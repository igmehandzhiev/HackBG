package com.hackbulgaria.programming51.week6;

public class MoveDown extends Movement {
	public Pair<Integer> move(Pair<Integer> currentPosition) {
		System.out.println("Moving right!");
		Pair<Integer> newPosition = new Pair<>(currentPosition.getFirst() + 1,
				currentPosition.getSecond());

		return newPosition;
	}
}
