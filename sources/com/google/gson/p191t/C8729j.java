package com.google.gson.p191t;

import com.google.gson.C8679j;
import com.google.gson.p191t.p192l.C8765n;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.t.j */
/* compiled from: Streams */
public final class C8729j {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C8680k.f24745a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C8679j m28504a(com.google.gson.stream.C8691a r2) throws com.google.gson.JsonParseException {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.q<com.google.gson.j> r1 = com.google.gson.p191t.p192l.C8765n.f24935X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo32314a((com.google.gson.stream.C8691a) r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.j r2 = (com.google.gson.C8679j) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.k r2 = com.google.gson.C8680k.f24745a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.C8729j.m28504a(com.google.gson.stream.a):com.google.gson.j");
    }

    /* renamed from: com.google.gson.t.j$a */
    /* compiled from: Streams */
    private static final class C8730a extends Writer {

        /* renamed from: f */
        private final Appendable f24846f;

        /* renamed from: g */
        private final C8731a f24847g = new C8731a();

        /* renamed from: com.google.gson.t.j$a$a */
        /* compiled from: Streams */
        static class C8731a implements CharSequence {

            /* renamed from: f */
            char[] f24848f;

            C8731a() {
            }

            public char charAt(int i) {
                return this.f24848f[i];
            }

            public int length() {
                return this.f24848f.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f24848f, i, i2 - i);
            }
        }

        C8730a(Appendable appendable) {
            this.f24846f = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C8731a aVar = this.f24847g;
            aVar.f24848f = cArr;
            this.f24846f.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f24846f.append((char) i);
        }
    }

    /* renamed from: a */
    public static void m28506a(C8679j jVar, C8694c cVar) throws IOException {
        C8765n.f24935X.mo32316a(cVar, jVar);
    }

    /* renamed from: a */
    public static Writer m28505a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C8730a(appendable);
    }
}
