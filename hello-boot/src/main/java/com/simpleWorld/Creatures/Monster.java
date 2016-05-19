package com.simpleWorld.Creatures;

import org.springframework.stereotype.Component;

@Component(value = "Monster")
public class Monster extends ACharacter{

	public void levelUp(){
		setStrength(getStrength()+5);
		setVitality(getVitality()+4);
		setIntelligence(getIntelligence()+2);
		setSpeedmoove(getSpeedmoove()+2);
		setAttackspeed(getAttackspeed()+3);
	}
}
