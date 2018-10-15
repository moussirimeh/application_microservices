package com.ecommerce.microcommerce.Modal;

public class Product {
    private int id;
    private String nom;
    private float prix;
    
     public Product() {
    }

    public Product(int id, String nom, float prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
    
     
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
        @Override
    public String toString(){  
        return "Product{"+
        "id=" + id + 
        ", nom='"+ nom + '\'' + 
        ", prix=" + prix+ '}';
    }
    
    
}