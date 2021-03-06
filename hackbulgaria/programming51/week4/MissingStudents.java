package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MissingStudents {

	public static Vector<Vector<String>> missingStudents(
			Vector<String> students, Vector<Vector<String>> presence) {
		Vector<Vector<String>> missing = new Vector<>();
		
		for (Vector<String> pres : presence) {
			Vector<String> mis = new Vector<>();
			for (String str : students) {
				if (!pres.contains(str))
					mis.add(str);
			}
			missing.add(mis);
			Collections.sort(mis);
		}
		 
		return missing;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Vector<String> students = new Vector<>();
		Vector<Vector<String>> presence = new Vector<>();

		int studentsCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < studentsCount; i++) {
			String student = scanner.nextLine();
			students.add(student);
		}

		int days = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < days; i++) {
			int studentsForThatDay = Integer.parseInt(scanner.nextLine());
			Vector<String> presenceForDay = new Vector<>();
			for (int j = 0; j < studentsForThatDay; j++) {
				presenceForDay.add(scanner.nextLine());
			}

			presence.add(presenceForDay);
		}

		Vector<Vector<String>> missing = missingStudents(students, presence);

		System.out.println(missing);
	}
}