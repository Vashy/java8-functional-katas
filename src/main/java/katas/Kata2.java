package katas;

import model.Movie;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
 * DataSource: DataUtil.getMovies()
 * Output: List of Integers
 */
public class Kata2 {
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return Arrays.asList(1, 2, 3);
    }
}
