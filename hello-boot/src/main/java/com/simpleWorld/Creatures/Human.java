package com.simpleWorld.Creatures;

import org.springframework.stereotype.Component;

@Component(value = "Human")
public class Human extends ACharacter{

	public void levelUp(){
		setStrength(getStrength()+3);
		setVitality(getVitality()+5);
		setIntelligence(getIntelligence()+1);
		setSpeedmoove(getSpeedmoove()+1);
		setAttackspeed(getAttackspeed()+2);
	}
}
