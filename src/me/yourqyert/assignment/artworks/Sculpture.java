package me.yourqyert.assignment.artworks;

import lombok.Getter;
import lombok.Setter;
import me.yourqyert.assignment.objects.Artist;
import me.yourqyert.assignment.objects.Artwork;
import me.yourqyert.assignment.objects.Displayable;

@Getter
@Setter
public class Sculpture extends Artwork implements Displayable {

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

    @Override
    public void displayInfo() {
        System.out.println("Sculpture: " + super.getName() + ", material: " + material);
    }
}
