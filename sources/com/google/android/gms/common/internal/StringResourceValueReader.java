package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C7158R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class StringResourceValueReader {

    /* renamed from: a */
    private final Resources f14156a;

    /* renamed from: b */
    private final String f14157b;

    public StringResourceValueReader(Context context) {
        Preconditions.m16037a(context);
        Resources resources = context.getResources();
        this.f14156a = resources;
        this.f14157b = resources.getResourcePackageName(C7158R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    /* renamed from: a */
    public String mo25392a(String str) {
        int identifier = this.f14156a.getIdentifier(str, "string", this.f14157b);
        if (identifier == 0) {
            return null;
        }
        return this.f14156a.getString(identifier);
    }
}
