package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class zzdss extends zzdsu implements zzbd {

    /* renamed from: m */
    private String f21725m;

    /* renamed from: n */
    private boolean f21726n;

    public zzdss(String str) {
        this.f21725m = str;
    }

    /* renamed from: a */
    public final void mo27967a(zzbe zzbe) {
    }

    /* renamed from: a */
    public final void mo27968a(zzdsw zzdsw, ByteBuffer byteBuffer, long j, zzba zzba) throws IOException {
        zzdsw.position();
        byteBuffer.remaining();
        this.f21726n = byteBuffer.remaining() == 16;
        mo29212a(zzdsw, j, zzba);
    }

    public final String getType() {
        return this.f21725m;
    }

    /* renamed from: a */
    public final void mo29212a(zzdsw zzdsw, long j, zzba zzba) throws IOException {
        this.f21730g = zzdsw;
        this.f21732i = zzdsw.position();
        if (!this.f21726n) {
            int i = ((8 + j) > 4294967296L ? 1 : ((8 + j) == 4294967296L ? 0 : -1));
        }
        zzdsw.mo26733f(zzdsw.position() + j);
        this.f21733j = zzdsw.position();
        this.f21729f = zzba;
    }
}
