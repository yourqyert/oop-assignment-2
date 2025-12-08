package me.yourqyert.assignment.artworks;

import lombok.Getter;
import lombok.Setter;
import me.yourqyert.assignment.objects.Artist;
import me.yourqyert.assignment.objects.Artwork;

@Getter
@Setter
public class Painting extends Artwork {

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
}
