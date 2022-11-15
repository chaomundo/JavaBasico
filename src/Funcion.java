public class Funcion {
    //IVA en colombia es de 19%
    static double rateIVA = 1.19;

    public static void main(String[] args) {
        double price = 546000.0;
        System.out.println(getPriceWithIVA(price));
    }
    static double getPriceWithIVA(double price){
        return price *= rateIVA;
    }
}