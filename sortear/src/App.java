import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
/*         float variavel = (float)(1+ (Math.random() * 5));
        int variavel1 = Math.round(variavel); */
        Random gerador = new Random();
        int variavel1 = gerador.nextInt(6)+1;
        JOptionPane.showMessageDialog(null, variavel1);
    }
}
