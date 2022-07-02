#include <stdio.h>
#include <stdlib.h>

int* sort(int array[]) {

    int aux;

    for(int i = 0; i < 10; i++) {
        for(int j = i; j < 10; j++) {
            if(array[i] > array[j]) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
    }

    return array;
}

void binarySearch(int array[], int element) {

    int *sortArray = sort(array);

    int inicio = 0;
    int fim = 9;
    int meio;

    while(inicio <= fim) {
        meio = (inicio + fim) / 2;

        if(element == sortArray[meio]) {
            printf(" \n Elemento %d encontrado", element);
            return;
        }

        if(element > sortArray[meio]) {
            inicio = meio + 1;
        } else {
            fim = meio - 1;
        }
    }

    printf("\n Elemento não encontrado \n");

}

int main()
{
    int elements[10] = {12, 31, 1, 4, 5, 88, 65, 11, 21, 3};
    int element;

    printf("Digite um numero para buscar no array: \n");
    scanf("%d", &element);

    binarySearch(elements, element);

    return 0;
}
