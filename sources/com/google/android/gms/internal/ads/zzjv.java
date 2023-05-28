package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzjv implements zzkf {

    /* renamed from: a */
    private final zzke f22136a;

    /* renamed from: b */
    private RandomAccessFile f22137b;

    /* renamed from: c */
    private long f22138c;

    /* renamed from: d */
    private boolean f22139d;

    public zzjv() {
        this((zzke) null);
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws zzjw {
        long j;
        try {
            zzjq.f22106a.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(zzjq.f22106a.getPath(), "r");
            this.f22137b = randomAccessFile;
            randomAccessFile.seek(zzjq.f22108c);
            if (zzjq.f22109d == -1) {
                j = this.f22137b.length() - zzjq.f22108c;
            } else {
                j = zzjq.f22109d;
            }
            this.f22138c = j;
            if (j >= 0) {
                this.f22139d = true;
                zzke zzke = this.f22136a;
                if (zzke != null) {
                    zzke.mo29411a();
                }
                return this.f22138c;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzjw(e);
        }
    }

    public final void close() throws zzjw {
        RandomAccessFile randomAccessFile = this.f22137b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f22137b = null;
                if (this.f22139d) {
                    this.f22139d = false;
                    zzke zzke = this.f22136a;
                    if (zzke != null) {
                        zzke.mo29413b();
                    }
                }
            } catch (IOException e) {
                throw new zzjw(e);
            } catch (Throwable th) {
                this.f22137b = null;
                if (this.f22139d) {
                    this.f22139d = false;
                    zzke zzke2 = this.f22136a;
                    if (zzke2 != null) {
                        zzke2.mo29413b();
                    }
                }
                throw th;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws zzjw {
        long j = this.f22138c;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f22137b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f22138c -= (long) read;
                zzke zzke = this.f22136a;
                if (zzke != null) {
                    zzke.mo29412a(read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new zzjw(e);
        }
    }

    public zzjv(zzke zzke) {
        this.f22136a = zzke;
    }
}
