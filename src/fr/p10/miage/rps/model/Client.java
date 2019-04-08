package fr.p10.miage.rps.model;

import fr.p10.miage.rps.contrat.IVisitable;
import fr.p10.miage.rps.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable {
    private String name;
    public List<Commande> commandes = new ArrayList<Commande>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande c){
        commandes.add(c);
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
