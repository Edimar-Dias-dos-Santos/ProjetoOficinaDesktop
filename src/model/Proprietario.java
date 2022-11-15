
package model;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROPRIETARIOS")
public class Proprietario implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "nascimento", nullable = false)
    private LocalDate nascimento;
    
    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "endereco", length = 150, nullable = false)
    private String endereco;

    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cidade",nullable = false,referencedColumnName = "id")
    private Cidade cidade;
    //
    public Proprietario(){
        
    }
    public Proprietario(int id, String nome, LocalDate nascimento, String cpf, String endereco, Cidade cidade) {
        this.setId(id);
        this.setNome(nome);
        this.setNascimento(nascimento);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setCidade(cidade);
    }
    public void setId(int id) {
        this.id = id;
    }    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"NONAME":nome.toUpperCase();
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento==null?LocalDate.now():nascimento;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty()?"000.000.000-00":cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty()?"NOADDRESS":endereco.toUpperCase();
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    //
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public LocalDate getNascimento() {
        return this.nascimento;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public Cidade getCidade() {
        return this.cidade;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proprietario other = (Proprietario) obj;
        return this.id == other.id;
    }
    
    
}
