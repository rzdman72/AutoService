package com.example.AutoService.shell;

import com.example.AutoService.services.CarService;
import com.example.AutoService.services.ClientService;
import com.example.AutoService.services.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.h2.tools.Console;
import java.sql.SQLException;

@ShellComponent
public class AppEventsCommands {
    private final ClientService clientService;
    private final WorkService workService;
    private final CarService carService;

    @Autowired
    public AppEventsCommands(ClientService clientService, WorkService workService, CarService carService) {
        this.clientService = clientService;
        this.workService = workService;
        this.carService = carService;
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

    @ShellMethod(value = "Get All Works_car", key = {"gaw", "getallworks"})
    public void getAllWorks() {System.out.println(workService.getAllWorks().toString()); }

    @ShellMethod(value = "Get All Cars", key = {"gacar", "getallcars"})
    public void getAllCars() {System.out.println(carService.getAllCars().toString());}
}
