package recursos;
import java.util.ArrayList;
import java.util.List;

public class Recursos {

    // Primer método: Retorna un mensaje de texto
    public String mensajePOO() {
        return "Programación Orientada a Objetos 2021";
    }

    // Segundo método: Retorna si es mayor o menor de edad según la edad del estudiante
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retorna la multiplicación de dos números enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Cuarto método: Retorna una lista de números del 1 al X
    public List<Integer> listaNumeros(int x) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }

    public static void main(String[] args) {
        // Instanciación de la clase Recursos
        Recursos recursos = new Recursos();

        // Llamada al primer método
        System.out.println(recursos.mensajePOO());

        // Llamada al segundo método
        int edad = 20; // puedes cambiar este valor para probar
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        // Llamada al tercer método
        int num1 = 5, num2 = 7; // puedes cambiar los valores para probar
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + recursos.multiplicar(num1, num2));

        // Llamada al cuarto método
        int x = 10; // puedes cambiar el valor de X para probar
        System.out.println("Lista de números del 1 al " + x + ": " + recursos.listaNumeros(x));
    }
}
