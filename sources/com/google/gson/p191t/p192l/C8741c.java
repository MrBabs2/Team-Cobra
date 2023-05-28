package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.gson.t.l.c */
/* compiled from: DateTypeAdapter */
public final class C8741c extends C8688q<Date> {

    /* renamed from: c */
    public static final C8690r f24860c = new C8742a();

    /* renamed from: a */
    private final DateFormat f24861a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b */
    private final DateFormat f24862b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: com.google.gson.t.l.c$a */
    /* compiled from: DateTypeAdapter */
    static class C8742a implements C8690r {
        C8742a() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new C8741c();
            }
            return null;
        }
    }

    /* renamed from: a */
    public Date m28524a(C8691a aVar) throws IOException {
        if (aVar.peek() != C8693b.NULL) {
            return m28522a(aVar.mo32378y());
        }
        aVar.mo32377x();
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return com.google.gson.p191t.p192l.p193o.C8804a.m28736a(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        throw new com.google.gson.JsonSyntaxException(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r2.f24861a.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.Date m28522a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f24862b     // Catch:{ ParseException -> 0x000b }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x0026
        L_0x000b:
            java.text.DateFormat r0 = r2.f24861a     // Catch:{ ParseException -> 0x0013 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0013 }
            monitor-exit(r2)
            return r3
        L_0x0013:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x001f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x001f }
            java.util.Date r3 = com.google.gson.p191t.p192l.p193o.C8804a.m28736a((java.lang.String) r3, (java.text.ParsePosition) r0)     // Catch:{ ParseException -> 0x001f }
            monitor-exit(r2)
            return r3
        L_0x001f:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch:{ all -> 0x0009 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8741c.m28522a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public synchronized void mo32316a(C8694c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo32400p();
        } else {
            cVar.mo32394e(this.f24861a.format(date));
        }
    }
}
