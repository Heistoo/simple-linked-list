#include <stdio.h>
#include <stdlib.h>
int main(){
    int v[100];
    int * p;
    float * pf;

while(p != NULL){
    p = (int*) malloc (1000000 * sizeof(int));
    printf("%p\n", p);
    free(p);
}
    // printf("Tamanho do V: %d de bytes\n", sizeof(v));
    // printf("Tamanho do p: %d bytes\n", sizeof(p));
    // printf("Tamanho do pf: %d\n", sizeof(pf));
    return 0;
}