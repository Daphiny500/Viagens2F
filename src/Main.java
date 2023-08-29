import javax.swing.*;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        //Classe objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();

        //Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");

        //Definir comportamento
        String retorno = mochileiro.viajar();
        JOptionPane.showMessageDialog(null,retorno);
    }
}