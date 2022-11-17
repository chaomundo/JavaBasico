package Entrega4;

public class SmartWatch extends SmartDevice {
    private int medidaDeCorrea;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, String marca, double precio, String color, double tamañoDePantalla, int medidaDeCorrea) {
        super(modelo, marca, precio, color, tamañoDePantalla);
        this.medidaDeCorrea = medidaDeCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "medidaDeCorrea=" + medidaDeCorrea +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", tamañoDePantalla=" + tamañoDePantalla +
                '}';
    }
}