package application.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "livros")
public class Livro{
    private int id;
    private String titulo;

    public void setTitulo(String titulo){
    this.titulo = titulo;
   }

   public String getTitulo(){
    return titulo;
   }
   
   public void setId(int id){
    this.id = id;
   }
   
   public int getId(){
    return id;
   }
 @ManyToOne
 @JoinColumn(name = "id_autor")
private Autor autor;

public void setAutor(Autor autor){
    this.autor = autor;
}

public Autor getAutor(){
    return autor;
}

@ManyToOne
@JoinColumn(name = "id_genero")
private Genero genero;
public void setGenero(Genero genero){
    this.genero = genero;
}
public Genero getGenero(){
    return genero;
}


}