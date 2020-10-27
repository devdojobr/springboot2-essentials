package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    // private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Boku No Hero"), new Anime(2L, "Berserk"));
    }
}
