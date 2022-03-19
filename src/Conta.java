import java.lang.reflect.Array;
import java.util.ArrayList;

public class Conta {
    private double saldo;
    private Estado estado;
    private ArrayList <Saque> saques;
    private ArrayList <Deposito> depositos;

    private boolean sacando;
    private boolean depositando;

    public Conta(double saldo) {
        this.saldo = saldo;
        this.estado = new Positiva(this);
    }

    public void Sacar(double valor){
        this.sacando = true;

    }

    public boolean isSacando() {
        return this.sacando;
    }

    public boolean isDepositando() {
        return this.sacando;
    }

}
