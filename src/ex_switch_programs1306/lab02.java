package ex_switch_programs1306;

import java.util.Locale;
import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch(browserName) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            default:
                System.out.println("Pelase eneter correct browser");
        }
    }
}
