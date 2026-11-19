/*
*Utilizando a ferramenta visualg, codifique um algoritmo que resolva o
seguinte problema: O usuário deverá informar dois números que aceite casas
decimais e o algoritmo deverá realizar o cálculo exponencial desses números 
e exibir o resultado na tela para o usuário.

*/
Algoritmo "calculo_exponencial"
Var base, expoente, resultado: real

Inicio escreva("Digite a base: ")

leia(base) escreva("Digite o expoente: ")
  leia(expoente) resultado <- exp(expoente * ln(base))

escreval("Resultado = ", resultado:0:2)

Fimalgoritmo









