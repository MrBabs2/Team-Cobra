package com.facebook.internal;

import com.facebook.C4716f;
import com.facebook.internal.C6442l;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.facebook.internal.k */
/* compiled from: FeatureManager */
public final class C6437k {

    /* renamed from: a */
    private static final Map<C6441d, String[]> f11813a = new HashMap();

    /* renamed from: com.facebook.internal.k$a */
    /* compiled from: FeatureManager */
    static class C6438a implements C6442l.C6445c {

        /* renamed from: a */
        final /* synthetic */ C6440c f11814a;

        /* renamed from: b */
        final /* synthetic */ C6441d f11815b;

        C6438a(C6440c cVar, C6441d dVar) {
            this.f11814a = cVar;
            this.f11815b = dVar;
        }

        public void onCompleted() {
            this.f11814a.mo15773a(C6437k.m13342d(this.f11815b));
        }
    }

    /* renamed from: com.facebook.internal.k$b */
    /* compiled from: FeatureManager */
    static /* synthetic */ class C6439b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11816a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.internal.k$d[] r0 = com.facebook.internal.C6437k.C6441d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11816a = r0
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Instrument     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.CrashReport     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.CrashShield     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.ErrorReport     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.AAM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.ModelRequest     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Monitoring     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Core     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.AppEvents     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Login     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Share     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f11816a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.facebook.internal.k$d r1 = com.facebook.internal.C6437k.C6441d.Places     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6437k.C6439b.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.k$c */
    /* compiled from: FeatureManager */
    public interface C6440c {
        /* renamed from: a */
        void mo15773a(boolean z);
    }

    /* renamed from: a */
    public static void m13338a(C6441d dVar, C6440c cVar) {
        C6442l.m13352a((C6442l.C6445c) new C6438a(cVar, dVar));
    }

    /* renamed from: b */
    public static void m13340b(C6441d dVar) {
        C4716f.m7696e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(dVar.mo20984d(), C4716f.m7710s()).apply();
    }

    /* renamed from: c */
    private static boolean m13341c(C6441d dVar) {
        return C6442l.m13353a(dVar.mo20984d(), C4716f.m7697f(), m13339a(dVar));
    }

    /* renamed from: d */
    public static boolean m13342d(C6441d dVar) {
        if (C6441d.Unknown == dVar) {
            return false;
        }
        if (C6441d.Core == dVar) {
            return true;
        }
        String string = C4716f.m7696e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(dVar.mo20984d(), (String) null);
        if (string != null && string.equals(C4716f.m7710s())) {
            return false;
        }
        C6441d a = dVar.mo20983a();
        if (a == dVar) {
            return m13341c(dVar);
        }
        if (!m13342d(a) || !m13341c(dVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C6441d m13336a(String str) {
        m13337a();
        for (Map.Entry next : f11813a.entrySet()) {
            String[] strArr = (String[]) next.getValue();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (str.startsWith(strArr[i])) {
                        return (C6441d) next.getKey();
                    }
                    i++;
                }
            }
        }
        return C6441d.Unknown;
    }

    /* renamed from: com.facebook.internal.k$d */
    /* compiled from: FeatureManager */
    public enum C6441d {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: f */
        private final int f11840f;

        private C6441d(int i) {
            this.f11840f = i;
        }

        /* renamed from: a */
        static C6441d m13344a(int i) {
            for (C6441d dVar : values()) {
                if (dVar.f11840f == i) {
                    return dVar;
                }
            }
            return Unknown;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo20984d() {
            return "FBSDKFeature" + toString();
        }

        public String toString() {
            switch (C6439b.f11816a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "CrashShield";
                case 5:
                    return "ThreadCheck";
                case 6:
                    return "ErrorReport";
                case 7:
                    return "AAM";
                case 8:
                    return "PrivacyProtection";
                case 9:
                    return "SuggestedEvents";
                case 10:
                    return "IntelligentIntegrity";
                case 11:
                    return "ModelRequest";
                case 12:
                    return "EventDeactivation";
                case 13:
                    return "ChromeCustomTabsPrefetching";
                case 14:
                    return "Monitoring";
                case 15:
                    return "IgnoreAppSwitchToLoggedOut";
                case 16:
                    return "CoreKit";
                case 17:
                    return "AppEvents";
                case 18:
                    return "CodelessEvents";
                case 19:
                    return "LoginKit";
                case 20:
                    return "ShareKit";
                case 21:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }

        /* renamed from: a */
        public C6441d mo20983a() {
            int i = this.f11840f;
            if ((i & 255) > 0) {
                return m13344a(i & -256);
            }
            if ((65280 & i) > 0) {
                return m13344a(i & -65536);
            }
            if ((16711680 & i) > 0) {
                return m13344a(i & -16777216);
            }
            return m13344a(0);
        }
    }

    /* renamed from: a */
    private static synchronized void m13337a() {
        synchronized (C6437k.class) {
            if (f11813a.isEmpty()) {
                f11813a.put(C6441d.AAM, new String[]{"com.facebook.appevents.aam."});
                f11813a.put(C6441d.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                f11813a.put(C6441d.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                f11813a.put(C6441d.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                f11813a.put(C6441d.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                f11813a.put(C6441d.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                f11813a.put(C6441d.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                f11813a.put(C6441d.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                f11813a.put(C6441d.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
    }

    /* renamed from: a */
    private static boolean m13339a(C6441d dVar) {
        switch (C6439b.f11816a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return false;
            default:
                return true;
        }
    }
}
