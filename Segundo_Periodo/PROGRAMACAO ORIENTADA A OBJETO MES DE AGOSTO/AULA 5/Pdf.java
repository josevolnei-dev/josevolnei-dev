# Estudo de Caso – Encapsulamento em Sistema de Pacientes

**Nome do aluno:** __________________________________________

### 1. Quais riscos surgem ao deixar atributos públicos em um sistema real de saúde?

Deixar os atributos públicos permite que qualquer parte do programa acesse e altere diretamente as informações dos pacientes. Em um sistema de saúde, isso pode causar erros nos dados e comprometer a segurança das informações.

Por exemplo, uma idade poderia ser registrada como um número negativo, um peso poderia receber o valor zero ou um valor negativo e a pressão arterial poderia ser armazenada em diferentes formatos. Essas informações incorretas podem prejudicar cálculos, relatórios e o funcionamento do sistema.

Além disso, informações de pacientes são sensíveis. Permitir alterações sem controle aumenta o risco de modificações indevidas e dificulta a garantia da integridade dos dados.

### 2. Como a aplicação do encapsulamento poderia resolver os problemas apresentados? Desenhe um diagrama UML para exemplificar a solução.

O encapsulamento permite proteger os atributos de uma classe, tornando-os **privados (`private`)** e controlando seu acesso por meio de métodos, como `get` e `set`.

Dessa forma, o programa não altera diretamente os dados do paciente. Os métodos `set` podem verificar se o valor informado é válido antes de armazená-lo. Assim, é possível impedir idades negativas, pesos inválidos e formatos incorretos de pressão arterial.

**Diagrama UML:**

```text
+----------------------------------+
|            Paciente              |
+----------------------------------+
| - nome: String                   |
| - idade: int                     |
| - pressaoArterial: String        |
| - peso: double                   |
+----------------------------------+
| + getNome(): String              |
| + setNome(nome: String): void    |
| + getIdade(): int                |
| + setIdade(idade: int): void     |
| + getPressaoArterial(): String   |
| + setPressaoArterial(p: String)  |
| + getPeso(): double              |
| + setPeso(peso: double): void    |
+----------------------------------+
```

No UML, o símbolo **`-`** representa atributos privados e o símbolo **`+`** representa métodos públicos.

### 3. Quais regras de validação poderiam ser implementadas nos métodos set para os atributos idade, pressão arterial e peso?

Para o atributo **idade**, o método `setIdade` poderia aceitar somente valores maiores ou iguais a zero. Dessa maneira, uma idade negativa seria rejeitada.

Para a **pressão arterial**, o método `setPressaoArterial` poderia exigir um formato padronizado, por exemplo, `120/80`. Dessa forma, formatos diferentes, como `12x8` ou `12-08`, poderiam ser rejeitados.

Para o **peso**, o método `setPeso` poderia aceitar somente valores maiores que zero. Assim, valores iguais a zero ou negativos não seriam armazenados.

Essas validações garantem que somente informações dentro das regras estabelecidas sejam armazenadas no objeto.

### 4. De que forma o encapsulamento contribui para a manutenção e a segurança de sistemas sensíveis como esse?

O encapsulamento contribui para a segurança porque impede o acesso e a alteração direta dos atributos. Os dados passam a ser modificados somente por métodos que podem aplicar regras de validação.

Isso também facilita a manutenção do sistema, pois as regras de acesso e validação ficam concentradas dentro da classe. Caso seja necessário alterar uma regra no futuro, o desenvolvedor pode modificar os métodos responsáveis sem precisar alterar todas as partes do programa.

Em um sistema de saúde, essa proteção é especialmente importante porque ajuda a manter os dados dos pacientes consistentes, reduz erros e aumenta a confiabilidade do sistema.
