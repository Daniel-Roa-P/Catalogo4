
package Flyweight;

import static main.Catalogo.aspectoHumano;
import static main.Catalogo.aspectoOrco;

public class HumanoConcreto extends Personaje {

     @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=300;
        
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=20;
        
        if(aspectoHumano.contains("escudo")){
            
            defensa=40;
            
        }
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=30;
    
        if(aspectoHumano.contains("arma")){
            
            ataque=60;
            
        }
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=3;
        
        if(aspectoHumano.contains("montura")){
            
            velocidad=6;
            
        }
    
    }
}
