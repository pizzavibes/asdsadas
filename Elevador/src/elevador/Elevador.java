package elevador;

public class Elevador {
 private int pisoActual;
 public int PISO_MAX;
 public int PISO_MIN;
 
 public Elevador( int max, int min){
 PISO_MAX= max;
 PISO_MIN= min; 
 pisoActual=PISO_MIN;
 }
    
public void subirPiso(){
pisoActual++ ;
}
 
public void bajarPiso(){
pisoActual--;
} 

public int getPisoActual(){
return pisoActual;
}
 
 
 
 
 
 
 
 
 
 
 
       
}
