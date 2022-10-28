package com.exemple.aulaid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService{
    //Dependências - Alto acoplamento

    @Autowired
    private TaxService taxService;
    @Autowired
    private DeliveryService deliveryService;

    //PARA FAZER O DESACOPLAMENTO, UMA DAS FORMAS É FAZER A INJEÇÃO DE DEPENDÊNCIA POR INVERSÃO DE CONTROLE
/*se eu fizer isso, fazendo o construtor dessa forma, framework do spring vai cuidar de injetar
    as dependências das classes pra mim no seu container (IOC)*/

    public double finalPrice(double cost, String state){
        return cost + deliveryService.fee(state) + taxService.tax(cost);
    }

    //30min video
}
