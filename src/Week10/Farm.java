package Week10;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    @Override
    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }
    @Override
    public String toString() {
        String result = "Farm owner: " + owner + "\n";
        result += "Barn bulk tank: " + barn + "\n";
        if (cows.isEmpty()) {
            result += "No cows.\n";
        } else {
            result += "Animals:\n";

            for (Cow cow : cows) {
                result += "\t" + cow + "\n";
            }
        }
        return result;
    }
}
