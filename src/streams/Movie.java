package streams;

public class Movie implements Comparable{
	private String title;
	private int likes;
	
	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLikes() {
		return likes;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
