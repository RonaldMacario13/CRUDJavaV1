package com.crud.disciplinas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CadastrosDB")

public class Cadastro {

	private long id;
    @NotNull
    @Size(min=2, max=100)
    private String nome;
    @NotNull
    @Size(min = 2, max = 100)
    private String nomeProfessor;
    @NotNull
    @Size(min = 2, max = 120)
    private String curso;
    @NotNull
    @Pattern(regexp="[1-14]")
    private Integer periodo;
 
    public Cadastro() { }
 
    public Cadastro(String nome, String nomeProfessor, String curso, Integer periodo) {
         this.nome = nome;
         this.nomeProfessor = nomeProfessor;
         this.curso = curso;
         this.periodo = periodo;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name = "NOME",nullable = false)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name = "NOME DO PROFESSOR", nullable = false)
    public String getNomeProf() {
    	return nomeProfessor;
    }
    public void setNomeProf(String nomeProfessor) {
    	this.nomeProfessor = nomeProfessor;
    }
    
    @Column(name = "CURSO", nullable = false)
    public String getCurso() {
    	return curso;
    }
    public void setCurso(String curso) {
    	this.curso = curso;
    }
    
    @Column(name = "PERÍODO", nullable = false)
    public Integer getPeriodo() {
    	return periodo;
    }
    public void setPeriodo(Integer periodo) {
    	this.periodo = periodo;
    }
    
    @Override
    public String toString() {
        return "Cadastro [id = " + id + ", Nome = " + nome + ", Nome do Professor = " + nomeProfessor + ", Curso = " + curso + ", Período = " + periodo + "]";
    }
}
