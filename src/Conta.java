import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Conta {
    private double saldo;
    private Estado estado;
    private ArrayList<Operacao> extrato = new ArrayList<>();

    public Conta(double saldo){
        if(saldo < 0) throw new InvalidParameterException("O saldo não pode ser negativo");
        this.saldo = saldo;
        this.estado = new Positiva(this);
    }

    public void sacar(double valor){
        if(valor < 0) Math.abs(valor);
        System.out.println("Sacar: " + valor);
        estado.onSaque(valor);
        System.out.println(this + "\n");
    }

    public void depositar(double valor){
        if(valor < 0) Math.abs(valor);
        System.out.println("Depositar: " + valor);
        estado.onDeposito(valor);
        System.out.println(this + "\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getExtrato(){
        StringBuilder depositosString = new StringBuilder();
        StringBuilder saquesSting = new StringBuilder();
        if(this.extrato.size() > 0) depositosString.append("\t[DATA DA OPERAÇÃO] \t\t[TIPO] \t\t[VALOR]\n");
        else depositosString.append("Nenhuma operação foi realizada para esta conta.\n");
        for(Operacao operacao : this.extrato){
            depositosString.append("\t" + operacao + "\n");
        }

        return "[Extrato]:\n" + depositosString
                + "\nSaldo Atual: R$" + saldo
                + "\nEstado: " + estado.getClass().getName();
    }

    @Override
    public String toString() {
        return "[Conta]: "
                + "Saldo Atual: R$" + saldo
                + ", Estado: " + estado.getClass().getName();
    }

    protected void setEstado(Estado estado) {
        this.estado = estado;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void addMovimentacao(Operacao operacao) {
        this.extrato.add(operacao);
    }
}
