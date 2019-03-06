package Flyweight;

public class Administrador {
    
    int contadorElfos,contadorHumanos,contadorOrcos;
    ElfoSinCompartir[] elfos;
    HumanoSinCompartir[] humanos;
    OrcoSinCompartir[] orcos;
    
    public Administrador(int contadorElfos, int contadorHumanos, int contadorOrcos){
        
        this.contadorElfos=contadorElfos;
        this.contadorHumanos=contadorHumanos;
        this.contadorOrcos=contadorOrcos;
        
        elfos = new ElfoSinCompartir[contadorElfos];
        humanos = new HumanoSinCompartir[contadorHumanos];
        orcos = new OrcoSinCompartir[contadorOrcos];
    }
    
    public void generarElfos(int x, int y){
    
        contadorElfos--;
        
        elfos[contadorElfos]=new ElfoSinCompartir(x,y);
        
    }
    
    public void generarHumanos(int x, int y){
    
        contadorHumanos--;
        
        humanos[contadorHumanos]=new HumanoSinCompartir(x,y);
        
    }
    
    public void generarOrcos(int x, int y){
    
        contadorOrcos--;
        
        orcos[contadorOrcos]=new OrcoSinCompartir(x,y);
        
    }
    
    public String[][] definirEstado(String[][] matriz){
        
        for(int i=0;i<elfos.length;i++){
        
            int temX=elfos[i].getCoorX()+5;
            int temY=elfos[i].getCoorY();
            
            if(temX<135 && matriz[temX][temY].equals("0")){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="e";
                
                elfos[i].setCoorX(temX);
                elfos[i].setCoorY(temY);
                
            }
            
        }
        
        for(int i=0;i<humanos.length;i++){
        
            int temX=humanos[i].getCoorX()+5;
            int temY=humanos[i].getCoorY();
            
            if(temX<135 && matriz[temX][temY].equals("0")){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="h";
                
                humanos[i].setCoorX(temX);
                humanos[i].setCoorY(temY);
            }
            
        }
        
        for(int i=0;i<orcos.length;i++){
        
            int temX=orcos[i].getCoorX()+5;
            int temY=orcos[i].getCoorY();
            
            if(temX<135 && matriz[temX][temY].equals("0")){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="o";
                
                orcos[i].setCoorX(temX);
                orcos[i].setCoorY(temY);
            }
            
            
            
        }
        
        for(int j=0;j<76;j++){
            for(int k=0;k<136;k++){
            System.out.print(matriz[k][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        return matriz;
    
    }
}
