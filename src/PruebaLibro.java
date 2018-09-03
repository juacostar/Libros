/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class PruebaLibro {
    
    public static void main(String[] args) {
        //Dependencia
        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        int opcion = -1;
        ConjuntoLibro conjunto = new ConjuntoLibro();
        System.out.println("Bienvenido a Biblioteca"); 
        do{
            System.out.println("1. Ingresar Libro");
            System.out.println("2. Listar Libros");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Libro l1= new Libro(null, null,0, 0);//Insertar 
                    System.out.println("Ingrese nombre");
                    String nombre= entrada.next();
                    l1.setTitulo(nombre);
                    //capturar dato
                    System.out.println("Ingrese Autor");
                    String autor= entrada.next();
                    l1.setAutor(autor);
                    //capturar dato
                    System.out.println("ingrese Numero Paginas");
                    int numPaginas= entrada.nextInt();
                    l1.setNumPaginas(numPaginas);
                    //capturar dato
                    System.out.println("Ingrese calificacion");
                    int calificacion=entrada.nextInt();
                    l1.setCalificacion(calificacion);
                    
                    conjunto.anadirLibro(l1);
                    //Crear Objeto Libro
                    //Anadirlo en la coleccion
                    break;
                case 2: 
                    Libro l3= new Libro("ocho", "ocho", 8, 123);
                    conjunto.anadirLibro(l3);
                    Libro l4= new Libro("cuatro", "cuatro", 6, 1234);
                    conjunto.anadirLibro(l4);
                    System.out.println("1. Eliminar libro por autor");
                    System.out.println("2. Eliminar libro por titulo");
                    System.out.println("3. Obtener el libro mas calificado");
                    System.out.println("4. Obtener el libro menos calificado");
                    System.out.println("5. Mostrar toda la coleccion");
                    
                    
                    int k= entrada.nextInt();
                    switch(k){
                        case 1:
                            System.out.println("Ingrese el autor del libro al que quiere eliminar");
                            String borrarautor= entrada.next();
                            conjunto.eliminarxAutor(borrarautor);
                            if(conjunto.eliminarxAutor(borrarautor)){
                                System.out.println("Se elmino el libro exitosamente");
                            }else{
                                System.out.println("operacion invalida");
                            }
                        break;
                        
                        case 2:
                            System.out.println("Ingrese el titulo del libro que quiere eliminar");
                            String borrarTitulo= entrada.next();
                            conjunto.eliminarxTitulo(borrarTitulo);
                            if(conjunto.eliminarxTitulo(borrarTitulo)){
                                System.out.println("Se elimino el libro exitosamente");
                            }else{
                                System.out.println("operacion invalida");
                            }
                            
                        break;
                        
                        case 3:
                            String M= conjunto.obtenerMejorCalificador().getTitulo();
                            System.out.println("el libro mas calificado tiene por tirulo: "+ M);
                        break;
                        
                        case 4:
                            System.out.println("El libro menos calificado tiene por titulo: "+conjunto.obtenerPeorCalificado().getTitulo());
                            break;
                            
                            
                        case 5:
                            System.out.println("Los libros segun su titulo son: ");
                            for(int i=0;i<4;i++){
                                System.out.println(conjunto.mostrarLibro(i));
                            }
                            
                        break;
                    }
                      //Listar
                      //Solicitar los libros a la coleccion
                      //Imprimir los libros
                    
                     break;
                default:
                    System.out.println("Opcion Invalida");
            }
            
            System.out.println("Desea continuar");
            continuar = entrada.nextBoolean();
        }while(continuar);
          
        
    }
}
