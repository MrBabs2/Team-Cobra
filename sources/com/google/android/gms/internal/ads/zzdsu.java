package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzdsu implements zzbe, Closeable, Iterator<zzbd> {

    /* renamed from: l */
    private static final zzbd f21728l = new C7601iy("eof ");

    /* renamed from: f */
    protected zzba f21729f;

    /* renamed from: g */
    protected zzdsw f21730g;

    /* renamed from: h */
    private zzbd f21731h = null;

    /* renamed from: i */
    long f21732i = 0;

    /* renamed from: j */
    long f21733j = 0;

    /* renamed from: k */
    private List<zzbd> f21734k = new ArrayList();

    static {
        zzdtc.m24221a(zzdsu.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final zzbd next() {
        zzbd a;
        zzbd zzbd = this.f21731h;
        if (zzbd == null || zzbd == f21728l) {
            zzdsw zzdsw = this.f21730g;
            if (zzdsw == null || this.f21732i >= this.f21733j) {
                this.f21731h = f21728l;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzdsw) {
                    this.f21730g.mo26733f(this.f21732i);
                    a = this.f21729f.mo27827a(this.f21730g, this);
                    this.f21732i = this.f21730g.position();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f21731h = null;
            return zzbd;
        }
    }

    /* renamed from: a */
    public final List<zzbd> mo29215a() {
        if (this.f21730g == null || this.f21731h == f21728l) {
            return this.f21734k;
        }
        return new zzdta(this.f21734k, this);
    }

    public void close() throws IOException {
        this.f21730g.close();
    }

    public boolean hasNext() {
        zzbd zzbd = this.f21731h;
        if (zzbd == f21728l) {
            return false;
        }
        if (zzbd != null) {
            return true;
        }
        try {
            this.f21731h = (zzbd) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f21731h = f21728l;
            return false;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f21734k.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f21734k.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29212a(zzdsw zzdsw, long j, zzba zzba) throws IOException {
        this.f21730g = zzdsw;
        this.f21732i = zzdsw.position();
        zzdsw.mo26733f(zzdsw.position() + j);
        this.f21733j = zzdsw.position();
        this.f21729f = zzba;
    }
}
