package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13406f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f13407g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f13408h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final int f13409i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final int f13410j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final String f13411k;

    @SafeParcelable.Constructor
    AccountChangeEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) String str2) {
        this.f13406f = i;
        this.f13407g = j;
        Preconditions.m16037a(str);
        this.f13408h = str;
        this.f13409i = i2;
        this.f13410j = i3;
        this.f13411k = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f13406f == accountChangeEvent.f13406f && this.f13407g == accountChangeEvent.f13407g && Objects.m16031a(this.f13408h, accountChangeEvent.f13408h) && this.f13409i == accountChangeEvent.f13409i && this.f13410j == accountChangeEvent.f13410j && Objects.m16031a(this.f13411k, accountChangeEvent.f13411k);
        }
    }

    public int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f13406f), Long.valueOf(this.f13407g), this.f13408h, Integer.valueOf(this.f13409i), Integer.valueOf(this.f13410j), this.f13411k);
    }

    public String toString() {
        int i = this.f13409i;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f13408h;
        String str3 = this.f13411k;
        int i2 = this.f13410j;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13406f);
        SafeParcelWriter.m16136a(parcel, 2, this.f13407g);
        SafeParcelWriter.m16143a(parcel, 3, this.f13408h, false);
        SafeParcelWriter.m16135a(parcel, 4, this.f13409i);
        SafeParcelWriter.m16135a(parcel, 5, this.f13410j);
        SafeParcelWriter.m16143a(parcel, 6, this.f13411k, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
