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
