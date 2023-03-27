import okhttp3.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CurrencyConverterAPI {

    private static final String API_ENDPOINT = "https://api.apilayer.com/exchangerates_data/convert";
    private String apiKey;

    public CurrencyConverterAPI(String apiKey){
        this.apiKey = apiKey;
    }
    public ConversionResult convertCurrency(String fromCurrency, String toCurrency, double amount) throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(API_ENDPOINT).newBuilder();
        urlBuilder.addQueryParameter("from", fromCurrency);
        urlBuilder.addQueryParameter("to", toCurrency);
        urlBuilder.addQueryParameter("amount", Double.toString(amount));
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .addHeader("apikey", apiKey)
                .build();

        Response response = client.newCall(request).execute();
        JSONObject jsonResponse = new JSONObject(response.body().string());

        String date = jsonResponse.getString("date");
        double result = jsonResponse.getDouble("result");

        return new ConversionResult(date, result);
    }
}