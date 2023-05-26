package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new zao();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14150f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f14151g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final int f14152h;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: i */
    private final Scope[] f14153i;

    @SafeParcelable.Constructor
    SignInButtonConfig(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.f14150f = i;
        this.f14151g = i2;
        this.f14152h = i3;
        this.f14153i = scopeArr;
    }

    /* renamed from: d */
    public int mo25385d() {
        return this.f14151g;
    }

    /* renamed from: o */
    public int mo25386o() {
        return this.f14152h;
    }

    @Deprecated
    /* renamed from: p */
    public Scope[] mo25387p() {
        return this.f14153i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14150f);
        SafeParcelWriter.m16135a(parcel, 2, mo25385d());
        SafeParcelWriter.m16135a(parcel, 3, mo25386o());
        SafeParcelWriter.m16148a(parcel, 4, (T[]) mo25387p(), i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, (Scope[]) null);
    }
}
