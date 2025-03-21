package com.farmacia.pharma_manager.backend.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {
    Optional<Funcionario> findByCpf(String cpf); // Método para buscar funcionário por CPF
    Funcionario findByNome(String nome); // Buscar funcionário pelo nome
}
