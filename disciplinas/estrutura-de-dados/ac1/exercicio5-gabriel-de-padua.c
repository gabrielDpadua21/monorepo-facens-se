#include <stdio.h>
#include <stdlib.h>

void doubleReference(int *number) {
    *number *= 2;
}

int main()
{

    int number;

    printf("Digite um numero: ");
    scanf("%d", &number);

    printf("Numero: %d \n", number);

    doubleReference(&number);

    printf("Dobro: %d \n", number);

    return 0;
}
