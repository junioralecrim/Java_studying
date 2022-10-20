public class PayService {

    //Dependências - Alto acoplamento
    private TaxService taxService;
    private DeliveryService deliveryService;

    //PARA FAZER O DESACOPLAMENTO, UMA DAS FORMAS É FAZER A INJEÇÃO DE DEPENDÊNCIA POR INVERSÃO DE CONTROLE
    private PayService(TaxService taxService, DeliveryService deliveryService){
        this.taxService = taxService;
        this.deliveryService = deliveryService;
    }

    public double finalPrice(double cost, String state){
        return cost + deliveryService.fee(state) + taxService.tax(cost);
    }

    //30min video
}
