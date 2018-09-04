/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    //Asociacion
    private Libro[] coleccion;
    
    public ConjuntoLibro(){
      this.coleccion = new Libro[4];
    }
    
    public boolean anadirLibro(Libro libro){
        for (int i = 0; i <this.coleccion.length; i++) {
            if(this.coleccion[i]==null){
                this.coleccion[i]=libro;
                return true;
            }
        }
        return false;
    }
    
    public Libro[] obtenerTodosLibros(){
       return this.coleccion;
    }
      
    public boolean eliminarxAutor(String autor){
        for(int i=0; i<this.coleccion.length;i++){
            if(this.coleccion[i].getAutor().equals(autor)){
                this.coleccion[i]=null;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarxTitulo(String titulo){
         for(int i=0;i<this.coleccion.length;i++){
            if(this.coleccion[i].getTitulo().equals(titulo)){
                this.coleccion[i]=null;
                return true;
            }
        }
      return false;
    }
    public Libro obtenerMejorCalificador(){
        float mayor=0;
        int pos=0;
        for(int i=0;i<coleccion.length;i++){
            if(this.coleccion[i]!= null && this.coleccion[i].getCalificacion()>mayor){
                mayor=this.coleccion[i].getCalificacion();
                pos=i;
            } 
        }
        
      return coleccion[pos];
    }
    public Libro obtenerPeorCalificado(){
        float menor=11;
        int pos=0;
        for(int i=0;i<coleccion.length;i++){
            if(this.coleccion[i]!= null && this.coleccion[i].getCalificacion()<menor){
                menor=this.coleccion[i].getCalificacion();
                pos=i;
            }
        }
        
        return coleccion[pos];
    }
    
    public String mostrarLibro(int i){
        return coleccion[i].getTitulo();
    }
  
}
