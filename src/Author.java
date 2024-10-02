import java.util.Objects;

public class Author {

    private String authorFirstName;
    private String authorSecondName;


    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    @Override
    public String toString() {
        return "Автор - " + authorFirstName + " " + authorSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorSecondName, author.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSecondName);
    }
}
