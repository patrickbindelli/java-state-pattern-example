public enum TipoOperacao {
    SAQUE("Saque"),
    DEPOSITO("Depósito");

    private String valor;

    TipoOperacao(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
