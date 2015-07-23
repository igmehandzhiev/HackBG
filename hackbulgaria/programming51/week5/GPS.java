package com.hackbulgaria.programming51.week5;

import java.util.Scanner;
import java.util.Vector;

public class GPS {

	public static Vector<Integer> getGasStations(int tripDistance,
			int tankSize, Vector<Integer> gasStations) {
		int temp = tankSize;
		Vector<Integer> stat = new Vector<>();
		for (int i = 1; i < gasStations.size(); ++i) {
			if (temp < gasStations.get(i)) {
				temp = tankSize + gasStations.get(i - 1);
				stat.add(gasStations.get(i - 1));
			}
		}
		if (temp < tripDistance)
			stat.add(gasStations.get(gasStations.size() - 1));
		return stat;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int tripDistance = scanner.nextInt();
		int tankSize = scanner.nextInt();

		int gasStationsCount = scanner.nextInt();
		Vector<Integer> gasStations = new Vector<Integer>();

		for (int i = 0; i < gasStationsCount; i++) {
			gasStations.add(scanner.nextInt());
		}

		Vector<Integer> result = getGasStations(tripDistance, tankSize,
				gasStations);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}
}
