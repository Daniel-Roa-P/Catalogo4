
package Flyweight;

public class OrcoSinCompartir extends Personaje{

    private int coorX;
    private int coorY;
    private int daño;
    
    private final OrcoConcreto orco;
    
    public OrcoSinCompartir (int x, int y){
        
        this.coorX=x;
        this.coorY=y;
        orco= CreadorOrcos.getOrco();
        
        setAtaque();
        setDefensa();
        setVida();
        setVelocidad();
        
    }
    
    @Override
    public int getVida() {
        
        this.vida=vida-daño;
        
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=orco.getVida();
        
    }

    @Override
    public int getDefensa() {
        
        daño=(daño/defensa)*10;
        return defensa;
    }

    @Override
    public void setDefensa() {
        
        this.defensa=orco.getDefensa();
    
    }

    @Override
    public int getAtaque() {
        
        return ataque;
    }

    @Override
    public void setAtaque() {     
        this.ataque=orco.getAtaque();
    }

    @Override
    public int getVelocidad() {
        
        velocidad = velocidad+velocidad;
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=orco.getVelocidad();
    
        System.out.println("personaje orco"+coorX+" "+coorY+" "+vida+" "+ataque+" "+defensa+" "+velocidad);
    }
}
