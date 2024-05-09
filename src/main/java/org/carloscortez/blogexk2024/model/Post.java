package org.carloscortez.blogexk2024.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPost;
    private String titlePost;
    private String contentPost;
    private String author;
    private String aliasAuthor;
    private Date postDate;
    private Time postTime;
    private int raiting;

}
