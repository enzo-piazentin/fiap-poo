# FiapRide

## O que é?

FiapRide é um sistema simples de gerenciamento de passageiros para um serviço de transporte.

## O que a classe Passageiro faz?

A classe `Passageiro` representa uma pessoa que usa o serviço de transporte. Ela gerencia:
- Nome e CPF do passageiro
- Saldo de créditos disponível
- Validade do passaporte

## Métodos

### 1. `adicionarSaldo(double valor)`
Adiciona créditos à conta do passageiro.
```java
passageiro.adicionarSaldo(50.0);
```

### 2. `validadePassaporte(int data)`
Valida o passaporte. Se `data > 25` é válido, senão está vencido.
```java
passageiro.validadePassaporte(28);  // Válido
```

### 3. `pagarViagem(double custo)`
Paga uma viagem deduzindo do saldo.
```java
passageiro.pagarViagem(20.0);
```

### 4. `passaporteConfiscado(boolean confiscado)`
Gerencia se o passaporte está confiscado (`false`) ou regularizado (`true`).
```java
passageiro.passaporteConfiscado(true);  // Regularizado
```

## Como usar

```java
// Criar um passageiro
Passageiro passageiro = new Passageiro("João Santos", "111.222.333-44");

// Adicionar saldo
passageiro.adicionarSaldo(100.0);

// Validar passaporte
passageiro.validadePassaporte(30);

// Pagar uma viagem
passageiro.pagarViagem(25.50);
```


