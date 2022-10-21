public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au au au au au auuu!");
    }

    public void reagir(Pessoa pessoa, String tipoFrase){ //reagir a frase
        if ("Agradavel".equalsIgnoreCase(pessoa.falarFrase(tipoFrase))){
            System.out.println("Abanando o rabo e latindo");
        } else {
            System.out.println("Rosnando");
        }
    }

    public void reagir(int hora){ //reagir a horario do dia
        if (hora >= 6 && hora <= 12){//manha
            System.out.println("Abanando o rabo");
        } else if (hora >= 18 && hora <= 24){
            System.out.println("Ignorar");
        } else if (hora >= 1 && hora < 5) {
            System.out.println("Dormindo");
        } else {
            System.out.println("ignorar");
        }
    }

    public void reagir(Boolean meuDono){ //reagir ao dono
        if (meuDono){
            System.out.println("Abanando o rabinho pro meu dono");
        } else {
            System.out.println("Aaarggg, você não é o meu dono!! Au au!!");
        }
    }

    public void reagir(int idade, float peso){
        if (idade <= 6 && peso <= 10.0f){
            System.out.println("Abanando o rabinho");
        } else if (idade <= 6 && peso > 10.0f){
            System.out.println("Latindo! Au au!");
        } else if (idade > 6 && peso <= 10.0f) {
            System.out.println("Arrrg... (rosnando)");
        } else if (idade > 6 && peso > 10.0f) {
            System.out.println("Ignorando...");
        }
    }
}
