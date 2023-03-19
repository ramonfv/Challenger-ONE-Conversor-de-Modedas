import java.io.IOException;
import org.json.JSONException;
public class ApiTest {
    public static void main(String[] args) throws IOException, JSONException {
//        RequestAPI requestAPI = new RequestAPI("Nx97Wd2Cp6T6736JP8IOxQqz2CIcCC6k");
//
//        ConversionResult result = requestAPI.conversaoDeMoedas("BRL", "USD", 100.0);
//        double valorConvertido = result.getResult();
//        String data = result.getDate();
//
//        System.out.println(String.format("Valor convertido $ %s:. Taxa de câmbio atualizad ano dia %f",valorConvertido, data));

        RequestAPI api = new RequestAPI("Nx97Wd2Cp6T6736JP8IOxQqz2CIcCC6k");
        RequestAPI.ConversionResult resultado = api.conversaoDeMoedas("BRL", "USD", 100.0);
        System.out.println("Data da conversão: " + resultado.getDate());
        System.out.println("Resultado da conversão: " + resultado.getResult());

    }
}
