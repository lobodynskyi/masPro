package com.masPro.masPro;

import com.masPro.masPro.controller.MainMenuController;
import com.masPro.masPro.model.Application;
import com.masPro.masPro.model.Client;
import com.masPro.masPro.model.Nurse;
import com.masPro.masPro.service.serviceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class MasProApplication implements CommandLineRunner {

    @Autowired
    ClientServiceImpl clientServiceImpl;

    @Autowired
    MainMenuController mainMenuController;

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(MasProApplication.class);
        builder.headless(false);
        builder.run(args);


    }

    public void run(String... args) throws Exception {

//        Client client1 = new Client("Adam", "Smith", 124492, "smith@gmail.com", "41120451477", LocalDate.now(), 5, "safasf", "brak");
//        client1.getApplications().add(new Application(2,1,1, LocalDateTime.now(), 1,client1));
//        client1.getApplications().add(new Application(1,1,1,LocalDateTime.now(),  2,client1));
//        client1.getApplications().add(new Application(2,2,2,LocalDateTime.now(),  1,client1));
//        client1.getApplications().add(new Application(3,1,2,LocalDateTime.now(),  1,client1));
//        clientServiceImpl.save(client1);
//
//        Client client2 = new Client("Miya", "Jackson", 885566, "jack@gmail.com", "74062129489", LocalDate.now(), 10, "safasf", "brak");
//        client2.getApplications().add(new Application(2,1,1, LocalDateTime.now(), 3,client2));
//        clientServiceImpl.save(client2);

        Nurse nurse = new Nurse("Jess", "Fox",548465665,"jessFox@gmail.com","10110586701",LocalDate.now(),LocalDate.now(),5500,3000,"","");


        mainMenuController.initialize();
        mainMenuController.setNurse(nurse);

    }

}
