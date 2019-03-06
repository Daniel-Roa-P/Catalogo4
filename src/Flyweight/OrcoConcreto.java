
package Flyweight;

import static main.Catalogo.aspectoOrco;

public class OrcoConcreto extends Personaje{

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
        
        this.defensa=30;
        
        if(aspectoOrco.contains("escudo")){
            
            defensa=60;
            
        }
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=45;
    
        if(aspectoOrco.contains("arma")){
            
            ataque=90;
            
        }
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=2;
        
        if(aspectoOrco.contains("montura")){
            
            velocidad=4;
            
        }
    
    }
    
}
