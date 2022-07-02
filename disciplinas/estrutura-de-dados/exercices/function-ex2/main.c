#include <stdio.h>
#include <stdlib.h>

void validNumber(int *number) {
    if(*number > 0) {
        printf("Numero Positivo");
        return;
    }

    printf("Numero negativo");
}


int main()
{

    int number;

    printf("Digite um numero: ");
    scanf("%d", &number);

    validNumber(&number);

    return 0;
}
