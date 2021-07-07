package br.com.sistema.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="funcionario")
public class Funcionario {

    //Define o Id como chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributo nome não núlo
    @Size(max = 80)
    @NotNull
    private String nome;

    //Atributo email não núlo
    @Size(max = 100)
    @NotNull
    private String email;

    @OneToOne
    @JoinColumn(name = "cargo_id", referencedColumnName = "id")
    private Cargo cargo;

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    //ToString para imprimir o objeto funcionário

    @Override
    public String toString() {
        return "Funcionario: " + id +
                ", " + nome +
                ", e-mail:" + email;
    }
}