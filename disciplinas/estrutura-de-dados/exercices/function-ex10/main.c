#include <stdio.h>
#include <stdlib.h>

void changeValues(int *num1, int *num2) {
    int aux;
    aux = *num1;
    *num1 = *num2;
    *num2 = aux;
}

int main()
{

    int value1 = 10;
    int value2 = 20;

    printf("Valores: %d, %d \n", value1, value2);

    changeValues(&value1, &value2);

    printf("Valores: %d, %d \n", value1, value2);

    return 0;
}
