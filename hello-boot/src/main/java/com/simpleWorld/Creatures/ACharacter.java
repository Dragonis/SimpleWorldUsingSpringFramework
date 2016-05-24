package com.simpleWorld.Creatures;

import org.springframework.stereotype.Component;

@Component(value = "ACharacter")
public abstract class ACharacter implements IMoveActions {

	private int strength = 0;
	private int vitality = 0;
	private int intelligence = 0;
	private int speedmoove = 0;
	private int attackspeed = 0;

	@Override
	public String move(String kierunek) {
		if (kierunek == "Przód") {
			System.out.println("Idę do przodu.");
			return "Idę do przodu.";
		}
		return "Błąd podczas wybierania kierunku.";
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drop(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lost(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getSpeedmoove() {
		return speedmoove;
	}

	public void setSpeedmoove(int speedmoove) {
		this.speedmoove = speedmoove;
	}

	public int getAttackspeed() {
		return attackspeed;
	}

	public void setAttackspeed(int attackspeed) {
		this.attackspeed = attackspeed;
	}

}
