#include <stdio.h>
#include <stdlib.h>

void waterVerify(float *temperature) {

    if(*temperature < 0) {
        printf("Agua em estado solido");
        return;
    }

    if(*temperature > 100) {
        printf("Agua em estado gasoso");
        return;
    }

    printf("Agua em estado liquido");

}

int main()
{

    float temperature;

    printf("Digite a temperatura do ambiente: ");
    scanf("%f", &temperature);

    waterVerify(&temperature);

    return 0;
}
