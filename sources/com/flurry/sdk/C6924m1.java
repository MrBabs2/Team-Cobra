package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.m1 */
final class C6924m1 {

    /* renamed from: a */
    final String f12977a = "Flurry.ScreenTime: ";

    /* renamed from: b */
    final String f12978b;

    /* renamed from: c */
    final String f12979c;

    /* renamed from: d */
    final long f12980d;

    /* renamed from: e */
    final Map<String, String> f12981e;

    /* renamed from: f */
    boolean f12982f;

    /* renamed from: g */
    long f12983g;

    /* renamed from: h */
    long f12984h;

    C6924m1(String str, String str2) {
        this.f12978b = str;
        this.f12979c = str2;
        this.f12980d = System.nanoTime();
        this.f12981e = new HashMap();
        this.f12982f = false;
        this.f12983g = 0;
        this.f12984h = 0;
    }
}
