package View;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ProductScreen implements ActionListener{

    JButton AddBotao, returnBotao;
    ArrayList<String> lista = new ArrayList<>();
    String fruta = "maça";
    JFrame tela_anterior;
    JFrame tela = new JFrame();

    public ArrayList<String> AddScreenAddProduto(JFrame telaAnterior){
        this.tela_anterior = telaAnterior;


        tela.setSize(500, 800);

        AddBotao = new JButton("Adicionar produto");
        tela.setLayout(null);
        AddBotao.setBounds(160,400,150,60);
        tela.add(AddBotao);

        returnBotao = new JButton("Retornar");
        tela.setLayout(null);
        returnBotao.setBounds(160,700,150,60);
        tela.add(returnBotao);

        returnBotao.addActionListener(this);
        AddBotao.addActionListener(this);

        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        return null;
    }
    public void actionPerformed(ActionEvent e) {
        if( e.getSource() ==  AddBotao) {
            createList(fruta);
        }
        if(e.getSource() == returnBotao){
            retornar(tela_anterior);
        }
    }

    public ArrayList<String> createList(String fruta){
        lista.add(fruta);
        return lista;
    }

    public void retornar(JFrame tela){
        this.tela.dispose();
        tela.setVisible(true);
    }
}
