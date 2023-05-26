package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13412f;
    @SafeParcelable.Field

    /* renamed from: g */
    private int f13413g;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: h */
    private String f13414h;
    @SafeParcelable.Field

    /* renamed from: i */
    private Account f13415i;

    @SafeParcelable.Constructor
    AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Account account) {
        this.f13412f = i;
        this.f13413g = i2;
        this.f13414h = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f13415i = account;
        } else {
            this.f13415i = new Account(str, "com.google");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13412f);
        SafeParcelWriter.m16135a(parcel, 2, this.f13413g);
        SafeParcelWriter.m16143a(parcel, 3, this.f13414h, false);
        SafeParcelWriter.m16140a(parcel, 4, (Parcelable) this.f13415i, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f13412f = 1;
    }
}
