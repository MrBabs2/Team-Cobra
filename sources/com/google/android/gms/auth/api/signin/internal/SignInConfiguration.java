package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f13579f;
    @SafeParcelable.Field

    /* renamed from: g */
    private GoogleSignInOptions f13580g;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        Preconditions.m16046b(str);
        this.f13579f = str;
        this.f13580g = googleSignInOptions;
    }

    /* renamed from: d */
    public final GoogleSignInOptions mo24786d() {
        return this.f13580g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f13579f.equals(signInConfiguration.f13579f)) {
            GoogleSignInOptions googleSignInOptions = this.f13580g;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f13580g == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f13580g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.mo24784a((Object) this.f13579f);
        hashAccumulator.mo24784a((Object) this.f13580g);
        return hashAccumulator.mo24783a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f13579f, false);
        SafeParcelWriter.m16140a(parcel, 5, (Parcelable) this.f13580g, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
