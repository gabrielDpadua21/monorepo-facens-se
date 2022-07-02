#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valores[10];

    printf("Digite 10 numeros: \n");

    for(int i = 0; i < 10; i++) {
        scanf("%d", &valores[i]);
    }


    reverse(valores, 10);

    printf("Valores: \n");

    print(valores, 10);

    return 0;
}

void reverse(int valores[], int n) {
    int aux[n];

    for(int i = 0; i < n; i++) {
        aux[n - 1 - i] = valores[i];
    }

    for(int j = 0; j < n; j++) {
        valores[j] = aux[j];
    }
}

void print(int valores[], int n) {
    for(int i = 0; i < n; i++) {
        printf("Valor: %d\n", valores[i]);
    }
}
