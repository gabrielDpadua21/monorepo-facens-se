package basic;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ac1, ac2, ag, af;

        System.out.println("Digite a nota da ac1");
        ac1 = sc.nextDouble();

        System.out.println("Digite a nota da ac2");
        ac2 = sc.nextDouble();

        System.out.println("Digite a nota da AF");
        af = sc.nextDouble();

        System.out.println("Digite a nota da AG");
        ag = sc.nextDouble();

        System.out.println("Media final: " + calc(ac1, ac2, ag, af));
    }

    public static double calc(double ac1, double ac2, double ag, double af) {
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }

}
