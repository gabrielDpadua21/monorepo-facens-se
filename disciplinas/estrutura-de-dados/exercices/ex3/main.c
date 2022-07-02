#include <stdio.h>
#include <stdlib.h>

int main()
{

    int num1, num2;

    printf("Digite um numero: \n");
    scanf("%d", &num1);

    printf("Digite outro numero: \n");
    scanf("%d", &num2);

    printf("Numero 1: %d, Numero 2: %d\n", num1, num2);

    troca(&num1, &num2);

    printf("Numero 1: %d, Numero 2: %d\n", num1, num2);

    return 0;
}

void troca(int *pointer1, int *pointer2) {
    int aux;

    aux = *pointer1;

    *pointer1 = *pointer2;

    *pointer2 = aux;

    return;
}
