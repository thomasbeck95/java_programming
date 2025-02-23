public class Film {
    // instance variables
    private String name;
    private int ageRating;

    // constructor method
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    // getter methods
    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
