package wsh.przemyslawbrambor;

public class Logger {
    private static Logger INSTANCE;

    private Logger() {
    }

    public void printMessage(String m) {
        System.out.println(m);
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }
}
