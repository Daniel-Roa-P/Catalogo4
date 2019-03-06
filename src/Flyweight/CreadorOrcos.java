

package Flyweight;

public class CreadorOrcos {
    
    private static OrcoConcreto OrcoInstanciasdo = null;
    
    public static OrcoConcreto getOrco(){
        
        if (OrcoInstanciasdo == null){
            OrcoInstanciasdo = new OrcoConcreto();
        }
        return OrcoInstanciasdo;
    }
    
}
