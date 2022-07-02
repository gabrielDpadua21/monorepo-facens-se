package basic;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double basesalary, gratification, brutesalary, liquidsalary;

        System.out.println("Base salary: ");
        basesalary = sc.nextDouble();

        System.out.println("Gratification: ");
        gratification = sc.nextDouble();

        liquidsalary = (basesalary + gratification) - ((basesalary + gratification) * calcIr((basesalary + gratification)));

        System.out.println("Salary: " + liquidsalary);

    }

    public static double calcIr(double salary) {
        if(salary < 100) {
            return 20.0 / 100.0;
        }

        return 15.0 / 100.0;
    }

}
