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

    }
}
