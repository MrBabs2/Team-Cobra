package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzaga;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzyf;
import com.google.android.gms.internal.ads.zzzs;
import com.google.android.gms.internal.ads.zzzt;

@SafeParcelable.Class
@zzard
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field
    private final boolean zzbqn;
    @SafeParcelable.Field
    private final zzzs zzbqo;
    private AppEventListener zzbqp;
    @SafeParcelable.Field
    private final IBinder zzbqq;

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzbqn = false;
        /* access modifiers changed from: private */
        public AppEventListener zzbqp;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbqp = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbqn = z;
            return this;
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.zzbqn = builder.zzbqn;
        AppEventListener zzb = builder.zzbqp;
        this.zzbqp = zzb;
        this.zzbqo = zzb != null ? new zzyf(this.zzbqp) : null;
        this.zzbqq = null;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbqp;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbqn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16146a(parcel, 1, getManualImpressionsEnabled());
        zzzs zzzs = this.zzbqo;
        SafeParcelWriter.m16138a(parcel, 2, zzzs == null ? null : zzzs.asBinder(), false);
        SafeParcelWriter.m16138a(parcel, 3, this.zzbqq, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    public final zzzs zzkt() {
        return this.zzbqo;
    }

    public final zzaga zzku() {
        return zzagb.m19167a(this.zzbqq);
    }

    @SafeParcelable.Constructor
    PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        this.zzbqn = z;
        this.zzbqo = iBinder != null ? zzzt.m25765a(iBinder) : null;
        this.zzbqq = iBinder2;
    }
}
