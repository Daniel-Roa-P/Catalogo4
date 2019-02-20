
package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Muros implements Sprites{

    Image imagen = new ImageIcon(getClass().getResource("../Imagenes/muro.PNG")).getImage();
    int xPos = 0;
    int yPos = 0;
    
    public Muros(int x, int y){
        xPos = x;
        yPos = y;
    }
    
    @Override
    public void draw(Graphics g) {
       
        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public void update(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rectangle getRect() {
        Rectangle rect = null;
        rect = new Rectangle(xPos, yPos, imagen.getWidth(null), imagen.getHeight(null));
        return rect;    }

    @Override
    public void cambiarSentido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
