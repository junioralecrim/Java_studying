public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; //como o objeto c1 está dentro de uma classe (main) que utiliza a classe caneta (Caneta), seria aquilo do
        //"mães e filhos". A caneta seria mãe nesse caso e a classe main seria o "filho". Então, posso usar.

        //c1.tampada = true;
        c1.tampar(); //o método tampar() e destampar() está dentro da classe principal caneta. Dentro desses dois métodos
        //eu vou estar mexendo com o atributo tampada, que está como private. Eu posso fazer isso pois o código do método
        //tampar/destampar está dentro da classe principal, então eu posso alterar. Lembrar do "eu", que seria a classe
        //Caneta. Somente EU posso mexer, então somente oq está dentro da classe caneta pode mexer com um atributo em private.


        c1.status();
    }
}