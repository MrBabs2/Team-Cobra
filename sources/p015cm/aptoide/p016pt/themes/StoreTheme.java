package p015cm.aptoide.p016pt.themes;

import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.themes.StoreTheme */
public enum StoreTheme {
    DEFAULT(C1086R.style.AptoideThemeLight, true),
    DEFAULT_DARK(C1086R.style.AptoideThemeDark, false),
    GREEN(C1086R.style.AptoideThemeLight_Green, true),
    GREEN_DARK(C1086R.style.AptoideThemeDark_Green, false),
    TEAL(C1086R.style.AptoideThemeLight_Teal, true),
    TEAL_DARK(C1086R.style.AptoideThemeDark_Teal, false),
    RED(C1086R.style.AptoideThemeLight_Red, true),
    RED_DARK(C1086R.style.AptoideThemeDark_Red, false),
    INDIGO(C1086R.style.AptoideThemeLight_Indigo, true),
    INDIGO_DARK(C1086R.style.AptoideThemeDark_Indigo, false),
    PINK(C1086R.style.AptoideThemeLight_Pink, true),
    PINK_DARK(C1086R.style.AptoideThemeDark_Pink, false),
    ORANGE(C1086R.style.AptoideThemeLight_Orange, true),
    ORANGE_DARK(C1086R.style.AptoideThemeDark_Orange, false),
    BROWN(C1086R.style.AptoideThemeLight_Brown, true),
    BROWN_DARK(C1086R.style.AptoideThemeDark_Brown, false),
    BLUE_GREY(C1086R.style.AptoideThemeLight_BlueGrey, true),
    BLUE_GREY_DARK(C1086R.style.AptoideThemeDark_BlueGrey, false),
    GREY(C1086R.style.AptoideThemeLight_Grey, true),
    GREY_DARK(C1086R.style.AptoideThemeDark_Grey, false),
    BLACK(C1086R.style.AptoideThemeLight_Black, true),
    BLACK_DARK(C1086R.style.AptoideThemeDark_Black, false),
    DEEP_PURPLE(C1086R.style.AptoideThemeLight_DeepPurple, true),
    DEEP_PURPLE_DARK(C1086R.style.AptoideThemeDark_DeepPurple, false),
    AMBER(C1086R.style.AptoideThemeLight_Amber, true),
    AMBER_DARK(C1086R.style.AptoideThemeDark_Amber, false),
    LIGHT_GREEN(C1086R.style.AptoideThemeLight_LightGreen, true),
    LIGHT_GREEN_DARK(C1086R.style.AptoideThemeDark_LightGreen, false),
    LIME(C1086R.style.AptoideThemeLight_Lime, true),
    LIME_DARK(C1086R.style.AptoideThemeDark_Lime, false),
    LIGHT_BLUE(C1086R.style.AptoideThemeLight_LightBlue, true),
    LIGHT_BLUE_DARK(C1086R.style.AptoideThemeDark_LightBlue, false),
    SEA_GREEN(C1086R.style.AptoideThemeLight_Green, false),
    SEA_GREEN_DARK(C1086R.style.AptoideThemeDark_Green, false),
    SLATE_GRAY(C1086R.style.AptoideThemeLight_Teal, false),
    SLATE_GRAY_DARK(C1086R.style.AptoideThemeDark_Teal, false),
    BLUE(C1086R.style.AptoideThemeLight_Indigo, false),
    BLUE_DARK(C1086R.style.AptoideThemeDark_Indigo, false),
    MAROON(C1086R.style.AptoideThemeLight_Brown, false),
    MAROON_DARK(C1086R.style.AptoideThemeDark_Brown, false),
    MIDNIGHT(C1086R.style.AptoideThemeLight_BlueGrey, false),
    MIDNIGHT_DARK(C1086R.style.AptoideThemeDark_BlueGrey, false),
    BLUE_GRAY(C1086R.style.AptoideThemeLight_BlueGrey, false),
    BLUE_GRAY_DARK(C1086R.style.AptoideThemeDark_BlueGrey, false),
    SILVER(C1086R.style.AptoideThemeLight_Grey, false),
    SILVER_DARK(C1086R.style.AptoideThemeDark_Grey, false),
    DIM_GRAY(C1086R.style.AptoideThemeLight_Grey, false),
    DIM_GRAY_DARK(C1086R.style.AptoideThemeDark_Grey, false),
    MAGENTA(C1086R.style.AptoideThemeLight_DeepPurple, false),
    MAGENTA_DARK(C1086R.style.AptoideThemeDark_DeepPurple, false),
    YELLOW(C1086R.style.AptoideThemeLight_Amber, false),
    YELLOW_DARK(C1086R.style.AptoideThemeDark_Amber, false),
    GOLD(C1086R.style.AptoideThemeLight_Amber, false),
    GOLD_DARK(C1086R.style.AptoideThemeDark_Amber, false),
    SPRING_GREEN(C1086R.style.AptoideThemeLight_Green, false),
    SPRING_GREEN_DARK(C1086R.style.AptoideThemeDark_Green, false),
    GREEN_APPLE(C1086R.style.AptoideThemeLight_Lime, false),
    GREEN_APPLE_DARK(C1086R.style.AptoideThemeDark_Lime, false),
    LIGHT_SKY(C1086R.style.AptoideThemeLight_LightBlue, false),
    LIGHT_SKY_DARK(C1086R.style.AptoideThemeDark_LightBlue, false),
    HAPPY_BLUE(C1086R.style.AptoideThemeLight_LightBlue, false),
    HAPPY_BLUE_DARK(C1086R.style.AptoideThemeDark_LightBlue, false);
    
    private boolean isSelectable;
    private int storeStyle;

    private StoreTheme(int i, boolean z) {
        this.storeStyle = i;
        this.isSelectable = z;
    }

    static StoreTheme get(String str, boolean z) {
        StoreTheme storeTheme = null;
        if (str != null) {
            try {
                storeTheme = valueOf(str.replace("-", "_").toUpperCase());
            } catch (IllegalArgumentException unused) {
            }
        }
        if (storeTheme == null) {
            storeTheme = DEFAULT;
        }
        if (!z || storeTheme.toString().contains("_DARK")) {
            return storeTheme;
        }
        return valueOf(storeTheme.toString() + "_DARK");
    }

    public static List<StoreTheme> getThemesFromVersion(int i) {
        LinkedList linkedList = new LinkedList();
        for (StoreTheme storeTheme : values()) {
            if (storeTheme.isSelectable) {
                linkedList.add(storeTheme);
            }
        }
        return linkedList;
    }

    public String getThemeName() {
        String replace = name().toLowerCase().replace('_', '-');
        return replace.contains("-dark") ? replace.substring(0, replace.indexOf("-dark")) : replace;
    }

    public int getThemeResource() {
        return this.storeStyle;
    }
}
