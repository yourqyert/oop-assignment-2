package me.yourqyert.assignment.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Artwork {

    private Artist artist;
    private String name;

    @Override
    public String toString() {
        return "Artwork{name='" + name + "', artist=" + artist.getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artwork)) return false;
        Artwork a = (Artwork) o;
        return name.equals(a.name) &&
                artist.equals(a.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist);
    }

}
