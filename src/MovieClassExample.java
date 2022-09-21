
public class MovieClassExample {
    private String title;
    private String studio;
    private String rating;

    public MovieClassExample(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public MovieClassExample(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public static MovieClassExample[] getPg(MovieClassExample[] mov)
    {
        MovieClassExample[] pgMov = new MovieClassExample[mov.length];
        int index = 0;
        String pg = "PG";
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals(pg)) {
                pgMov[index] = mov[i];
                index++;
            }
        }
        return pgMov;
    }
    public static void main(String[] args) {
        MovieClassExample m1 = new MovieClassExample("Casino Royale","Eon Productions", "PG-13");
        MovieClassExample m2 = new MovieClassExample("Casino Royale-A","Eon Productions");
        MovieClassExample m3 = new MovieClassExample("Casino Royale-B","Eon Productions");
        MovieClassExample[] movies = new MovieClassExample[3];
        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;
        MovieClassExample[] finalArray = MovieClassExample.getPg(movies);
        for(int i = 0; i < finalArray.length;i++)
        {
            if(finalArray[i] != null)
            System.out.println(finalArray[i].title+" "+finalArray[i].studio+" "+finalArray[i].rating);
        }
    }

}
