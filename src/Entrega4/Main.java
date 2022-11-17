package Entrega4;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice(
                "PL60", "Motorola", 919900.0, "Verde",
                12
        );

        SmartDevice smartPhone = new SmartPhone(
                "A22", "Samsung", 719900.0, "Gris",
                12.0, "60mpx", "12mpx"
        );

        SmartDevice smartWatch = new SmartWatch(
                "R7Plus", "CAT", 129900.0, "Azul",
                6.6, 12
        );

        System.out.println(smartDevice);
        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}