package me.yourqyert.assignment.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Gallery {

    private String name;
    private List<Artwork> artworks = new ArrayList<>();

    public Optional<Artwork> getArtwork(String author, String name) {
        return getArtworkList(author).stream()
                .filter(a -> a.getName().equalsIgnoreCase(name)).findFirst();
    }

    public List<Artwork> getSortedArtworks() {
        return artworks.stream()
                .sorted(Comparator.comparing(Artwork::getName))
                .toList();
    }

    public List<Artwork> getArtworkList(String author) {
        return artworks.stream()
                .filter(work -> work.getArtist().getName().equalsIgnoreCase(author)).toList();
    }

    public void showArtwork(Displayable displayable) {
        displayable.displayInfo();
    }

    @Override
    public String toString() {
        return "Gallery{name='" + name + "', artworks=" + Arrays.toString(artworks.toArray()) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gallery)) return false;
        Gallery g = (Gallery) o;
        return name.equals(g.name) && artworks.equals(g.artworks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artworks);
    }

}
