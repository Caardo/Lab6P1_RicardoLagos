//Lab 6
//Pues no se que hacer va

package lab6p1_ricardolagos;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_RicardoLagos {
    
    static Random random = new Random();
    static Scanner cardo=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Bienvenido (a/e) al Lab6");
        System.out.println("""
                           1.Conjuntos
                           2.¿Cuantos primos tienes?
                           3.Salir del programa""");
        System.out.println("Ingrese una opcion: ");
        int opcion=cardo.nextInt();
        
        int size=cardo.nextInt();
        int array[]= new int [size];
        int array2[]= new int [size];
        
        while(opcion>0&&opcion<3){
            
            switch(opcion){
                case 1->{
                    System.out.println("Ingrese el tamaño del set 1:");
                    String size1=cardo.nextLine();
                    int Set1[]= new int [size];
                    Set1=Llenado(Set1);
                    System.out.print("Set 1: ");
                    imprimir(Set1);
                    System.out.println("Ingrese el tamaño del set 2: ");
                    String size2=cardo.nextLine();
                    int Set2[]= new int [size];
                    System.out.print("Cadena generada: ");
                  
                }//fin caso 1
                
                case 2->{
                    System.out.println("Ingrese el numero del arreglo: ");
                    int can=cardo.nextInt();
                    System.out.println("Limite inferior: ");
                    int limit=cardo.nextInt();
                    int array3[]=new int [limit];
                    System.out.println("Limite superior: ");
                    int sup=cardo.nextInt();
                    int array4[]=new int [sup];
                    for (int i = limit; i < array4.length; i++) {
                        array[i]=random.nextInt(20);
                    }
                    imprimir(array);
                    System.out.println("");
                    imprimir(array);
                    System.out.println("");
                    imprimir(array2);
                    
                }//fin caso 2
                
            }//fin del switch
            
        System.out.println("//--//--//M E N U//--//--//");
        System.out.println("""
                           1.Conjuntos
                           2.¿Cuantos primos tienes?
                           3.Salir del programa""");
        System.out.println("Ingrese una opcion: "); 
        opcion=cardo.nextInt();
        
        }//fin  del while
        
    }//fin del main
    
    public static int [] conjuntos(int genRandCharArray, String cadena){
        
        String size1 = cardo.nextLine();
        int temporal []= new int [genRandCharArray];
        char cifra =' ';
        String resp="";
        for (int b = 0; b < size1.length(); b++){
            cifra = size1.charAt(b);
            int num =cifra;
            cifra +=2;  
            resp += cifra;
            num=random.nextInt((73-65)+1)+65;
        }
        
        
      return temporal;  
      
    }//fin de conjuntos
    
    public static void imprimir (int[] array){
        for (int j = 0; j < array.length; j++) {
            System.out.print("[ "+array[j]+" ]");
        }//fin for
        System.out.println("");
    }//fin de imprimir
    
    public static int[] Llenado(int array[]){
        for (int i = 0; i < array.length; i++) {
            Random rng = new Random( );
            int aleatorio = rng.nextInt(99);
            array[i]=aleatorio;
        }
        return array;
    }//fin del llenado
    
    public static void genRandArray(int size){
        int temporal []= new int [size];
        for (int i = 0; i < size; i++) {
            temporal[i]=random.nextInt(20)+1;
            System.out.println(temporal[i]);
        }
    }//fin del random
    
}//fin de la clase
