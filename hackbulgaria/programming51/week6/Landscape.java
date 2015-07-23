package com.hackbulgaria.programming51.week6;

import java.util.ArrayList;
public class Landscape {
	private ArrayList<Tile> landscape=new ArrayList<>();
	public void addTile(Tile t){
		landscape.add(t);
	}
	
	public String renderAll(){
		String str="";
		for(Tile t: landscape){
			str+=t.render();
		}
		return str;
	}

	public static void main(String[] args) {
	    Landscape landscape = new Landscape();
	
	    landscape.addTile(new Land());
	    landscape.addTile(new Water());
	    landscape.addTile(new Mountain());
	    landscape.addTile(new Forest());
	
	    System.out.println(landscape.renderAll()); // --~~/\!!
	  }
}
