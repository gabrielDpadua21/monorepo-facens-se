#include <stdio.h>
#include <stdlib.h>

int main()
{

    int num = 10;

    int *pointer;

    pointer = &num;

    *pointer = 12;

    printf("Numero: %d", num);

    return 0;
}
