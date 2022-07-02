package challenges;

public class AsciiTable {

    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("|   Tabela Ascii   |");
        System.out.println("====================");

        System.out.println("| Codigo | Caracter |");
        System.out.println("---------------------");

        for(int i = 32; i < 256; i++) {

            if(i < 100) {
                System.out.println("|     " + i + " |   " + (char)i + "      |");

                System.out.println("---------------------");
                continue;
            }

            System.out.println("|  " + i + "   |   " + (char)i + "      |");
            System.out.println("---------------------");
        }

        System.out.println("=====================");

    }

}
