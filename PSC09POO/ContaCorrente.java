package banco;

public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibe() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}