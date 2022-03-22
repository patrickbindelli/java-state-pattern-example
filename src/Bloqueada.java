public class Bloqueada extends Estado {
    public Bloqueada(Conta conta) {
        super(conta);
    }

    @Override
    public void onDeposito(double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("A conta foi desbloqueada.");
        if(conta.getSaldo() > 0) conta.setEstado(new Positiva(conta));
        else conta.setEstado(new Negativa(conta));
    }

    @Override
    public void onSaque(double valor) {
        System.out.println("Conta bloqueada.");
        System.out.println(conta);
    }
}
