package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();
    @SafeParcelable.Field

    /* renamed from: f */
    private String f23659f;
    @SafeParcelable.Field

    /* renamed from: g */
    private DataHolder f23660g;
    @SafeParcelable.Field

    /* renamed from: h */
    private ParcelFileDescriptor f23661h;
    @SafeParcelable.Field

    /* renamed from: i */
    private long f23662i;
    @SafeParcelable.Field

    /* renamed from: j */
    private byte[] f23663j;

    /* renamed from: k */
    private byte[] f23664k;

    /* renamed from: l */
    private File f23665l;

    static {
        Class<SafeBrowsingData> cls = SafeBrowsingData.class;
    }

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.f23659f = str;
        this.f23660g = dataHolder;
        this.f23661h = parcelFileDescriptor;
        this.f23662i = j;
        this.f23663j = bArr;
    }

    /* renamed from: a */
    private static void m26852a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.FileOutputStream m26853u() {
        /*
            r5 = this;
            java.io.File r0 = r5.f23665l
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r5.f23661h = r3     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.delete()
        L_0x002e:
            throw r1
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.delete()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.m26853u():java.io.FileOutputStream");
    }

    /* renamed from: d */
    public DataHolder mo30650d() {
        return this.f23660g;
    }

    /* renamed from: o */
    public ParcelFileDescriptor mo30651o() {
        return this.f23661h;
    }

    /* renamed from: p */
    public long mo30652p() {
        return this.f23662i;
    }

    /* renamed from: q */
    public String mo30653q() {
        return this.f23659f;
    }

    /* renamed from: t */
    public byte[] mo30654t() {
        return this.f23663j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f23661h
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.f23664k
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.m26853u()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f23664k     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.f23664k     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            m26852a(r0)
            r0 = 1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            m26852a(r0)
            throw r4
        L_0x002e:
            m26852a(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            com.google.android.gms.safetynet.zzj.m26865a(r3, r4, r5)
            r4 = 0
            r3.f23661h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }
}
