package ahlem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
	private static ArrayList<album> albums=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		album myalbum=new album("map of the soul 7","BTS");
		myalbum.addsong("ON");
		myalbum.addsong("boy with love");
		myalbum.addsong("make it right");
		myalbum.addsong("jamais vu");
		myalbum.addsong("dionysus");
		myalbum.addsong("black swan");
		myalbum.addsong("ugh!");
		myalbum.addsong("00:00 zero o'clock");
		albums.add(myalbum);
		myalbum=new album("map of the soul persona","BTS");
		myalbum.addsong("mikrokosmos");
		myalbum.addsong("euphoria");
		myalbum.addsong("truth intold");
		myalbum.addsong("seesaw");
		myalbum.addsong("ephinay");
		myalbum.addsong("serendipity");
		myalbum.addsong("singularity");
		myalbum.addsong("just dance");
		myalbum.addsong("love");
		
		albums.add(myalbum);
		LinkedList<song> playlist=new LinkedList<>();
		albums.get(0).addtoplaylist(playlist,1);
		albums.get(0).addtoplaylist(playlist,2);
		albums.get(0).addtoplaylist(playlist,3);
		albums.get(0).addtoplaylist(playlist,4);
		albums.get(1).addtoplaylist(playlist,2);
		albums.get(1).addtoplaylist(playlist,1);
		albums.get(1).addtoplaylist(playlist,3);
		albums.get(1).addtoplaylist(playlist,4);
		albums.get(1).addtoplaylist(playlist,5);
		play(playlist);
		
	}
		
		public static void play(LinkedList<song> playlist) {
			int action;
			boolean forward=true;
			boolean quit=false;
			ListIterator<song> listiterator=playlist.listIterator();
			System.out.println("0-quit 1-forward 2-backward 3-replay the song");
			Scanner sc =new Scanner(System.in);
			action=sc.nextInt();
			if (playlist.size()==0) {
					System.out.println("no song to play");
		}while(!quit) {
			switch(action) {
			case 0:
				System.out.println("no song to play");
				quit=true;
				break;
			case 1:
				if(!forward) {
				if(listiterator.hasNext()) {
					listiterator.next();
					
				}
				forward=true;
				}if(listiterator.hasNext()) {
					  listiterator.next();
					  System.out.println("now playing"+""+listiterator.next().toString());
			          }else {System.out.println("we have reached the end of the playlist");forward=false;break;}
				
			
			case 2:
				if(listiterator.hasPrevious()) {
				  listiterator.previous();
				  System.out.println("now playing"+""+listiterator.previous().toString());
			}else {System.out.println("we are in the top of playlist");forward=true;break;}
				
			case 3:
				if(forward) {
					if(listiterator.hasPrevious()) {
						System.out.println("now replaying"+""+listiterator.previous().toString());
						forward=false;
					   }else {System.out.println("we are in the start of the list");}
			   }else {
				   if(listiterator.hasNext()) {
					   System.out.println("now replaying"+""+listiterator.next().toString());
					   forward=true;
				   }else {System.out.println("we are in the start of the list");}
			   }
			case 4:
				printlist(playlist);
			case 5:
				if(playlist.size()>0) {
					listiterator.remove();
				}if(listiterator.hasNext()) {System.out.println("now playing"+listiterator.next());
				
				}else if(listiterator.hasPrevious()) {System.out.println("now playing"+listiterator.previous());}
				
				
		}
       
		
	}
		}
		
		
		private static void printlist(LinkedList<song> playlist){
			ListIterator<song> listiterator=playlist.listIterator();
			System.out.println("////////////////////");
			while(listiterator.hasNext()) {
				System.out.println("****your list****"+""+listiterator.next());
			}
			System.out.println("\\\\\\\\\\\\\\\\\\");
			
		}
	}
		

		


