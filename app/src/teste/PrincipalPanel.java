import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrincipalPanel implements ActionListener {

    private static JButton botao;

    public static void main(String[] args) {
        JFrame frame = new JFrame("exemplo Principal Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JLabel mensagem = new JLabel("essa é uma mensagem!");

        botao = new JButton("fazer login");
        
        PrincipalPanel principal = new PrincipalPanel(); // cria instância para o listener
        botao.addActionListener(principal); // adiciona o listener ao botão

        panel.add(mensagem);
        panel.add(botao);

        frame.add(panel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botao) {
            JOptionPane.showMessageDialog(null, "Você clicou no botão Fazer login!");
        }
    }
}
