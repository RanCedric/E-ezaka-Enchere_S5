/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Cédric
 */

public class Client extends BDD{
    private int client_id;
    private String nom;
    private int sexe;
    private int naissance;
    private double salaire;
    private double longitude;
    private double poids;
    private double couleur;
    private int bacc;
    private int finoana;
    private int fiangonana;
    private String lettre;

    public Client() {
    }

    public Client(int client_id, String nom, int sexe, int naissance, double salaire, double longitude, double poids, double couleur, int bacc, int finoana, int fiangonana, String lettre) {
        this.setClient_id(client_id);
        this.setNom(nom);
        this.setSexe(sexe);
        this.setNaissance(naissance);
        this.setSalaire(salaire);
        this.setLongitude(longitude);
        this.setPoids(poids);
        this.setCouleur(couleur);
        this.setBacc(bacc);
        this.setFinoana(finoana);
        this.setFiangonana(fiangonana);
        this.setLettre(lettre);
    }

    public Client(String client_id, String nom, String sexe, String naissance, String salaire, String longitude, String poids, String couleur, String bacc, String finoana, String fiangonana, String lettre) {
    this.setClient_id(Integer.parseInt(client_id));
    this.setNom(nom);
    this.setSexe(Integer.parseInt(sexe));
    this.setNaissance(Integer.parseInt(naissance));
    this.setSalaire(Double.parseDouble(salaire));
    this.setLongitude(Double.parseDouble(longitude));
    this.setPoids(Double.parseDouble(poids));
    this.setCouleur(Double.parseDouble(couleur));
    this.setBacc(Integer.parseInt(bacc));
    this.setFinoana(Integer.parseInt(finoana));
    this.setFiangonana(Integer.parseInt(fiangonana));
    this.setLettre(lettre);
}


    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public int getNaissance() {
        return naissance;
    }

    public void setNaissance(int naissance) {
        this.naissance = naissance;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getCouleur() {
        return couleur;
    }

    public void setCouleur(double couleur) {
        this.couleur = couleur;
    }

    public int getBacc() {
        return bacc;
    }

    public void setBacc(int bacc) {
        this.bacc = bacc;
    }

    public int getFinoana() {
        return finoana;
    }

    public void setFinoana(int finoana) {
        this.finoana = finoana;
    }

    public int getFiangonana() {
        return fiangonana;
    }

    public void setFiangonana(int fiangonana) {
        this.fiangonana = fiangonana;
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }
    
    
}
