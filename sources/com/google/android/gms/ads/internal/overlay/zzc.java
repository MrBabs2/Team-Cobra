package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzard;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field
    public final Intent intent;
    @SafeParcelable.Field
    public final String mimeType;
    @SafeParcelable.Field
    public final String packageName;
    @SafeParcelable.Field
    public final String url;
    @SafeParcelable.Field
    private final String zzdjg;
    @SafeParcelable.Field
    public final String zzdjh;
    @SafeParcelable.Field
    public final String zzdji;
    @SafeParcelable.Field
    private final String zzdjj;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.zzdjg, false);
        SafeParcelWriter.m16143a(parcel, 3, this.url, false);
        SafeParcelWriter.m16143a(parcel, 4, this.mimeType, false);
        SafeParcelWriter.m16143a(parcel, 5, this.packageName, false);
        SafeParcelWriter.m16143a(parcel, 6, this.zzdjh, false);
        SafeParcelWriter.m16143a(parcel, 7, this.zzdji, false);
        SafeParcelWriter.m16143a(parcel, 8, this.zzdjj, false);
        SafeParcelWriter.m16140a(parcel, 9, (Parcelable) this.intent, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public zzc(Intent intent2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent2);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) Intent intent2) {
        this.zzdjg = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdjh = str5;
        this.zzdji = str6;
        this.zzdjj = str7;
        this.intent = intent2;
    }
}
