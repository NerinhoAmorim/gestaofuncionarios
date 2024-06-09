package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioRequest;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioResponse;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {

	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioNovo) {
		log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
		Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioNovo));
		log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
		return FuncionarioResponse.builder().idFuncionario(funcionario.getIdFuncionario()).build();
	}

}
