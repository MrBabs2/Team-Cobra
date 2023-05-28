package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new zam();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14140f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final Account f14141g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final int f14142h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final GoogleSignInAccount f14143i;

    @SafeParcelable.Constructor
    ResolveAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f14140f = i;
        this.f14141g = account;
        this.f14142h = i2;
        this.f14143i = googleSignInAccount;
    }

    /* renamed from: d */
    public int mo25375d() {
        return this.f14142h;
    }

    public Account getAccount() {
        return this.f14141g;
    }

    /* renamed from: o */
    public GoogleSignInAccount mo25377o() {
        return this.f14143i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14140f);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) getAccount(), i, false);
        SafeParcelWriter.m16135a(parcel, 3, mo25375d());
        SafeParcelWriter.m16140a(parcel, 4, (Parcelable) mo25377o(), i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
