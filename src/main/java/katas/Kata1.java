package katas;

import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Goal: use map() to project an array of videos into an array of {id, title}-pairs
 * DataSource: DataUtil.getMovies()
 * Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
 */
public class Kata1 {
    public static List<Map<String, ?>> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return Arrays.asList(ImmutableMap.of("id", 5, "title", "Bad Boys"));
    }
}
