package main.java;
import java.util.Scanner;


public class Programa implements Controladores{
  static Controladores accion = new Controladores() {
      @Override
      public int hashCode() {
          return super.hashCode();
      }
  };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese moneda de origen (ej: USD, EUR): ");
        String origen = scanner.nextLine();

        System.out.println("Ingrese moneda de destino (ej: DOP, ARG): ");
        String destino = scanner.nextLine();

        System.out.println("ingrese la cantidad que quiere convertir");
        String resultado = scanner.nextLine();

    }


}
