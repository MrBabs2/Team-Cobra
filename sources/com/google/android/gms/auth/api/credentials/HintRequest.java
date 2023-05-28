package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f13499f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final CredentialPickerConfig f13500g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final boolean f13501h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f13502i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final String[] f13503j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final boolean f13504k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final String f13505l;
    @SafeParcelable.Field

    /* renamed from: m */
    private final String f13506m;

    public static final class Builder {

        /* renamed from: a */
        private CredentialPickerConfig f13507a = new CredentialPickerConfig.Builder().mo24697a();
    }

    @SafeParcelable.Constructor
    HintRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2) {
        this.f13499f = i;
        Preconditions.m16037a(credentialPickerConfig);
        this.f13500g = credentialPickerConfig;
        this.f13501h = z;
        this.f13502i = z2;
        Preconditions.m16037a(strArr);
        this.f13503j = strArr;
        if (this.f13499f < 2) {
            this.f13504k = true;
            this.f13505l = null;
            this.f13506m = null;
            return;
        }
        this.f13504k = z3;
        this.f13505l = str;
        this.f13506m = str2;
    }

    /* renamed from: d */
    public final String[] mo24707d() {
        return this.f13503j;
    }

    /* renamed from: o */
    public final CredentialPickerConfig mo24708o() {
        return this.f13500g;
    }

    /* renamed from: p */
    public final String mo24709p() {
        return this.f13506m;
    }

    /* renamed from: q */
    public final String mo24710q() {
        return this.f13505l;
    }

    /* renamed from: t */
    public final boolean mo24711t() {
        return this.f13501h;
    }

    /* renamed from: u */
    public final boolean mo24712u() {
        return this.f13504k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 1, (Parcelable) mo24708o(), i, false);
        SafeParcelWriter.m16146a(parcel, 2, mo24711t());
        SafeParcelWriter.m16146a(parcel, 3, this.f13502i);
        SafeParcelWriter.m16149a(parcel, 4, mo24707d(), false);
        SafeParcelWriter.m16146a(parcel, 5, mo24712u());
        SafeParcelWriter.m16143a(parcel, 6, mo24710q(), false);
        SafeParcelWriter.m16143a(parcel, 7, mo24709p(), false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13499f);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
