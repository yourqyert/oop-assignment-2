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
public class Artist {

    private String name;

    @Override
    public String toString() {
        return "Artist{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist a = (Artist) o;
        return name.equals(a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
