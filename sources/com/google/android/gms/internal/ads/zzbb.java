package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

public class zzbb extends zzdsu implements Closeable {
    static {
        zzdtc.m24221a(zzbb.class);
    }

    public zzbb(zzdsw zzdsw, zzba zzba) throws IOException {
        mo29212a(zzdsw, zzdsw.size(), zzba);
    }

    public void close() throws IOException {
        this.f21730g.close();
    }

    public String toString() {
        String obj = this.f21730g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
