package Entrega7_8_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // 0. Reversar cadena
        System.out.println(reverse("Hola Mundo"));

        // 1. Valores de un array unidimensional
        String[] arrayUnidimensional = { "Chao", "Mundo", ",", "Saludos"};
        for (String string:
             arrayUnidimensional) {
            System.out.println(string);
        }

        // 2. Posicion y valor de array bidimensional
        int[][] arrayBidimensional = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Elemento en la posición [" + i + "," + j + "]: " + arrayBidimensional[i][j]);
            }
        }

        // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> vector = new Vector<>();
        vector.add(133);
        vector.add(122);
        vector.add(345);
        vector.add(435);
        vector.add(347);
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        // El problema es que la capacidad cuando se aregan mas de 10 (defecto) se va aumentando generando varios array con la capacidad por defecto
        // que afectan el rendimiento al tener que copiar todos los elementos.

        // 5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        List<String> stringList = new ArrayList<>();
        stringList.add("Go");
        stringList.add("Java");
        stringList.add("SQL");
        stringList.add("C#");
        stringList.forEach(System.out::println);
        LinkedList<String> linkedListCopy = new LinkedList<>(stringList);
        linkedListCopy.forEach(System.out::println);

        // 6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> arrayList = new ArrayList<>();
        int iterator = 1;
        while (iterator <= 10){
            arrayList.add(iterator++);
        }
        arrayList.add(10);
        int iterator2 = 0;
        while (iterator2 < arrayList.size()){
            if (arrayList.get(iterator2) % 2 == 0){
                arrayList.remove(iterator2);
                continue;
            }
            System.out.println(arrayList.get(iterator2));
            iterator2++;
        }

        // 7. Método divide por 0
        try{
            dividePorCero();
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            System.out.println("Demo de Código");
        }

        // 8. Ficheros
        try{
            InputStream file_In = new FileInputStream("inputFile.txt");
            PrintStream print_Out = new PrintStream("outputFile.txt");
            CopyFiles(file_In, print_Out);
        }catch (IOException ioE){
            System.out.println(ioE.getMessage());
        }

    }

    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static String reverse(String texto){
        StringBuilder reverso = new StringBuilder();
        for (char c : texto.toCharArray()) {
            reverso.insert(0, c);
        }
        return reverso.toString();
    }

    // Crea una función DividePorCero.
    // Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su
    // llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static void dividePorCero() throws ArithmeticException
    {
        throw new ArithmeticException("Esto no puede hacerse");
    }

    public static void CopyFiles(InputStream fileIn, PrintStream fileOut) throws IOException {
        byte[] buffer = new byte[fileIn.available()];
        fileIn.readAllBytes();
        fileIn.close();
        fileOut.write(buffer);
        fileOut.close();

    }

}
