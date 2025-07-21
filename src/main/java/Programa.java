package main.java;
import java.util.Scanner;

//implements Controladores
public class Programa  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controladores conversor = new Conversor();

        System.out.print("Ingrese moneda de origen (ej: USD): ");
        String origen = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese moneda de destino (ej: DOP): ");
        String destino = scanner.nextLine().toUpperCase();

        System.out.println("ingresa una cantidad");
       String dale = scanner.nextLine();

        double resultado = conversor.convertirMoneda(origen, destino);
        System.out.println("Tasa de cambio de " + origen + " a " + destino + "es" + dale + ": " + resultado);
    }


}
