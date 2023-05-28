package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f13490f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f13491g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String[] f13492h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final CredentialPickerConfig f13493i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final CredentialPickerConfig f13494j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final boolean f13495k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final String f13496l;
    @SafeParcelable.Field

    /* renamed from: m */
    private final String f13497m;
    @SafeParcelable.Field

    /* renamed from: n */
    private final boolean f13498n;

    public static final class Builder {
    }

    @SafeParcelable.Constructor
    CredentialRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z3) {
        this.f13490f = i;
        this.f13491g = z;
        Preconditions.m16037a(strArr);
        this.f13492h = strArr;
        this.f13493i = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().mo24697a() : credentialPickerConfig;
        this.f13494j = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().mo24697a() : credentialPickerConfig2;
        if (i < 3) {
            this.f13495k = true;
            this.f13496l = null;
            this.f13497m = null;
        } else {
            this.f13495k = z2;
            this.f13496l = str;
            this.f13497m = str2;
        }
        this.f13498n = z3;
    }

    /* renamed from: d */
    public final String[] mo24698d() {
        return this.f13492h;
    }

    /* renamed from: o */
    public final CredentialPickerConfig mo24699o() {
        return this.f13494j;
    }

    /* renamed from: p */
    public final CredentialPickerConfig mo24700p() {
        return this.f13493i;
    }

    /* renamed from: q */
    public final String mo24701q() {
        return this.f13497m;
    }

    /* renamed from: t */
    public final String mo24702t() {
        return this.f13496l;
    }

    /* renamed from: u */
    public final boolean mo24703u() {
        return this.f13495k;
    }

    /* renamed from: v */
    public final boolean mo24704v() {
        return this.f13491g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, mo24704v());
        SafeParcelWriter.m16149a(parcel, 2, mo24698d(), false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) mo24700p(), i, false);
        SafeParcelWriter.m16140a(parcel, 4, (Parcelable) mo24699o(), i, false);
        SafeParcelWriter.m16146a(parcel, 5, mo24703u());
        SafeParcelWriter.m16143a(parcel, 6, mo24702t(), false);
        SafeParcelWriter.m16143a(parcel, 7, mo24701q(), false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13490f);
        SafeParcelWriter.m16146a(parcel, 8, this.f13498n);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
