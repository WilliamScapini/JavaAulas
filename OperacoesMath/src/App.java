import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       int numero1 = 6;
       int numero2 = 7;
       int res = numero1 + numero2;
JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " + " + numero2 + " é " + res, "soma", JOptionPane.INFORMATION_MESSAGE);
    }
}
