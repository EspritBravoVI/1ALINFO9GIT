package org.example;

import java.util.Collection;
import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete {

    HashMap<Employe, Departement> empdepmap = new HashMap<>();


    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {

    }

    @Override
    public void supprimerEmploye(Employe e) {


    }

    @Override
    public void afficherLesEmployesLeursDepartements() {

    }

    @Override
    public void afficherLesEmployes() {

    }

    @Override
    public void afficherLesDepartements() {

    }

    @Override
    public void afficherDepartement(Employe e) {

    }

    //commit anas

    @Override
    public boolean rechercherEmploye(Employe e) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return false;
    }
}