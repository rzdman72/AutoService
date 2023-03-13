package com.example.AutoService.shell;

import com.example.AutoService.entities.Client;
import com.example.AutoService.services.CarService;
import com.example.AutoService.services.ClientService;
import com.example.AutoService.services.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.h2.tools.Console;
import org.springframework.shell.standard.ShellOption;

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

    @ShellMethod(value = "Get Client by id", key = {"gcbi", "getclientbyid"})
    public void getClientById(@ShellOption(defaultValue = "1") long id) {
        System.out.println(clientService.getClientById(id).toString());
    }

    @ShellMethod(value = "Get Car by id", key = {"gcarbi", "getcarbyid"})
    public void getCarById(@ShellOption(defaultValue = "1") long id) {
        System.out.println(carService.getCarById(id).toString());
    }

    @ShellMethod(value = "Get Work by id", key = {"gwbi", "getworkbyid"})
    public void getWorkById(@ShellOption(defaultValue = "1") long id) {
        System.out.println(workService.getWorkById(id).toString());
    }

    @ShellMethod(value = "Create a new Client", key = {"cc", "createclient"})
    public String createNewClient(@ShellOption(defaultValue = "Anonymous") String name) {
        return clientService.createClient(new Client(name)).toString();
    }

    @ShellMethod(value = "Updating information about the Client", key = {"uc", "updateclient"})
    public void updateClient(
            @ShellOption(defaultValue = "1") long id,
            @ShellOption(defaultValue = "Anonymous") String name) {
        clientService.updateClient(new Client(id, name));
    }

    @ShellMethod(value = "Deleting Client data from the AutoService", key = {"dc", "deleteclient"})
    public void deleteClient(
            @ShellOption(defaultValue = "1") long id,
            @ShellOption(defaultValue = "Anonymous") String name) {
        clientService.deleteClient(new Client(id, name));
    }
}
