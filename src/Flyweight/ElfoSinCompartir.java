
package Flyweight;

public class ElfoSinCompartir extends Personaje{

    private int coorX;
    private int coorY;
    private int daño;
    
    private final ElfoConcreto elfo;
    
    public ElfoSinCompartir(int x, int y){
        
        this.coorX=x;
        this.coorY=y;
        
        elfo= CreadorElfos.getElfo();
        
        setAtaque();
        setDefensa();
        setVida();
        setVelocidad();
        
    }
    
    public ElfoSinCompartir(){
        
        elfo= CreadorElfos.getElfo();
        
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
        
        this.vida=elfo.getVida();
        
    }

    @Override
    public int getDefensa() {
        
        daño=(daño/defensa)*10;
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

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    @Override
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
