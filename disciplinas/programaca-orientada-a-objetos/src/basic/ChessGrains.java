package basic;

public class ChessGrains {

    public static void main(String[] args) {

        double grains;

        grains = calcGrains(64);

        System.out.println("Grains -> " + grains);

    }

    public static double calcGrains(int max) {
        if(max == 0) return 1;

        return max * calcGrains(max-1);
    }

}
