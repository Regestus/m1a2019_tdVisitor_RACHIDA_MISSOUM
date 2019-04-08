package fr.p10.miage.rps.model;

import fr.p10.miage.rps.contrat.IVisitable;
import fr.p10.miage.rps.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Commande implements IVisitable {
    private String name;
    public List<Ligne> lignes = new ArrayList<Ligne>();

    @Override
    public void accept(IVisitor visitor) {

    }

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, List<Ligne> ligneName) {
        this.name = name;
        this.lignes = ligneName;
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne l){
        lignes.add(l);
    }
}
