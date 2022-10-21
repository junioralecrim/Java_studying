public class Main {
    public static void main(String[] args) {
        PayService payService = new PayService();

        System.out.println("RESULTADO = " + payService.finalPrice(300.00, "SP"));
    }
}