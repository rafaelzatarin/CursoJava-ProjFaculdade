package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends FaculdadeFrame {
    private JPanel rootPanel;
    private JTable tableAlunos;
    private JButton buttonNovo;
    private JButton buttonExcluir;
    private JButton buttonEditar;
    private JButton buttonMensalidade;
    private JLabel labelInformatica;
    private JLabel labelMatematica;
    private JLabel labelEngenharia;

    public Main() {
        this.setContentPane(rootPanel);
        this.setSize(800, 450);
        this.setTitle("Projeto Faculdade");

        super.defaultConfig();

        this.setEvents();
    }

    private void setEvents(){
        this.buttonNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Aluno();
                dispose();
            }
        });

        this.buttonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        this.buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        this.buttonMensalidade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Mensalidade();
                dispose();
            }
        });
    }

}
