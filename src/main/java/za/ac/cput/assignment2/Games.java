package za.ac.cput.assignment2;

import java.util.Objects;

/**
 * Games.java
 * This is a Games class.
 * @Author Keenan Barends   219002959
 * @Date 16 May 2021
 */

public class Games
{
    private String title;
    private String developer;

    public Games() {
    }

    public Games(String title, String developer) {
        this.title = title;
        this.developer = developer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Games{" +
                "Title = '" + title + '\'' +
                ", Developer = '" + developer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(title, games.title) && Objects.equals(developer, games.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, developer);
    }
}
