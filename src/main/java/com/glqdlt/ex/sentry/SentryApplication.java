package com.glqdlt.ex.sentry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentryApplication implements CommandLineRunner
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SentryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SentryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            throw new RuntimeException("Hello");
        }catch (RuntimeException e) {
            LOGGER.error(e.getMessage(),e);
        }
    }
}
