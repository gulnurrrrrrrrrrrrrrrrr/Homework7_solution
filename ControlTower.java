import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private Queue<Aircraft> runwayQueue = new LinkedList<>();  // Очередь на посадку
    private Queue<Aircraft> takeoffQueue = new LinkedList<>();  // Очередь на взлет

    @Override
    public void broadcast(String msg, Aircraft sender) {
        System.out.println(sender.getId() + " sends message: " + msg);
    }

    @Override
    public boolean requestRunway(Aircraft a) {
        if (a instanceof PassengerPlane) {
            System.out.println(a.getId() + " is allowed to land.");
            runwayQueue.add(a);
            return true;
        } else if (a instanceof CargoPlane) {
            System.out.println(a.getId() + " is waiting for clearance to land.");
            takeoffQueue.add(a);  // Добавляем в очередь на взлет
            return false;
        } else if (a instanceof Helicopter) {
            System.out.println(a.getId() + " is waiting for clearance to land.");
            takeoffQueue.add(a);  // Добавляем в очередь на взлет
            return false;
        }
        return false;
    }

    public void emergencyLanding(Aircraft a) {
        System.out.println(a.getId() + " emergency landing! Clearing runway for immediate landing.");
        runwayQueue.add(a);
        broadcast("EMERGENCY LANDING! " + a.getId() + " needs immediate landing.", a);
    }
}
