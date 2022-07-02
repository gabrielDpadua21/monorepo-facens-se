## Lista de exercicios 04

## Exercicio 01

```java
package lista5;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value;
        double sum = 0;
        int counter = 0;
        double media;

        do {

            System.out.println("Digite um numero: ");
            value = sc.nextDouble();

            if(value >= 0) {
                sum += value;
                counter++;
            }

        } while (value >= 0);

        media = sum / counter;

        System.out.println("A media dos numeros digitados e: " + media);

    }

}
```

## Exercicio 02

```java
package lista5;

import java.util.Scanner;

public class exercicio2 {

    static void successMessage() {
        System.out.println("\nParabens: voto computado com sucesso\n");
        System.out.println("\nFIM\n");
    }

    static void verifyWinner(int cand1, int cand2, int cand3, int cand4) {
        if(cand1 > cand2 && cand1 > cand3 && cand1 > cand4) {
            System.out.println("Vencedor e o candidato 1");
        } else if (cand2 > cand1 && cand2 > cand3 && cand2 > cand4) {
            System.out.println("Vencedor e o candidato 2");
        } else if(cand3 > cand1 && cand3 > cand2 && cand3 > cand4) {
            System.out.println("Vencedor e o candidato 3");
        } else if(cand4 > cand1 && cand4 > cand2 && cand4 > cand3) {
            System.out.println("Vencedor e o candidato 4");
        } else {
            System.out.println("Ocorreu um empate");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulos = 0;
        int brancos = 0;
        int total;
        String operation;

        do {

            System.out.println("URNA ELETRONICA");
            System.out.println("Escolha seu canditado: ");
            System.out.println("(1) - Candidato 1");
            System.out.println("(2) - Candidato 2");
            System.out.println("(3) - Candidato 3");
            System.out.println("(4) - Candidato 4");
            System.out.println("(5) - Votar em branco");
            System.out.println("(6) - Votar nulo");
            System.out.println("(0) - Encerrar votaçao");

            operation = sc.next();

            switch (operation) {
                case "1":
                    cand1++;
                    successMessage();
                    break;
                case "2":
                    cand2++;
                    successMessage();
                    break;
                case "3":
                    cand3++;
                    successMessage();
                    break;
                case "4":
                    cand4++;
                    successMessage();
                    break;
                case "5":
                    nulos++;
                    successMessage();
                    break;
                case "6":
                    brancos++;
                    successMessage();
                    break;
                case "0":
                    System.out.println("\nEleiçao finalizada, veja o resultado a seguir\n");
                    break;
                default:
                    System.out.println("\nopçao invalida, digite novamente\n");
                    break;

            }

        } while (!operation.equals("0"));

        total = cand1 + cand2 + cand3 + cand3 + cand4 + nulos + brancos;

        System.out.println("\n\nRESULTADO\n\n");
        System.out.println("Candidato 1: (" + cand1 + ") votos, Porcentagem: " + (100*cand1/total) + "%");
        System.out.println("Candidato 2: (" + cand2 + ") votos, Porcentagem: " + (100*cand2/total) + "%");
        System.out.println("Candidato 3: (" + cand3 + ") votos, Porcentagem: " + (100*cand3/total) + "%");
        System.out.println("Candidato 4: (" + cand4 + ") votos, Porcentagem: " + (100*cand4/total) + "%");
        System.out.println("Nulos: (" + nulos + ") votos, Porcentagem: " + (100*nulos/total) + "%");
        System.out.println("Brancos: (" + brancos+ ") votos, Porcentagem: " + (100*brancos/total) + "%");
        System.out.println("Total: (" + total + ") votos");

        verifyWinner(cand1, cand2, cand3, cand4);

    }

}

```

## Exercicio 03

```java
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

```

## Exercicio 04

```java
package lista5;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value;
        double sum = 0;
        double media;
        int counter = 0;


        do {
            System.out.println("Digite um numero: ");
            value = sc.nextDouble();

            if(value % 2 == 0 && value != 0) {
                sum += value;
                counter++;
            }

        } while(value != 0);

        // TRATAMENTO PARA DIVISAO POR ZERO ...
        counter = counter == 0 ? 1 : counter;

        media = sum / counter;

        System.out.println("A media dos numeros pares digitados e: " + media);

    }

}

```

## Exercicio 05

```java
package lista5;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = 0;
        int range1 = 0;
        int range2 = 0;
        int range3 = 0;
        int range4 = 0;

        while (value >= 0) {
            System.out.println("Digite um numero:");
            value = sc.nextDouble();

            if(value >= 0 && value < 26) {
                range1++;
            } else if (value >= 26 && value < 51) {
                range2++;
            } else if (value >= 51 && value < 76) {
                range3++;
            } else if (value >= 76 && value < 101) {
                range4++;
            }
        }

        System.out.println("Numeros no intervalor [0, 25]: " + range1);
        System.out.println("Numeros no intervalo [26, 50]: " + range2);
        System.out.println("Numeros no intervalo [51, 75]: " + range3);
        System.out.println("Numeros no intervalor [76, 100]: " + range4);

    }

}
```

## Exercicio 06

```java
package lista5;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value;
        int sum = 0;

        do {
            System.out.println("Digite um numero inteiro: ");
            value = sc.nextInt();

            if(value < 0) {
                sum += value;
            }

        } while (value != 0);

        System.out.println("A soma dos numero negativos e: " + sum);

    }

}
```

## Exercicio 07

```java
package lista5;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prod = 1;
        int value;

        do {

            System.out.println("Digite um numero inteiro: ");
            value = sc.nextInt();

            if(value > 0) {
                prod *= value;
            }

        } while (value != 0);

        System.out.println("O produto dos numero positivos e: " + prod);

    }

}
```

## Exercicio 08

```java
package lista5;

import java.util.*;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<HashMap<Integer, HashMap<String, Double>>> products = new ArrayList<HashMap<Integer, HashMap<String, Double>>>();
        int productCod;
        double value;
        double newValue;
        double media;

        do {

            System.out.println("Digite o codigo do produto: ");
            productCod = sc.nextInt();

            if(productCod > 0) {
                HashMap<Integer, HashMap<String, Double>> product = new HashMap<Integer, HashMap<String, Double>>();
                HashMap<String, Double> innerProducts = new HashMap<String, Double>();
                System.out.println("Digite o valor do produto: ");
                value = sc.nextDouble();

                newValue = value * 1.2;
                media = (value + newValue) / 2;

                innerProducts.put("Preco", value);
                innerProducts.put("PrecoNovo", newValue);
                innerProducts.put("Media", media);

                product.put(productCod, innerProducts);

                products.add(product);
            }

        } while (productCod > 0);

        System.out.println("\n======================\n");

        products.forEach(prods -> {

            for (int key: prods.keySet()) {
                System.out.println("Produto: " + key);
                HashMap<String, Double> prices = prods.get(key);

                for (String keyPrices: prices.keySet()) {
                    double price = prices.get(keyPrices);
                    System.out.println(keyPrices + ": " + price);
                }

            }

            System.out.println("\n======================\n");

        });

    }

}
```

## Exercicio 09

```java
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
```

## Exercicio 10

```java
package lista5;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ages;
        int counterFat = 0;
        int counter = 0;
        int sumAges = 0;
        double middleAges;
        double weight;

        while (counter < 7) {
            System.out.println("Digite a idade da pessoa");
            ages = sc.nextInt();

            sumAges += ages;

            System.out.println("Digite o peso da pessoa em kg");
            weight = sc.nextDouble();

            if(weight > 90) {
                counterFat++;
            }

            counter++;
        }

        middleAges = sumAges / counter;

        System.out.println("\n=========================\n");
        System.out.println("A media das idade e: " + middleAges);
        System.out.println("A quantidade de pessoas com mais de 90kg e: " + counterFat);


    }

}
```

By Gabriel De Pádua