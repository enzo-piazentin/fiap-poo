# Projeto FiapRide - Enzo Ribeiro Domingues Piazentin

## Informações do Aluno

- **Nome:** Enzo Ribeiro Domingues Piazentin
- **RM:** 564216
- **Turma:** 2CCPO
- **Curso:** Ciências da Computação
- **GitHub:** @enzo-piazentin

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (sistema de gerenciamento de pets).

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**
Com variáveis soltas funciona para um passageiro só. Para um milhão eu teria que repetir nome, cpf e saldo de cada um, e não dá nem para organizar isso direito. A classe Passageiro define uma vez o que todo passageiro tem, e depois é só usar new Passageiro para criar quantos forem, servindo como modelo. Cada um vira um objeto separado na memória, mas todos seguem a mesma estrutura. Assim eu consigo colocar todos numa lista e chamar o mesmo método pagarViagem em qualquer um deles. O sistema funciona igual independente da quantidade de usuários.

---

### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Sua Resposta:**
Se eu mexo direto no saldo eu pulo toda a validação. O if no adicionarSaldo bloqueia valor zero ou negativo, então quando o método é usado eu garanto que o saldo nunca recebe lixo. Sem isso, qualquer programador poderia escrever passageiro.saldo = -50000 e gerar saldo negativo, ou viagem de graça. Tem outra coisa: a regra fica num lugar só. Se um dia eu quiser aplicar um bônus na recarga ou cobrar uma taxa, eu mudo só o adicionarSaldo e isso vale pro sistema inteiro. Numa empresa de mobilidade, isso evita fraude e bug no relatório financeiro.

---

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar?

**Sua Resposta:**
O getSaldo só devolve o valor para quem chamou, é uma leitura. A pessoa que recebeu não consegue alterar o saldo de dentro do objeto, ela só viu o número. Se o atributo fosse public, qualquer um poderia escrever direto nele e mudar para qualquer coisa. É a mesma diferença de dar uma cópia do RG para alguém olhar versus entregar o RG original para pessoa rasurar. Mantendo o atributo private e expondo só o get, eu continuo no controle de como o saldo é guardado e calculado por dentro.

---

### Aula 4 - Construtores

**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

**Sua Resposta:**
A IDE não sabe a regra do negócio, ela só olha os atributos e gera setter para todos. Mas tem coisa que não muda na vida real. Um Onix não vira Corolla, ou seja, o modelo do carro não deveria ter setter nenhum. Se eu deixar o setModelo, um bug pode trocar o modelo do carro no sistema e quebrar a relação com placa, seguro, Detran. A placa até muda, mas só por um processo formal. Por isso o setPlaca é privado e tem um método público chamado atualizarPlaca, que representa o processo certo de pedir nova placa. As duas decisões garantem que ninguém troca os dados na marra, só por um caminho com validação.

---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?

**Sua Resposta:**
String é só texto, não faz nada. A Viagem precisa descontar saldo, ver se o passageiro tem crédito, registrar o pagamento. Só dá para fazer isso se a Viagem tiver o objeto Passageiro inteiro, porque é nele que está o método pagarViagem e o atributo saldo. Com a String "Ana Silva" eu não consigo descontar nada. Outro ponto: como Java passa o objeto por referência, se a Ana recarregar depois que a Viagem foi criada, a Viagem já enxerga o saldo novo na hora, porque os dois apontam pro mesmo Passageiro.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Sua Resposta:**
O princípio é o encapsulamento da Aula 3. Private quer dizer "só essa classe acessa", e essa regra vale até paras filhas. Se o Carro pudesse escrever direto em this.placa, ele pularia a validação do setPlaca (que checa se a placa não é nula nem vazia) e podia cadastrar um veículo sem placa no sistema. Obrigando o Carro a usar super() ou setPlaca, a validação da mãe sempre roda, e a regra é respeitada por todas as filhas. A herança compartilha a estrutura, mas o controle de quem pode escrever no atributo continua só da classe que criou ele.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Sua Resposta:**
Não conseguiríamos. O Java verifica os métodos na hora de compilar, olhando o tipo declarado da variável. Como a variável é do tipo Veiculo, ele só deixa chamar métodos que Veiculo tenha. Se calcularAutonomia não existir na mãe, o veiculo.calcularAutonomia() dentro do for vai dar erro vermelho, mesmo que as filhas tenham o método. O contrato precisa estar na mãe porque é ela que define o que todo veículo sabe fazer. As filhas podem sobrescrever do jeito delas, mas a "promessa" do método tem que existir na base, senão o loop nem compila.

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Sua Resposta:**
Na vida real ninguém compara "um veículo" só. Compara um carro, uma moto, um caminhão. Mas o Java não tem como adivinhar isso. para ele, qualquer classe pode ser instanciada por padrão. Por isso precisamos colocar o abstract na frente, para dizer que essa classe é só um molde. Se esquecer, alguém pode chamar new Veiculo("ABC-1234", "Genérico") e cadastrar na frota um veículo que não é nem carro nem moto. O sistema compila, mas começa a dar resposta genérica onde deveria ter cálculo específico. O abstract garante que só dá para criar um Veiculo passando por uma filha concreta como Carro ou Moto.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?

**Sua Resposta:**
Se herança múltipla fosse permitida e Veiculo e Bateria tivessem o método ligar(), o CarroEletrico não ia saber qual usar, o da mãe Veiculo ou o da mãe Bateria. Java prefere proibir isso logo no começo: só uma mãe pode trazer código pronto. Interfaces resolvem porque elas não têm código nenhum, só a assinatura do método. Implementar Recarregavel e GPS ao mesmo tempo não dá conflito porque nenhuma das duas vem com implementação. Quem escreve o código do método é a classe que assina o contrato. Por isso o CarroEletrico pode ser ao mesmo tempo um Veiculo e um Recarregavel, e um Celular pode ser só Recarregavel sem nenhum parentesco com Veiculo.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Sistema de gerenciamento de pets. Escolhi porque é um domínio que eu conheço bem e dava para encaixar perfeitamente nas aulas: tem hierarquia natural (Pet como classe mãe, Gato e Cachorro como filhas) e comportamentos que podem ser compartilhados através de interfaces, como brincar.

**Quais classes você criou?**
Pet (abstrata), Gato, Cachorro, Dono e a interface Comportamental. A Pet tem os atributos comuns (nome, idade, nomeRaca, raca, dono) e os métodos exibirFichaDoPet e exibirFichaGeral, mais o método abstrato EmitirSom. O Gato e Cachorro herdam de Pet e implementam EmitirSom de forma diferente (miado e latido). A classe Dono representa a associação: cada Pet tem um Dono com nome, cpf, numero e email. A interface Comportamental define o contrato brincar(), que é implementado por Gato (caçando bolinha de lã) e Cachorro (buscando bolinho).

**Qual foi o maior desafio técnico que você enfrentou?**
Fiquei confuso na validação do construtor da Pet. No começo a lógica estava errada:

```java
if (nome != null && !nome.trim().isBlank() && idade >= 0 || idade <= 18 && dono.equals(dono.getNome()) && dono.getNome() == null){
```

O problema era que o operador || estava separando validações que deveriam estar juntas, e a condição `dono.equals(dono.getNome())` não faz sentido. Depois que eu revisei, entendi que precisava validar se o dono não é nulo e se seus dados estão completos antes de aceitar o cadastro do pet.

Outro desafio foi na Aula 9 com a interface Comportamental. Eu precisava fazer Pet implementar a interface, mas como Pet é abstrata, não precisei implementar brincar() nela. Só as classes concretas (Gato e Cachorro) implementaram. Isso mostrou bem a diferença entre classe abstrata e interface: a abstrata pode ter código compartilhado, a interface só define o contrato.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
Aprendi a montar um sistema todo em volta de classes, em vez de jogar tudo no main com variáveis soltas. Cada aula resolveu uma parte: classe para organizar os dados, método para validar a entrada, encapsulamento para esconder os atributos, construtor para obrigar os dados básicos no nascimento do objeto, associação para conectar uma classe na outra (Pet com Dono), herança para reaproveitar (Gato e Cachorro de Pet), polimorfismo para cada filha responder do seu jeito (EmitirSom diferente), classe abstrata para evitar instância genérica e interface para ligar classes que não têm a mesma mãe mas compartilham comportamento (Comportamental). Entendo um pouco melhor agora, mas tenho minhas dificuldades ainda, pois são muitos detalhes pequenos que preciso prestar atenção.

**Qual conceito foi mais difícil de entender?**
A diferença entre classe abstrata e interface. As duas podem ter métodos sem corpo, e mesmo eu sabendo que são diferentes eu esqueço no quê são. Então no projeto, coloquei Pet como classe abstrata porque Gato e Cachorro compartilham código (nome, idade, dono, exibirFicha), enquanto Comportamental era interface, porque um pet e outro animal que não é pet (como um pássaro) não têm nada a ver um com o outro, além de ter o mesmo comportamento de brincar. Eu ainda acho tudo um pouco difícil ainda, mas consegui me virar quanto a isso.

**O que você melhoraria no seu projeto se pudesse refazer?**
Pensaria a hierarquia inteira antes de começar a codar, essa parte é um pouco mais difícil por causa da minha indecisão. Algumas coisas do começo (validação errada no construtor, lógica confusa com o operador ||) tiveram que ser refeitas nas próximas aulas. Outra coisa que eu questiono no design é o uso do System.out.println dentro dos construtores e setters quando a validação falha. No construtor da Pet, se eu mandar dados inválidos o método só imprime "Erro: Informações erradas ou registro faltando" no console e segue como se nada tivesse acontecido, sem avisar quem chamou. Nos sistemas reais isso esconde bug, porque o método de fora pensa que deu certo. Eu trocaria por uma exceção, para forçar o tratamento do erro.
