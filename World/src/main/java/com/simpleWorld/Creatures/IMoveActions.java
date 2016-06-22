package com.simpleWorld.Creatures;


public interface IMoveActions {

	public void move();
	
	public void attack();
	
	public void defend();
	
	public void drop(String item);
	
	public void lost(String item);

	String move(String kierunek);
	
}
