package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton prueba = Singleton.getInstance();
        Singleton otro = Singleton.getInstance();
        otro.setContador(45);
        prueba.setContador(20);

        System.out.println(prueba.getContador() +" " + "counter"
                + " " + "memoria" +  " "  + prueba);
        System.out.println(otro.getContador() + " " +  "counter" + " " + "memoria" + " " + otro);

       Applicacion app =  Applicacion.getInstance();
       app.Run();
        System.out.println(app.isRunning);
       app.turnOff();
        System.out.println(app.isRunning);
        System.out.println(app);

        Applicacion app2 =  Applicacion.getInstance();
        app2.Run();
        System.out.println(app2.isRunning);
        app.turnOff();
        System.out.println(app2.isRunning);
        System.out.println(app2);
    }
}
