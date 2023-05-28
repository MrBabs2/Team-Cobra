package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: f */
    private String f13569f;
    @SafeParcelable.Field

    /* renamed from: g */
    private GoogleSignInAccount f13570g;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: h */
    private String f13571h;

    @SafeParcelable.Constructor
    SignInAccount(@SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(id = 8) String str2) {
        this.f13570g = googleSignInAccount;
        Preconditions.m16039a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f13569f = str;
        Preconditions.m16039a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.f13571h = str2;
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo24777a() {
        return this.f13570g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 4, this.f13569f, false);
        SafeParcelWriter.m16140a(parcel, 7, (Parcelable) this.f13570g, i, false);
        SafeParcelWriter.m16143a(parcel, 8, this.f13571h, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
