package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();
    @KeepForSdk

    /* renamed from: j */
    public static final ConnectionResult f13608j = new ConnectionResult(0);
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13609f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f13610g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final PendingIntent f13611h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final String f13612i;

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) String str) {
        this.f13609f = i;
        this.f13610g = i2;
        this.f13611h = pendingIntent;
        this.f13612i = str;
    }

    /* renamed from: a */
    public final void mo24839a(Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo24845q()) {
            activity.startIntentSenderForResult(this.f13611h.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    /* renamed from: d */
    public final int mo24840d() {
        return this.f13610g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f13610g == connectionResult.f13610g && Objects.m16031a(this.f13611h, connectionResult.f13611h) && Objects.m16031a(this.f13612i, connectionResult.f13612i);
    }

    public final int hashCode() {
        return Objects.m16029a(Integer.valueOf(this.f13610g), this.f13611h, this.f13612i);
    }

    /* renamed from: o */
    public final String mo24843o() {
        return this.f13612i;
    }

    /* renamed from: p */
    public final PendingIntent mo24844p() {
        return this.f13611h;
    }

    /* renamed from: q */
    public final boolean mo24845q() {
        return (this.f13610g == 0 || this.f13611h == null) ? false : true;
    }

    /* renamed from: t */
    public final boolean mo24846t() {
        return this.f13610g == 0;
    }

    public final String toString() {
        Objects.ToStringHelper a = Objects.m16030a((Object) this);
        a.mo25372a("statusCode", m15244a(this.f13610g));
        a.mo25372a("resolution", this.f13611h);
        a.mo25372a("message", this.f13612i);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13609f);
        SafeParcelWriter.m16135a(parcel, 2, mo24840d());
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) mo24844p(), i, false);
        SafeParcelWriter.m16143a(parcel, 4, mo24843o(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    static String m15244a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
