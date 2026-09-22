package com.vitor.gestao_vagas.modules.candidate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity(name = "candidates")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank ()
    @Pattern (regexp = "\\S+" , message = "O campo [Username]  não pode ter espaços")
    private String username;
   @Email (message = "O campo deve conter um email valido")
    private String email;
    private String name;
    @Length (min = 10 , max = 100, message = "A senha deve ter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String curriuculum;

    @CreationTimestamp 
    private LocalDateTime createdAt;
}
