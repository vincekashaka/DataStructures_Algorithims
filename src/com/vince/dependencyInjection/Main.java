package com.vince.dependencyInjection;

public class Main {
    public static void main(String[] args) {

        // dependencies
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);

        //Inject
        CarService carService = new CarService(
                carDAO,
                emailService,
                motService);
    }
}
