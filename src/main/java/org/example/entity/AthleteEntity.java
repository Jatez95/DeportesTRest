package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deportista")
public class AthleteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String surname;

    @Column(name = "posicion")
    private String position;

    @Column(name = "edad")
    private Integer age;

    @Column(name = "nacionalidad")
    private String nationality;

    @Column(name = "apodo")
    private String nickname;

    @Column(name = "titulos")
    private Integer titles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo")
    private TeamEntity team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deporte")
    private SportEntity sport;

    @ManyToMany(mappedBy = "athletes")
    private List<UserEntity> users;

}
