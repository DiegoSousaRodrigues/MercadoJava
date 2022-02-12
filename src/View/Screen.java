package View;

import javax.swing.*;
import java.awt.*;

public class Screen {
    JFrame tela = new JFrame();
    private JButton ok;

    public void mainScreen() {
        tela.setSize(500, 800);

        ok = new JButton("Adicionar Produto");
        tela.setLayout(null);
        ok.setBounds(200,400,150,60);
        tela.add(ok);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
