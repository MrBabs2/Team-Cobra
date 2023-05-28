package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zznd extends zzmy {

    /* renamed from: b */
    public final zzmz f22332b = new zzmz();

    /* renamed from: c */
    public ByteBuffer f22333c;

    /* renamed from: d */
    public long f22334d;

    public zznd(int i) {
    }

    /* renamed from: a */
    public final void mo29540a() {
        super.mo29540a();
        ByteBuffer byteBuffer = this.f22333c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: d */
    public final void mo29552d(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f22333c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f22333c.position() + i;
            if (capacity < position) {
                m24914e(position);
                throw null;
            }
            return;
        }
        m24914e(i);
        throw null;
    }

    /* renamed from: e */
    public final boolean mo29553e() {
        return mo29545c(1073741824);
    }

    /* renamed from: e */
    private final ByteBuffer m24914e(int i) {
        ByteBuffer byteBuffer = this.f22333c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
