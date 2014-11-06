package com.demo.pubsub.test;

import com.demo.pubsub.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStartPubSub {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext( AppConfig.class );
    }

}
