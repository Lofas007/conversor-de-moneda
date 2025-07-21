package main.java;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public interface Controladores {
    public class Main {
        public static void main(String[] args) throws Exception {
            String url = "https://api.exchangerate-api.com/v4/latest/USD";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir JSON a objeto Java con Gson
            Gson gson = new Gson();
            Conversor.CurrencyResponse resultado = gson.fromJson(response.body(), Conversor.CurrencyResponse.class);

            // Mostrar algunas tasas de cambio
            System.out.println("Base: " + resultado.getBase());
            System.out.println("Fecha: " + resultado.getDate());
            System.out.println("USD a DOP: " + resultado.getRates().get("DOP"));
            System.out.println("USD a EUR: " + resultado.getRates().get("EUR"));
            System.out.println("USD a DOP: " + resultado.getRates().get("DOP"));
        }
    }
}
