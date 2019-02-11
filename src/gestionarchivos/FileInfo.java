
package gestionarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Estudiante
 */

public class FileInfo {

    public static void main (String[] args) throws FileNotFoundException{
        /**File archivo = new File("x");//El archivo debe estar en el directorio de la app
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());
        
        Mirar comor acceder a todos los archivos que tiene una carpeta
        if(archivo.isDirectory()){
            File files[] = archivo.listFiles();
            for(File file: files){
                if(file.isDirectory()){
                    
                }
            }       
        }
        */
        /**Scanner
        
        Scanner input = new Scanner (new File("x/y/w/a.txt"));
        int count = 0;
        while(input.hasNext()){
            String word = input.next();
            count++;
        }
        System.out.println("Palabras totales :"+count);
        */
        
        //Programa
        int a = 0;
        
        do{
        System.out.println("Opciones");
        System.out.println("1.Ingresar entero ");
        System.out.println("2.Guardar información");
        System.out.println("3.Mostrar datos ingresados");
        System.out.println("Ingrese el número de la opción deseada: ");
        
        Scanner lectura = new Scanner(System.in);
        a = lectura.nextInt();
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        
        switch(a){
            case 1:
                System.out.println("Ingrese un número entero: ");
                int num=lectura.nextInt();
                enteros.add(num);
             
                break;
            case 2:
                PrintStream out = new PrintStream ("x/z/b.txt");
                for(int i=0;i<enteros.size();i++){
                    out.println(enteros.get(i));
                }
                break;
            case 3:
                Scanner input = new Scanner (new File("x/z/b.txt"));
                while(input.hasNextInt()){
                    int b = input.nextInt();
                    System.out.println(b);
                }
                break;            
        }
        }while((0<a)&&(a<4));
    }
}

