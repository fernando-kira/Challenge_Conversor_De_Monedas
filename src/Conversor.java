public class Conversor {

    public double convertir (String monedaDeseada, Double cantidad, Respuesta_Moneda respuestaMoneda){
        monedaDeseada = monedaDeseada.toUpperCase();
       var resultado = respuestaMoneda.getConversionRates().get(monedaDeseada);
       if(!respuestaMoneda.getConversionRates().containsKey(monedaDeseada)){
           throw new IllegalArgumentException("Moneda no encontrada");
       }
        return resultado *cantidad;
    }
}
