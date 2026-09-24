package com.vitor.gestao_vagas.modules.company.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String level;
    private String benefits;

    @ManyToOne()
    @JoinColumn(name = "Ccompany_id")
    private CompanyEntity companyEntity;

    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime created;
}
