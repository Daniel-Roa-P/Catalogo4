
package Flyweight;

public class CreadorHumanos {
    
    private static HumanoConcreto HumanoInstanciado = null;
    
    public static HumanoConcreto getHumano(){
        
        if (HumanoInstanciado == null){
            HumanoInstanciado = new HumanoConcreto();
        }
        return HumanoInstanciado;
    }
    
}
