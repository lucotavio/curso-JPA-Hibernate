package com.equipe.equipehasordemservico_ordemservico;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EQUIPE_HAS_ORDEM_SERVICO")
public class EquipeHasOrdemServico {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "ID_EQUIPE")
    private Equipe equipe;
    
    @ManyToOne
    @JoinColumn(name = "ID_ORDEM_SERVICO")
    private OrdemServico ordemServico;
    
    @Column(name = "HORA_ENTRADA_EQUIPE")
    private LocalDateTime horaEntradaEquipe;
    
    @Column(name = "HORA_SAIDA_EQUIPE")
    private LocalDateTime horaSaidaEquipe;
}
