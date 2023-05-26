package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zae();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14052f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final Uri f14053g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final int f14054h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final int f14055i;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.f14052f = i;
        this.f14053g = uri;
        this.f14054h = i2;
        this.f14055i = i3;
    }

    /* renamed from: d */
    public final int mo25248d() {
        return this.f14055i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.m16031a(this.f14053g, webImage.f14053g) && this.f14054h == webImage.f14054h && this.f14055i == webImage.f14055i;
        }
    }

    public final int hashCode() {
        return Objects.m16029a(this.f14053g, Integer.valueOf(this.f14054h), Integer.valueOf(this.f14055i));
    }

    /* renamed from: o */
    public final Uri mo25251o() {
        return this.f14053g;
    }

    /* renamed from: p */
    public final int mo25252p() {
        return this.f14054h;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f14054h), Integer.valueOf(this.f14055i), this.f14053g.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14052f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) mo25251o(), i, false);
        SafeParcelWriter.m16135a(parcel, 3, mo25252p());
        SafeParcelWriter.m16135a(parcel, 4, mo25248d());
        SafeParcelWriter.m16132a(parcel, a);
    }
}
