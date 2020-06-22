package com.masPro.masPro;

import com.masPro.masPro.controller.CreateApplicationController;
import com.masPro.masPro.controller.MainMenuController;
import com.masPro.masPro.gui.CreateApplicationWindow;
import com.masPro.masPro.gui.MainMenuWindow;
import com.masPro.masPro.model.Application;
import com.masPro.masPro.model.Client;
import com.masPro.masPro.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class MasProApplication implements CommandLineRunner {

    @Autowired
    ClientService clientService;

    @Autowired
    MainMenuController mainMenuController;

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(MasProApplication.class);
        builder.headless(false);
        builder.run(args);


    }

    public void run(String... args) throws Exception {

        Client client = new Client("Adam", "Smith", 12442, "smith@gmail.com", "5458736", LocalDate.now(), 5, "safasf", "brak");

        client.getApplicationListList().add(new Application(2,1,1, LocalDateTime.now(), 1,client));
        client.getApplicationListList().add(new Application(1,1,1,LocalDateTime.now(),  2,client));
        client.getApplicationListList().add(new Application(2,2,2,LocalDateTime.now(),  1,client));
        client.getApplicationListList().add(new Application(3,1,2,LocalDateTime.now(),  1,client));


        clientService.save(client);

        clientService.getAll().stream().forEach(System.out::println);

        clientService.findById(1).ifPresent(System.out::println);
        clientService.findById(3).ifPresent(System.out::println);

		System.out.println(client.getApplicationListList());


        mainMenuController.initialize(client);

    }

}
