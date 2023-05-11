public class BrazilTaxService extends TaxService{

    @Override
    public double tax(double value){
        return value * 0.30;
    }
}
