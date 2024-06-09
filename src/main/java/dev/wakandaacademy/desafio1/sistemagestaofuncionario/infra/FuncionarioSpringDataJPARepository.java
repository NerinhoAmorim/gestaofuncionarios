package dev.wakandaacademy.desafio1.sistemagestaofuncionario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID>{

}
