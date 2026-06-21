public class Singleton {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("Loading user data.");

        if (logger1 == logger2) {
            System.out.println("\nOnly one Logger object exists.");
        } else {
            System.out.println("\nDifferent Logger objects created.");
        }
    }
}