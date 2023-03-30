package com.example.springBatch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ContaDeUmACincoReaderConfig {

    @Bean
    public ItemReader<Integer> contaDeUmACincoReader(){
        return new ListItemReader<>(Arrays.asList(1, 2, 3, 4, 5));
    }
}
