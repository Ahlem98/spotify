package ahlem;

import java.util.ArrayList;
import java.util.LinkedList;

public class album {
	private String name;
	private String artist;
	ArrayList<song> alb =new ArrayList<>();
	public album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		
	}
	
	public song findsong(String title) {
		for(song checkedsong:alb) {
			if(checkedsong.getTitle().equals(title)) {
				return checkedsong;

			}
		}
		         return null;
		     }
		 	
	                 
		
	
	 public boolean addsong(String title) {
		 if(findsong(title)!=null) {
			this.alb.add(new song(title));
			 return true;
			 
		 }
		 else {return false;
	 }

	 }
	 public boolean addtoplaylist(LinkedList<song> playlist, int tracknumber) {
		 int index=tracknumber-1;
		 if((index>=0)&&(index<=alb.size())){
		  playlist.add(this.alb.get(index));
		 return true;
	 }System.out.println("this song does not exist");
	 return false;
			 
			 
		 
			 
		 }
		 
	 }
