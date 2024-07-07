package org.sda.universitymanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "nota")
@NoArgsConstructor @AllArgsConstructor
public class Nota {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nota")
    private Integer nota;

    @OneToOne
    @JoinColumn(name = "id_student", referencedColumnName = "id")
    private Perdorues student;

    @OneToOne
    @JoinColumn(name = "id_kurs", referencedColumnName = "id")
    private Kurs kurs;

    @Column(name = "sezoni")
    private String sezoni;
}
