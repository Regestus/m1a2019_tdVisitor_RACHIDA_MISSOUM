package fr.p10.miage.visitorClient.model;

import fr.p10.miage.visitorClient.contrat.IVisitable;
import fr.p10.miage.visitorClient.contrat.IVisitor;

public class Ligne implements IVisitable {
    private String name;

    public String getName() {
        return name;
    }

    public Ligne(String name) {
        this.name = name;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}
