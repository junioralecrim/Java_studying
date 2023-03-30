package com.example.springBatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class JobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public Job job(@Qualifier("imprimeDeUmACincoStep") Step imprimeDeUmACincoStep,
                   @Qualifier("imprimeDeSeisADezStep") Step imprimeDeSeisADezStep){
        System.out.println("kkkkk");
        return jobBuilderFactory
                .get("job")
                .start(imprimeDeUmACincoStep)
                .next(imprimeDeSeisADezStep)
                .build();
    }
}
