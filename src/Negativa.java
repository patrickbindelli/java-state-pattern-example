public class Negativa extends Estado{
    Negativa(Conta conta) {
        super(conta);
    }

    @Override
    public void onDeposito(double valor) {
        conta.addMovimentacao(new Operacao(TipoOperacao.DEPOSITO, valor));
        conta.setSaldo(conta.getSaldo() + valor);
        if(conta.getSaldo() > 0) conta.setEstado(new Positiva(conta));
    }

    @Override
    public void onSaque(double valor) {
        if((conta.getSaldo() - valor) >= -100) {
            conta.addMovimentacao(new Operacao(TipoOperacao.SAQUE, valor));
            conta.setSaldo(conta.getSaldo() - valor);
        }else {
            System.out.println("Você não pode sacar esse valor. Sua conta foi bloqueada. Realize um depósito para desbloquear.");
            conta.setEstado(new Bloqueada(conta));
        }
    }
}
