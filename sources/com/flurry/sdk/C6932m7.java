package com.flurry.sdk;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.flurry.sdk.m7 */
public final class C6932m7 {

    /* renamed from: c */
    private static SimpleDateFormat f13000c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* renamed from: a */
    public String f13001a;

    /* renamed from: b */
    public long f13002b;

    public C6932m7(String str, long j) {
        this.f13001a = str;
        this.f13002b = j;
    }

    public final String toString() {
        return f13000c.format(Long.valueOf(this.f13002b)) + ": " + this.f13001a + "\n";
    }
}
