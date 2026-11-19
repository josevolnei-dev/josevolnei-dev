Atividade Prática: Sistema de Veículos

Valor 10 pontos
Objetivo

    Exercitar o conceito de herança em Java.
    Entender como atributos e métodos podem ser reutilizados em subclasses.
    Diferenciar membros herdados dos específicos de cada classe.
    Representar a estrutura de herança do sistema por meio de um diagrama UML.

Enunciado

Implemente um pequeno sistema em Java para representar veículos.

        1. Diagrama UML (classe-pai e subclasses)

        Antes de implementar o código, desenhe um diagrama UML simples representando a herança entre as classes Veiculo, Carro, Moto e Onibus. O diagrama deve indicar:
            A classe-pai Veiculo e as três classes-filhas herdando dela.
            Os atributos e o método comuns, presentes em Veiculo.
            O atributo e o método específicos de cada subclasse.

2. Classe Veiculo (classe-pai)

Crie uma classe Veiculo com os seguintes atributos e métodos:

    Atributos: marca, modelo, ano.
    Método: exibirInfo() → exibe os dados do veículo.

3. Subclasses Carro, Moto e Onibus

Crie as seguintes subclasses que herdem de Veiculo:

    Carro → com atributo adicional quantidadePortas e método abrirPortaMalas().
    Moto → com atributo adicional cilindradas e método empinar().
    Onibus → com atributo adicional quantidadePassageiros e método abrirPorta().

        4. Classe principal (Main)

        Na classe principal (main), crie objetos de Carro, Moto e Onibus, inicialize seus atributos e demonstre:
            O uso de atributos e métodos herdados da classe Veiculo.
            O uso de atributos e métodos específicos de cada subclasse.



Saída Esperada

A execução do programa deverá gerar uma saída semelhante a esta:

Marca:Toyota,Modelo:Corolla,Ano:2022

Abrindooporta-malasdocarroCorolla

Marca:Honda,Modelo:CG,Ano:2021

AmotoCGestáempinando!

Marca:Mercedes,Modelo:Urbano,Ano:2020

AbrindoaportadoônibusUrbano


Dica para o aluno: Antes de implementar, desenhe um diagrama UML simples representando a herança entre as classes Veiculo, Carro, Moto e Onibus.