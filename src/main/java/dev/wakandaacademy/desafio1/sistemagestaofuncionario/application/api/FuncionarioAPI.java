package dev.wakandaacademy.desafio1.sistemagestaofuncionario.application.api;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v/1funcionario")
public interface FuncionarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioNovo);

	@GetMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.OK)
	FuncionarioDetalhadoResponse detalhaFuncionario(@PathVariable UUID idFuncionario);

	@PatchMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void atualizaDetalhesFuncionario(@PathVariable UUID idFuncionario,
			@Valid @RequestBody FuncionarioAtualizaoDetalhes funcionarioAtualizaDetalhes);
}
