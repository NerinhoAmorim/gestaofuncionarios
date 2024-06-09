package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {

	private final FuncionarioService funcionarioService;

	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioNovo) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioNovo);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionarioCriado;
	}

	@Override
	public FuncionarioDetalhadoResponse detalhaFuncionario(UUID idFuncionario) {
		log.info("[inicia] FuncionarioController -detalhaFuncionario");
		log.info("[idFuncionario] {}", idFuncionario);
		FuncionarioDetalhadoResponse clienteDetalhado = funcionarioService.buscaFuncionarioPorId(idFuncionario);
		log.info("[finaliza] FuncionarioController -detalhaFuncionario");
		return clienteDetalhado;
	}

}
