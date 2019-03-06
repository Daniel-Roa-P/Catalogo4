
package Flyweight;

public abstract class Personaje {
    
    protected int vida;
    protected int defensa;
    protected int ataque;
    protected int velocidad;

    public abstract int getVida();
    public abstract void setVida();

    public abstract int getDefensa();
    public abstract void setDefensa();

    public abstract int getAtaque();
    public abstract void setAtaque();

    public abstract int getVelocidad();
    public abstract void setVelocidad();

    public void setDaño(int daño){};
        

}
