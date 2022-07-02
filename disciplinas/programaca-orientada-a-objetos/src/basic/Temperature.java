package basic;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;

        System.out.println("Digite a temperatura em fahrenheit: ");
        temp = sc.nextDouble();

        System.out.println("Temperatura em celsius: " + celsius(temp));

    }

    public static double celsius(double temp) {
        return ((temp - 32) * 5) / 9;
    }

}
