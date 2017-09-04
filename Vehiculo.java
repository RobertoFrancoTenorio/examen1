public class Vehiculo{
    private String placas;
    private int hora;
    private int min;
    
    public Vehiculo(){
        placas = new String();
        hora = 0;
        min = 0;
    }
    
    public void IngresaPlacas(String noPlacas)
    {
        placas=noPlacas;
    }
    
    public void IngresaHora(int Hora)
    {
        hora=Hora;
    }
    
    public void IngresaMin(int Min)
    {
        min=Min;
    }
}