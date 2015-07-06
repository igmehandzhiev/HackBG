package com.hackbulgaria.programming51.week4;

public class Song {

	// private
	private String name = null;
	private String artist = null;
	private double duration = 0;
	private String album = null;

	// public
	public Song(String name, String artist, double duration, String album) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}

	// get-methods
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public double getDuration() {
		return duration;
	}

	public String getAlbum() {
		return album;
	}

	//
	public String toString() {
		return name + " " + artist + " " + duration + " " + album;
	}
}
