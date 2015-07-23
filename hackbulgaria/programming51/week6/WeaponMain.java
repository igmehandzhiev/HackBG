package com.hackbulgaria.programming51.week6;

import java.util.Scanner;
import java.util.Vector;

public class WeaponMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int zCount = scan.nextInt();
		int zHealth = scan.nextInt();

		String weapon = scan.next();
		Weapon w;
		switch (weapon) {
		case "axe": {
			w = new Axe();
			break;
		}
		case "shotgun": {
			w = new Shotgun();
			break;
		}
		case "sword": {
			w = new AncientSword();
			break;
		}
		case "revolver": {
			w = new Revolver();
			break;
		}
		default: {
			System.out.println("Invalid! ");
			return;
		}
		}
		Vector<Zombie> z = new Vector<>();
		for (int i = 0; i < zCount; ++i) {
			z.add(new Zombie(zHealth));
		}
		int counter = 0;
		for (int i = 0; i < z.size(); ++i) {
			Zombie current = z.get(i);
			while (!current.isDead()) {
				current.hit(w.getDamage());
				w.hit();
				counter++;
			}
		}
		System.out.println(counter);
	}
}
