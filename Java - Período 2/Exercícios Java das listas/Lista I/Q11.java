import java.util.*;

public class Q11 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double notaUm = 0, notaDois = 0, mediaAluno = 0;

        System.out.println("Digite a primeira nota do aluno: ");
        notaUm = in.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        notaDois = in.nextDouble();

        mediaAluno = (notaUm+notaDois)/2;

        if(mediaAluno >= 7.0){
            System.out.println("Aluno aprovado com média " + mediaAluno);
        } else {
            if((mediaAluno < 7) && (mediaAluno >= 4)){
                System.out.println("Aluno de recuperação com média " + mediaAluno);
            } else {
                if(mediaAluno < 4){
                    System.out.println("Aluno reprovado com média " + mediaAluno);
                }
            }
        }
        

    }
}
