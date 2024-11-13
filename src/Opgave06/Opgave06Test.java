package Opgave06;

import Opgave06.Models.Spell;
import Opgave06.Storage.SpellsStorage;

import java.util.ArrayList;

public class Opgave06Test {
    public static void main(String[] args) {
        SpellsStorage storage = new SpellsStorage();
        ArrayList<Spell> spells = storage.getSpells();

        storage.printSpellDescription("Silencio");
        storage.printSpellDescription("Riddikulus");
        storage.printSpellDescription("Ascendio");
    }

}