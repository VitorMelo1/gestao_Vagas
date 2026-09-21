package com.vitor.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class CandidateEntity {
    private UUID id;

    @Pattern (regexp = "^(?!\\s*$).+" , message = "O campo [Username]  não pode ter espaços")
    private String username;
   @Email (message = "O campo deve conter um email valido")
    private String email;
    private String name;
    @Length (min = 10 , max = 100)
    private String password;
    private String description;
    private String curriuculum;

}
