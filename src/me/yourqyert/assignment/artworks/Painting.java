package me.yourqyert.assignment.artworks;

import lombok.Getter;
import lombok.Setter;
import me.yourqyert.assignment.objects.Artist;
import me.yourqyert.assignment.objects.Artwork;
import me.yourqyert.assignment.objects.Displayable;

@Getter
@Setter
public class Painting extends Artwork implements Displayable {

    private Technicue technique;

    public Painting(Artist artist, String name, Technicue technique) {
        super(artist, name);
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "name='" + getName() + '\'' +
                ", artist=" + getArtist().getName() +
                ", technique='" + technique.name() + '\'' +
                '}';
    }

    public enum Technicue {
        WATERCOLOR,
        ACRYLIC
    }

    @Override
    public void displayInfo() {
        System.out.println("Painting: " + super.getName() + ", artist: " + getArtist().getName());
    }
}
