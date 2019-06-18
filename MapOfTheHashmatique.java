import java.util.Set;
import java.util.HashMap;

public class MapofTheHashmatique {
    public static void main(String[] args) {

        HashMap<String, String> trackList  = new HashMap<String, String>();
        trackList.put("Beautiful", "I have everything ,For not wanting anything more..");
        trackList.put("Sea", "The terrible thing about the sea is dying of thirst..");
        trackList.put("River", "In free fall, I am not free");
        trackList.put("Dream", "You deserve what you dream ,Never so tall ,So high, I fell");

                System.out.println("Hit Single: "+trackList.get("Dream"));

        Set<String> list = trackList.keySet();
        for(String key : list) {
        System.out.println(key+": "+ trackList.get(key));    
    
        }
    }
}