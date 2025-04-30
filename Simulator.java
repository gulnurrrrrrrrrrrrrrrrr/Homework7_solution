public class Simulator {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        Aircraft militaryPlane = PluginLoader.createAircraft("MilitaryPlanePlugin", "M1");
        if (militaryPlane != null) {
            militaryPlane.send("Requesting runway", tower);
        }

        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("Triggering emergency: MAYDAY from " + militaryPlane.getId());
            militaryPlane.send("MAYDAY", tower);  // Отправка MAYDAY
            tower.emergencyLanding(militaryPlane);  // Обработка экстренной посадки
        }

        Aircraft p1 = new PassengerPlane("P1");
        p1.send("Requesting runway", tower);
    }
}
