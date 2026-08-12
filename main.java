//01
// #include <stdio.h>
// #include <math.h>

// #ifndef M_PI
// #define M_PI 3.14159265358979323846
// #endif

// int main(void) {
//     double raio, volume;

//     printf("Digite o valor do raio da esfera: \n");
//     scanf("%lf", &raio);

//     volume = (4.0 / 3.0) * M_PI * pow(raio, 3);

//     printf("O volume da esfera e: %.2f\n", volume);

//     return 0;
// }

//02

// #include <stdio.h>

// int main(void) {
//     double n1, n2, n3;
//     double p1, p2, p3;
//     double media_ponderada;

//     printf("Digite o primeiro numero e o seu peso: \n");
//     scanf("%lf %lf", &n1, &p1);

//     printf("Digite o segundo numero e o seu peso: \n");
//     scanf("%lf %lf", &n2, &p2);

//     printf("Digite o terceiro numero e o seu peso: \n");
//     scanf("%lf %lf", &n3, &p3);

//     media_ponderada = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

//     printf("A media ponderada e: %.2f\n", media_ponderada);

//     return 0;
// }


//03

// #include <stdio.h>

// int main(void) {
//     int homicidios;
//     double habitantes;

//     printf("Digite a quantidade de homicídios: \n");
//     scanf("%d", &homicidios);

//     printf("Digite o número total de habitantes da cidade: \n");
//     scanf("%lf", &habitantes);

//     double taxa = (homicidios / habitantes) * 100.0;

//     printf("A taxa de homicídios é de %.2f porcento por 100 mil habitantes.\n", taxa);

//     return 0;
// }

//04

// #include <stdio.h>

// int main(void) {
//     double n1, t, an;
//     int n;

//     printf("Digite o valor do primeiro elemento (n1): \n");
//     scanf("%lf", &n1);

//     printf("Digite a quantidade de termos (t): \n");
//     scanf("%d", &n);

//     printf("Digite o valor da razão (r): \n");
//     scanf("%lf", &t);

//     an = n1 + (n - 1) * t;
//     printf("O %dº termo da progressão aritmética é: %.2f\n", t, an);

//     return 0;
// }

//05

// #include <stdio.h>

// int main(void) {
//     int horaInicio, minutoInicio;
//     int horaFim, minutoFim;

//     printf("Digite a hora de início: \n");
//     scanf("%d", &horaInicio);
//     printf("Digite o minuto de início: \n");
//     scanf("%d", &minutoInicio);

//     printf("Digite a hora de término: \n");
//     scanf("%d", &horaFim);
//     printf("Digite o minuto de término: \n");
//     scanf("%d", &minutoFim);

//     int totalMinutosInicio = (horaInicio * 60) + minutoInicio;
//     int totalMinutosFim = (horaFim * 60) + minutoFim;

//     if (totalMinutosFim < totalMinutosInicio) {
//         totalMinutosFim += 24 * 60;
//     }

//     int duracaoTotal = totalMinutosFim - totalMinutosInicio;

//     printf("A duração total do evento foi de %d minutos.\n", duracaoTotal);

//     return 0;
// }




//06
// #include <stdio.h>
// int main(void){
//   double base;
//   double altura;
//   printf("Digite a base do triângulo: \n");
//   (void)scanf("%lf", &base);
//   printf("Digite a altura do triângulo: \n");
//   (void)scanf("%lf", &altura);
//   double area = base * altura / 2;

//   printf("A área do triângulo é:%lf",area);
//   return 0;
// }

//07
// #include <stdio.h>

// int main(void){
//   double celsius;
//   printf("Digite a temperatura em graus Ceusius: \n");
//   (void) scanf("%lf", &celsius);
//   double fahrenheit = (celsius * 9 / 5) + 32;

//   printf("A temperatura em Fahrenheit é: %lf", fahrenheit);
// }

//08
// #include <stdio.h>

// int main(void){
//   double precoProduto;
//   double porcentagem;
//   printf("Digite o preço do produto: \n");
//   (void) scanf("%lf", &precoProduto);
//   printf("Digite a quantidade de desconto: \n");
//   (void) scanf("%lf", &porcentagem);

//   double desconto = precoProduto * (100 - porcentagem) / 100;
//   printf("O preço do produto com o desconto aplicado é: %lf", desconto);

// }

//09
// #include <stdio.h>
// #include <math.h>

// int main(void) {
//     double capital, taxa, montanteSimples, montanteComposto;
//     int tempo;

//     printf("Digite o capital a ser investido: \n");
//     scanf("%lf", &capital);

//     printf("Digite a taxa de juros mensal: \n");
//     scanf("%lf", &taxa);

//     printf("Digite o tempo em meses da aplicacao: \n");
//     scanf("%d", &tempo);

//     taxa = taxa / 100;

//     montanteSimples = capital * (1 + taxa * tempo);

//     montanteComposto = capital * pow(1 + taxa, tempo);

//     printf("O montante com juros simples e: R$ %.2f\n", montanteSimples);
//     printf("O montante com juros compostos e: R$ %.2f\n", montanteComposto);

//     return 0;
// }



// //10
// #include <stdio.h>

// int main(void) {
//     int numero;
//     int i;

//     printf("Digite um numero: \n");
//     scanf("%d", &numero);

//     for (i = 1; i <= 10; i++) {
//         printf("%d x %d = %d\n", numero, i, numero * i);
//     }

//     return 0;
// }
