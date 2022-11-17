package Entrega4;

public class SmartPhone extends SmartDevice {
    private String definicionCamaraPosterior;
    private String definicionCamaraFrontal;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, String marca, double precio, String color, double tamañoDePantalla, String definicionCamaraPosterior, String definicionCamaraFrontal) {
        super(modelo, marca, precio, color, tamañoDePantalla);
        this.definicionCamaraPosterior = definicionCamaraPosterior;
        this.definicionCamaraFrontal = definicionCamaraFrontal;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "definicionCamaraPosterior='" + definicionCamaraPosterior + '\'' +
                ", definicionCamaraFrontal='" + definicionCamaraFrontal + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", tamañoDePantalla=" + tamañoDePantalla +
                '}';
    }
}