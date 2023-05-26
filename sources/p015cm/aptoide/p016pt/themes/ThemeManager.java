package p015cm.aptoide.p016pt.themes;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.appcompat.app.C0078f;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.BuildConfig;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0010\u0010 \u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo16641d2 = {"Lcm/aptoide/pt/themes/ThemeManager;", "", "activity", "Landroid/app/Activity;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Activity;Landroid/content/SharedPreferences;)V", "THEME_PREFERENCE_KEY", "", "getAttributeForTheme", "Landroid/util/TypedValue;", "attributeResourceId", "", "themeName", "getBaseTheme", "Lcm/aptoide/pt/themes/StoreTheme;", "getDarkThemeMode", "Lcm/aptoide/pt/themes/DarkThemeMode;", "getStoreTheme", "storeThemeName", "getThemeOption", "Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "isThemeDark", "", "resetStatusBarColor", "", "resetToBaseTheme", "setDefaultNightMode", "themeOption", "setStatusBarThemeColor", "color", "theme", "setTheme", "setThemeOption", "ThemeOption", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.ThemeManager */
/* compiled from: ThemeManager.kt */
public final class ThemeManager {
    private String THEME_PREFERENCE_KEY = "app_theme_preference";
    private final Activity activity;
    private final SharedPreferences sharedPreferences;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "", "(Ljava/lang/String;I)V", "SYSTEM_DEFAULT", "LIGHT", "DARK", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.themes.ThemeManager$ThemeOption */
    /* compiled from: ThemeManager.kt */
    public enum ThemeOption {
        SYSTEM_DEFAULT,
        LIGHT,
        DARK
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.themes.ThemeManager$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ThemeOption.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ThemeOption.SYSTEM_DEFAULT.ordinal()] = 1;
            $EnumSwitchMapping$0[ThemeOption.LIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0[ThemeOption.DARK.ordinal()] = 3;
            int[] iArr2 = new int[ThemeOption.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ThemeOption.DARK.ordinal()] = 1;
            $EnumSwitchMapping$1[ThemeOption.LIGHT.ordinal()] = 2;
            $EnumSwitchMapping$1[ThemeOption.SYSTEM_DEFAULT.ordinal()] = 3;
        }
    }

    public ThemeManager(Activity activity2, SharedPreferences sharedPreferences2) {
        C10202j.m34178b(activity2, "activity");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        this.activity = activity2;
        this.sharedPreferences = sharedPreferences2;
    }

    private final void setDefaultNightMode(ThemeOption themeOption) {
        int i = WhenMappings.$EnumSwitchMapping$0[themeOption.ordinal()];
        if (i == 1) {
            C0078f.m246e(-1);
        } else if (i == 2) {
            C0078f.m246e(1);
        } else if (i == 3) {
            C0078f.m246e(2);
        }
    }

    public final TypedValue getAttributeForTheme(int i) {
        TypedValue typedValue = new TypedValue();
        this.activity.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public final StoreTheme getBaseTheme() {
        StoreTheme storeTheme = StoreTheme.get(BuildConfig.APTOIDE_THEME, isThemeDark());
        C10202j.m34174a((Object) storeTheme, "StoreTheme.get(BuildConf…IDE_THEME, isThemeDark())");
        return storeTheme;
    }

    public final DarkThemeMode getDarkThemeMode() {
        int i = WhenMappings.$EnumSwitchMapping$1[getThemeOption().ordinal()];
        if (i == 1) {
            return DarkThemeMode.DARK;
        }
        if (i == 2) {
            return DarkThemeMode.LIGHT;
        }
        if (i == 3) {
            Resources resources = this.activity.getResources();
            C10202j.m34174a((Object) resources, "activity.resources");
            if ((resources.getConfiguration().uiMode & 48) == 32) {
                return DarkThemeMode.SYSTEM_DARK;
            }
            return DarkThemeMode.SYSTEM_LIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StoreTheme getStoreTheme(String str) {
        StoreTheme storeTheme = StoreTheme.get(str, isThemeDark());
        C10202j.m34174a((Object) storeTheme, "StoreTheme.get(storeThemeName, isThemeDark())");
        return storeTheme;
    }

    public final ThemeOption getThemeOption() {
        return ThemeOption.values()[this.sharedPreferences.getInt(this.THEME_PREFERENCE_KEY, 0)];
    }

    public final boolean isThemeDark() {
        ThemeOption themeOption = getThemeOption();
        if (themeOption != ThemeOption.DARK) {
            if (themeOption == ThemeOption.SYSTEM_DEFAULT) {
                Resources resources = this.activity.getResources();
                C10202j.m34174a((Object) resources, "activity.resources");
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void resetStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            setStatusBarThemeColor(getAttributeForTheme(16843857).data);
        }
    }

    public final void resetToBaseTheme() {
        setTheme(BuildConfig.APTOIDE_THEME);
    }

    public final void setStatusBarThemeColor(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            setStatusBarThemeColor(getAttributeForTheme(str, 16843857).data);
        }
    }

    public final void setTheme(String str) {
        StoreTheme storeTheme = StoreTheme.get(str, isThemeDark());
        setDefaultNightMode(getThemeOption());
        Activity activity2 = this.activity;
        C10202j.m34174a((Object) storeTheme, "storeTheme");
        activity2.setTheme(storeTheme.getThemeResource());
        setStatusBarThemeColor(str);
    }

    public final void setThemeOption(ThemeOption themeOption) {
        C10202j.m34178b(themeOption, "themeOption");
        this.sharedPreferences.edit().putInt(this.THEME_PREFERENCE_KEY, themeOption.ordinal()).apply();
    }

    public final TypedValue getAttributeForTheme(String str, int i) {
        Resources.Theme theme = this.activity.getTheme();
        StoreTheme storeTheme = StoreTheme.get(str, isThemeDark());
        C10202j.m34174a((Object) storeTheme, "StoreTheme.get(themeName, isThemeDark())");
        TypedValue peekValue = theme.obtainStyledAttributes(storeTheme.getThemeResource(), new int[]{i}).peekValue(0);
        C10202j.m34174a((Object) peekValue, "activity.theme.obtainSty…ResourceId)).peekValue(0)");
        return peekValue;
    }

    public final void setStatusBarThemeColor(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            C10202j.m34174a((Object) window, "window");
            window.setStatusBarColor(i);
        }
    }
}
