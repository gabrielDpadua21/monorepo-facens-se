#include <stdio.h>
#include <stdlib.h>

int smaller(int values[], int tam) {

    int menor = values[0];

    for( int i = 1; i < tam; i++) {
        if(values[i] < menor) {
            menor = values[i];
        }
    }

    return menor;

}

int main()
{

    int tam = 3;
    int menor;
    int values[tam];

    printf("Digite %d numeros: \n", tam);

    for(int i = 0; i < tam; i++) {
        scanf("%d", &values[i]);
    }

    menor = smaller(values, tam);

    printf(" \n O menor numero e: %d", menor);

    return 0;
}
