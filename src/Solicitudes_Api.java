import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitudes_Api {

    public void solicitaMoneda (Respuesta_Moneda respuestaMoneda){
        String url ="https://v6.exchangerate-api.com/v6/e1704b867986787e0bf14dd7/latest/"+
                respuestaMoneda.getCodigo();
    }


}
