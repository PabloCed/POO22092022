package ventanacesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CifradoCesar extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel cifrado;
    private JTextField llave;

    private JTextField cuadro2;
    private JButton boton2;
    private JLabel cifrado2;
    private JTextField llave2;

    public CifradoCesar() throws HeadlessException {

        setTitle("Cifrado de César");
        setSize(950, 400);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        llave = new JTextField(3);
        cuadro = new JTextField(15);
        boton = new JButton("Cifrar");
        boton.setToolTipText("Clic para cifrar");
        cifrado = new JLabel("Texto cifrado:");

        llave2 = new JTextField(3);
        cuadro2 = new JTextField(15);
        boton2 = new JButton("Decifrar");
        boton2.setToolTipText("Clic para decifrar");
        cifrado2 = new JLabel("Texto decifrado:");

        this.getContentPane().add(llave);
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(cifrado);
        this.validate();
        this.setVisible(true);

        this.getContentPane().add(llave2);
        this.getContentPane().add(cuadro2);
        this.getContentPane().add(boton2);
        this.getContentPane().add(cifrado2);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent ee) {
                System.exit(0);
            }
        });



        this.boton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

              
                final String ALPHMAY = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                final String ALPHMIN = "abcdefghijklmnñopqrstuvwxyz";

                String res = "";
                String mensaje = cuadro.getText();
                int desp = Integer.parseInt(llave.getText());
                desp = desp % 27;

                for (int pos = 0; pos < mensaje.length(); pos++) {
                    char actual = mensaje.charAt(pos);

               
                    if (actual >= 'A' && actual <= 'Z' || actual == 'Ñ') {
                        int posActual = ALPHMAY.indexOf(actual + "");
                        posActual = posActual + desp;
                        if (posActual > 26) {
                            posActual = posActual - 27;
                        }
                        actual = ALPHMAY.charAt(posActual);
                    } else {
                        if (actual >= 'a' && actual <= 'z' || actual == 'ñ') {
                            int posActual = ALPHMIN.indexOf(actual + "");
                            posActual = posActual + desp;
                            if (posActual > 26) {
                                posActual = posActual - 27;
                            }
                            actual = ALPHMIN.charAt(posActual);
                        }
                    }
                    res = res + actual;

                }

                cifrado.setText("Texto cifrado: " + res);

            }

        }
        );

        this.boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                final String ALPHMAY = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                final String ALPHMIN = "abcdefghijklmnñopqrstuvwxyz";

                String res2 = "";
                String mensaje2 = cuadro2.getText();
                int desp = Integer.parseInt(llave2.getText());
                desp = desp % 27;

                for (int pos = 0; pos < mensaje2.length(); pos++) {
                    char actual2 = mensaje2.charAt(pos);

                    // if (esMayuscula(actual)) {
                    if (actual2 >= 'A' && actual2 <= 'Z' || actual2 == 'Ñ') {
                        int posActual = ALPHMAY.indexOf(actual2 + "");
                        posActual = posActual - desp;
                        if (posActual > 26) {
                            posActual = posActual - 27;
                        }
                        actual2 = ALPHMAY.charAt(posActual);
                    } else {
                        if (actual2 >= 'a' && actual2 <= 'z' || actual2 == 'ñ') {
                            int posActual = ALPHMIN.indexOf(actual2 + "");
                            posActual = posActual - desp;
                            if (posActual > 26) {
                                posActual = posActual - 27;
                            }
                            actual2 = ALPHMIN.charAt(posActual);
                        }
                    }
                    res2 = res2 + actual2;

                }

                cifrado2.setText("Texto decifrado: " + res2);
            }
        }
        );

    }
}
