package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.service;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioRequest;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioResponse;

public interface FuncionarioService {

	FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioNovo);

}
