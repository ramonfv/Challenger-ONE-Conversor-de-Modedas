import okhttp3.*;

import org.json.*;

import java.io.IOException;

public class RequestAPI {
    private String apiKey;
    private OkHttpClient client;

    public RequestAPI(String apiKey){
        this.apiKey = apiKey;
        this.client = new  OkHttpClient().newBuilder().build();
    }

    public class ConversionResult {
        private String date;
        private double result;

        public ConversionResult(String date, double result) {
            this.date = date;
            this.result = result;
        }

        public String getDate() {
            return date;
        }

        public double getResult() {
            return result;
        }
    }

    public ConversionResult conversaoDeMoedas(String origem, String destino, double valor) throws IOException, JSONException {
        String url = String.format("https://api.apilayer.com/exchangerates_data/convert?from=%s&to=%s&amount=%f", origem, destino, valor);

        Request request = new Request.Builder()
                .url(url)
                .addHeader("apikey", apiKey)
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        JSONObject valorConvertido = new JSONObject(response.body().string());

        String valorStr = valorConvertido.getString("result");
        double resultadoDaConversao = Double.parseDouble(valorStr);

        String dataStr = valorConvertido.getString("date");

        return new ConversionResult(dataStr, resultadoDaConversao);

    }

}