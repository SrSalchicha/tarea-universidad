package SegundoCuatrimestre;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGrafico2 extends JFrame {
    private JButton regresarButton;
    private JPanel panelMain;

    public MenuGrafico2() {
        setVisible(true);
        setContentPane(panelMain);
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu regreso = new Menu();
                regreso.MultiList = Pila.pop();

            }
        });
    }
}
