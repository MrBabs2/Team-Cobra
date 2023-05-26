package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

public final class zzib implements zzie {

    /* renamed from: c */
    private static final byte[] f22001c = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: a */
    private final zzjp f22002a;

    /* renamed from: b */
    private long f22003b;

    public zzib(zzjp zzjp, long j, long j2) {
        this.f22002a = zzjp;
        this.f22003b = j;
    }

    /* renamed from: a */
    public final boolean mo29369a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3 = i2;
        while (i3 > 0) {
            if (!Thread.interrupted()) {
                int read = this.f22002a.read(bArr, i, i3);
                if (read != -1) {
                    i += read;
                    i3 -= read;
                } else if (z && i3 == i2) {
                    return false;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f22003b += (long) i2;
        return true;
    }

    public final long getPosition() {
        return this.f22003b;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo29369a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final void mo29368a(int i) throws IOException, InterruptedException {
        int i2 = i;
        while (i2 > 0) {
            if (!Thread.interrupted()) {
                zzjp zzjp = this.f22002a;
                byte[] bArr = f22001c;
                int read = zzjp.read(bArr, 0, Math.min(bArr.length, i2));
                if (read != -1) {
                    i2 -= read;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f22003b += (long) i;
    }
}
