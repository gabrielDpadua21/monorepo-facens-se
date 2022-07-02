package basic;

public class Metros {

    public static void main(String[] args) {

        int velocit = 1100;
        double interval = 7.2;
        double distance;

        distance = velocit * interval;

        distance = distance * 0.3048;

        System.out.println("Distance in meters: " + distance);

    }

}
