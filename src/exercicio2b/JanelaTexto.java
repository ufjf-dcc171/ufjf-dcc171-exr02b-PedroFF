
package exercicio2b;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JanelaTexto extends JFrame{
    private JLabel etiqueta1 = new JLabel();
    private final JTextField texto;
    private JLabel etiqueta2 = new JLabel();

    public JanelaTexto() throws HeadlessException {
        super("Janela Texto");
        
        etiqueta1 = new JLabel("Primeiro número: ");
        texto = new JTextField("Escreva aqui", 20);
        add(etiqueta1);
        add(texto);
        
        etiqueta2 = new JLabel("");
        add(etiqueta2);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        texto.addActionListener(new InverteTexto());
    }

    private class InverteTexto implements ActionListener {

        public InverteTexto() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuffer sb = new StringBuffer(texto.getText());
            sb.reverse();
            String impressao = sb.toString();
            etiqueta2.setText(impressao);
        }
    }
    
    
}
