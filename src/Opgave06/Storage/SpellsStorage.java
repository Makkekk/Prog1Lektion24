package Opgave06.Storage;

import Opgave06.Models.Spell;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class SpellsStorage {
    private ArrayList<Spell> spells;

    public SpellsStorage() {
        Gson gson = new GsonBuilder().create();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/spells"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            spells = gson.fromJson(response.body(), new TypeToken<List<Spell>>(){}.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public Spell findSpellByName(String name) {
        int left = 0;
        int right = spells.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            Spell spell = spells.get(middle);
            int comparision = spell.getName().compareToIgnoreCase(name);

            if (comparision == 0) {
                return spell; //Navnet matcher
            } else if ( comparision < 0) {
                left = middle + 1; //Søg i højre halvdel
            } else {
                right = middle - 1; // Søg i venstre halvdel
            }

        }
        return null;
    }

    public  void printSpellDescription(String name) {
        Spell spell = findSpellByName(name);
        if (spell != null) {
            System.out.println("Description of" + name + ": " + spell.getDescription());
        } else {
            System.out.println("Spell " + name + "not found");
        }
    }
}

