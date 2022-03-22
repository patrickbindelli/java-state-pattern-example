public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta(0);

        conta.depositar(100);

        conta.sacar(3243);

        System.out.println();
        System.out.println(conta);
        System.out.println(conta.getExtrato());
    }
}
