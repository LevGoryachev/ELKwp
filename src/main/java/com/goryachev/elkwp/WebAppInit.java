package com.goryachev.elkwp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan(basePackages = "ru.goryachev.orderservice")
public class WebAppInit extends SpringBootServletInitializer {

}