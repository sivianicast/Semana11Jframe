/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Laboratorio CISCO
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private char sexo;
    public Persona(){
        nombre = "";
        apellido = "";
        sexo = 'F';
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setSexo(char sexo){
        sexo = Character.toUpperCase(sexo);
        this.sexo = sexo == 'F' || sexo == 'M' ? sexo : 'F';
    }
    @Override
    public String toString(){
        return Integer.toString(this.id)+", "+
                this.nombre+", "+
                this.apellido+", "+
                this.sexo;
    }
}
