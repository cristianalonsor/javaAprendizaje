import gui.Formulario;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        System.out.println("INICIO DE LA APP");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame= new Formulario();
                frame.setVisible(true);
                frame.setSize(300,300);

            }
        });
    }


}
