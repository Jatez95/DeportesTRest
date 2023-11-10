package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.http.parser.Cookie;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deporte")
public class Sport implements Serializable {
    @Id
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @OneToMany(mappedBy = "sport")
    private List<Comment> comments;
    @OneToOne(mappedBy = "sport")
    private Athlete athlete;
}
