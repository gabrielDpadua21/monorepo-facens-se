#include <stdio.h>
#include <stdlib.h>

void waterVerify(double *temperature) {

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

    double temperature;

    printf("Digite a temperatura do ambiente: ");
    scanf("%lf", &temperature);

    waterVerify(&temperature);

    return 0;
}
