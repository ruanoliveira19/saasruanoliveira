package application.models;


import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "autores")
public class Autor {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;


  private String nome;


  public void setId(int id) {
    this.id = id;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getId() {
    return id;
  }


  public String getNome() {
    return nome;
  }
}


