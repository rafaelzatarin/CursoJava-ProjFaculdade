package ui;

import business.AlunoBusiness;
import com.sun.deploy.security.SelectableSecurityManager;
import entity.AlunoEntity;
import entity.CursoTipo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aluno extends FaculdadeFrame {
    private JPanel rootPanel;
    private JTextField textNome;
    private JTextField textSobrenome;
    private JRadioButton radioMatematica;
    private JRadioButton radioInformatica;
    private JRadioButton radioEngenharia;
    private JCheckBox checkPromocional;
    private JButton buttonSair;
    private JButton buttonSalvar;

    private AlunoBusiness mAlunoBusiness;

    public Aluno() {
        this.setContentPane(rootPanel);
        this.setSize(600, 350);
        this.setTitle("Cadastro de Alunos");

        super.defaultConfig();

        this.mAlunoBusiness = new AlunoBusiness();

        this.radioMatematica.setSelected(true);
        this.setEvents();
    }

    private void setEvents() {
        this.buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Salvar();
            }
        });

        this.buttonSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
                dispose();
            }
        });

    }

    private void Salvar() {
        try {
            String nome = this.textNome.getText().trim();
            String sobrenome = this.textSobrenome.getText().trim();

            CursoTipo cursoTipo;
            if (radioMatematica.isSelected())
                cursoTipo = CursoTipo.MATEMÁTICA;
            else if (radioInformatica.isSelected())
                cursoTipo = CursoTipo.INFORMÁTICA;
            else
                cursoTipo = CursoTipo.ENGENHARIA;

            boolean promocional = this.checkPromocional.isSelected();

            AlunoEntity alunoEntity = new AlunoEntity(nome, sobrenome, cursoTipo, promocional);
            this.mAlunoBusiness.validate(alunoEntity);
            this.mAlunoBusiness.create(alunoEntity);

        } catch (Exception e){
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }

    }
}
