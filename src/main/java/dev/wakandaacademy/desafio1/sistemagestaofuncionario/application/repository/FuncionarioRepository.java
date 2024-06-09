package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.repository;

import java.util.UUID;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;

public interface FuncionarioRepository {

	Funcionario salva(Funcionario funcionario);
	Funcionario buscaFuncionarioPorId(UUID idFuncionario);

	
}
