import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Q4 {


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Contador de letras");
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        JLabel jLabel = new JLabel("Digite algo:");
        jLabel.setBounds(120, 120, 80, 40);
        jLabel.setVisible(true);
        jFrame.getContentPane().add(jLabel);

        JTextField box = new JTextField();
        box.setBounds(200, 130, 100, 30);
        jFrame.getContentPane().add(box);


        JButton jButton = new JButton("Enviar");
        jButton.setBounds(200, 180, 80, 40);
        jFrame.getContentPane().add(jButton);


        jButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                String palavra = box.getText();
                int quant = palavra.length();
                JOptionPane.showMessageDialog(null, "A palavra " + palavra + " tem " + quant +" letras.");

                
            }});
        

    }

}
