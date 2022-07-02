#include <stdio.h>
#include <stdlib.h>

void bigger(int values[], int tamanho) {

    int aux;

    for(int i = 0; i < tamanho; i++) {
        for(int j = i; j < tamanho; j++) {
            if(values[i] > values[j]) {
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
            }
        }
    }

    printf("Maior valor: %d", values[tamanho - 1]);
}

int main()
{

    int tamanho;

    printf("Digite o numero de valores que deseja digitar: \n");
    scanf("%d", &tamanho);

    int values[tamanho];

    printf("Digite %d numeros: \n", tamanho);

    for(int i = 0; i < tamanho; i++) {
        scanf("%d", &values[i]);
    }

    bigger(values, tamanho);

    return 0;
}
