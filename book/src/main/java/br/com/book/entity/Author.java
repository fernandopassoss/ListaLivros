package br.com.book.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "author") //nome criado no banco de dados
@Entity (name = "author") //utilizando quando criamos as querys dentro do spring
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="name")
    private String name;

    public Author(String name){
        this.name = name;
    }
}
