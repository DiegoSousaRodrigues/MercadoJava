package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Screen {
    private JFrame tela = new JFrame();
    private JButton addProd, closeJframe;
    private ProductScreen prdScreen = new ProductScreen();

    public void mainScreen() {
        tela.setSize(500, 800);

        addProd = new JButton("Adicionar Produto");
        tela.setLayout(null);
        addProd.setBounds(160,200,150,60);
        tela.add(addProd);

        closeJframe = new JButton("Sair");
        tela.setLayout(null);
        closeJframe.setBounds(160, 300,150,60);
        tela.add(closeJframe);

        closeJframe.addActionListener(e ->{
            tela.dispose();
        });
        addProd.addActionListener(e -> {
            tela.setVisible(false);
            prdScreen.AddScreenAddProduto();
            tela.setVisible(true);
        });

        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }


}
