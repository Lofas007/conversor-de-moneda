package main.java;
import java.util.Map;
import com.google.gson.Gson;
public class Conversor implements Controladores{
    private Gson gson = new Gson();

    @Override
    public double convertirMoneda(String monedaOrigen, String monedaDestino) {
        String jsonSimulado = "{ \"USD\": 1.0, \"DOP\": 59.45, \"EUR\": 0.91 }";
        Map<String, Double> tasas = gson.fromJson(jsonSimulado, Map.class);

        if (tasas.containsKey(monedaOrigen) && tasas.containsKey(monedaDestino)) {
            double tasaOrigen = tasas.get(monedaOrigen);
            double tasaDestino = tasas.get(monedaDestino);

            return tasaDestino / tasaOrigen;
        } else {
            System.out.println("Monedas no válidas.");
            return 0.0;
        }
    }
}
