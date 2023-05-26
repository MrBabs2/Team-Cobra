package p015cm.aptoide.p016pt.preferences;

import android.content.SharedPreferences;
import p123rx.C12475j;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p128t.C12889e;

/* renamed from: cm.aptoide.pt.preferences.Preferences */
public class Preferences {
    /* access modifiers changed from: private */
    public final SharedPreferences preferences;

    public Preferences(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }

    private C5368e<Void> change(final String str) {
        return C5368e.m10241a(new C5368e.C5370a<Void>() {
            /* renamed from: a */
            public /* synthetic */ void mo13384a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
                Preferences.this.preferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }

            public void call(final C12475j<? super Void> jVar) {
                C35771 r0 = new SharedPreferences.OnSharedPreferenceChangeListener() {
                    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        if (!jVar.isUnsubscribed() && str.equals(str)) {
                            jVar.onNext(null);
                        }
                    }
                };
                jVar.add(C12889e.m41501a(new C3584d(this, r0)));
                Preferences.this.preferences.registerOnSharedPreferenceChangeListener(r0);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo13375a(String str, boolean z) {
        this.preferences.edit().putBoolean(str, z).commit();
    }

    public Single<Boolean> contains(String str) {
        return Single.m10119a(Boolean.valueOf(this.preferences.contains(str)));
    }

    public C5368e<Boolean> getBoolean(String str, boolean z) {
        return change(str).mo18694j(new C3590j(this, str, z)).mo18660b(Boolean.valueOf(this.preferences.getBoolean(str, z)));
    }

    public C5368e<Integer> getInt(String str, int i) {
        return change(str).mo18694j(new C3586f(this, str, i)).mo18660b(Integer.valueOf(this.preferences.getInt(str, i)));
    }

    public C5368e<String> getString(String str, String str2) {
        return change(str).mo18694j(new C3587g(this, str, str2)).mo18660b(this.preferences.getString(str, str2));
    }

    public C5328b remove(String str) {
        return C5328b.m10169d(new C3585e(this, str));
    }

    public C5328b save(String str, boolean z) {
        return C5328b.m10169d(new C3588h(this, str, z));
    }

    public C5328b save(String str, String str2) {
        return C5328b.m10169d(new C3591k(this, str, str2));
    }

    public C5328b save(String str, int i) {
        return C5328b.m10169d(new C3589i(this, str, i));
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo13369a(String str, boolean z, Void voidR) {
        return Boolean.valueOf(this.preferences.getBoolean(str, z));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13374a(String str, String str2) {
        this.preferences.edit().putString(str, str2).commit();
    }

    /* renamed from: a */
    public /* synthetic */ String mo13371a(String str, String str2, Void voidR) {
        return this.preferences.getString(str, str2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13373a(String str, int i) {
        this.preferences.edit().putInt(str, i).commit();
    }

    /* renamed from: a */
    public /* synthetic */ Integer mo13370a(String str, int i, Void voidR) {
        return Integer.valueOf(this.preferences.getInt(str, i));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13372a(String str) {
        this.preferences.edit().remove(str).commit();
    }
}
