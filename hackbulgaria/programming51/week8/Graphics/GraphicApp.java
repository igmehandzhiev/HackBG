package com.hackbulgaria.programming51.week8.Graphics;

import javax.swing.JFrame;

public class GraphicApp extends JFrame {

	public GraphicApp() {	
		add(new Canvas());

		setResizable(false);
		pack();

		setTitle("My application name");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		GraphicApp app = new GraphicApp();
		app.setVisible(true);
	}
}