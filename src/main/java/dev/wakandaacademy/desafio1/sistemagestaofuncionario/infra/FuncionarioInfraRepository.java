package dev.wakandaacademy.desafio1.sistemagestaofuncionario.infra;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {

	private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia] FuncionarioInfraRepository - salva");
		funcionarioSpringDataJPARepository.save(funcionario);
		log.info("[finaliza] FuncionarioInfraRepository - salva");
		return funcionario;
	}

	@Override
	public Funcionario buscaFuncionarioPorId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioInfraRepository - buscaClienteAtravesId");
		Funcionario funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionario não encontrado!"));
		log.info("[finaliza] FuncionarioInfraRepository - buscaClienteAtravesId");
		return funcionario;
	}

	

}
