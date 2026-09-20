package app;

import gui.GUIFactory;
import gui.MacOSFactory;
import gui.WindowsFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Delivery mode (ROAD, SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();
        Logistics logistics = configureLogistics(deliveryMode);

        if (logistics == null) {
            System.out.println("Error: Unsupported delivery mode '" + deliveryMode + "'. Application stopped.");
            return;
        }

        System.out.print("UI platform (WINDOWS, MACOS): ");
        String uiPlatform = scanner.nextLine().trim().toUpperCase();
        GUIFactory guiFactory = configureGUI(uiPlatform);

        if (guiFactory == null) {
            System.out.println("Error: Unsupported UI platform '" + uiPlatform + "'. Application stopped.");
            return;
        }

        System.out.println("--------------------------------------------------");
        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
        app.start("laboratory equipment", "Aktau warehouse");
    }

    private static Logistics configureLogistics(String mode) {
        return switch (mode) {
            case "ROAD" -> new RoadLogistics();
            case "SEA" -> new SeaLogistics();
            default -> null;
        };
    }

    private static GUIFactory configureGUI(String platform) {
        return switch (platform) {
            case "WINDOWS" -> new WindowsFactory();
            case "MACOS" -> new MacOSFactory();
            default -> null;
        };
    }
}