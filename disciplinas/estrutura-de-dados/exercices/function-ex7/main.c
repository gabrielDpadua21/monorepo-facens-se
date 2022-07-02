#include <stdio.h>
#include <stdlib.h>

void power(int number, int potencia) {

    int total = 1;

    for(int i = 1; i <= potencia; i++) {
        total *= number;
    }

    printf("Resultado: %d", total);

}

int main()
{

    int valor, potencia;

    printf("Digite 2 numeros para calcular a potencia: \n");
    scanf("%d", &valor);
    scanf("%d", &potencia);

    power(valor, potencia);

    return 0;
}
