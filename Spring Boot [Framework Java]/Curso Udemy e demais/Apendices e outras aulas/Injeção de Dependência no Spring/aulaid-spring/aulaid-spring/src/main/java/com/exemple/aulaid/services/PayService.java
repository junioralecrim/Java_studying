package com.exemple.aulaid.services;

import org.springframework.stereotype.Service;

@Service
public class PayService{
    //Dependências - Alto acoplamento
    private TaxService taxService;
    private DeliveryService deliveryService;

    //PARA FAZER O DESACOPLAMENTO, UMA DAS FORMAS É FAZER A INJEÇÃO DE DEPENDÊNCIA POR INVERSÃO DE CONTROLE
    public PayService(TaxService taxService, DeliveryService deliveryService){
        this.taxService = taxService;
        this.deliveryService = deliveryService;
    }/*se eu fizer isso, fazendo o construtor dessa forma, framework do spring vai cuidar de injetar
    as dependências das classes pra mim no seu container (IOC)*/

    public double finalPrice(double cost, String state){
        return cost + deliveryService.fee(state) + taxService.tax(cost);
    }

    //30min video
}
