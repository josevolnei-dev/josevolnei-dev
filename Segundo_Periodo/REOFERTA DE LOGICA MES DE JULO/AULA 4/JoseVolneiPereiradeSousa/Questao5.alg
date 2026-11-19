/*Utilizando a ferramenta visualg, codifique um algoritmo que resolva
o seguinte problema: O usuário deverá informar dois números inteiros e o
algoritmo deverá realizar o cálculo do resto da divisão desses números e exibir
o resultado na tela
para o usuário.

*/Algoritmo "resto_divisao"

Var
num1, num2, resto: inteiro

Inicio

escreva("Digite o primeiro número: ")
leia(num1)

escreva("Digite o segundo número: ")
leia(num2)

resto <- num1 % num2

escreval("O resto da divisão é: ", resto)

Fimalgoritmo