package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzmr {
    /* renamed from: a */
    public static int m24862a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) << 5;
    }
}
