package com.farmacia.pharma_manager.backend.gerente;
import com.farmacia.pharma_manager.backend.funcionario.Funcionario;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "gerente")
public class Gerente extends Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGerente")
    private Integer id;

    @Column(name = "nivel")
    private String nivel;

    @OneToMany(mappedBy = "gerente", fetch = FetchType.LAZY)
    private List<Funcionario> funcionariosSupervisionados;


    public Gerente(String nome, String telefone, String cpf, String cargo, String nivel, List<Funcionario> funcionariosSupervisionados) {
        super(nome, telefone, cpf, cargo);
        this.nivel = nivel;
        this.funcionariosSupervisionados = funcionariosSupervisionados;
    }

    public Gerente() {}


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Funcionario> getFuncionariosSupervisionados() {
        return funcionariosSupervisionados;
    }

    public void setFuncionariosSupervisionados(List<Funcionario> funcionariosSupervisionados) {
        this.funcionariosSupervisionados = funcionariosSupervisionados;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nivel='" + nivel + '\'' +
                ", funcionariosSupervisionados=" + funcionariosSupervisionados +
                '}';
    }
}
