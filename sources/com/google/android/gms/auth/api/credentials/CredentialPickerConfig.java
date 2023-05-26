package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f13483f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final boolean f13484g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final boolean f13485h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final int f13486i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
    }

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f13487a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f13488b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f13489c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo24697a() {
            return new CredentialPickerConfig(this);
        }
    }

    @SafeParcelable.Constructor
    CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i2) {
        this.f13483f = i;
        this.f13484g = z;
        this.f13485h = z2;
        int i3 = 3;
        if (i < 2) {
            this.f13486i = !z3 ? 1 : i3;
        } else {
            this.f13486i = i2;
        }
    }

    @Deprecated
    /* renamed from: d */
    public final boolean mo24693d() {
        return this.f13486i == 3;
    }

    /* renamed from: o */
    public final boolean mo24694o() {
        return this.f13484g;
    }

    /* renamed from: p */
    public final boolean mo24695p() {
        return this.f13485h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, mo24694o());
        SafeParcelWriter.m16146a(parcel, 2, mo24695p());
        SafeParcelWriter.m16146a(parcel, 3, mo24693d());
        SafeParcelWriter.m16135a(parcel, 4, this.f13486i);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13483f);
        SafeParcelWriter.m16132a(parcel, a);
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.f13487a, builder.f13488b, false, builder.f13489c);
    }
}
