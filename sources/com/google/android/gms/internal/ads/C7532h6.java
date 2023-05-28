package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.h6 */
final /* synthetic */ class C7532h6 implements C7684l6 {

    /* renamed from: a */
    private final String f15353a;

    /* renamed from: b */
    private final String f15354b;

    /* renamed from: c */
    private final Map f15355c;

    /* renamed from: d */
    private final byte[] f15356d;

    C7532h6(String str, String str2, Map map, byte[] bArr) {
        this.f15353a = str;
        this.f15354b = str2;
        this.f15355c = map;
        this.f15356d = bArr;
    }

    /* renamed from: a */
    public final void mo26014a(JsonWriter jsonWriter) {
        zzazx.m20495a(this.f15353a, this.f15354b, this.f15355c, this.f15356d, jsonWriter);
    }
}
