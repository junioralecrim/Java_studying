//package com.example.springBatch.config;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfig {
//    @Bean
//    public Job job(JobRepository jobRepository, Step step){
//        return new JobBuilder("jo")
//                .repository(jobRepository)
//                .start(step)
//                .build();
//    }
//
//    @Bean
//    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager){
//        return new StepBuilder("step")
//                .repository(jobRepository)
//                .tasklet((contribution, chunckContext) -> {
//                    System.out.println("Hello, world!");
//                    return RepeatStatus.FINISHED;
//                })
//                .transactionManager(transactionManager)
//                .build();
//    }
//}
