package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.Modal.Product;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.microcommerce.dao.Productdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private Product DaoproductDao;

    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product>listeProduits() {
        return Productdao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return Productdao.findById(id);
    }
}