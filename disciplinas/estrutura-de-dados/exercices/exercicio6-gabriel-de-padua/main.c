#include <stdio.h>
#include <stdlib.h>

float tenPercente(float value) {
    return value * 0.10;
}

int main()
{

    float value, percent;

    printf("Digite um numero: \n");
    scanf("%f", &value);

    percent = tenPercente(value);

    printf("Valor: %f \n", value);
    printf("10 porcento do valor: %f \n", percent);

    return 0;
}
