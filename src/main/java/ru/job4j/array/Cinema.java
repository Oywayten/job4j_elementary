package ru.job4j.array;
import java.util.Objects;

public class Cinema {

    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j] == null && j + 1 < places[i].length && places[i][j + 1] == null
                        && i + 1 < places.length && places[i + 1][j] == null) {
                    Place place  = new Place(i, j);
                    return place;
                }
            }
        }
        return null;
    }

    public static class Place {

        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;

        }

        @Override

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}