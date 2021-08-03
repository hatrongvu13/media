public enum DemoEnums {
    BACH_DUONG("BẠCH DƯƠNG"),
    KIM_NGUU("KIM NGƯU"),
    SONG_TU("SONG TỬ"),
    CU_GIAI("CỰ GIẢI"),
    SU_TU("SƯ TỬ"),
    XU_NU("XỬ NỮ"),
    THIEN_BINH("THIÊN BÌNH"),
    BO_CAP("BỌ CẠP"),
    NHAN_MA("NHÂN MÃ"),
    MA_KET("MA KẾT"),
    BAO_BINH("BẢO BÌNH"),
    SONG_NGU("SONG NGƯ");

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
