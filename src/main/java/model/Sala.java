package model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String descricao;

    private int quantidadeMax;

    public Sala(){

    }

    public long getId() {return id;}
    public String getNome() {return nome;}
    public String getDescricao() {return descricao;}
    public int getQuantidadeMax() {return quantidadeMax;}

    public void setNome(String nome) {this.nome = nome;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public void setQuantidadeMax(int quantidadeMax) {this.quantidadeMax = quantidadeMax;}
}