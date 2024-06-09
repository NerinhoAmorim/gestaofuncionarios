package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioResponse {
	private UUID idFuncionario;


}
