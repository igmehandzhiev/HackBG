package com.hackbulgaria.programming51.week3;

public class TravelMain {

	public static void main(String[] args) {
		Employee ivo = new Employee("Ivaylo");
		Employee rado = new Employee("Rado");
		Employee blago = new Employee("Blago");
		Employee ganev = new Employee("Ganev");
		Employee strunka = new Employee("Strunka");
		Employee ivan = new Employee("Ivan");
		Employee vasko = new Employee("Vasil");
		Employee kolio = new Employee("Molio");

		Travel conf = new Travel("Sofia", "Bulgaria", 20);

		TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 50);
		TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 60);
		TravelExpense dinnerBlago = new TravelExpense("Dinner", blago, 90);
		TravelExpense dinnerGanev = new TravelExpense("Dinner", ganev, 40);
		TravelExpense dinnerStrunka = new TravelExpense("Dinner", strunka, 30);
		TravelExpense dinnerIvan = new TravelExpense("Dinner", ivan, 10);
		TravelExpense dinnerVasko = new TravelExpense("Dinner", vasko, 100);
		TravelExpense dinnerKolio = new TravelExpense("Dinner", kolio, 70);

		conf.addExpense(dinnerRado);
		conf.addExpense(dinnerIvo);
		conf.addExpense(dinnerBlago);
		conf.addExpense(dinnerGanev);
		conf.addExpense(dinnerStrunka);
		conf.addExpense(dinnerIvan);
		conf.addExpense(dinnerVasko);
		conf.addExpense(dinnerKolio);

		System.out.println(conf.totalCost()); // 120

		TravelExpense[] toFire = conf.mostExpensesMadeBy();

		for (TravelExpense employee : toFire) {
			System.out.println(employee.getEmployee());
		}
	}
}
