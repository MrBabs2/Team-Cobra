package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

@zzard
public abstract class zzacj<T> {

    /* renamed from: a */
    private final int f17759a;

    /* renamed from: b */
    private final String f17760b;

    /* renamed from: c */
    private final T f17761c;

    private zzacj(int i, String str, T t) {
        this.f17759a = i;
        this.f17760b = str;
        this.f17761c = t;
        zzyt.m25669d().mo27159a(this);
    }

    /* renamed from: b */
    public static zzacj<String> m18963b(int i, String str) {
        zzacj<String> a = m18962a(i, str, (String) null);
        zzyt.m25669d().mo27162c(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo26193a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public abstract T mo26194a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo26195a(JSONObject jSONObject);

    /* renamed from: a */
    public final String mo27154a() {
        return this.f17760b;
    }

    /* renamed from: a */
    public abstract void mo26196a(SharedPreferences.Editor editor, T t);

    /* renamed from: c */
    public final T mo27156c() {
        return this.f17761c;
    }

    /* renamed from: a */
    public static zzacj<Boolean> m18961a(int i, String str, Boolean bool) {
        return new C7677l(i, str, bool);
    }

    /* renamed from: a */
    public static zzacj<Integer> m18959a(int i, String str, int i2) {
        return new C7714m(i, str, Integer.valueOf(i2));
    }

    /* renamed from: b */
    public final int mo27155b() {
        return this.f17759a;
    }

    /* renamed from: a */
    public static zzacj<Long> m18960a(int i, String str, long j) {
        return new C7751n(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static zzacj<Float> m18958a(int i, String str, float f) {
        return new C7788o(i, str, Float.valueOf(f));
    }

    /* synthetic */ zzacj(int i, String str, Object obj, C7677l lVar) {
        this(i, str, obj);
    }

    /* renamed from: a */
    public static zzacj<String> m18962a(int i, String str, String str2) {
        return new C7825p(i, str, str2);
    }

    /* renamed from: a */
    public static zzacj<String> m18957a(int i, String str) {
        zzacj<String> a = m18962a(i, str, (String) null);
        zzyt.m25669d().mo27161b(a);
        return a;
    }
}
