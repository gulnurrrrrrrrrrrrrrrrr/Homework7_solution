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
        }
        return false;
    }
}