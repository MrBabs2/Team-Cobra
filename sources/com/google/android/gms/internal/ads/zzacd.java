package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzacd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzacd> CREATOR = new zzace();
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f17755f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f17756g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final boolean f17757h;

    public zzacd(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 2, this.f17755f);
        SafeParcelWriter.m16146a(parcel, 3, this.f17756g);
        SafeParcelWriter.m16146a(parcel, 4, this.f17757h);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzacd(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) boolean z3) {
        this.f17755f = z;
        this.f17756g = z2;
        this.f17757h = z3;
    }
}
