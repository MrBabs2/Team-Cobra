package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzaru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzarw();
    @SafeParcelable.Field

    /* renamed from: f */
    private ParcelFileDescriptor f18435f;

    /* renamed from: g */
    private Parcelable f18436g = null;

    /* renamed from: h */
    private boolean f18437h = true;

    @SafeParcelable.Constructor
    public zzaru(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f18435f = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final ParcelFileDescriptor m19887d() {
        if (this.f18435f == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f18436g.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f18435f = m19886a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f18435f;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo27593a(Parcelable.Creator<T> creator) {
        if (this.f18437h) {
            if (this.f18435f == null) {
                zzbad.m20519b("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f18435f));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                IOUtils.m16280a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f18436g = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f18437h = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                zzbad.m20520b("Could not read from parcel file descriptor", e);
                IOUtils.m16280a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                IOUtils.m16280a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f18436g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m19887d();
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16140a(parcel, 2, (Parcelable) this.f18435f, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m19886a(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C7903r3(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                zzbad.m20520b("Error transporting the ad response", e);
                zzk.zzlk().mo27734a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.m16280a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            zzbad.m20520b("Error transporting the ad response", e);
            zzk.zzlk().mo27734a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            IOUtils.m16280a(autoCloseOutputStream);
            return null;
        }
    }
}
