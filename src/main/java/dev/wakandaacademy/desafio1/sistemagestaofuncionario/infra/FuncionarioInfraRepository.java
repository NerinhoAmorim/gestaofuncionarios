package dev.wakandaacademy.desafio1.sistemagestaofuncionario.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.repository.FuncionarioRepository;
import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;
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

}
