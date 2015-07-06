package com.hackbulgaria.programming51.week4;

import java.util.Vector;

public class MusicOrganiser {

	// private
	private Vector<Song> songs = new Vector<Song>();
	private int count = 0;
	private int capacity = 50;

	private boolean isEnoughSpace() {
		if (count <= capacity)
			return true;
		else
			return false;
	}

	// constructors
	public MusicOrganiser() {
	}

	public MusicOrganiser(int capacity) {
		this.capacity = capacity;
	}

	// public
	public void addSong(Song s) {
		if (isEnoughSpace()) {
			songs.addElement(s);
			count++;
		} else
			System.out.println("There's not enough space");
	}

	public int getCount() {
		return count;
	}

	public Vector<String> getAlbums() {
		Vector<String> albums = new Vector<String>();
		for (int i = 0; i < songs.size(); ++i) {
			if (!albums.contains(songs.get(i).getAlbum()))
				albums.addElement(songs.get(i).getAlbum());
		}
		return albums;
	}

	public int getAlbumsCount() {
		return getAlbums().size();
	}

	public Vector<String> getAlbumSongs(String albumName) {
		Vector<String> albumSongs = new Vector<String>();
		for (int i = 0; i < songs.size(); ++i) {
			if (songs.get(i).getAlbum().equals(albumName))
				albumSongs.addElement(songs.get(i).getName());
		}
		return albumSongs;
	}

	public Vector<String> getAlbumsAndSongs() {
		Vector<String> albumsAndSongs = new Vector<String>();
		for (int i = 0; i < getAlbums().size(); ++i) {
			albumsAndSongs.addElement(getAlbums().get(i) + "("
					+ getAlbumSongs(getAlbums().get(i)).size() + ")");
		}
		return albumsAndSongs;
	}

	public static void main(String[] args) {
		MusicOrganiser mo = new MusicOrganiser();

		mo.addSong(new Song("The real Slim Shady", "Eminem", 213,
				"The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183,
				"The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256,
				"Curtain Call: The Hits"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221,
				"Curtain Call: The Hits"));
		mo.addSong(new Song("Stan", "Eminem", 362, "The Marshall Mathers LP"));
		mo.addSong(new Song("I'm Back", "Eminem", 310,
				"The Marshall Mathers LP"));
		mo.addSong(new Song("My Name Is", "Eminem", 269,
				"Curtain Call: The Hits"));
		mo.addSong(new Song("Huslter's ambition", "50 cent", 299, "Curtis"));

		System.out.println("# of songs: " + mo.getCount());
		System.out.println("# of albums: " + mo.getAlbumsCount());
		System.out.println("Albums: " + mo.getAlbums());
		String album = "Curtain Call: The Hits";
		System.out.println("Song(s) in '" + album + "' album :");
		Vector<String> songs = mo.getAlbumSongs(album);
		for (int i = 0; i < songs.size(); i++) {
			System.out.println(i + 1 + ". " + songs.get(i));
		}
		System.out.println("getAlbumsAndSongs:");
		Vector<String> albumsAndSongs = mo.getAlbumsAndSongs();
		for (int i = 0; i < albumsAndSongs.size(); i++) {
			System.out.println("• " + albumsAndSongs.get(i));
		}

	}

}