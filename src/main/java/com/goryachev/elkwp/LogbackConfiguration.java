package com.goryachev.elkwp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
//import javax.annotation.PostConstruct;

//@Configuration
public class LogbackConfiguration {
/*
    @Value("${logging.logstash.host:127.0.0.1}")
    private String logstashHost;

    @Value("${logging.logstash.port:8086}")
    private String logstashPort;

    @PostConstruct
    public void init() {
        System.setProperty("LOGSTASH_HOST", logstashHost);
        System.setProperty("LOGSTASH_PORT", logstashPort);
    }*/
}
