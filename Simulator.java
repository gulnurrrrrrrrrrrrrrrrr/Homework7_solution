import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        Aircraft p1 = new PassengerPlane("P1");
        Aircraft c1 = new CargoPlane("C1");
        Aircraft h1 = new Helicopter("H1");

        p1.send("Requesting runway", tower);
        c1.send("Requesting runway", tower);
        h1.send("Requesting runway", tower);
    }
}