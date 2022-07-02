#include <stdio.h>
#include <stdlib.h>

void imparPar(int *number) {
    if(*number % 2 == 0) {
        printf("Nao e impar");
        return;
    }

    printf("Numero impar");
}

int main()
{

    int number;

    printf("Digite um numero: ");
    scanf("%d", &number);

    imparPar(&number);

    return 0;
}
