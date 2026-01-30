import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitudes_Api {

    public Respuesta_Moneda solicitaMoneda (String codigo) {
        codigo = codigo.toUpperCase();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e1704b867986787e0bf14dd7/latest/" +
                codigo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response=null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }return new Gson().fromJson(response.body(), Respuesta_Moneda.class);
    }
}
