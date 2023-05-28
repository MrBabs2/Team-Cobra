package com.facebook.p032t.p181u;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C4716f;
import java.util.UUID;

/* renamed from: com.facebook.t.u.j */
/* compiled from: SessionInfo */
class C6666j {

    /* renamed from: a */
    private Long f12418a;

    /* renamed from: b */
    private Long f12419b;

    /* renamed from: c */
    private int f12420c;

    /* renamed from: d */
    private Long f12421d;

    /* renamed from: e */
    private C6668l f12422e;

    /* renamed from: f */
    private UUID f12423f;

    public C6666j(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    /* renamed from: i */
    public static void m14226i() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).edit();
        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
        edit.apply();
        C6668l.m14242b();
    }

    /* renamed from: j */
    public static C6666j m14227j() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e());
        long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
        long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
        String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
        if (j == 0 || j2 == 0 || string == null) {
            return null;
        }
        C6666j jVar = new C6666j(Long.valueOf(j), Long.valueOf(j2));
        jVar.f12420c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
        jVar.f12422e = C6668l.m14243c();
        jVar.f12421d = Long.valueOf(System.currentTimeMillis());
        jVar.f12423f = UUID.fromString(string);
        return jVar;
    }

    /* renamed from: a */
    public void mo21421a(Long l) {
        this.f12419b = l;
    }

    /* renamed from: b */
    public int mo21422b() {
        return this.f12420c;
    }

    /* renamed from: c */
    public UUID mo21423c() {
        return this.f12423f;
    }

    /* renamed from: d */
    public Long mo21424d() {
        return this.f12419b;
    }

    /* renamed from: e */
    public long mo21425e() {
        Long l;
        if (this.f12418a == null || (l = this.f12419b) == null) {
            return 0;
        }
        return l.longValue() - this.f12418a.longValue();
    }

    /* renamed from: f */
    public C6668l mo21426f() {
        return this.f12422e;
    }

    /* renamed from: g */
    public void mo21427g() {
        this.f12420c++;
    }

    /* renamed from: h */
    public void mo21428h() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f12418a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f12419b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f12420c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f12423f.toString());
        edit.apply();
        C6668l lVar = this.f12422e;
        if (lVar != null) {
            lVar.mo21429a();
        }
    }

    public C6666j(Long l, Long l2, UUID uuid) {
        this.f12418a = l;
        this.f12419b = l2;
        this.f12423f = uuid;
    }

    /* renamed from: a */
    public long mo21420a() {
        Long l = this.f12421d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }
}
