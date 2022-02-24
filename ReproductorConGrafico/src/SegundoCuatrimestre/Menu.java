package SegundoCuatrimestre;

import SegundoCuatrimestre.Multimedios.Musica;
import SegundoCuatrimestre.Multimedios.Pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel panel1;
    private JLabel Titulo;
    private JComboBox textFormato;
    private JButton añadirButton;
    private JButton visualizarButton;
    private JButton salirButton;
    private JTextArea mostrarTexto;
    private JTextField textTitulo;
    private JTextField textAutor;
    private JTextField textActor;
    private JTextField textDuracion;
    private JTextField textAño;
    private JButton limpiarButton;
    private JButton eliminarUltimoDatoIngresadoButton;
    private JButton botonButton;


    //variables for save string
    private String titulo;
    private String autor;
    private String actor;
    private String formato;
    private Integer duracion;
    private Integer año;

    //variables para pila
     public PilaMultimedia MultiList;

    public void initComponets(){

    }

    public Menu(){

        setVisible(true);
        setContentPane(panel1);
        setSize(750,700);
        setTitle("Reproductor multimedia grafico");
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("IMG/conejo2.jpg"));
        setIconImage(iconoPropio);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Salir del programa
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        
        
        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo = textTitulo.getText();
                autor = textAutor.getText();
                actor = textActor.getText();
                formato = (String)textFormato.getSelectedItem();
                duracion = Integer.valueOf(textDuracion.getText());
                año = Integer.valueOf(textAño.getText());

                if (formato == "mp4" || formato == "dvd"||formato =="mov"||formato=="mpg"){
                    MultiList.push(new Pelicula(titulo, autor, formato, duracion, año, actor));
                }else{
                    MultiList.push(new Musica(titulo, autor, actor, formato, duracion, año));
                }
                Icon icon = new ImageIcon("IMG/like.png");
                JOptionPane.showMessageDialog(null, "Registro agregado", "Exito", JOptionPane.INFORMATION_MESSAGE, icon);

                //Limpiar formulario
                textTitulo.setText(null);
                textActor.setText(null);
                textAño.setText(null);
                textAutor.setText(null);
                textDuracion.setText(null);


            }
        });
        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTexto.append(MultiList.toString());
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pila.Capacidad(1);
                Pila.push(MultiList);

                MenuGrafico2 menu2 = new MenuGrafico2();
                dispose();

            }

        });
        eliminarUltimoDatoIngresadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MultiList.pop();
            }
        });
        botonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTexto.setText("");
            }
        });
    }



}
