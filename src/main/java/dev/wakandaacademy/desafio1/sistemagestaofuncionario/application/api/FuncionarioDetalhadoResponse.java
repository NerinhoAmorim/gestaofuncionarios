package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api;

import java.util.UUID;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioDetalhadoResponse {
	private UUID idFuncionario;
	private String nome;
	private String designacao;
	private double salario;
	private String numeroTelefone;
	private String endereco;

	public FuncionarioDetalhadoResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.nome = funcionario.getDesignacao();
		this.designacao = funcionario.getDesignacao();
		this.salario = funcionario.getSalario();
		this.numeroTelefone = funcionario.getDesignacao();
		this.endereco = funcionario.getDesignacao();

	}
}
