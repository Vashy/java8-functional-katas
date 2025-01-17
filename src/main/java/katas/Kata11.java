package katas;

import com.google.common.collect.ImmutableMap;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
    Goal: Create a datastructure from the given data:

    This time we have 4 seperate arrays each containing lists, videos, boxarts, and bookmarks respectively.
    Each object has a parent id, indicating its parent.
    We want to build an array of list objects, each with a name and a videos array.
    The videos array will contain the video's id, title, bookmark time, and smallest boxart url.
    In other words we want to build the following structure:

    [
        {
            "name": "New Releases",
            "videos": [
                {
                    "id": 65432445,
                    "title": "The Chamber",
                    "time": 32432,
                    "boxart": "http://cdn-0.nflximg.com/images/2891/TheChamber130.jpg"
                },
                {
                    "id": 675465,
                    "title": "Fracture",
                    "time": 3534543,
                    "boxart": "http://cdn-0.nflximg.com/images/2891/Fracture120.jpg"
                }
            ]
        },
        {
            "name": "Thrillers",
            "videos": [
                {
                    "id": 70111470,
                    "title": "Die Hard",
                    "time": 645243,
                    "boxart": "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"
                },
                {
                    "id": 654356453,
                    "title": "Bad Boys",
                    "time": 984934,
                    "boxart": "http://cdn-0.nflximg.com/images/2891/BadBoys140.jpg"
                }
            ]
        }
    ]

    DataSource: DataUtil.getLists(), DataUtil.getVideos(), DataUtil.getBoxArts(), DataUtil.getBookmarkList()
    Output: the given datastructure
*/
public class Kata11 {
    public static List<Map<String, ?>> execute() {
        List<Map<String, ?>> lists = DataUtil.getLists();
        List<Map<String, ?>> videos = DataUtil.getVideos();
        List<Map<String, ?>> boxArts = DataUtil.getBoxArts();
        List<Map<String, ?>> bookmarkList = DataUtil.getBookmarkList();

        return Arrays.asList(ImmutableMap.of("name", "someName", "videos",
                Arrays.asList(
                        ImmutableMap.of("id", 5, "title", "The Chamber", "time", 123, "boxart", "someUrl")
                )));
    }
}
