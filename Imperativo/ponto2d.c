
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
    Ponto2D *p3 = ponto2D_new(0, 0);
    p3->x = p1->x + p2->x;
    p3->y = p1->y + p2->y;
    return p3;
}

Ponto2D *ponto2D_scale(Ponto2D *p, double s) {
    // TODO: Implemente aqui a solucao para operacao scale
    // Multiplicar ambas as coordenadas de um ponto (recebendo um novo em troca) 
    p->x = p->x * s;
    p->y = p ->y * s;
    return p;
}

double ponto2D_gradient(Ponto2D *p1, Ponto2D *p2) {
     // TODO: Implemente aqui a solucao para operacao Calcular o coeficiente angular 
     // de uma reta que passe pelos dois pontos;
    if(p2->x == p1->x){ 
        printf("não é possível");
        return 0;
    }
    double m = ((p2->y) - (p1->y))/((p2->x) - (p1->x));
    return m;
}