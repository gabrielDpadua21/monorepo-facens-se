#include <stdio.h>
#include <stdlib.h>

void product(float *number1, float *number2) {
    printf("%f X %f = %f", *number1, *number2, ((*number1) * (*number2)));
}

int main()
{

    float number1, number2;

    printf("Digite um numero: ");
    scanf("%f", &number1);

    printf("Digite outro numero: ");
    scanf("%f", &number2);

    product(&number1, &number2);

    return 0;
}
