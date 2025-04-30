public class MilitaryPlane extends Aircraft {
    public MilitaryPlane(String id) {
        super(id);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Military Plane " + id + " received: " + msg);
    }
}
