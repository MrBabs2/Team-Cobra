package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f13508f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f13509g;

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        Preconditions.m16044a(!TextUtils.isEmpty(str), (Object) "account type string cannot be null or empty");
        Preconditions.m16044a(!TextUtils.isEmpty(str2), (Object) "id token string cannot be null or empty");
        this.f13508f = str;
        this.f13509g = str2;
    }

    /* renamed from: d */
    public final String mo24714d() {
        return this.f13508f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.m16031a(this.f13508f, idToken.f13508f) && Objects.m16031a(this.f13509g, idToken.f13509g);
    }

    /* renamed from: o */
    public final String mo24716o() {
        return this.f13509g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, mo24714d(), false);
        SafeParcelWriter.m16143a(parcel, 2, mo24716o(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
