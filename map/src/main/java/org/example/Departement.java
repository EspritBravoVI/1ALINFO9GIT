package org.example;

import java.util.Objects;

public class Departement {
    private String id, nom , section ;

    public Departement() {
    }

    public Departement(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Departement(String id, String nom,String section ) {
        this.id = id;
        this.nom = nom;
        this.section=section;
    }

    // getting user id
    public String getId() {
        return id;
    }

    // getting user name
    public String getNom() {
        return nom;
    }

    // getting user name
    public void setId(String id) {
        this.id = id;
    }

    // setting user id
    public void setNom(String nom) {
        this.nom = nom;
    }
    // getting user name
    public void setsection(String section) {
        this.section = section;
    }

    // setting user id
    public void getSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                 ", section='" + section + '\'' +
                '}';
    }

    @Override
    //override equals function
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom);
    }


}
}