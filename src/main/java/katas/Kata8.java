package katas;

import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Goal: Combine videos and bookmarks by index (StreamUtils.zip) (https://github.com/poetix/protonpack)
 * DataSource: DataUtil.getMovies()
 * Output: List of ImmutableMap.of("videoId", "5", "bookmarkId", "3")
 */
public class Kata8 {
    public static List<Map<String, ?>> execute() {
        List<Movie> movies = DataUtil.getMovies();
        List<Bookmark> bookMarks = DataUtil.getBookMarks();

        // StreamUtils.zip()

        return Arrays.asList(ImmutableMap.of("videoId", 5, "bookmarkId", 3));
    }
}
