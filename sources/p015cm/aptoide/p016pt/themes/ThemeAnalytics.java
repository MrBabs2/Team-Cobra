package p015cm.aptoide.p016pt.themes;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.p032t.C4728g;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p036io.rakam.api.C4759f;
import p036io.rakam.api.C4760h;
import p112n.p115f.p116a.p117a.C5299a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, mo16641d2 = {"Lcm/aptoide/pt/themes/ThemeAnalytics;", "", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "(Lcm/aptoide/analytics/AnalyticsManager;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "createDarkThemeRakamSuperProperty", "Lorg/json/JSONObject;", "currentProperties", "darkThemeMode", "Lcm/aptoide/pt/themes/DarkThemeMode;", "getThemeOptionName", "", "themeOption", "Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "sendDarkThemeDialogTurnItOnClickEvent", "", "context", "sendDarkThemeDismissClickEvent", "sendDarkThemeInteractEvent", "action", "sendThemeChangedEvent", "theme", "setDarkThemeUserProperty", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.ThemeAnalytics */
/* compiled from: ThemeAnalytics.kt */
public final class ThemeAnalytics {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DARK_THEME_INTERACT_EVENT = "Dark_Theme_Interact";
    private final AnalyticsManager analyticsManager;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/themes/ThemeAnalytics$Companion;", "", "()V", "DARK_THEME_INTERACT_EVENT", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.themes.ThemeAnalytics$Companion */
    /* compiled from: ThemeAnalytics.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.themes.ThemeAnalytics$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeManager.ThemeOption.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ThemeManager.ThemeOption.SYSTEM_DEFAULT.ordinal()] = 1;
            $EnumSwitchMapping$0[ThemeManager.ThemeOption.LIGHT.ordinal()] = 2;
            $EnumSwitchMapping$0[ThemeManager.ThemeOption.DARK.ordinal()] = 3;
        }
    }

    public ThemeAnalytics(AnalyticsManager analyticsManager2) {
        C10202j.m34178b(analyticsManager2, "analyticsManager");
        this.analyticsManager = analyticsManager2;
    }

    private final JSONObject createDarkThemeRakamSuperProperty(JSONObject jSONObject, DarkThemeMode darkThemeMode) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            String name = darkThemeMode.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject.put(RoomStore.THEME, lowerCase);
                return jSONObject;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private final String getThemeOptionName(ThemeManager.ThemeOption themeOption) {
        int i = WhenMappings.$EnumSwitchMapping$0[themeOption.ordinal()];
        if (i == 1) {
            return "system default";
        }
        if (i == 2) {
            return "light theme";
        }
        if (i == 3) {
            return "dark theme";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void sendDarkThemeInteractEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        this.analyticsManager.logEvent(hashMap, DARK_THEME_INTERACT_EVENT, AnalyticsManager.Action.CLICK, str2);
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final void sendDarkThemeDialogTurnItOnClickEvent(String str) {
        C10202j.m34178b(str, "context");
        sendDarkThemeInteractEvent("turn it on", str);
    }

    public final void sendDarkThemeDismissClickEvent(String str) {
        C10202j.m34178b(str, "context");
        sendDarkThemeInteractEvent("dismiss", str);
    }

    public final void sendThemeChangedEvent(ThemeManager.ThemeOption themeOption, String str) {
        C10202j.m34178b(themeOption, RoomStore.THEME);
        C10202j.m34178b(str, "context");
        sendDarkThemeInteractEvent(getThemeOptionName(themeOption), str);
    }

    public final void setDarkThemeUserProperty(DarkThemeMode darkThemeMode) {
        C10202j.m34178b(darkThemeMode, "darkThemeMode");
        Bundle bundle = new Bundle();
        bundle.putBoolean("dark_theme", darkThemeMode.isDark());
        C4728g.m7727a(bundle, (GraphRequest.C6344f) ThemeAnalytics$setDarkThemeUserProperty$1.INSTANCE);
        C4760h a = C4759f.m7803a();
        C10202j.m34174a((Object) a, "rakamClient");
        a.mo16567a(createDarkThemeRakamSuperProperty(a.mo16579b(), darkThemeMode));
        String name = darkThemeMode.name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            C5299a.m10019a(RoomStore.THEME, lowerCase);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
