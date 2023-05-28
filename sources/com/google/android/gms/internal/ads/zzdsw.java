package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface zzdsw extends Closeable {
    /* renamed from: a */
    ByteBuffer mo26731a(long j, long j2) throws IOException;

    void close() throws IOException;

    /* renamed from: f */
    void mo26733f(long j) throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
