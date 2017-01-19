package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Herotable;
import com.example.repositories.HeroRepo;

@Service
public class HeroServiceImpl implements HeroService {
	private HeroRepo heroRepo;

	@Autowired
	public void setProductRepository(HeroRepo heroRepo) {
		this.heroRepo = heroRepo;
	}

	@Override
	public Iterable<Herotable> listAllHero() {
		return heroRepo.findAll();
	}

	@Override
	public Herotable saveHero(Herotable hero) {
		return heroRepo.save(hero);
	}

}
