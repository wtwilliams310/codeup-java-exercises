package movies;
import util.Input;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static Movie[] movies = MoviesArray.findAll();

    public static void movieSelectOptions() {
        System.out.print("What would you like to do?\n");
        System.out.print("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n" +
                "\n" +
                "Enter your choice: ");
    }

    public static void categorySelection(String category) {
        for (int i = 0; i < Movie.movies.length; i++) {
            if (Movie.movies[i].category.equals(category)) {
                System.out.printf("%s -- %s%n", Movie.movies[i].name, Movie.movies[i].category);
            }
        }
        viewMovies();
    }

    public static void viewMovies() {
        Input input = new Input();
        movieSelectOptions();
        int userInput = input.getInt();
            if (userInput == 1) {
                for (int i = 0; i < Movie.movies.length; i++) {
                    System.out.printf("%s -- %s%n", Movie.movies[i].name, Movie.movies[i].category);
                }
                viewMovies();
            } else if (userInput == 2) {
                categorySelection("animated");
            } else if (userInput == 3) {
                categorySelection("drama");
            } else if (userInput == 4) {
                categorySelection("horror");
            } else if (userInput == 5) {
                categorySelection("scifi");
            } else if (userInput == 0) {
            return;
             } else {
            System.out.print("Enter a valid selection...\n");
            viewMovies();
        }



    }

}
