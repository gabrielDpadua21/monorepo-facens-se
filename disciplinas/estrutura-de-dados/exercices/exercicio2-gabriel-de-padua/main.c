#include <stdio.h>
#include <stdlib.h>

void financingValidate(float salary, float total, int numberPartion) {

    double partion = total / numberPartion;

    if((salary / 3) > partion) {
        printf("Financiamento concedido \n");
    }

    printf("\n Obrigado pela consulta \n");

}

int main()
{

    float salary, total;
    int numberPartion;

    printf("\n BEM VINDO FINANCEIRA C \n");
    printf("Vamos calcular seu financiamento \n\n");

    printf("Digite seu salario mensal: \n");
    scanf("%f", &salary);

    printf("\n Digite o valor que deseja financiar: \n");
    scanf("%f", &total);

    printf("\n Digite o numero de parcelas que deseja pagar: \n");
    scanf("%d", &numberPartion);

    financingValidate(salary, total, numberPartion);

    return 0;
}
