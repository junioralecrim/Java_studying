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
public class ImprimeDeUmACincoStepConfig {
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step imprimeDeUmACincoStep(@Qualifier("contaDeUmACincoReader") ItemReader<Integer> contaDeUmACincoReader,
                                      ItemWriter<Integer> imprimeWriter){
        return stepBuilderFactory
                .get("Imprimir de um a cinco Step")
                .<Integer, Integer>chunk(2)
                .reader(contaDeUmACincoReader)
                .writer(imprimeWriter)
                .build();
    }
}
