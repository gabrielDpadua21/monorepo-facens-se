# Lista de Exercícios - 15/04


Exercício 01


![](https://paper-attachments.dropbox.com/s_31EC867B6F5710FB60EFD59D2954C2124744A06E4CCB9636A7F43AF3A31C1D05_1587437781978_Captura+de+tela+de+2020-04-20+23-55-37.png)


Exercício 02


![](https://paper-attachments.dropbox.com/s_31EC867B6F5710FB60EFD59D2954C2124744A06E4CCB9636A7F43AF3A31C1D05_1587437795960_Captura+de+tela+de+2020-04-20+23-54-21.png)


Exercício 03


```java
class Main {
      public static void main(String[] args) {
    
        System.out.println("Tabela Ascii");
    
        System.out.println("---------------");
        // Char conversor
        for(int i = 32; i < 256; i++) {
          System.out.println("| Código | Caracter |");
          if(i < 99) {
            System.out.println("|   " + i + " |   " + (char)i + "  |");
            continue;
          }
          System.out.println("|  " + i + " |   " + (char)i + "  |");
        }
        System.out.println("---------------");
      }
    }
```




    



Exercício 04


```java
 import java.util.Scanner;
    
    public class UpperLowerCase {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            int maskUpper = 0b1011111;
            int maskLower = 0b0100000;
    
            System.out.println("Digite um letra: ");
            char letter = sc.next().charAt(0);
    
            int upper = letter & maskUpper;
            int lower = letter | maskLower;
    
            System.out.println("Caractere Maisculo: " + (char)upper);
            System.out.println("Caractere Minusculo: " + (char)lower);
    
        }
    
    }
```
   

Exercício 05


```java
import java.util.Scanner;
    
    public class VerifyPermission {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Digite um numero: ");
            int value = sc.nextInt();
    
            int mask = 0b0010;
    
            int permission = value & mask;
    
            System.out.println("Permission: " + permission);
    
            if (permission > 0) {
                System.out.println("Voce tem permissao de leitura");
            }
    
        }
    
    }
```
    

Exercício 6

```java
public class LeftShift {
    
        public static void main(String[] args) {
            for (int i = 1; i != 0;) {
                System.out.println(i);
                i = i<<1;
            }
        }
    
}
```
    

By: Gabriel de Pádua Barreto de Noronha e Silva
RA: 200749