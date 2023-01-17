package org.example;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao con = null;

        try {
            con = new Conexao(); //uma conexão aberta deve ser fechada
            con.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexão " + ex.getMessage());
        } finally {
            con.fecha();
        }
    }
}
