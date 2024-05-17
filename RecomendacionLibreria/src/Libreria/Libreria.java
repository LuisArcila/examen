package Libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libreria {
    Scanner sc = new Scanner(System.in);

    // Atributos encapsulados con el modificador private
    private  String nombre;

    private  String autor;
    private  String sinopsis;
    private String genero;

    private  List<ArrayList<Object>> comentarios = new ArrayList<>();
    private int meGusta;



    // Constructor de la clase


    // Getter and Setter
    public String getid(){
        return nombre;
    }

    public Libreria(){

    }

    public void setId(String nombre){
        this.nombre = nombre ;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis =sinopsis;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getComentarios(){
        return    comentarios;
    }
    public void setComentarios(String comentarios){
        this.comentarios = new ArrayList<>() ;
    }



    public int getMeGusta(){
        return meGusta;
    }

    public void setMeGusta(int meGusta){
        this.meGusta = 0;
    }




    // metodo propio





    ArrayList<Object> comentsrios = new ArrayList<Object>();



    public  void crear(){
        System.out.println("nombre");
        nombre = sc.nextLine();
        libro.add(nombre);

        System.out.println("autor");
        autor = sc.nextLine();
        libro.add(autor);

        System.out.println("sinopsis");
        sinopsis = sc.nextLine();
        libro.add(sinopsis);

        System.out.println("genero");
        genero = sc.nextLine();
        libro.add(genero);

        System.out.println("comentarios");
        comentarios = sc.nextLine();
        libro.add(comentarios);

        System.out.println("me gusta");
        meGusta = sc.nextInt();
        sc.nextLine();
        libro.add(meGusta);




    }



    public void printUser(){

        for (Object item : libro){
            System.out.println(item);
        }

    }


}
