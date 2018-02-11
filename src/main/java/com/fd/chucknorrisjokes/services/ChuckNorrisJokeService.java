package com.fd.chucknorrisjokes.services;

import com.fd.chucknorrisjokes.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

    private JokeRepository jokeRepository;

    @Autowired
    public ChuckNorrisJokeService(@Qualifier("chuckNorrisJokeRepository") JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public String getRandomJoke() {
        return jokeRepository.getJoke();
    }
}
