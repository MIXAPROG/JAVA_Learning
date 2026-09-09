package Week1;

public class Ex_5 {
    public static void main (String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int secondsInYear = days * hours * minutes * seconds;

        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}