package com.fd.chucknorrisjokes.repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;

@Repository
public class ChuckNorrisJokeRepository implements JokeRepository{
    @Override
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
