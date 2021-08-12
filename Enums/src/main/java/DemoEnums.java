public enum DemoEnums {
    ARIES("BẠCH DƯƠNG"),
    TAURUS("KIM NGƯU"),
    GEMINI("SONG TỬ"),
    CANCER("CỰ GIẢI"),
    LEO("SƯ TỬ"),
    VIRGO("XỬ NỮ"),
    LIBRA("THIÊN BÌNH"),
    SCORPIUS("BỌ CẠP"),
    SAGITTARIUS("NHÂN MÃ"),
    CAPRICORN("MA KẾT"),
    AQUARIUS("BẢO BÌNH"),
    PISCES("SONG NGƯ"),
    UNDEFINE("UNDEFINE");

    private final String zodiac;

    DemoEnums(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getZodiacName() {
        return zodiac;
    }

    public static boolean contains(String zodiac) {
        for (DemoEnums z : DemoEnums.values()) {
            if (z.name().equals(zodiac))
                return true;
        }
        return false;
    }
}
