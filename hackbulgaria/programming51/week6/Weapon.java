package com.hackbulgaria.programming51.week6;

public abstract class Weapon {
	protected int damage;
	protected int durability;
	protected int maxDurability;

	
	public Weapon(int damage, int durability) {
		this.damage = damage;
		this.durability = durability;
		this.maxDurability = durability;
	}

	public int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

	public int getDurability() {
		// TODO Auto-generated method stub
		return durability;
	}

	public abstract String getType();

	public abstract void hit();
}
