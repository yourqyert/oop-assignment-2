package me.yourqyert.assignment;

import me.yourqyert.assignment.artworks.Painting;
import me.yourqyert.assignment.artworks.Sculpture;
import me.yourqyert.assignment.objects.Artist;
import me.yourqyert.assignment.objects.Artwork;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
        ); //list of objects

        List<Artwork> rodinWorks = works.stream()
                .filter(work -> work.getArtist().equals(rodin)).toList(); //filtering

        Comparator<Artwork> comparator = (a, b) -> a.getName().compareTo(b.getName());
        List<Artwork> sortedList = works.stream().sorted(comparator).toList(); //sorting

        Optional<Artwork> artwork = works.stream()
                .filter(work -> work.getArtist().equals(rodin)).findAny(); //searching

    }
}