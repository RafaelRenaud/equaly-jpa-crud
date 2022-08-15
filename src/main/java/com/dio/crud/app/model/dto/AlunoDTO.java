package com.dio.crud.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class AlunoDTO {

    @NotBlank(message = "Preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue} precisa estar entre {min} e {max} caracteres'")
    private String nome;

    @NotBlank(message = "Preencha o campo corretamente")
    @CPF(message = "CPF inválido")
    private String cpf;

    @NotBlank(message = "Preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue} precisa estar entre {min} e {max} caracteres'")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente")
    @Past(message = "Data inválida")
    private LocalDate dataDeNascimento;
}