package p015cm.aptoide.p016pt.themes;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/themes/DarkThemeMode;", "", "(Ljava/lang/String;I)V", "isDark", "", "LIGHT", "DARK", "SYSTEM_LIGHT", "SYSTEM_DARK", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.DarkThemeMode */
/* compiled from: DarkThemeMode.kt */
public enum DarkThemeMode {
    LIGHT,
    DARK,
    SYSTEM_LIGHT,
    SYSTEM_DARK;

    public final boolean isDark() {
        return this == DARK || this == SYSTEM_DARK;
    }
}
