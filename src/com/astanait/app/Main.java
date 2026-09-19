package com.astanait.app;
import com.astanait.gui.GUIFactory;
import com.astanait.gui.macos.MacOSFactory;
import com.astanait.gui.windows.WindowsFactory;
import com.astanait.logistics.Logistics;
import com.astanait.logistics.RoadLogistics;
import com.astanait.logistics.SeaLogistics;
import java.util.Scanner;

public final class Main {
    private static final String CARGO = "motorcycle";
    private static final String DESTINATION = "Semey warehouse";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mode = readInput(args, 0, scanner, "Enter delivery mode (ROAD/SEA): ");
        String platform = readInput(args, 1, scanner, "Enter UI platform (WINDOWS/MACOS): ");

        Logistics logistics = getLogistics(mode);
        if (logistics == null) {
            System.out.println("Invalid delivery mode: " + mode);
            return;
        }

        GUIFactory factory = getFactory(platform);
        if (factory == null) {
            System.out.println("Invalid UI platform: " + platform);
            return;
        }

        System.out.println("Delivery mode: " + mode.toUpperCase());
        System.out.println("UI platform: " + platform.toUpperCase());

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.run(CARGO, DESTINATION);
    }

    private static String readInput(String[] args, int index, Scanner scanner, String message) {
        if (args.length > index && !args[index].isBlank()) {
            return args[index];
        }
        System.out.print(message);
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }

    private static Logistics getLogistics(String mode) {
        if (mode == null || mode.isBlank()) {
            return null;
        }
        switch (mode.trim().toUpperCase()) {
            case "ROAD": return new RoadLogistics();
            case "SEA": return new SeaLogistics();
            default: return null;
        }
    }

    private static GUIFactory getFactory(String platform) {
        if (platform == null || platform.isBlank()) {
            return null;
        }
        switch (platform.trim().toUpperCase()) {
            case "WINDOWS": return new WindowsFactory();
            case "MACOS": return new MacOSFactory();
            default: return null;
        }
    }
}