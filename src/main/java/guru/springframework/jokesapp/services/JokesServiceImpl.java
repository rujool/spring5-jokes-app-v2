package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
