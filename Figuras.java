import java.util.*;
public class Figuras {
   Scanner teclado = new Scanner(System.in);
   private double area;
   private double base;
   private double altura;
   private double perimetro;
   private double hipotenusa;

   public double getHipotenusa() {
      return hipotenusa;
   }

   public void setHipotenusa(double hipotenusa) {
      this.hipotenusa = hipotenusa;
   }

   public double getArea() {
      return area;
   }
import java.util.*;

public class Figuras {
   Scanner teclado = new Scanner(System.in);
   private double area;
   private double base;
   private double altura;
   private double perimetro;
   private double hipotenusa;

   public double getHipotenusa() {
      return hipotenusa;
   }

   public void setHipotenusa(double hipotenusa) {
      this.hipotenusa = hipotenusa;
   }

   public double getArea() {
      return area;
   }

   public double getBase() {
      return base;
   }

   public double getPerimetro() {
      return perimetro;
   }

   public double getAltura() {
      return altura;
   }

   public void setBase(double base) {
      this.base = base;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public void setPerimetro(double perimetro) {
      this.perimetro = perimetro;
   }

   public void setArea(double area) {
      this.area = area;
   }

   public void menu() {
      int opc;
      do {
         System.out.println("******* BIENVENIDO*******");
         System.out.println("(1) calcular area");
         System.out.println("(2) calcular hipotenusa");
         System.out.println("(3) calcular perimetro");
         System.out.println("(4) mostrar resultados");
         System.out.println("(5) salir");

         opc = teclado.nextInt();

         switch(opc) {
            case 1: 
               calcularArea();
               break;
            case 2: 
               calcularHipotenusa();
               break;
            case 3: 
               calcularPerimetro();
               break;
            case 4: 
               mostrarResultados();
               break;
            case 5: 
               System.out.println("saliendo...");
               break;
            default: 
               System.out.println("opcion no valida");
         }
      } while(opc != 5);
   }

   private void calcularPerimetro() {
      setPerimetro(base + altura + hipotenusa);
      System.out.println("El perimetro es: " + perimetro); 
   }

   private void mostrarResultados() {
      System.out.println("***** RESULTADOS *****");
      System.out.println("Perimetro -> " + perimetro);
      System.out.println("Area -> " + area);
      System.out.println("Hipotenusa -> " + hipotenusa);
      System.out.println("volviendo al menu...");
   }

   private void calcularArea() {
      System.out.println("ingresa la base: ");
      setBase(teclado.nextInt());
      System.out.println("ingresa la altura: ");
      setAltura(teclado.nextInt());
      setArea((base * altura) / 2);
      System.out.println("El resultado del area es: " + area);
      System.out.println("volviendo al menu...");
   }

   private void calcularHipotenusa() {
      setHipotenusa(Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2))));
      System.out.println("hipotenusa calculada: " + hipotenusa);
      System.out.println("volviendo al menu...");
   }

   public static void main(String args[]) {
      Figuras figuras = new Figuras();
      figuras.menu();
   }
}

