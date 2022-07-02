#include <stdio.h>
#include <stdlib.h>

void drawRetangule() {

    printf("\n----------");

    for(int i = 0; i < 20; i++) {
        printf("\n| \t |");
    }

    printf("\n----------\n");

}

int main()
{

    drawRetangule();

    return 0;
}
