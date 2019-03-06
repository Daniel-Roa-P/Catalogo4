
package Flyweight;

public class HumanoSinCompartir extends Personaje{

    private final HumanoConcreto humano= CreadorHumanos.getHumano();
    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=humano.getVida();
        
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=humano.getDefensa();
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=humano.getAtaque();
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=humano.getVelocidad();
    
    }
   
}
