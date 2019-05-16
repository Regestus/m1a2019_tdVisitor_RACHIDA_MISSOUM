package fr.p10.miage.visitorClient.model;

import fr.p10.miage.visitorClient.contrat.IVisitable;
import fr.p10.miage.visitorClient.contrat.IVisitor;

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
