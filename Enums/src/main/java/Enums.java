import java.text.Normalizer;

public class Enums {
    public static void main(String[] args) {
        String zodiac = "Song ngư";
        zodiac = zodiac.toUpperCase();
        System.out.println(Normalizer.normalize("àèé", Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""));
        System.out.println(Normalizer.normalize(zodiac, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
        String test = Normalizer.normalize(zodiac, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll(" ","_");
        System.out.println(DemoEnums.contains("SONG_NGU"));
        System.out.println(DemoEnums.contains(test));
        System.out.println(DemoEnums.BACH_DUONG.name());
    }
}
