package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f14284f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final C7218b f14285g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final boolean f14286h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f14287i;

    @SafeParcelable.Constructor
    zzk(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f14284f = str;
        this.f14285g = m16319a(iBinder);
        this.f14286h = z;
        this.f14287i = z2;
    }

    /* renamed from: a */
    private static C7218b m16319a(IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper D = zzj.m16176a(iBinder).mo25213D();
            if (D == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.m16390H(D);
            }
            if (bArr != null) {
                return new C7219c(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, this.f14284f, false);
        C7218b bVar = this.f14285g;
        if (bVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            bVar = null;
        } else {
            bVar.asBinder();
        }
        SafeParcelWriter.m16138a(parcel, 2, (IBinder) bVar, false);
        SafeParcelWriter.m16146a(parcel, 3, this.f14286h);
        SafeParcelWriter.m16146a(parcel, 4, this.f14287i);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
