
package main;

import javax.swing.JFrame;

class Juego extends JFrame{
    
    CampoBatalla campo = new CampoBatalla();
    Archivos fu = new Archivos();
    String[][] matriz;
    
    public Juego(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        String archivo = fu.archivoAleatorio("../archivos");
        
        System.out.println(archivo);
        
        matriz = fu.fileToMatriz("../archivos/" + archivo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(campo);
        pack();
        setBounds(0, 0, 1350, 730);
        campo.iniciarCampo(matriz);
        campo.setBounds(0, 0, 1300, 730);
    }
    
}
