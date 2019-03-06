
package Flyweight;

public class ElfoSinCompartir extends Personaje{

    private final ElfoConcreto elfo= CreadorElfos.getElfo();
    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=elfo.getVida();
        
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=elfo.getDefensa();
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=elfo.getAtaque();
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=elfo.getVelocidad();
    
    }
    
}
