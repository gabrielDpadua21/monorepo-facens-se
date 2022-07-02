#include <stdio.h>
#include <stdbool.h>
#include <malloc.h>

typedef int TIPOCHAVE;

typedef struct {
    TIPOCHAVE chave;
} REGISTRO;

typedef struct aux {
    REGISTRO reg;
    struct aux * prox;
} ELEMENTO;

typedef ELEMENTO* PONT;

typedef struct {
    PONT topo;
} PILHA;

void inicializarPilha(PILHA *p) {
    p->topo = NULL;
}

int tamanho(PILHA *p) {
    PONT end = p->topo;
    int tam = 0;
    
    while(end != NULL) {
        tam++;
        end = end->prox;
    }
    
    return tam;
}

bool verificarTamanho(PILHA *p) {
    if(p->topo == NULL) {
        return true;
    }
    
    return false;
}

void imprimirPilha(PILHA *p) {
    PONT end = p->topo;
    
    printf("Pilha: \" ");
    
    while(end != NULL) {
        printf("| %d ", end->reg.chave);
        end = end->prox;
    }
    
    printf(" \"\n ");
    
}

bool inserirElementoPilha(PILHA *p, REGISTRO reg) {
    PONT newElem = (PONT) malloc(sizeof(ELEMENTO));
    newElem->reg = reg;
    newElem->prox = p->topo;
    p->topo = newElem;
    return true;
}

bool excluirElemento(PILHA *p, REGISTRO *reg) {
    if(p->topo == NULL) {
        return false;
    }
    *reg = p->topo->reg;
    PONT apagar = p->topo;
    p->topo = p->topo->prox;
    free(apagar);
    return true;
}

void reinicializarPilha(PILHA *p) {
    PONT apagar;
    PONT posicao = p->topo;
    
    while(posicao != NULL) {
        apagar = posicao;
        posicao = posicao->prox;
        free(apagar);
    }
    
    p->topo = NULL;
}

int main() {
    
    PILHA p;
    int tam;
    REGISTRO reg;
    REGISTRO regDeleted;
    bool excluir;
    
    printf("Inicializar pilha \n");
    inicializarPilha(&p);
    
    tam = tamanho(&p);
    
    printf("Tamanho da pilha: %d \n", tam);
    imprimirPilha(&p);
    
    printf("Inserindo elementos na pilha: \n");
    
    reg.chave = 12;
    inserirElementoPilha(&p, reg);
    
    reg.chave = 44;
    inserirElementoPilha(&p, reg);
    
    reg.chave = 22;
    inserirElementoPilha(&p, reg);
    
    reg.chave = 120;
    inserirElementoPilha(&p, reg);

    imprimirPilha(&p);
    tam = tamanho(&p);
    printf("Tamanho da pilha: %d \n", tam);
    
    excluir = excluirElemento(&p, &regDeleted);
    
    if(excluir) {
        printf("Elemento excluido %d com sucesso \n", regDeleted.chave);
    }
    
    imprimirPilha(&p);
    tam = tamanho(&p);
    printf("Tamanho da pilha: %d \n", tam);
    
    reinicializarPilha(&p);
    
    imprimirPilha(&p);
    tam = tamanho(&p);
    printf("Tamanho da pilha: %d \n", tam);
    
    return 0;
}
