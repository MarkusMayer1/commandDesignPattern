package at.ac.fhcampuswien;

import java.util.Scanner;

public class Bewohner {
    private static Licht licht = new Licht();
    private static LichtSchalter lichtSchalter = new LichtSchalter(licht);

    public static void main(String[] args) {
        Fernbedienung fernbedienung = new Fernbedienung();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            input = scanner.nextLine();
            if (input.equals("l")) fernbedienung.knopfDruecken(lichtSchalter);
        }
    }
}
