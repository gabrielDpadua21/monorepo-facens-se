#include <stdio.h>
#include <stdlib.h>

void tabuada(int number) {

    printf("\nTabuada do %d \n\n", number);

    for(int i = 0; i < 11; i++) {
        printf("%d X %d = %d \n", number, i, (number * i));
    }

}

int main()
{

    int number;

    printf("Digite um numero para calcular a tabuada: \n");
    scanf("%d", &number);

    tabuada(number);

    return 0;
}
