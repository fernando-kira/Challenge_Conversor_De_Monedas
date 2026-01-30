public class Conversor {

    public double convertir (String monedaDeseada, Double cantidad, Respuesta_Moneda respuestaMoneda){
        monedaDeseada.toUpperCase();
       var resultado = respuestaMoneda.getConversion_rates().get(monedaDeseada);
       if(!respuestaMoneda.getBase_code().contains(monedaDeseada)){
           throw new IllegalArgumentException("Moneda no encontrada");
       }
        return resultado *cantidad;
    }
}
