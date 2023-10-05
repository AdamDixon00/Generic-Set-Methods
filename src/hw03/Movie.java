package hw03;
/**
 * Name:        Adam Dixon
 * CIN:         304772993
 * Course:      Programming with Data Structures
 * Section:     CS-2013
 * Description: This is movie class which is a given movie class. 
 */
public class Movie implements Comparable<Movie> {
	private String title;
	
	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie("+ title + ")";
	}
	
	@Override
	public int compareTo(Movie o) {
		return this.title.compareTo(o.title);
	}
}
