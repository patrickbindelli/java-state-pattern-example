import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacao {
    TipoOperacao tipo;
    Double valor;
    String data;

    public Operacao(TipoOperacao tipo, Double valor) {
        this.valor = valor;
        this.tipo = tipo;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.data = dateTimeFormatter.format(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "[" + data + "]\t" + String.format("%-8s", tipo) +  "\tR$"  + valor;
    }
}
