package com.example.springBatch.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeDeSeisADezStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step imprimeDeSeisADezStep(@Qualifier("contaDeSeisADezReader") ItemReader<Integer> contaDeSeisADezReader,
                                      ItemWriter<Integer> imprimeWriter){

        return stepBuilderFactory
                .get("Imprimir de seis a dez step")
                .<Integer, Integer>chunk(2) //primeiro generics é o tipo de entrada e o segundo o tipo de saída
                .reader(contaDeSeisADezReader)
                .writer(imprimeWriter)
                .build();
    }

}
