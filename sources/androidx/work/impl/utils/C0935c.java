package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: androidx.work.impl.utils.c */
/* compiled from: IdGenerator */
public class C0935c {

    /* renamed from: a */
    private final Context f3252a;

    /* renamed from: b */
    private SharedPreferences f3253b;

    /* renamed from: c */
    private boolean f3254c;

    public C0935c(Context context) {
        this.f3252a = context;
    }

    /* renamed from: b */
    private void m4071b() {
        if (!this.f3254c) {
            this.f3253b = this.f3252a.getSharedPreferences("androidx.work.util.id", 0);
            this.f3254c = true;
        }
    }

    /* renamed from: a */
    public int mo4928a(int i, int i2) {
        synchronized (C0935c.class) {
            m4071b();
            int a = m4069a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            m4070a("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    /* renamed from: a */
    public int mo4927a() {
        int a;
        synchronized (C0935c.class) {
            m4071b();
            a = m4069a("next_alarm_manager_id");
        }
        return a;
    }

    /* renamed from: a */
    private int m4069a(String str) {
        int i = 0;
        int i2 = this.f3253b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        m4070a(str, i);
        return i2;
    }

    /* renamed from: a */
    private void m4070a(String str, int i) {
        this.f3253b.edit().putInt(str, i).apply();
    }
}
