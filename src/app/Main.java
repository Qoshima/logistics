package app;

import gui.GUIFactory;
import gui.macos.MacOSFactory;
import gui.windows.WindowsFactory;
import transport.Logistics;
import transport.RoadLogistics;
import transport.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");

        if (!scanner.hasNextLine()) {
            System.out.println("Missing delivery mode.");
            return;
        }

        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        if (deliveryMode.isEmpty()) {
            System.out.println("Missing delivery mode.");
            return;
        }

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");

        if (!scanner.hasNextLine()) {
            System.out.println("Missing UI platform.");
            return;
        }

        String platform = scanner.nextLine().trim().toUpperCase();

        if (platform.isEmpty()) {
            System.out.println("Missing UI platform.");
            return;
        }

        Logistics logistics;

        if (deliveryMode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Unsupported delivery mode: " + deliveryMode);
            return;
        }

        GUIFactory guiFactory;

        if (platform.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Unsupported UI platform: " + platform);
            return;
        }

        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + platform);

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run("laboratory equipment", "Aktau warehouse");
    }
}