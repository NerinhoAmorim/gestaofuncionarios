package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioAtualizaoDetalhes;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioDetalhadoResponse;
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

	@Override
	public FuncionarioDetalhadoResponse buscaFuncionarioPorId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioApplicationService - buscaFuncionarioPorId");
		Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
		log.info("[finaliza] FuncionarioApplicationService - buscaFuncionarioPorId");
		return new FuncionarioDetalhadoResponse(funcionario);
	}

	@Override
	public void atualizaDetalhesFuncionario(UUID idFuncionario,
			FuncionarioAtualizaoDetalhes funcionarioAtualizaDetalhes) {
		log.info("[inicia] FuncionarioApplicationService - atualizaDetalhesFuncionario");
		Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
		funcionario.atualiza(funcionarioAtualizaDetalhes);
		funcionarioRepository.salva(funcionario);
		log.info("[finaliza] FuncionarioApplicationService - atualizaDetalhesFuncionario");

	}

	@Override
	public void excluirFuncionarioPorId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioApplicationService - excluirFuncionarioPorId");
		Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
		funcionarioRepository.excluirFuncionario(funcionario);
		log.info("[finaliza] FuncionarioApplicationService - excluirFuncionarioPorId");
		
	}

	
}
