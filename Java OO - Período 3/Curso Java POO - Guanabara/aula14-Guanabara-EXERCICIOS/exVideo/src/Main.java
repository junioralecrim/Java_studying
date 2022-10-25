public class Main {
    public static void main(String[] args) {
        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Junior Alecrim", 19, Sexo.MASCULINO,
                false, "junioralecrim_11", 0);
        g[1] = new Gafanhoto("Daniel Silva", 22, Sexo.MASCULINO,
                false, "danisam_2020", 0);


        Video v[] = new Video[2];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 01 de MySQL");


        Visualizacao vis[] = new Visualizacao[2];

        vis[0] = new Visualizacao(g[0], v[0]); //Junior assiste POO
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); //Junior assiste MySQL
        vis[0].avaliar(8);
        System.out.println(vis[1].toString());


    }
}