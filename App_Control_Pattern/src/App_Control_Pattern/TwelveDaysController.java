package App_Control_Pattern;

import java.util.HashMap;

public class TwelveDaysController {
    private final HashMap<String,TwelveDaysHandler> daysManager = new HashMap();

    public void manageRequest(String request, HashMap<String, Object> song) {

        TwelveDaysHandler handler = daysManager.get(request);
        if (handler != null) {
            handler.daysHandler(song);
        }
    }

    public void mapCommand(String command, TwelveDaysHandler handler) {
        daysManager.put(command, handler);
    }
}
