#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{

    char frase[40];
    int vogais;

    printf("Digite uma frase: ");
    scanf("%s", &frase);

    printf("Sua frase: %s\n", frase);

    vogais = conta_vogais(frase);

    printf("Na frase tem: %d vogais\n", vogais);

    return 0;
}

int conta_vogais(char frase[]) {

    int count = 0;

    // a, A, e, E, i, I, o, O, u, U
    char vogais[10] = "aAeEiIoOuU";

    for(int i = 0; i < strlen(frase); i++) {
        for(int j = 0; j < 10; j++) {
            if(vogais[j] == frase[i]) {
                count++;
            }
        }
    }

    return count;
}
