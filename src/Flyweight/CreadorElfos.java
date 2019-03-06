
package Flyweight;

public class CreadorElfos {
    
    private static ElfoConcreto ElfoInstanciado = null;
    
    public static ElfoConcreto getElfo(){
        
        if (ElfoInstanciado == null){
            ElfoInstanciado = new ElfoConcreto();
        }
        return ElfoInstanciado;
    }
    
}
