public abstract class Estado {
    Conta conta;
    Estado(Conta conta){
        this.conta = conta;
    }

    public abstract void onDeposito();
    public abstract void onSaque();
}
