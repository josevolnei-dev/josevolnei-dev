algoritmo "MediaDeTrezNumeros"
// Disciplina  :  [Introducao e Lógica de Programação]
// Professor   : [Nome do Professor]
// Descrição   : receber trz numeros e calcular a media! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : ${DATA_ATUAL}/${MES_ATUAL}/${ANO_ATUAL}
var
Numero1: real
Numero2: real
Numero3: real
media :real

inicio

    escreval ("informe o primeiro numero")
        leia (Numero1)
    escreval("informe o segundo numero")
        leia (Numero2)
    escreval(" informe o terceiro numero")
        leia (Numero3)
    
    media <- ( Numero1 + Numero2 + Numero3)/3

    escreval ("A media de trez numeros e", media)

fimalgoritmo