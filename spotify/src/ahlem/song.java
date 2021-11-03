package ahlem;

public class song {
	private String title;
	
	public song(String title) {
		super();
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
		return "song [title=" + title + "]";
	}
	
	

}
