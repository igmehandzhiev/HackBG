package com.hackbulgaria.programming51.week8.Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	private final int WIDTH = 800;
	private final int HEIGHT = 800;

	private final int SQUARE_LENGTH = 400;

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	public void paintComponent(Graphics g1) {
		super.paintComponent(g1);
		Graphics2D g = (Graphics2D) g1;
		//4SQUARE
		// Rectangle2D.Double first = new Rectangle2D.Double(0, 0,
		// SQUARE_LENGTH,
		// SQUARE_LENGTH);
		// Rectangle2D.Double second = new Rectangle2D.Double(SQUARE_LENGTH, 0,
		// SQUARE_LENGTH, SQUARE_LENGTH);
		// Rectangle2D.Double third = new Rectangle2D.Double(0, SQUARE_LENGTH,
		// SQUARE_LENGTH, SQUARE_LENGTH);
		// Rectangle2D.Double fourth = new Rectangle2D.Double(SQUARE_LENGTH,
		// SQUARE_LENGTH, SQUARE_LENGTH, SQUARE_LENGTH);
		// fillSquare(g, Color.BLUE, first);
		// fillSquare(g, Color.ORANGE, second);
		// fillSquare(g, Color.RED, third);
		// fillSquare(g, Color.GREEN, fourth);
		
		//CHESSBOARD
//		for (int i = 0; i <= HEIGHT; i += 80) {
//			for (int j = 0; j <= WIDTH; j += 80) {
//				Rectangle2D.Double grey = new Rectangle2D.Double(i, j, 40, 40);
//				g.setPaint(Color.GRAY);
//				g.fill(grey);
//			}
//		}
//		for (int i = 40; i <= HEIGHT; i += 80) {
//			for (int j = 40; j <= WIDTH; j += 80) {
//				Rectangle2D.Double grey = new Rectangle2D.Double(i, j, 40, 40);
//				g.setPaint(Color.GRAY);
//				g.fill(grey);
//			}
//		}
		
		
		
	}

	public void fillSquare(Graphics2D g, Color color, Rectangle2D.Double square) {
		g.setPaint(color);
		g.fill(square);
	}
}
