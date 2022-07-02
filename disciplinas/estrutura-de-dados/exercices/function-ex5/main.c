#include <stdio.h>
#include <stdlib.h>

void bigger(int values[]) {

    int aux;

    for(int i = 0; i < 2; i++) {
        for(int j = i; j < 2; j++) {
            if(values[i] > values[j]) {
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
            }
        }
    }

    printf("Maior valor: %d", values[1]);
}

int main()
{

    int values[2];

    printf("Digite um numero: ");
    scanf("%d", &values[0]);

    printf("Digite outro numero: ");
    scanf("%d", &values[1]);

    bigger(values);

    return 0;
}
