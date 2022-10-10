import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos times você deseja cadastrar? ");
        int qtdTimes = in.nextInt();
        String vetTimes[] = new String[qtdTimes];
        in.nextLine();

        for (int i = 0; i < qtdTimes; i++){
            System.out.print((i + 1) + "° TIME : ");
            vetTimes[i] = in.nextLine();
        }

        for (int i = 0; i < qtdTimes; i++){
            String auxNome = vetTimes[i];
            for (int j = 0; j < qtdTimes; j++){
                if (auxNome.equals(vetTimes[j])){
                } else {
                    System.out.println(auxNome + " [ ] x [ ] " + vetTimes[j]);
                }
            }
        }
    }
}