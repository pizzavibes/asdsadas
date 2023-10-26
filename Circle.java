package area_circulo;
public class Circle {
    private final double pi =3.14;
    private final double radio;
    public Circle(double diameter){
    radio= diameter/2;
    }
    
    public double area(){
    return pi*Math.pow(radio,2);
    }
    
    public double perimeter(){
    return 2* pi* radio; 
    }
    
public static void main(String[] args) { 
   Circle medium_pizza = new Circle(8);
    System.out.println(" Area pizza mediana: " + medium_pizza.area());
    System.out.println("Perimetro pizza mediana: " + medium_pizza.perimeter());
   }
}
