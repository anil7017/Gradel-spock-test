package com.example.test;

import java.math.BigInteger;
import java.time.Duration;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@Service
public class PrimeNumberService {

  @Bean
  Supplier<Flux<Long>> send() {
    return () -> {
      return Flux.interval(Duration.ofSeconds(1))
              .log();
    };
  }

  @Bean
  Function<Flux<Long>, Flux<Long>> accumulate() {
    return longFlux -> {
      System.out.println(longFlux);
      return longFlux
              .map(i -> i * i)
              .log();
    };
  }

  @Bean
  Consumer<Long> receive() {
    return payload -> {
      System.out.println("payload data {}"+ payload);
    };
  }
}
