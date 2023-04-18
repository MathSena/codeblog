package com.mathsena.codeblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_POST")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    @NotBlank
    @Lob
    private String texto;




}
