import java.text.Normalizer;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Enums {
    public static void main(String[] args) {
        String zodiac = "Song ngư";
        zodiac = zodiac.toUpperCase();
        System.out.println(Normalizer.normalize("àèé", Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""));
        System.out.println(Normalizer.normalize(zodiac, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
        String test = Normalizer.normalize(zodiac, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll(" ","_");
        System.out.println(DemoEnums.contains("SONG_NGU"));
        System.out.println(DemoEnums.contains(test));
        System.out.println(DemoEnums.AQUARIUS.name());
        LocalDate date = null;
        System.out.println(date == null);

        Set<DemoEnums> horoscopeEnumSet = new HashSet<>();
        horoscopeEnumSet.add(DemoEnums.ARIES);
        horoscopeEnumSet.add(DemoEnums.TAURUS);
        horoscopeEnumSet.add(DemoEnums.GEMINI);
        horoscopeEnumSet.add(DemoEnums.CANCER);
        horoscopeEnumSet.add(DemoEnums.LEO);
        horoscopeEnumSet.add(DemoEnums.VIRGO);
        horoscopeEnumSet.add(DemoEnums.LIBRA);
        horoscopeEnumSet.add(DemoEnums.SCORPIUS);
        horoscopeEnumSet.add(DemoEnums.SAGITTARIUS);
        horoscopeEnumSet.add(DemoEnums.CAPRICORN);
        horoscopeEnumSet.add(DemoEnums.AQUARIUS);
        horoscopeEnumSet.add(DemoEnums.PISCES);

        System.out.println("erorr "+horoscopeEnumSet);

        String horo = "";

        Map<DemoEnums, Integer> map = new HashMap<>();

        map.put(DemoEnums.AQUARIUS, 1);
        map.put(DemoEnums.PISCES, 1);
        map.put(DemoEnums.LEO, 0);
//        map.put("demo", 0);
        System.out.println("----");
        map.remove(DemoEnums.LEO);
        System.out.println("----");
        Set<DemoEnums> key = map.keySet();

        System.out.println(map);
        horoscopeEnumSet.remove(DemoEnums.LEO);
        for (DemoEnums h : horoscopeEnumSet) {
            horo += " - ";
            horo += h;
        }
        System.out.println(horoscopeEnumSet.size());
        System.out.println(horo);
    }
}
