package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "categories")
public class Categorie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Column(nullable = false, unique = true)
    private String nom;


    public Categorie() {}


    public Categorie(String nom) { this.nom = nom; }


    // getters / setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }


    @Override
    public String toString() { return "Categorie{" + "id=" + id + ", nom='" + nom + '\'' + '}'; }
}