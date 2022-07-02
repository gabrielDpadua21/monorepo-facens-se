#include <stdio.h>
#include <stdlib.h>

void media(int valores[], int tam) {

    int soma = 0;

    for(int i = 0; i < tam; i++) {
        soma += valores[i];
    }

    printf("A media: %d", (soma / tam));
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

    media(values, tamanho);

    return 0;
}
