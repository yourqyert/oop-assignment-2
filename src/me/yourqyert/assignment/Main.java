package me.yourqyert.assignment;

import me.yourqyert.assignment.artworks.*;
import me.yourqyert.assignment.objects.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Artist vanGogh = new Artist("Vincent van Gogh");
        Artist daVinci = new Artist("Leonardo da Vinci");
        Artist rodin = new Artist("Auguste Rodin");

        Artwork starryNight = new Painting(vanGogh, "Starry Night", Painting.Technicue.ACRYLIC);
        Artwork monaLisa = new Painting(daVinci, "Mona Lisa", Painting.Technicue.WATERCOLOR);

        Artwork thinker = new Sculpture(rodin, "The Thinker", "Bronze");

        List<Artwork> works = List.of(
                starryNight,
                monaLisa,
                thinker
        );

        Gallery gallery = new Gallery("EXPO Gallery", works);

        System.out.println("Current artwork list: " + Arrays.toString(gallery.getArtworks().toArray()));
        System.out.println("Sorted artwork list: " + Arrays.toString(gallery.getSortedArtworks().toArray()));

        List<Artwork> artworkByAuthorList = new ArrayList<>(gallery.getArtworkList(vanGogh.getName()));
        System.out.println(vanGogh.getName() + "'s artwork list: " + Arrays.toString(artworkByAuthorList.toArray()));

        Artwork testArtwork =
                gallery.getArtwork(vanGogh.getName(), "Mona Lisa").orElse(null);

        if (testArtwork == null) {
            System.out.println("Artwork not found (filter by name and author result)");
        } else {
            System.out.println("Artwork found (filter by name and author result)");
        }
    }
}
