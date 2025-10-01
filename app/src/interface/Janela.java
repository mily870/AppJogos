
import javax.swing.JPanel;

import java.awt.CardLayout;


import javax.swing.JFrame;


public class Janela extends JFrame{
    public Janela(){
        this.setBounds(0,0,1920,1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = JPanel (controleTela);]
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        PrincipalPanel PrincipalPanel = new PrincipalPanel(telas, this);
    }
}
