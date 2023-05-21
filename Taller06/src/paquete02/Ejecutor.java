
package paquete02;

import java.util.Scanner;
import paquete01.*;

public class Ejecutor {

    public static void main(String[] args) {        
        
        Scanner entrada = new Scanner(System.in);
        
        String nombreHospital;
        String direcc;
        String nombreCiudad;
        String provincia;
        int numEspecialidades;
        int numDoc;
        int numNurse;
        // Creamos las variables que enviaremos a cada objeto        
        
        System.out.println("Ingrese el nombre del hospital:");
        nombreHospital = entrada.nextLine();
        
        System.out.println("Ingrese la dirección del hospital:");
        direcc = entrada.nextLine();
        
        System.out.println("Ingrese el nombre de la ciudad:");
        nombreCiudad = entrada.nextLine();
        
        System.out.println("Ingrese la provincia:");
        provincia = entrada.nextLine();
        
        // Creamos un objeto ciudad para enviarle a la clase Hospital
        Ciudad ciudad = new Ciudad (nombreCiudad,provincia);        
        
        System.out.println("Ingrese el número de especialidades:");
        numEspecialidades = entrada.nextInt();
        
        System.out.println("Ingrese el número de médicos:");
        numDoc = entrada.nextInt();
        
        System.out.println("Ingrese el número de enfermeros(as)");
        numNurse = entrada.nextInt();       
        
        // Creamos dos arreglos uno de tipo Medico y otro de tipo Enfermero
        // Su tamaño serán dados por el usuario que dirá cuántos médicos y 
        // enfermeros hay en el hospital
        Medico[] medicos = new Medico [numDoc];
        Enfermero [] enfermeros = new Enfermero [numNurse];
        
        String nombre;
        String apellido;
        String especialidad;
        String tipo;
        double sueldoMensual;
        // Creamos las siguientes variables que nos ayudarán a llenar los arreglos
        entrada.nextLine();
        
        for (int i=0; i<numDoc; i++) {
            System.out.println("Ingrese el nombre del médico:");
            nombre = entrada.next();
            
            System.out.println("Ingrese el apellido del médico:");
            apellido = entrada.next();
            
            System.out.println("Ingrese la especialidad:");
            especialidad = entrada.next();
            
            System.out.println("Ingrese el sueldo mensual del médico");
            sueldoMensual = entrada.nextDouble();
            
            medicos[i]= new Medico(nombre,apellido,especialidad,
                    sueldoMensual);
            // Llenamos el arreglo en la posición i con un objeto tipo Medico
        }
        
        entrada.nextLine();
        
        for (int i=0; i<numNurse; i++) {
            System.out.println("Ingrese el nombre del enfermero:");
            nombre = entrada.next();
            
            System.out.println("Ingrese el apellido del enfermero:");
            apellido = entrada.next();
            
            System.out.println("Ingrese el tipo (nombramiendo o contrato):");
            tipo = entrada.next();
            
            System.out.println("Ingrese el sueldo mensual del enfermero");
            sueldoMensual = entrada.nextDouble();
            
            enfermeros[i]= new Enfermero(nombre,apellido,tipo,
                    sueldoMensual);
            // Llenamos el arreglo en la posición i con un objeto tipo Enfermero
        }
        
        Hospital hospital = new Hospital(nombreHospital,direcc,ciudad,
                medicos,enfermeros,numEspecialidades);
        // Por último creamos el objeti tipo Hospital y le enviamos los 
        // parpametros que necesita
        
        //Calculamos el total a pagar en cuanto a sueldos
        hospital.calcularSueldos(medicos, enfermeros);
        
        // Llamamos al método toString para imprimir
        System.out.printf("\n%s\n", hospital);
    }
    
}
