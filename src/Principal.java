import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversor conversor =new Conversor();
        var solicitudesApi = new Solicitudes_Api();

        System.out.println("Elige la moneda que deseas convertir");
        System.out.println("""
            Monedas más usadas:
            USD - Dólar estadounidense
            EUR - Euro
            MXN - Peso mexicano
            GBP - Libra esterlina
            JPY - Yen japonés
            CAD - Dólar canadiense
            AUD - Dólar australiano
            CHF - Franco suizo
            CNY - Yuan chino
            BRL - Real brasileño
            """);

        var respuesta_Moneda = solicitudesApi.solicitaMoneda(lectura.nextLine());
        System.out.println("ingresa la cantidad que deseas convertir");
        var cantidad = lectura.nextDouble();
        lectura.nextLine(); // limpia buffer
        System.out.println("******************************************");
        System.out.println("ingresa la abrebiacion de la mondeda que quieres");
        String monedaDeseada = lectura.nextLine();

        System.out.println(conversor.convertir(monedaDeseada,cantidad,respuesta_Moneda));
    }
}
