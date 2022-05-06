import javax.swing.*;

import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        JFrame Screen  = new JFrame("Olá mundo");
        JLabel Text = new JLabel("Bem vindo a minha primeira GUI");
        Screen.getContentPane().add(Text);

        Text.setBounds(30, 20, 200, 20);
        Screen.setLayout(null);
        Screen.setSize(1080, 1920);
        Screen.setVisible(true);

        Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
