package teste;

import javax.swing.JFrame;

public class JanelaMobile {
    public static void main(String[] args) {
    
        JFrame janela = new JFrame("janela mobile");

        janela.setSize(750, 320);

        janela.setLocation(0, 0);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setVisible(true);
    }
}

