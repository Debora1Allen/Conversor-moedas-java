package com.project.currencyconverter;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyApi {
    private static final String API_KEY = "a2aafd928998314b6c60e792";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double convert(String fromCurrency, String toCurrency, double amount) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            double rate = jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();

            return amount * rate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}

