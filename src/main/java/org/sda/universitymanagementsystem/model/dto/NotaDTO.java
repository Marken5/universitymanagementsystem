package org.sda.universitymanagementsystem.model.dto;

import lombok.Data;

@Data
public class NotaDTO {
    private Integer id;

    private Integer nota;

    private PerdoruesDTO student;

    private KursDTO kurs;

    private String sezoni;
}
