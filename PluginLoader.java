import java.util.ServiceLoader;

public class PluginLoader {
    public static Aircraft createAircraft(String pluginName, String id) {
        ServiceLoader<AircraftPlugin> loader = ServiceLoader.load(AircraftPlugin.class);
        for (AircraftPlugin plugin : loader) {
            if (plugin.getClass().getSimpleName().equals(pluginName)) {
                return plugin.createAircraft(id);
            }
        }
        return null;
    }
}
