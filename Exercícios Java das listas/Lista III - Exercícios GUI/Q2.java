import javax.swing.JFrame;

public class Q2 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Questão 2");
        jFrame.setVisible(true); //estou deixando a janela principal com a visibilidade ativa
        jFrame.setSize(800,500); //definindo o tamanho da janela
//        jFrame.setTitle("Questão 2"); //o titulo também pode ser colocado direto na classe do JFrame.

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //isso serve pra quando eu clicar no x, além da janela fechar a execução também parar
        jFrame.setResizable(false); //aqui eu estou dizendo que a alteração do tamanho do JFrame não poderá ser feita

    }
}
