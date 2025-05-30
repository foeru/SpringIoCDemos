package com.foeru.ioc.containeroverview;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.foeru.ioc.containeroverview.config.AppConfig;
import com.foeru.ioc.containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
}

