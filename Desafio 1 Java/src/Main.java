import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("INGRESE SU NOMBRE:");

        String nombre = buffer.readLine();


        System.out.println("HOLA " + nombre);


    }
}