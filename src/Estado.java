
public abstract class Estado {
    Conta conta;
    Estado(Conta conta){
        this.conta = conta;
    }

    public abstract void onDeposito(double valor);
    public abstract void onSaque(double valor);

}
