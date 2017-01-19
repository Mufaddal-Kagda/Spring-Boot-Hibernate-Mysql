package com.example.service;

import com.example.domain.Herotable;

public interface HeroService {

	Iterable<Herotable> listAllHero();

	Herotable saveHero(Herotable hero);

}
