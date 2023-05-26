package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzdsx extends zzdtc {

    /* renamed from: a */
    private String f21735a;

    public zzdsx(String str) {
        this.f21735a = str;
    }

    /* renamed from: a */
    public final void mo29219a(String str) {
        String str2 = this.f21735a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
