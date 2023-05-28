package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class zzjm implements zzkf {

    /* renamed from: a */
    private final AssetManager f22098a;

    /* renamed from: b */
    private final zzke f22099b;

    /* renamed from: c */
    private InputStream f22100c;

    /* renamed from: d */
    private long f22101d;

    /* renamed from: e */
    private boolean f22102e;

    public zzjm(Context context, zzke zzke) {
        this.f22098a = context.getAssets();
        this.f22099b = zzke;
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws zzjn {
        long j;
        try {
            zzjq.f22106a.toString();
            String path = zzjq.f22106a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f22098a.open(path, 1);
            this.f22100c = open;
            zzkh.m24659b(open.skip(zzjq.f22108c) == zzjq.f22108c);
            if (zzjq.f22109d == -1) {
                j = (long) this.f22100c.available();
            } else {
                j = zzjq.f22109d;
            }
            this.f22101d = j;
            if (j >= 0) {
                this.f22102e = true;
                zzke zzke = this.f22099b;
                if (zzke != null) {
                    zzke.mo29411a();
                }
                return this.f22101d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzjn(e);
        }
    }

    public final void close() throws zzjn {
        InputStream inputStream = this.f22100c;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.f22100c = null;
                if (this.f22102e) {
                    this.f22102e = false;
                    zzke zzke = this.f22099b;
                    if (zzke != null) {
                        zzke.mo29413b();
                    }
                }
            } catch (IOException e) {
                throw new zzjn(e);
            } catch (Throwable th) {
                this.f22100c = null;
                if (this.f22102e) {
                    this.f22102e = false;
                    zzke zzke2 = this.f22099b;
                    if (zzke2 != null) {
                        zzke2.mo29413b();
                    }
                }
                throw th;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws zzjn {
        long j = this.f22101d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f22100c.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f22101d -= (long) read;
                zzke zzke = this.f22099b;
                if (zzke != null) {
                    zzke.mo29412a(read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new zzjn(e);
        }
    }
}
