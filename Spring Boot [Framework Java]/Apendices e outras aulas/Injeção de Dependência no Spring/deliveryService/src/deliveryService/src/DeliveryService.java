package deliveryService.src;

public class DeliveryService {
    public double fee(String state){
        if ("SP".equalsIgnoreCase(state)){
            return 10.0;
        }
        return 20.0;
    }
}
