package at.ac.fhcampuswien;

import java.util.Scanner;

public class Inhabitant {
    private static Light light = new Light();
    private static LightSwitch lightSwitch = new LightSwitch(light);

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            input = scanner.nextLine();
            if (input.equals("l")) {
                remoteControl.buttonPressed(lightSwitch);
            }
        }
    }
}
