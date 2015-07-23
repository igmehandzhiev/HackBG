package com.hackbulgaria.programming51.week6;

public class MoveRight extends Movement {
	public Pair<Integer> move(Pair<Integer> currentPosition) {
		System.out.println("Moving right!");
		Pair<Integer> newPosition = new Pair<>(currentPosition.getFirst(),
				currentPosition.getSecond() + 1);

		return newPosition;
	}
}
