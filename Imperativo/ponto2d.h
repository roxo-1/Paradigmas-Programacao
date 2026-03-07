#ifndef __PONTO2D__
#define __PONTO2D__

typedef struct {
    double x, y;
}Ponto2D;

// inicializa um ponto alocado dinamicamente e iniciliza os campos do ponto
Ponto2D *ponto2D_new(double x, double y);

// finaliza o ponto, ou seja, desaloca.
void ponto2D_destroy(Ponto2D **p);

// Retornar os valores das componentes x 
double ponto2D_get_x(Ponto2D *p);

// Retornar os valores das componentes y
double ponto2D_get_y(Ponto2D *p);

//Somar dois pontos e obtem um terceiro;
Ponto2D *ponto2D_add(Ponto2D *p1, Ponto2D *p2);

// Multiplicar ambas as coordenadas de um ponto 
Ponto2D *ponto2D_scale(Ponto2D *p, double s);

//Calcular o coeficiente angular de uma reta que passe pelos dois pontos
double ponto2D_gradient(Ponto2D *p1, Ponto2D *p2);

#endif
