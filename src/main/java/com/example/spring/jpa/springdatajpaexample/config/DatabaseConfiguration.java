package com.example.spring.jpa.springdatajpaexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.spring.jpa.springdatajpaexample.repo.CustomerJpaRepository;

@Configuration
@EnableJpaRepositories(basePackageClasses = CustomerJpaRepository.class)
public class DatabaseConfiguration {

}
