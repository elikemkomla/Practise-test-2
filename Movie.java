 public class Movie{
 	private String title;
 	private String studio;
 	private String rating;

 	public Movie(String a, String b, String c){
 		title = a;
 		studio = b;
 		ratinng = c;
 	}
   public Movie(String a, String b,){
   	title = a;
   	studio = b;
   	rating = "PG";
   }
   public static Movie [] getPG(Movie [] film){
   	Movie [] pgFilm = new Movie [film.length];
   	int video = 0;
   	for(int i = 0; i < film.length; i++){
   		if (film[i].rating.equals("PG")){
   			pgFilm[video]=film[i];
   			video++
   		}
   	}
   	return pgFilm
   }
   Movie film =new Movie("Casino Royale","Eon productions", "PG-13");
    
 }