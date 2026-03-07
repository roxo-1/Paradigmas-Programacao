
#include <stdlib.h>
#include <stdio.h>
#include "ponto2d.h"


Ponto2D *ponto2D_new(double x, double y) {
    // TODO: Implemente aqui a solucao para operacao new
    Ponto2D *p; // declara uma variavel ponteiro
    p = malloc(sizeof(Ponto2D));// aloca a struct Ponto2D

    p->x = x;
    p->y = y;

    return p;
}


void ponto2D_destroy(Ponto2D **p) {
    // TODO: Implemente aqui a solucao para operacao destroy
    free(*p);
    *p = NULL;
    
}

double ponto2D_get_x(Ponto2D *p) {
    // TODO: Implemente aqui a solucao para operacao obter o valor do componente x
    return p->x;
}

double ponto2D_get_y(Ponto2D *p) {
    // TODO: Implemente aqui a solucao para operacao obter o valor do componente y
    return p->y;
}

Ponto2D *ponto2D_add(Ponto2D *p1, Ponto2D *p2) {
    // TODO: Implemente aqui a solucao para operacao somar dois pontos 
    // (e obter um terceiro);
    return NULL;
}

Ponto2D *ponto2D_scale(Ponto2D *p, double s) {
     // TODO: Implemente aqui a solucao para operacao scale
    return NULL;
}

double ponto2D_gradient(Ponto2D *p1, Ponto2D *p2) {
     // TODO: Implemente aqui a solucao para operacao Calcular o coeficiente angular 
     // de uma reta que passe pelos dois pontos;
    return 0;
}