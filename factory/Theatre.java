import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public String name;
    public Location location;
    public List<Screen> screens = new ArrayList<>();

    public Theatre(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public void addScreen(Screen screen) {
        if (screen != null) {
            screens.add(screen);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    @Override
    public String toString() {
        return name;
    }
}
