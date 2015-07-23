package com.hackbulgaria.programming51.week6;

public class Zombie {
	private int health;

	public Zombie(int zHealth) {
		this.health = zHealth;
	}

	public int gethealth() {
		return health;
	}

	public void hit(int damage) {
		if (health >= damage) {
			health -= damage;
		}
	}

	public boolean isDead() {
		if (health <= 0) {
			return true;
		}
		return false;
	}
}
