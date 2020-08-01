package ui;

import javax.swing.*;
import java.awt.*;

public class FaculdadeFrame extends JFrame {
    public void defaultConfig() {
        //Realizar ajuste para o programr ser executado no centro da tela;
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);

        this.setVisible(true);
        // Para o programar ao clicar no fecahr
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
