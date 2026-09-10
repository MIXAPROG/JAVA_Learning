package Week10;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    /*
        // Exercise 31.1 - BulkTank

        BulkTank tank = new BulkTank();

        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);

        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);

        System.out.println(tank);

        // Exercise 31.2 - Cow

        Cow cow = new Cow();
        System.out.println(cow);

        Alive livingCow = cow;

        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();
        System.out.println(cow);
        System.out.println("");

        cow = new Cow("Ammu");
        System.out.println(cow);

        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);

        cow.milk();
        System.out.println(cow);

        // Exercise 31.3 - MilkingRobot

        MilkingRobot milkingRobot = new MilkingRobot();
        cow = new Cow();
        System.out.println("");

        tank = new BulkTank();
        milkingRobot.setBulkTank(tank);
        System.out.println("Bulk tank: " + tank);

        for (int i = 0; i < 2; i++) {
            System.out.println(cow);
            System.out.println("Living..");
            for (int j = 0; j < 5; j++) {
                cow.liveHour();
            }

            System.out.println(cow);
            System.out.println("Milking...");
            milkingRobot.milk(cow);
            System.out.println("Bulk tank: " + tank);
            System.out.println("");
        }

        // Exercise 31.4 - Barn

        Barn barn = new Barn(new BulkTank());
        System.out.println("Barn: " + barn);
        MilkingRobot robot = new MilkingRobot();
        barn.installMilkingRobot(robot);

        Cow ammu = new Cow();
        ammu.liveHour();
        ammu.liveHour();

        barn.takeCareOf(ammu);
        System.out.println("Barn: " + barn);
        ArrayList<Cow> cowList = new ArrayList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());

        for (Cow currentCow : cowList) {
            currentCow.liveHour();
            currentCow.liveHour();
        }
        barn.takeCareOf(cowList);
        System.out.println("Barn: " + barn);
    */
        // Exercise 31.5 - Farm

        Farm farm = new Farm("Esko", new Barn(new BulkTank()));

        farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.liveHour();
        farm.liveHour();
        farm.manageCows();
        System.out.println(farm);
        System.out.println(farm.getOwner() + " is a tough guy!");
    }
}