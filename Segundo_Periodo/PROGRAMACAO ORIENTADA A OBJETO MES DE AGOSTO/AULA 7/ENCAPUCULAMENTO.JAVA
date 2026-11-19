/***1. Quais são os problemas de manutenção e repetição de código no modelo atual sem herança?**

Sem herança, as classes Carro, Caminhao e Onibus possuem os mesmos atributos, como marca, modelo e placa, além de métodos em comum, como ligar() e desligar(). Isso causa repetição de código. Quando é necessário alterar ou corrigir alguma característica comum, a alteração precisa ser feita em todas as classes, aumentando o trabalho e o risco de erros e inconsistências no sistema.

**2. Como a utilização do conceito de herança poderia resolver esse problema?**

A herança permite criar uma classe-pai com os atributos e métodos que são comuns a todos os veículos. As classes Carro, Caminhao e Onibus podem herdar essas características da classe-pai e utilizar o código já existente, sem precisar repeti-lo. Dessa forma, o código fica mais organizado, fácil de manter e reutilizar.

**3. Qual seria a classe-pai adequada nesse cenário e quais atributos e métodos deveriam estar nela?**

A classe-pai adequada seria **Veiculo**.

Ela poderia possuir os seguintes atributos:

* marca
* modelo
* placa

E os seguintes métodos:

* ligar()
* desligar()

Essas características são comuns a todos os tipos de veículos.

**4. Quais seriam as classes-filhas e quais características específicas 
cada uma deveria implementar?**

As classes-filhas seriam:

* **Carro** – teria o atributo capacidadePassageiros.
* **Caminhao** – teria o atributo capacidadeCarga.
* **Onibus** – teria o atributo quantidadeAssentos.

Todas elas herdariam de Veiculo os atributos marca, modelo e placa, além 
dos métodos ligar() e desligar().

**5. Explique como a herança favorece a reutilização de código e a extensibilidade
 do sistema.**

A herança favorece a reutilização de código porque os atributos e métodos comuns 
ficam concentrados na classe-pai e podem ser utilizados pelas classes-filhas. Isso 
evita a repetição de código e facilita a manutenção. Além disso, o sistema se torna



mais extensível, pois novos tipos de veículos podem ser criados como novas classes-

filhas, aproveitando as características da classe Veiculo e adicionando apenas suas
 próprias características específicas.





*/