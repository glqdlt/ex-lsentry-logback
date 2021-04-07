package com.glqdlt.ex.sentry;

import io.sentry.Sentry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentryApplication implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(SentryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            throw new RuntimeException("Hello");
        }catch (RuntimeException e) {
            Sentry.captureException(e);
        }
    }
}
