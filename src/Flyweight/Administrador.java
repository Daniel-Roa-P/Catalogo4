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
}
