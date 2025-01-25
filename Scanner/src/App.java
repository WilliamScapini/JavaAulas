
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String time = JOptionPane.showInputDialog(null, "Qual Seu time do coração?", "Time",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Seu time do coração é " + time, time, JOptionPane.INFORMATION_MESSAGE);
    }
}
