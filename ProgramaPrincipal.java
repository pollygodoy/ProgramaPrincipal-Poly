#  ProgramaPrincipal-Poly
// O Exercicio começa a partir da linha 18
// Cria um arquivo com o nome ProgramaPrincipal.java
public class Programa Principal {
    // Esse código está correto
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
    }
}

// Existem correções 10
Classe pública ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    saldo duplo privadoAtual;

    // Método Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    // Métodos
    private String depositar(double valorDeposito) {
        this.saldoAtual = saldoAtual + valorDeposito;
    }

    private void sacar(double valorSaque) {
        if (this.valorSaque >= saldoAtual);
        this.valorSaque -= saldoAtual;
        {
         System.out.println("Saldo insuficiente");
        }

    }
         outro {
            this.saldoAtual = saldoAtual - valorSaque;
        }
    }

    private void obterSaldo() {
        retornar saldoAtual;
    }