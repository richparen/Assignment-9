package kz.iitu.lms.model;

import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.OnDelete;

import lombok.Data;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String info;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "authorId",insertable = false,updatable = false)

    @JsonIgnore
    private User author;
    @Column(name = "authorId")
    private Long authorId;

}
