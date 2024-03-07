package banco;
public class Banco {

    public static void main(String[] args) {
            ContaCorrente uma = new ContaCorrente(5000.0);
            ContaCorrente outra = new ContaCorrente(15000.0);

            uma.sacar(1000);
            outra.depositar(2000);

        System.out.println(uma.saldo());
        System.out.println(outra.saldo());

    }
}



