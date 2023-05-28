package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: androidx.work.impl.utils.e */
/* compiled from: Preferences */
public class C0937e {

    /* renamed from: a */
    private Context f3256a;

    /* renamed from: b */
    private SharedPreferences f3257b;

    public C0937e(Context context) {
        this.f3256a = context;
    }

    /* renamed from: b */
    private SharedPreferences m4075b() {
        SharedPreferences sharedPreferences;
        synchronized (C0937e.class) {
            if (this.f3257b == null) {
                this.f3257b = this.f3256a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f3257b;
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo4930a() {
        return m4075b().getBoolean("reschedule_needed", false);
    }

    /* renamed from: a */
    public void mo4929a(boolean z) {
        m4075b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
