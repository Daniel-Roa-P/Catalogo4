
package Flyweight;

public class HumanoSinCompartir extends Personaje{

    private int coorX;
    private int coorY;
    private int daño;
    
    private final HumanoConcreto humano;
    
    public HumanoSinCompartir(int x, int y){
    
        this.coorX=x;
        this.coorY=y;
        humano= CreadorHumanos.getHumano();
        
        setAtaque();
        setDefensa();
        setVida();
        setVelocidad();
        
    }
    
     @Override
    public int getVida() {
        
        vida=vida-daño;
        
        return vida;
    }

    @Override
    public void setVida() {
        
        this.vida=humano.getVida();
        
    }

    @Override
    public int getDefensa() {
        
        daño=(daño/defensa)*10;
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
        
        velocidad = velocidad+velocidad;
        return velocidad;    
    }

    @Override
    public void setVelocidad() {
        
        this.velocidad=humano.getVelocidad();
    
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    public int getCoorX() {
        return coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public int getDaño() {
        return daño;
    }    
}
