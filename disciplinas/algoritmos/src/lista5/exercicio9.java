package lista5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<HashMap<String, Integer>> population = new ArrayList<>();
        int age;
        int sex;
        int high;
        int counter = 1000;
        List<Integer> ages;
        List<Integer> highFem;
        List<Integer> ageMale;
        List<Integer> agesYoung;
        double middleAges;
        double middleHighFem;
        double middleAgeMale;
        double percenteAgesYoung;

        do {

            HashMap<String, Integer> data = new HashMap<>();

            System.out.println("Digite o sexo da pessoa: ");
            System.out.println("(0) - Masculino ");
            System.out.println("(1) - Feminino");
            sex = sc.nextInt();
            System.out.println("Digite a idade da pessoa: ");
            age = sc.nextInt();
            System.out.println("Digite a altura da pessoa em centrimetros");
            high = sc.nextInt();

            data.put("sexo", sex);
            data.put("idade", age);
            data.put("altura", high);

            population.add(data);

            counter--;

        } while (counter > 0);

        ages = population.stream()
                .filter(map -> map.containsKey("idade"))
                .map(map -> map.get("idade"))
                .collect(Collectors.toList());

        highFem = population.stream()
                .filter(map -> map.get("sexo") == 1)
                .map(map -> map.get("altura"))
                .collect(Collectors.toList());

        ageMale = population.stream()
                .filter(map -> map.get("sexo") == 0)
                .map(map -> map.get("idade"))
                .collect(Collectors.toList());

        agesYoung = population.stream()
                .filter(map -> map.get("idade") > 18 && map.get("idade") < 36)
                .map(map -> map.get("idade"))
                .collect(Collectors.toList());


        middleAges = ages.stream().mapToInt(Integer::intValue).sum() / ages.size();
        middleHighFem = highFem.stream().mapToInt(Integer::intValue).sum() / highFem.size();
        middleAgeMale = ageMale.stream().mapToInt(Integer::intValue).sum() / ageMale.size();
        percenteAgesYoung = agesYoung.size() * 100 / population.size();

        System.out.println("========================");
        System.out.println("\nRelatorio\n");
        System.out.println("Media de idades: " + middleAges);
        System.out.println("Media de altura das mulheres: " + middleHighFem);
        System.out.println("Media de idade dos homens: " + middleAgeMale);
        System.out.println("Porcentagem de idade entre 18 e 35: " + percenteAgesYoung + "%");


    }

}
