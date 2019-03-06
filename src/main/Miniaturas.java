
package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Miniaturas implements Sprites{

    int xPos = 0;
    int yPos = 0;
    Image imagen;
    
    public Miniaturas(int x, int y, String miniatura){
        xPos = x;
        yPos = y;
        imagen = new ImageIcon(getClass().getResource("../Imagenes/"+miniatura+"min.png")).getImage();
    }
    
    @Override
    public void draw(Graphics g) {
       
        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public Rectangle getRect() {
        Rectangle rect = null;
        rect = new Rectangle(xPos, yPos, imagen.getWidth(null), imagen.getHeight(null));
        return rect;    
    }

    
}
