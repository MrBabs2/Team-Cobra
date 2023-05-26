package com.flurry.sdk;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.flurry.sdk.t1 */
public final class C7026t1<ObjectType> extends C7016s1<ObjectType> {
    public C7026t1(C7048v1<ObjectType> v1Var) {
        super(v1Var);
    }

    /* renamed from: a */
    public final void mo23605a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                try {
                    super.mo23605a(gZIPOutputStream2, objecttype);
                    C6766c2.m14420a((Closeable) gZIPOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C6766c2.m14420a((Closeable) gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C6766c2.m14420a((Closeable) gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final ObjectType mo23604a(InputStream inputStream) throws IOException {
        GZIPInputStream gZIPInputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
            try {
                ObjectType a = super.mo23604a(gZIPInputStream2);
                C6766c2.m14420a((Closeable) gZIPInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                C6766c2.m14420a((Closeable) gZIPInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C6766c2.m14420a((Closeable) gZIPInputStream);
            throw th;
        }
    }
}
