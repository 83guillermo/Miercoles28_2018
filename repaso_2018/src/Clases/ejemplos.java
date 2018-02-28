/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejemplos {
    public static void IngresoDeDatos(){
       // integer numeroUno;
       // integer numeroDos;
       // integer resultado;
       // Scanner teclado;
        
    }
    public static void MostrarDatos(){
          //System.out.println("hola mundo");
        int numero1 ;
        int numero2 ;
        int resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero1 = leer.nextInt();
      
        System.out.println("ingrese otro numero");
        numero2 = leer.nextInt();
        resultado =numero1+numero2;
        System.out.println("resultado:"+resultado);
        if(numero1==numero2){
            System.out.println("son iguales");
        }
        if (numero2<numero1){
            System.out.println("el numero 1 es mayor al 2");
        }
        else{
            System.out.println("el numero 2 es mayor 1");
        }
    }
    // metodo saludar
    public static void Saludar(){
        System.out.println("hola mundo");
    }
    public static void UsoDelSwitch(){
        String mes;
        Scanner teclado= new Scanner(System.in) ;
        System.out.println("ingrese mes");
        mes = teclado.next();
        switch(mes){
            // mes de 28 dias o 29
            case "febrero":
                System.out.println("febrero tiene 28 dias o 29 si es biciestos");
                break;
            //meses con 31 dias
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "Octubre":
            case "diciembre":
                System.out.println("el mes que elejiste tiene 31 dias");
                break;
            //meses con 30 dias    
            case "abril":
            case "noviembre":
            case "septiembre":
            case "junio":
                System.out.println("el mes que elejistes  tiene 30");
                break;
               
             
             
        }
            
        }
    public static void UsoDelSwitchIf(){
        /*
        se pide el ingreso de un dia de la semana y una edad.
        de ser de un dia de fin de semana y de tener menos  de 13
        años  mostrar el msj "a descanzar"
        si es dia de al semana  y la misma edad el msj "a estudiar"
        si la edad supera los 18 años el msj es "a trabajar"
        si la edad esta entre los 15 y los 30 "a festejar solo si es fin de semana"
        */
        String UnDia;
        int edad;
        Scanner ingreseDia = new Scanner(System.in);
        UnDia= ingreseDia.next();
        Scanner ingreseEdad = new Scanner(System.in);
        edad = ingreseEdad.nextInt();
        System.out.println("este es la edad :"+edad+" \n y este es el dia :"+UnDia);
        
    }
    public static void UsoDelWhilevalidar(){
        
        Scanner ingreso = new Scanner(System.in);
        int edad; // mayor a 0 y menor a 100
        int sueldo; // mayor a 0
        String sexo;// f 0 m
        String TipoAlumno; // c cursoando , L = libre , E para egresado
        int temperatura; // -200 y +200
        String respuesta;  // si o no
        System.out.println("ingrese sueldo ");
        sueldo = ingreso.nextInt();
        if(sueldo==0){
            System.out.println("tu sueldo no tiene saldo");
        }else{
        while (sueldo<0){
            System.out.println("error ,suledo no puede ser negativo" );
            sueldo= ingreso.nextInt();
        }
       Scanner ingresoEdad = new Scanner(System.in);
        edad = ingresoEdad.nextInt();
        while(edad>0 && edad<100){
            
            System.out.println("si quiere salir ingrese una edad mayor a 100 o menor a 0");
            edad = ingresoEdad.nextInt();
            System.out.println("ingrese su sexo");
             Scanner ingresoSexo = new Scanner(System.in);
            sexo = ingresoSexo.next();
            while (!sexo.equals("f") && !sexo.equals("m")){
                System.out.println("no ingreso su sexo correctamente es f o m");
                sexo = ingresoSexo.next();    
            }
         
        }
        }
        }
    }
    

    

