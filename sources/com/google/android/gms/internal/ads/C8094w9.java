package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

@zzard
/* renamed from: com.google.android.gms.internal.ads.w9 */
final class C8094w9 implements zzdsw {

    /* renamed from: f */
    private final ByteBuffer f17077f;

    C8094w9(ByteBuffer byteBuffer) {
        this.f17077f = byteBuffer.duplicate();
    }

    /* renamed from: a */
    public final ByteBuffer mo26731a(long j, long j2) throws IOException {
        int position = this.f17077f.position();
        this.f17077f.position((int) j);
        ByteBuffer slice = this.f17077f.slice();
        slice.limit((int) j2);
        this.f17077f.position(position);
        return slice;
    }

    public final void close() throws IOException {
    }

    /* renamed from: f */
    public final void mo26733f(long j) throws IOException {
        this.f17077f.position((int) j);
    }

    public final long position() throws IOException {
        return (long) this.f17077f.position();
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f17077f.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f17077f.remaining());
        byte[] bArr = new byte[min];
        this.f17077f.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long size() throws IOException {
        return (long) this.f17077f.limit();
    }
}
