/*Utilizando a ferramenta visualg, codifique um algoritmo
que resolva o seguinte problema: O usuário deverá informar
o seu nome e o ano de nascimento e o algoritmo deverá realizar
o cálculo da idade e de dias vividos e exibir na tela para o
usuário, o nome informado, a idade e a quantidade de dias
    vividos. Para o cálculo dos dias vividos, considere a idade
    dividida por 365.

*/Algoritmo "idade_dias"

Var nome: caractere anoNascimento, idade, dias: inteiro

Inicio escreva("Digite seu nome: ")

leia(nome) escreva("Digite o ano de nascimento: ")
leia(anoNascimento)

 idade <- 2026 - anoNascimento dias <- idade * 365

escreval("Nome: ", nome)
escreval("Idade: ", idade)

escreval("Dias vividos: ", dias)
Fimalgoritmo
