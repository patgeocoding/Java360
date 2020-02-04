package App_Control_Pattern;

import java.util.HashMap;

public class TwelveDaysCatcher implements TwelveDaysHandler {
    @Override
    public void daysHandler(HashMap<String, Object> song) {
        System.out.println("The Twelve Days of Christmas: ");
        System.out.println();
        System.out.println("On the first day of Christmas, my true love gave to me: " + song.get("first"));
        System.out.println("On the second day of Christmas, my true love gave to me: " + song.get("second"));
        System.out.println("On the third day of Christmas, my true love gave to me: " + song.get("third"));
        System.out.println("On the forth day of Christmas, my true love gave to me: " + song.get("fourth"));
        System.out.println("On the fifth day of Christmas, my true love gave to me: " + song.get("fifth"));
        System.out.println("On the sixth day of Christmas, my true love gave to me: " + song.get("sixth"));
        System.out.println("On the seventh day of Christmas, my true love gave to me: " + song.get("seventh"));
        System.out.println("On the eigth day of Christmas, my true love gave to me: " + song.get("eighth"));
        System.out.println("On the ninth day of Christmas, my true love gave to me: " + song.get("ninth"));
        System.out.println("On the tenth day of Christmas, my true love gave to me: " + song.get("tenth"));
        System.out.println("On the eleventh day of Christmas, my true love gave to me: " + song.get("eleventh"));
        System.out.println("On the twelfth day of Christmas, my true love gave to me: " + song.get("twelfth"));

    }
}
