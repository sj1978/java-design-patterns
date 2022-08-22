package singleton;

public class Applicacion {
    private static Applicacion app;
    boolean isRunning = false;
    private Applicacion(){}
    public static Applicacion getInstance() {
        if ( app ==  null) {
            app = new Applicacion();
        }
        return app;
    }

    public boolean Run() {
        if (!isRunning) {
            isRunning = true;
        }
        return isRunning;

    }
    public boolean turnOff () {
        isRunning = false;
        return isRunning;
    }

    }



