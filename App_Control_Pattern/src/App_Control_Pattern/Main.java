package App_Control_Pattern;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        TwelveDaysController controller = new TwelveDaysController();

        controller.mapCommand("Song lyrics", new TwelveDaysCatcher());

        HashMap songLyrics = new HashMap();

        songLyrics.put("first", "A partridge in a pear tree");
        songLyrics.put("second", "Two turtle doves");
        songLyrics.put("third", "Three french hens");
        songLyrics.put("fourth", "Four calling birds");
        songLyrics.put("fifth", "Five golden rings");
        songLyrics.put("sixth", "Six geese a laying");
        songLyrics.put("seventh", "Seven swans a swimming");
        songLyrics.put("eighth", "Eight maids a milking");
        songLyrics.put("ninth", "Nine ladies dancing");
        songLyrics.put("tenth", "Ten lords a leaping");
        songLyrics.put("eleventh", "Eleven pipers piping");
        songLyrics.put("twelfth", "Twelve drummers drumming");

        controller.manageRequest("Song lyrics",songLyrics);
    }
}
