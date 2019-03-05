
package main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import static main.Catalogo.aspectoElfo;
import static main.Catalogo.aspectoHumano;
import static main.Catalogo.aspectoOrco;


public class CampoBatalla extends Canvas{
    
    BufferedImage imgBuffer;
    String[][] matriz;
    ArrayList<Sprites> rocas;
 
    public CampoBatalla(){
        
        rocas = new ArrayList<>();
        imgBuffer = new BufferedImage(1090, 730, BufferedImage.TRANSLUCENT);
        
    }
    
    public void iniciarCampo(String[][] matriz) {
        this.matriz = matriz;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c].equals("1")) {
                    rocas.add(new Miniaturas(f * 8, c * 8, "muro"));
                } else if (matriz[f][c].equals("e")) {
                    rocas.add(new Miniaturas(f * 8, c * 8, aspectoElfo));
                } else if (matriz[f][c].equals("h")) {
                    rocas.add(new Miniaturas(f * 8, c * 8, aspectoHumano));
                } else if (matriz[f][c].equals("o")) {
                    rocas.add(new Miniaturas(f * 8, c * 8, aspectoOrco));
                } 

            }
        }
    }
    
    @Override
    public void paint(Graphics g) {
        //super.paint(g); //To change body of generated methods, choose Tools | Templates.
    
        Graphics miG = imgBuffer.getGraphics();
        //miG.drawImage(new ImageIcon(getClass().getResource("../imagenes/fondo.png")).getImage(), 0, 0, null);
        miG.clearRect(0, 0, 1300, 600);
        
        for (Iterator<Sprites> iterator = rocas.iterator(); iterator.hasNext();) {
            Sprites next = iterator.next();
            next.draw(miG);

        }
        
        g.drawImage(imgBuffer, 0, 0, this);
    }
    
    
}
