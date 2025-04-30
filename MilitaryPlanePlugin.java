public class MilitaryPlanePlugin implements AircraftPlugin {
    @Override
    public Aircraft createAircraft(String id) {
        return new MilitaryPlane(id);
    }
}
