## Relatório Dos Componentes de Orientação a Objetos
### Herança
As classes Carro e Moto herdam atributos e métodos da classe Aluguel. Isso promove a reutilização de código

### Classes Abstratas
A classe abstrata Aluguel serve como uma base para as classes concretas Carro e Moto. Ela contém atributos e métodos comuns a ambas as subclasses, permitindo a reutilização de código e fornecendo uma estrutura comum para suas implementações específicas.

### Classes Concretas
São as classes Carro e Moto que utilizamos para herdar uma classe abstrata implementando as funcionalidades definidas pela classe mãe

### Métodos abstratos
Define um conjunto de operações que qualquer implementação dessa interface deve fornecer.

### Metodo Concreto
Um exemplo de método concreto no nosso código é os métodos do CRUD, pq pegamos a assinatura da interface e implementamos ele na classe que herda, e definimos o método la.

### Polimorfismo
O polimorfismo é aplicado ao utilizar métodos da interface Aluguel em outras classes, como Carro e Moto. Isso significa que essas classes podem implementar esses métodos de maneiras diferentes, adequando-se às suas próprias necessidades, mas mantendo a mesma assinatura definida na interface.

### Interface
A interface Aluguel define um conjunto de operações que podem ser realizadas em relação aos aluguéis de carros e motos no código

### Encapsulamento
Os atributos da classe Aluguel são declarados como privados, o que significa que eles não podem ser acessados diretamente de fora da classe. Para permitir o acesso a esses atributos, métodos getters e setters são fornecidos, garantindo que o acesso e a modificação dos dados ocorram de maneira controlada.



<center>
    <h1 align="center">Projeto com Spring</h1>
    <h4 align="center">Trabalho da matéria de Linguagem de Programação <strong>Orientada a Objetos</strong> </h4>
  <p align="center">
        <strong>Data de Entrega:</strong> 3 Abril 2024<br>
        <strong>Valor:</strong> 70 pontos
    </p> 
</center>

## Trabalho com Spring
Baseado no projeto desenvolvido durante as aulas você deverá:

    Ampliar o escopo inicialmente apresentado. (Sugiro a alteração do cenário por completo).
    Adicionar componentes da Orientação a Objetos que possam facilitar a manutenção e desenvolvimento do projeto, por exemplo: Heranças, Classes e métodos abstratos,         Polimorfismo, Interfaces, etc...
    Personalizar as funcionalidades do cenário escolhido além das funcionalidades básicas do CRUD
    Tratamento de validações para os campos de cada Entidade mapeada pelo projeto
    Separação das camadas MVC, juntamente com a camada Service.

O trabalho seguirá a organização de acordo com as postagens no mural, relacionado ao desenvolvimento individual ou em grupo.

OBS: Estas definições podem sofrer alterações de acordo com o andamento das aulas teóricas.
OBS2: Lembrem-se que teremos uma avaliação escrita em cima do projeto desenvolvido para validar os pontos especificados. Desta forma, é importantíssimo a maior ampliação e utilização dos componentes de OO possível.

Forma de entrega: Todos componentes do grupo deverão gravar um vídeo de no máximo 10 minutos expondo as funcionalidades do projeto, bem como o código fonte (repositório público no Git). É obrigatório a participação de TODOS componentes.

Trabalhos atrasados serão desconsiderados.

Trabalhos copiados serão desconsiderados
