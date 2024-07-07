package org.sda.universitymanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // gjeneron getters, setters
@NoArgsConstructor
@Entity
@Table(name = "perdorues")
public class Perdorues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "emri_plote")
    private String emriPlote;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String pasword;
    @Column(name = "nid")
    private String nid;
    @Column(name = "rol")
    private String rol;
    @Column(name = "grupi")
    private String grupi;
}
