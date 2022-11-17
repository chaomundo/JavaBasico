package Entrega4;

public class SmartDevice {
    protected String modelo;
    protected String marca;
    protected double precio;
    protected String color;
    protected double tamañoDePantalla;
    public SmartDevice() {
    }
    public SmartDevice(String modelo, String marca, double precio, String color, double tamañoDePantalla) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.tamañoDePantalla = tamañoDePantalla;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", tamañoDePantalla=" + tamañoDePantalla +
                '}';
    }
}