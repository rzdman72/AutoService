package com.example.AutoService.shell;

import com.example.AutoService.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.h2.tools.Console;
import java.sql.SQLException;

@ShellComponent
public class AppEventsCommands {
    private final ClientService clientService;

    @Autowired
    public AppEventsCommands(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Метод startConsoleH2 запускает консоль
     */
    @ShellMethod(value = "Start console H2", key = {"c", "console"})
    public void startConsoleH2() {
        try {
            Console.main();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @ShellMethod(value = "Get All Clients", key = {"gac", "getallclients"})
    public void getAllClients() {
        System.out.println(clientService.getAllClients().toString());
    }
}
