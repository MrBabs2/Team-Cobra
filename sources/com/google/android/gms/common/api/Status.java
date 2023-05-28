package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: j */
    public static final Status f13682j = new Status(0);
    @KeepForSdk

    /* renamed from: k */
    public static final Status f13683k = new Status(14);
    @KeepForSdk

    /* renamed from: l */
    public static final Status f13684l = new Status(8);
    @KeepForSdk

    /* renamed from: m */
    public static final Status f13685m = new Status(15);
    @KeepForSdk

    /* renamed from: n */
    public static final Status f13686n = new Status(16);
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13687f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f13688g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f13689h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final PendingIntent f13690i;

    static {
        new Status(17);
        new Status(18);
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.f13687f = i;
        this.f13688g = i2;
        this.f13689h = str;
        this.f13690i = pendingIntent;
    }

    /* renamed from: a */
    public final void mo24980a(Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo24985p()) {
            activity.startIntentSenderForResult(this.f13690i.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    /* renamed from: d */
    public final int mo24981d() {
        return this.f13688g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f13687f != status.f13687f || this.f13688g != status.f13688g || !Objects.m16031a(this.f13689h, status.f13689h) || !Objects.m16031a(this.f13690i, status.f13690i)) {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f13687f), Integer.valueOf(this.f13688g), this.f13689h, this.f13690i);
    }

    /* renamed from: o */
    public final String mo24984o() {
        return this.f13689h;
    }

    @VisibleForTesting
    /* renamed from: p */
    public final boolean mo24985p() {
        return this.f13690i != null;
    }

    /* renamed from: q */
    public final boolean mo24986q() {
        return this.f13688g <= 0;
    }

    /* renamed from: t */
    public final String mo24987t() {
        String str = this.f13689h;
        if (str != null) {
            return str;
        }
        return CommonStatusCodes.m15310a(this.f13688g);
    }

    public final String toString() {
        Objects.ToStringHelper a = Objects.m16030a((Object) this);
        a.mo25372a("statusCode", mo24987t());
        a.mo25372a("resolution", this.f13690i);
        return a.toString();
    }

    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, mo24981d());
        SafeParcelWriter.m16143a(parcel, 2, mo24984o(), false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) this.f13690i, i, false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f13687f);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @KeepForSdk
    public Status(int i) {
        this(i, (String) null);
    }

    @KeepForSdk
    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    @KeepForSdk
    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}
