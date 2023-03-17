package org.example;

import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {

  HashMap<Employe, Departement> empdepmap = new HashMap<>();


  @Override
  public void ajouterEmployeDepartement(Employe e, Departement d) {
    empdepmap.put(e, d);
  }

  @Override
  public void supprimerEmploye(Employe e) {
    empdepmap.remove(e);
  }

  @Override
  public void afficherLesEmployesLeursDepartements() {
    for (Map.Entry<Employe, Departement> mp : empdepmap.entrySet()) {
      System.out.println(mp.getKey());
      System.out.println(mp.getValue());
    }
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

  @Override
  public boolean rechercherEmploye(Employe e) {
    return false;
  }

  @Override
  public boolean rechercherDepartement(Departement e) {
    return false;
  }
}