package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzay implements zzba {

    /* renamed from: b */
    private static Logger f18659b = Logger.getLogger(zzay.class.getName());

    /* renamed from: a */
    private ThreadLocal<ByteBuffer> f18660a = new C8201z5(this);

    /* renamed from: a */
    public final zzbd mo27827a(zzdsw zzdsw, zzbe zzbe) throws IOException {
        int read;
        long j;
        zzdsw zzdsw2 = zzdsw;
        zzbe zzbe2 = zzbe;
        long position = zzdsw.position();
        this.f18660a.get().rewind().limit(8);
        do {
            read = zzdsw2.read(this.f18660a.get());
            if (read == 8) {
                this.f18660a.get().rewind();
                long a = zzbc.m20574a(this.f18660a.get());
                byte[] bArr = null;
                if (a >= 8 || a <= 1) {
                    String f = zzbc.m20579f(this.f18660a.get());
                    if (a == 1) {
                        this.f18660a.get().limit(16);
                        zzdsw2.read(this.f18660a.get());
                        this.f18660a.get().position(8);
                        j = zzbc.m20576c(this.f18660a.get()) - 16;
                    } else {
                        j = a == 0 ? zzdsw.size() - zzdsw.position() : a - 8;
                    }
                    if ("uuid".equals(f)) {
                        this.f18660a.get().limit(this.f18660a.get().limit() + 16);
                        zzdsw2.read(this.f18660a.get());
                        bArr = new byte[16];
                        for (int position2 = this.f18660a.get().position() - 16; position2 < this.f18660a.get().position(); position2++) {
                            bArr[position2 - (this.f18660a.get().position() - 16)] = this.f18660a.get().get(position2);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    zzbd a2 = mo26768a(f, bArr, zzbe2 instanceof zzbd ? ((zzbd) zzbe2).getType() : "");
                    a2.mo27967a(zzbe2);
                    this.f18660a.get().rewind();
                    a2.mo27968a(zzdsw, this.f18660a.get(), j2, this);
                    return a2;
                }
                Logger logger = f18659b;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        zzdsw2.mo26733f(position);
        throw new EOFException();
    }

    /* renamed from: a */
    public abstract zzbd mo26768a(String str, byte[] bArr, String str2);
}
