package org.sda.universitymanagementsystem.model.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.sda.universitymanagementsystem.model.Perdorues;
@Data
public class KursDTO {
    private Integer id;
    private String emer;
    private String vitAkademik;
    private Integer kredite;
    private String departament;
    private PerdoruesDTO pedagogu;
}
