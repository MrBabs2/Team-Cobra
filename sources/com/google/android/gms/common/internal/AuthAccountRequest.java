package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14059f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    private final IBinder f14060g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final Scope[] f14061h;
    @SafeParcelable.Field

    /* renamed from: i */
    private Integer f14062i;
    @SafeParcelable.Field

    /* renamed from: j */
    private Integer f14063j;
    @SafeParcelable.Field

    /* renamed from: k */
    private Account f14064k;

    @SafeParcelable.Constructor
    AuthAccountRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) Scope[] scopeArr, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) Account account) {
        this.f14059f = i;
        this.f14060g = iBinder;
        this.f14061h = scopeArr;
        this.f14062i = num;
        this.f14063j = num2;
        this.f14064k = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14059f);
        SafeParcelWriter.m16138a(parcel, 2, this.f14060g, false);
        SafeParcelWriter.m16148a(parcel, 3, (T[]) this.f14061h, i, false);
        SafeParcelWriter.m16141a(parcel, 4, this.f14062i, false);
        SafeParcelWriter.m16141a(parcel, 5, this.f14063j, false);
        SafeParcelWriter.m16140a(parcel, 6, (Parcelable) this.f14064k, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
