public class EquipArquers extends Equip {
    public EquipArquers(String nom) {
        super(nom);
        personatges.add(new Arquer("Arquer A ("+nom+")"));
        personatges.add(new Arquer("Arquer B ("+nom+")"));
    }
}
