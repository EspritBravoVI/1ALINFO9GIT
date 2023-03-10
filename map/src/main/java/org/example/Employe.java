package org.example;

import java.util.Objects;

public class Employe {
    private String matricule, nom, prenom;
    private int cin;

    public Employe(){}
    public Employe(int cin, String matricule, String nom, String prenom){
        this.cin=cin;
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
            "matricule='" + matricule + '\'' +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", cin=" + cin +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin && Objects.equals(matricule, employe.matricule) && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, nom, prenom, cin);
    }
}