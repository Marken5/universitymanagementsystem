package org.sda.universitymanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "kurs")
public class Kurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "emer")
    private String emer;

    private String vitAkademik;

    @Column(name = "kredite")
    private Integer kredite;

    @Column(name = "departament")
    private String departament; //

    @OneToOne
    @JoinColumn(name = "id_pedagogu", referencedColumnName = "id")
    private Perdorues pedagogu;
}
