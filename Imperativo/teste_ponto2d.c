/*
Compile com:
gcc -g  teste_ponto2d.c ponto2d.c -o teste_ponto2d

Verifique os testes com

./teste_ponto2d

Testando o valgrind
valgrind --leak-check=yes ./teste_ponto2d

*/
#include <stdio.h>
#include <stdlib.h>
#include "ponto2d.h"

// Macro test_assert
#define test_assert(expr, str) { if(!(expr)) { printf("%s: [FALHA] %s in %s:%d\n", __func__, str, __FILE__, __LINE__); exit(-1); } }

// testa as operacoes
// Inicialização e finalização - todo ponto deve ser inicializado com algum valor 
// para x e y.
// Testa tambem a operacao que retorna os valores das componentes x e y do ponto;
int test_new_destroy_get() {
    Ponto2D *p = ponto2D_new(0, 0);
    
    test_assert( p != NULL, "Erro na alocacao do Ponto2D *p !");

    test_assert(ponto2D_get_x(p) == 0, "Erro na inicializacao da componente x!");
    test_assert(ponto2D_get_y(p) == 0, "Erro na inicializacao da componente y!");

    Ponto2D *p2 = ponto2D_new(10, 20);

    test_assert( p2 != NULL, "Erro na alocacao do Ponto2D *p2!");

    test_assert(ponto2D_get_x(p2) == 10, "Erro na inicializacao da componente x!");
    test_assert(ponto2D_get_y(p2) == 20, "Erro na inicializacao da componente y!");

    ponto2D_destroy(&p);
    test_assert(p == NULL, "p nao foi setado como NULL apos destroy!");

    ponto2D_destroy(&p2);
    test_assert(p2 == NULL, "p2 nao foi setado como NULL apos destroy!");

    return 0;
}
// Testa a operacao
// Somar dois pontos (e obter um terceiro);
int test_add() {
    Ponto2D *a, *b, *c;
    a = ponto2D_new(10.5, 20);
    b = ponto2D_new(30, 40.3);
    c = ponto2D_add(a, b);

    test_assert( c != NULL, "Erro na alocacao do Ponto2D *c !");

    test_assert(ponto2D_get_x(c) == 40.5, "Erro na soma: componente x!");
    test_assert(ponto2D_get_y(c) == 60.3, "Erro na soma: componente x!");

    ponto2D_destroy(&a);
    ponto2D_destroy(&b);
    ponto2D_destroy(&c);

    return 0;
}
// Testa a operacao
// Multiplicar ambas as coordenadas de um ponto (recebendo um novo em troca) 
// esta operacao equivale a mudanca de escala;
int test_scale() {
    Ponto2D *a, *b, *c;
    a = ponto2D_new(10.5, 20);
    b = ponto2D_scale(a, 2.5);

    test_assert( b != NULL, "Erro na alocacao do Ponto2D *b !");

    test_assert(ponto2D_get_x(b) == 26.25, "Erro na escala: componente x!");
    test_assert(ponto2D_get_y(b) == 50, "Erro na escala: componente y!");

    c = ponto2D_scale(a, 0);

    test_assert(ponto2D_get_x(c) == 0, "Erro na escala: componente x!");
    test_assert(ponto2D_get_y(c) == 0, "Erro na escala: componente y!");

    ponto2D_destroy(&a);
    ponto2D_destroy(&b);
    ponto2D_destroy(&c);

    return 0;
}
// Testa a operacao
// Calcular o coeficiente angular de uma reta que passe pelos dois pontos;
// https://www.todamateria.com.br/calculo-do-coeficiente-angular/
int test_coef_angular() {
    Ponto2D *a, *b;
    a = ponto2D_new(2, 3);
    b = ponto2D_new(4, 5);

    test_assert(ponto2D_gradient(a, b) == 1, "Erro na inclinacao da reta!");

    ponto2D_destroy(&a);
    ponto2D_destroy(&b);

    a = ponto2D_new(2, 3);
    b = ponto2D_new(4, 4);

    test_assert(ponto2D_gradient(a, b) == 0.5, "Erro na inclinacao da reta!");

    test_assert(ponto2D_gradient(a, a) == 0, "Erro na inclinacao da reta!");

    ponto2D_destroy(&a);
    ponto2D_destroy(&b);

    return 0;
}

int main() {
    printf("Executando testes ...\n");
    printf("=====================\n\n");

    test_new_destroy_get();
    printf("test_new_get [PASS]\n\n");

    test_add();
    printf("test_add [PASS]\n\n");

    test_scale();
    printf("test_scale [PASS]\n\n");

    test_coef_angular();
    printf("test_coef_angular [PASS]\n\n");

    printf("=====================\n");
    printf("TODOS TESTES PASS\n");

    return 0;
}
