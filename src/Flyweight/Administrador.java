package Flyweight;

public class Administrador {
    
    int contadorElfos,contadorHumanos,contadorOrcos;
    int eEnemigos,hEnemigos,oEnemigos;
    ElfoSinCompartir[] elfos,elfosEnemigos;
    HumanoSinCompartir[] humanos,humanosEnemigos;
    OrcoSinCompartir[] orcos,orcosEnemigos;
    
    public Administrador(int contadorElfos, int contadorHumanos, int contadorOrcos){
        
        this.contadorElfos=contadorElfos;
        this.contadorHumanos=contadorHumanos;
        this.contadorOrcos=contadorOrcos;
        
        elfos = new ElfoSinCompartir[contadorElfos];
        humanos = new HumanoSinCompartir[contadorHumanos];
        orcos = new OrcoSinCompartir[contadorOrcos];
    }
    
    public void setEnemigos(int eEnemigos, int hEnemigos, int oEnemigos){
        
        this.eEnemigos=eEnemigos;
        this.hEnemigos=hEnemigos;
        this.oEnemigos=oEnemigos;
        
        elfosEnemigos = new ElfoSinCompartir[eEnemigos];
        humanosEnemigos = new HumanoSinCompartir[hEnemigos];
        orcosEnemigos = new OrcoSinCompartir[oEnemigos];
        
        
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
    
    public void generarElfosE(int x, int y){
    
        eEnemigos--;
        elfosEnemigos[eEnemigos]=new ElfoSinCompartir(x,y);
        
    }
    
    public void generarHumanosE(int x, int y){
    
        hEnemigos--;
        humanosEnemigos[hEnemigos]=new HumanoSinCompartir(x,y);
        
    }
    
    public void generarOrcosE(int x, int y){
    
        oEnemigos--;
        orcosEnemigos[oEnemigos]=new OrcoSinCompartir(x,y);
        
    }
    
    public String[][] definirEstado(String[][] matriz){
        
        for(int i=0;i<elfos.length;i++){
        
            int temX=elfos[i].getCoorX()+5;
            int temY=elfos[i].getCoorY();
            
            if(temX<135 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="e";
                
                elfos[i].setCoorX(temX);
                elfos[i].setCoorY(temY);
                
            } else if((matriz[temX][temY].equals("E")) || (matriz[temX][temY].equals("O")) || (matriz[temX][temY].equals("H")) ){
            
            }
            
        }
        
        for(int i=0;i<elfosEnemigos.length;i++){
        
            int temX=elfosEnemigos[i].getCoorX()-5;
            int temY=elfosEnemigos[i].getCoorY();
            
            if(temX>0 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX+5][temY]="n";
                matriz[temX][temY]="E";
                
                elfosEnemigos[i].setCoorX(temX);
                elfosEnemigos[i].setCoorY(temY);
                
            } else if((matriz[temX][temY].equals("e")) || (matriz[temX][temY].equals("o")) || (matriz[temX][temY].equals("h")) ){
            
            }
            
        }
        
        for(int i=0;i<humanos.length;i++){
        
            int temX=humanos[i].getCoorX()+5;
            int temY=humanos[i].getCoorY();
            
            if(temX<135 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="h";
                
                humanos[i].setCoorX(temX);
                humanos[i].setCoorY(temY);
                
            } else if((matriz[temX][temY].equals("E")) || (matriz[temX][temY].equals("O")) || (matriz[temX][temY].equals("H")) ){
                
                
                
            }
            
        }
        
        for(int i=0;i<humanosEnemigos.length;i++){
        
            int temX=humanosEnemigos[i].getCoorX()-5;
            int temY=humanosEnemigos[i].getCoorY();
            
            if(temX>0 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX+5][temY]="n";
                matriz[temX][temY]="H";
                
                humanosEnemigos[i].setCoorX(temX);
                humanosEnemigos[i].setCoorY(temY);
                
            }  else if((matriz[temX][temY].equals("e")) || (matriz[temX][temY].equals("o")) || (matriz[temX][temY].equals("h")) ){
            
            }
            
        }
        
        for(int i=0;i<orcos.length;i++){
        
            int temX=orcos[i].getCoorX()+5;
            int temY=orcos[i].getCoorY();
            
            if(temX<135 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX-5][temY]="n";
                matriz[temX][temY]="o";
                
                orcos[i].setCoorX(temX);
                orcos[i].setCoorY(temY);
                
            } else if((matriz[temX][temY].equals("E")) || (matriz[temX][temY].equals("O")) || (matriz[temX][temY].equals("H")) ){
            
            }
                   
        }
        
        for(int i=0;i<orcosEnemigos.length;i++){
        
            int temX=orcosEnemigos[i].getCoorX()-5;
            int temY=orcosEnemigos[i].getCoorY();
            
            if(temX>0 && (matriz[temX][temY].equals("0") || matriz[temX][temY].equals("n"))){
                
                matriz[temX+5][temY]="n";
                matriz[temX][temY]="O";
                
                orcosEnemigos[i].setCoorX(temX);
                orcosEnemigos[i].setCoorY(temY);
                
            } else if((matriz[temX][temY].equals("e")) || (matriz[temX][temY].equals("o")) || (matriz[temX][temY].equals("h")) ){
            
            }
            
        }
        
        return matriz;
    
    }
    
    
    
}
