
package Flyweight;

import static main.Catalogo.aspectoElfo;

public class ElfoConcreto extends Personaje {

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=100;
        
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=10;
        
        if(aspectoElfo.contains("escudo")){
            
            defensa=20;
            
        }
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=15;
    
        if(aspectoElfo.contains("arma")){
            
            ataque=30;
            
        }
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=5;
        
        if(aspectoElfo.contains("montura")){
            
            velocidad=10;
            
        }
        
    }
    
}
