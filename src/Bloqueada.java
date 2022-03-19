public class Bloqueada extends Estado {
    Bloqueada(Conta conta) {
        super(conta);
    }

    @Override
    public void onDeposito() {
        if (conta.isSacando()) {
            System.out.println("Conta Bloqueada");
            return;
        }
    }

    @Override
    public void onSaque() {

    }
}
