package com.vitor.gestao_vagas.excepitions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor 
public class ErrorMessageDTO {
    private String message;
    private String field;
}
