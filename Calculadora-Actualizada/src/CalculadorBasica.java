import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadorBasica extends JFrame implements ActionListener{
    private JButton button[] = new JButton[18];
    private JTextField display = new JTextField();
    private JPanel higher = new JPanel();
    private JPanel middle = new JPanel();
    private JPanel lower = new JPanel();
    private String s = "";

    public CalculadorBasica(){
        //Initialization of objects
        for (int i = 1; i < 10; i++){
                button[i] = new JButton("" + i);
        }
        button[10] = new JButton("0");
        button[11] = new JButton("+");
        button[12] = new JButton("-");
        button[13] = new JButton("/");
        button[14] = new JButton("*");
        button[15] = new JButton(".");
        button[16] = new JButton("=");
        button[17] = new JButton("New");

        //add components
        setLayout(new BorderLayout());
        higher.setLayout(new BorderLayout());
        higher.add("Center", display);
        display.setEditable(false);
        middle.setLayout(new GridLayout(4,4));

        for (int i = 1; i < 17; i++){
            middle.add(button[i]);
        }
        lower.setLayout(new BorderLayout());
        lower.add("Center", button[17]);
        add("North", higher);
        add("Center", middle);
        add("South", lower);

        for (int i = 1; i < 18; i++){
            button[i].addActionListener(this);
        }

        setBounds(50,50,200,200);
        setVisible(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        for (int i = 1; i < 17; i++){
            if (e.getSource() == button[i]){
                s += button[i].getText();
                System.out.println(s);
            }
        }
        if (e.getSource() == button[17]){
            //aqui va la magia
        }

    }

}
