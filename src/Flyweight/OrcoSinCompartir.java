
package Flyweight;

public class OrcoSinCompartir extends Personaje{

    private final ElfoConcreto Orco= CreadorElfos.getElfo();
    
    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=Orco.getVida();
        
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=Orco.getDefensa();
    
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=Orco.getAtaque();
    }

    @Override
    public int getVelocidad() {
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=Orco.getVelocidad();
    
    }
}
