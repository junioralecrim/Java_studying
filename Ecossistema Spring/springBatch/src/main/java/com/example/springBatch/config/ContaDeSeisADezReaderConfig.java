package com.example.springBatch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ContaDeSeisADezReaderConfig {

    @Bean
    public ItemReader<Integer> contaDeSeisADezReader(){
        return new ListItemReader<>(Arrays.asList(6, 7, 8, 9, 10));
    }
}
