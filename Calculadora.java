/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author pimen
 */
public class Calculadora {
    //atributos privados

 private double numero1;
 private double numero2;
 
  //constructores

    public Calculadora() {
        this.numero1 = 0; //por deecto 0
        this.numero2 = 0;   
       
    }
    //los dos numeros que realizaran las operaciones
    public void Ingresarnumero (double numero1, double numero2){ 
        this.numero1 = numero1;//primer numero
        this.numero2 = numero2;//segundo numero 
        
    } 
    //calcula la suma de los dos numeros, utilizando return para dar el resultado de esta
    public double calcularSuma(){
        return numero1+numero2; 
        
    }
 //calcula la resta de los dos numeros, utilizando return para dar el resultado de esta
    public double calcularResta(){ 
        return numero1-numero2;
  
    }
    //calcula la multiplicacion de los dos numeros, utilizando return para dar el resultado de esta  
    public double calcularMultilicacion(){ 
        return numero1*numero2;
        
    }
     //calcula la division de los dos numeros, utilizando return para dar el resultado de esta 
    public double calcularDivision(){
        if (numero2==0) {
            System.out.println("no se puede divivdir entre 0");
        }
        return numero1 / numero2;
        
    }
    /*metodo principal donde se muestra el menu de opciones y la ejecucion 
    *de la operacion que seleccione hasta que se elija la opcion salir
    */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       Calculadora calc = new Calculadora();
       int opc;
       
       //el menu proncipal  (0 para salir)
       
        do {            
            
            System.out.println("====Calculadora matematica====");            
            System.out.println("1. Ingresar numeros");            
            System.out.println("2. Sumar ");            
            System.out.println("3. Restar");            
            System.out.println("4. MUltiplicar");            
            System.out.println("5. Dividir");            
            System.out.println("0. Salir");
            System.out.println("=======================================");
            System.out.println("Selecciona uuna opcion: ");
            opc = sc.nextInt();
            
            //se ejecuta la opcion ingresada por el ususrio
            
            switch(opc) {
                
                case 1:
                    
                    System.out.println("ingresarnumero..");
                    double   numero1 =sc.nextDouble();                    
                    System.out.println("ingresarnumero..");
                    double   numero2 =sc.nextDouble();
                    
                    calc.Ingresarnumero(numero1, numero2);
                    
                    break;                
                case 2:
                    
                    System.out.println("Resultado suma: " + calc.calcularSuma());
                    
                    break;                
                case 3:
                    
                    System.out.println("Resultado resta: " + calc.calcularResta());
                    
                    break;                
                case 4:
                    System.out.println("Resultado multiplicacion: " + calc.calcularMultilicacion());
                    break;                   
                case 5:
                    //antes que nada valida si se ingreso un 0 como segundo numero 
                    System.out.println("Resultado dividir: " + calc.calcularDivision());
                    //en caso de que se ingrese el cero se mostrara el mensaje
                    break;
            }
        } while (opc!=0);
        
        sc.close();
    }
    
    
}
