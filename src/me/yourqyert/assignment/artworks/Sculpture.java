package me.yourqyert.assignment.artworks;

import lombok.Getter;
import lombok.Setter;
import me.yourqyert.assignment.objects.Artist;
import me.yourqyert.assignment.objects.Artwork;

@Getter
@Setter
public class Sculpture extends Artwork {

    private String material;

    public Sculpture(Artist artist, String name, String material) {
        super(artist, name);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "name='" + getName() + '\'' +
                ", artist=" + getArtist().getName() +
                ", material='" + material + '\'' +
                '}';
    }
}
