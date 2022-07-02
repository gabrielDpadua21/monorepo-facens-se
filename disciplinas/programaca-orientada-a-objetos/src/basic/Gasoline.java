package basic;

import java.util.Scanner;

public class Gasoline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double time, velocity, distance, gasoline;
        int kml = 12;

        System.out.println("Digite o tempo da viajem em horas: ");
        time = sc.nextDouble();

        System.out.println("Digite a velocidade percorrida em km/h: ");
        velocity = sc.nextDouble();

        distance = velocity * time;
        gasoline = distance / kml;

        System.out.println("Velocidade media: " + velocity + " km/h");
        System.out.println("Tempo gasto: " + time + " horas");
        System.out.println("Distancia pescorrida: " + distance + " Km");
        System.out.println("Total gasto de gazolina: " + gasoline + " L");


    }

}
