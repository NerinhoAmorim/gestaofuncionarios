package dev.wakandaacademy.desafio1.sistemagestaofuncionario.domain;

import java.util.UUID;

import dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api.FuncionarioRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;
	@NotBlank
	private String nome;
	private String designacao;
	private double salario;
	@NotBlank
	private String numeroTelefone;
	private String endereco;

	public Funcionario(FuncionarioRequest funcionarioNovo) {
		this.nome = funcionarioNovo.getNome();
		this.designacao =  funcionarioNovo.getDesignacao();
		this.salario =  funcionarioNovo.getSalario();
		this.numeroTelefone =  funcionarioNovo.getNumeroTelefone();
		this.endereco =  funcionarioNovo.getEndereco();
	}

}
