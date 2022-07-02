#include <stdio.h>
#include <stdlib.h>

int main()
{
    int valores[10];

    for(int i = 0; i < 11; i++) {
        valores[i] = i;
    }

    for(int j = 0; j < 11; j++) {
        printf("Valor: %d \n", valores[j]);
    }

    return 0;
}
