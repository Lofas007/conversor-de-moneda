package main.java;
import java.util.Map;

public class Conversor {
    public class CurrencyResponse {
        private String base;
        private String date;
        private Map<String, Double> rates;

        // Getters y setters
        public String getBase() { return base; }
        public String getDate() { return date; }
        public Map<String, Double> getRates() { return rates; }
    }

}
