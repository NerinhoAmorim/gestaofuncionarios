package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;
@Value

public class FuncionarioRequest {
	@NotBlank
	private String nome;
	private String designacao;
	private double salario;
	@NotBlank
	private String numeroTelefone;
	private String endereco;

}
