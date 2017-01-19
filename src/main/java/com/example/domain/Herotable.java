package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Herotable {
	@Id
	private Integer rank;

	@Column(nullable = false)
	private String name;

	@Column(nullable = true)
	private String power;

	public Herotable() {

	}

	public Herotable(Integer rank, String name) {

		this.rank = rank;
		this.name = name;
	}

	public Herotable(Integer rank, String name, String power) {

		this.rank = rank;
		this.name = name;
		this.power = power;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
