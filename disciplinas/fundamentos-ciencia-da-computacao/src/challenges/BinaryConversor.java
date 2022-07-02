package challenges;

import java.util.*;

public class BinaryConversor {

    public static void main(String[] args) {

        ArrayList<Integer> binary = new ArrayList();
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number = sc.nextInt();

        for(int i = number; i >= 1;) {

            int div = (int) i / 2;
            int rest = number % 2;

            i = div;

            binary.add(rest);

            if(i <= 1) {
                binary.add(div);
            }

            counter++;
        }

        Collections.reverse(binary);

        System.out.println(Arrays.toString(binary.toArray()));

    }

}
