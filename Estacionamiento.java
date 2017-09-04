public class Estacionamiento
{
    private Vehiculo capacidad[];
    
    public Estacionamiento(){
        capacidad =  new Vehiculo [150];
    }
    
    public boolean ingresaVehiculo( Vehiculo auto)
    {
        for(int i=0; i< capacidad.length; i++){
            if(capacidad[i]==null){
                capacidad[i]= auto;
                return true;
            } 
        }
        return false;
    }
    
    public void Salida(int horaSalida, int Total, Vehiculo placas)
    {
        for(int i=0; i<capacidad.length; i++){
            if(capacidad[i]== placas){
                Total = horaSalida * placas.IngresaMin();
            }
        }
    }
}