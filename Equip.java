import java.util.ArrayList;

public abstract class Equip {
    private String nom;
    protected ArrayList<Personatge> personatges;

    public Equip(String nom) {
        this.nom = nom;
        personatges = new ArrayList<>();
    }

    @Override
    public String toString() {
        return nom;
    }

    public void torn(Combatents combatents) {
        for (Personatge p : personatges) {
            if (p.esViu()) {
                p.torn(combatents);
            }
        }
    }

    public ArrayList<Personatge> obtenirPersonatgesVius() {
        ArrayList<Personatge> personatgesVius = new ArrayList<>();
        for (Personatge p : personatges) {
            if (p.esViu()) {
                personatgesVius.add(p);
            }
        }
        return personatgesVius;
    }
}
