package api;

import api.RickAndMorty.RickAndMortyApiJava;
import api.Tomato.TomatoApiJava;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RunApiTest {

    @Test
    @DisplayName("Задача 1. Погружение в API")

    public void resultsRickAndMortyTest() {
        RickAndMortyApiJava.searchMortySmith("2");
        RickAndMortyApiJava.searchLastPersonageToLastEpisode();
        RickAndMortyApiJava.searchLocationAndSpeciesLastPersonage();
        RickAndMortyApiJava.assertSpecies();
        RickAndMortyApiJava.assertLocation();
    }

    @Test
    @DisplayName("Задача 2. Углубление в API")

    public void resultsReqresTest() throws IOException {
        TomatoApiJava.createUser();
    }
}
