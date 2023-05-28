package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.content.C0394a;

/* renamed from: androidx.preference.j */
/* compiled from: PreferenceManager */
public class C0600j {

    /* renamed from: a */
    private Context f2387a;

    /* renamed from: b */
    private long f2388b = 0;

    /* renamed from: c */
    private SharedPreferences f2389c;

    /* renamed from: d */
    private C0583e f2390d;

    /* renamed from: e */
    private SharedPreferences.Editor f2391e;

    /* renamed from: f */
    private boolean f2392f;

    /* renamed from: g */
    private String f2393g;

    /* renamed from: h */
    private int f2394h;

    /* renamed from: i */
    private int f2395i = 0;

    /* renamed from: j */
    private PreferenceScreen f2396j;

    /* renamed from: k */
    private C0604d f2397k;

    /* renamed from: l */
    private C0603c f2398l;

    /* renamed from: m */
    private C0601a f2399m;

    /* renamed from: n */
    private C0602b f2400n;

    /* renamed from: androidx.preference.j$a */
    /* compiled from: PreferenceManager */
    public interface C0601a {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* renamed from: androidx.preference.j$b */
    /* compiled from: PreferenceManager */
    public interface C0602b {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.j$c */
    /* compiled from: PreferenceManager */
    public interface C0603c {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* renamed from: androidx.preference.j$d */
    /* compiled from: PreferenceManager */
    public static abstract class C0604d {
        /* renamed from: a */
        public abstract boolean mo3380a(Preference preference, Preference preference2);

        /* renamed from: b */
        public abstract boolean mo3381b(Preference preference, Preference preference2);
    }

    public C0600j(Context context) {
        this.f2387a = context;
        mo3370a(m2913a(context));
    }

    /* renamed from: a */
    private static String m2913a(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo3372b() {
        long j;
        synchronized (this) {
            j = this.f2388b;
            this.f2388b = 1 + j;
        }
        return j;
    }

    /* renamed from: c */
    public C0602b mo3373c() {
        return this.f2400n;
    }

    /* renamed from: d */
    public C0603c mo3374d() {
        return this.f2398l;
    }

    /* renamed from: e */
    public C0604d mo3375e() {
        return this.f2397k;
    }

    /* renamed from: f */
    public C0583e mo3376f() {
        return this.f2390d;
    }

    /* renamed from: g */
    public PreferenceScreen mo3377g() {
        return this.f2396j;
    }

    /* renamed from: h */
    public SharedPreferences mo3378h() {
        Context context;
        if (mo3376f() != null) {
            return null;
        }
        if (this.f2389c == null) {
            if (this.f2395i != 1) {
                context = this.f2387a;
            } else {
                context = C0394a.m1911a(this.f2387a);
            }
            this.f2389c = context.getSharedPreferences(this.f2393g, this.f2394h);
        }
        return this.f2389c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo3379i() {
        return !this.f2392f;
    }

    /* renamed from: a */
    public PreferenceScreen mo3365a(Context context, int i, PreferenceScreen preferenceScreen) {
        m2914a(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new C0599i(context, this).mo3354a(i, (PreferenceGroup) preferenceScreen);
        preferenceScreen2.mo3188a(this);
        m2914a(false);
        return preferenceScreen2;
    }

    /* renamed from: a */
    public void mo3370a(String str) {
        this.f2393g = str;
        this.f2389c = null;
    }

    /* renamed from: a */
    public boolean mo3371a(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f2396j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.mo3171R();
        }
        this.f2396j = preferenceScreen;
        return true;
    }

    /* renamed from: a */
    public <T extends Preference> T mo3364a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f2396j;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.mo3240c(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SharedPreferences.Editor mo3363a() {
        if (this.f2390d != null) {
            return null;
        }
        if (!this.f2392f) {
            return mo3378h().edit();
        }
        if (this.f2391e == null) {
            this.f2391e = mo3378h().edit();
        }
        return this.f2391e;
    }

    /* renamed from: a */
    private void m2914a(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f2391e) != null) {
            editor.apply();
        }
        this.f2392f = z;
    }

    /* renamed from: a */
    public void mo3367a(C0601a aVar) {
        this.f2399m = aVar;
    }

    /* renamed from: a */
    public void mo3366a(Preference preference) {
        C0601a aVar = this.f2399m;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }

    /* renamed from: a */
    public void mo3369a(C0603c cVar) {
        this.f2398l = cVar;
    }

    /* renamed from: a */
    public void mo3368a(C0602b bVar) {
        this.f2400n = bVar;
    }
}
