import java.io.IOException;
import org.json.JSONException;
import javax.swing.JOptionPane;
import java.io.IOException;
import org.json.JSONException;
public class ApiTest {

    public static void main(String[] args) {
        String apiKey = JOptionPane.showInputDialog("Insira a chave da API: ");
        String origem = JOptionPane.showInputDialog("Insira a moeda de origem:");
        String destino = JOptionPane.showInputDialog("Insira a moeda de destino:");
        String valor = JOptionPane.showInputDialog("Insira o valor a ser convertido:");
        double valorAserConvertido = Double.parseDouble(valor);


        CurrencyConverterAPI api = new CurrencyConverterAPI(apiKey);
        try {
            ConversionResult result = api.convertCurrency(origem, destino, valorAserConvertido);
            String message = "Data da conversão: " + result.getDate() + "\n" +
                    "Valor convertido: " + result.getResult();
            JOptionPane.showMessageDialog(null, message);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao converter moeda");
        }
    }
}




