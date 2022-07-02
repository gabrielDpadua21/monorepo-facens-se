package lista5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> students = new HashMap<String, Double>();
        String code;
        double sum = 0;
        double media;
        double value;
        int counter;

        do {

            System.out.println("\n\nDigite o codigo do aluno: ");
            code = sc.next();
            counter = 0;

            if(!code.equals("0")) {
                while (counter < 3) {
                    System.out.println("Digite o nota: " + (counter + 1) + " do aluno: " + code);
                    value = sc.nextDouble();
                    sum += value;
                    counter++;
                }

                media = sum / counter;
                sum = 0;
                students.put(code, media);
            }

        } while (!code.equals("0"));

        for (String key: students.keySet()) {
            double studentMedia = students.get(key);
            System.out.println("A media do estudante: " + key + " e: " + studentMedia);
        }

    }

}
