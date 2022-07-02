#include <stdio.h>
#include <stdlib.h>

void printValues(int *num1, int *num2) {
    printf("Valor 1: %d\n", *num1);
    printf("Valor 2: %d\n", *num2);
}


int main()
{

    int num1 = 10;
    int num2 = 20;

    printValues(&num1, &num2);

    return 0;
}
