package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.service;

import java.util.UUID;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioAtualizaoDetalhes;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioDetalhadoResponse;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioRequest;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioResponse;

public interface FuncionarioService {

	FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioNovo);
	FuncionarioDetalhadoResponse buscaFuncionarioPorId(UUID idFuncionario);
	void atualizaDetalhesFuncionario(UUID idFuncionario, FuncionarioAtualizaoDetalhes funcionarioAtualizaDetalhes);
	void excluirFuncionarioPorId(UUID idFuncionario);

	}
