public class Estacionamiento
{
    private Vehiculo capacidad[];
    
    public Estacionamiento(){
        capacidad =  new Vehiculo [150];
    }
    
    /**
     * Metodo para ingresar el vehiculo
     * @param auto recibe los datos del auto
     * @return nos regresa un dato de tipo booleano "true" si aun pudo entrar
     * "false" si ya no habia espacio
     */
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
    
    public void Salida(int horaSalida, int Total, Vehiculo auto)
    {
        for(int i=0; i<capacidad.length; i++){
            if(capacidad[i] == auto){
                //Total = horaSalida * auto.IngresaMin(_Min_);
            }
        }
        System.out.println(Total);
        System.out.println(auto);
    }
}
