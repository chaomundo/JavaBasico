public class BucleForEach {
    public static void main(String[] args) {
        String [] palabras = {"Hola", ",", " Buen" + " día"};
        StringBuilder frase = new StringBuilder();
        for (String palabra : palabras) {
            frase.append(palabra);
        }
        System.out.println(frase);
    }
}