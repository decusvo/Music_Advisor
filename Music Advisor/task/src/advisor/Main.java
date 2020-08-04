package advisor;
import java.util.*;

public class Main {


    static boolean userAuthenticated = false;

    static void authenticate() {
        if (userAuthenticated == false) {
            userAuthenticated = true;
        }
    }

    static boolean checkAuthentication() {
        if (userAuthenticated == false) {
            System.out.println("Please, provide access for application.");
            return false;
        } else {
            return true;
        }
    }

    static void newReleases() {
        if (checkAuthentication() == true) {
            System.out.println("---NEW RELEASES---\nMountains [Sia, Diplo, Labrinth]\nRunaway [Lil Peep]\nThe Greatest Show [Panic! At The Disco]\nAll Out Life [Slipknot]");
        }
    }

    static void featuredReleases() {
        if (checkAuthentication() == true) {
            System.out.println("---FEATURED---\nMellow Morning\nWake Up and Smell the Coffee\nMonday Motivation\nSongs to Sing in the Shower");
        }
    }

    static void categories() {
        if (checkAuthentication() == true) {
            System.out.println("---CATEGORIES---\nTop Lists\nPop\nMood\nLatin\n");
        }
    }

    static void playlists() {
        if (checkAuthentication() == true) {
            System.out.println("---MOOD PLAYLISTS---\nWalk Like A Badass\nRage Beats\nArab Mood Booster\nSunday Stroll");
        }
    }

    static void auth() {

        System.out.println("https://accounts.spotify.com/authorize?client_id=7527abad707644d2bd85cd25075dcace&redirect_uri=http://localhost:8080&response_type=code");
        authenticate();
        System.out.println("---SUCCESS---");

    }

    static void exit() {
        System.out.println("---GOODBYE!---");
        System.exit(0);
    }


    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.print(">");
        String userInput = scannerObject.nextLine();

        switch (userInput) {
            case "new":
                newReleases();
                break;
            case "featured":
                featuredReleases();
                break;
            case "categories":
                categories();
                break;
            case "playlists Mood":
                playlists();
                break;
            case "exit":
                exit();
            case "auth":
                auth();
                break;
        }

    }
}
