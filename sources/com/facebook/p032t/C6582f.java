package com.facebook.p032t;

import android.content.Context;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import com.facebook.p032t.C6564a;
import com.facebook.p032t.C6570c;
import com.facebook.p032t.p181u.C6650b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.t.f */
/* compiled from: AppEventStore */
class C6582f {

    /* renamed from: a */
    private static final String f12224a = "com.facebook.t.f";

    /* renamed from: com.facebook.t.f$a */
    /* compiled from: AppEventStore */
    private static class C6583a extends ObjectInputStream {
        public C6583a(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C6564a.C6566b.class);
            }
            return readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(C6570c.C6572b.class) : readClassDescriptor;
        }
    }

    C6582f() {
    }

    /* renamed from: a */
    public static synchronized void m13962a(C6564a aVar, C6600o oVar) {
        synchronized (C6582f.class) {
            C6650b.m14185b();
            C6597n a = m13961a();
            if (a.mo21345a(aVar)) {
                a.mo21346b(aVar).addAll(oVar.mo21351b());
            } else {
                a.mo21344a(aVar, oVar.mo21351b());
            }
            m13964a(a);
        }
    }

    /* renamed from: a */
    public static synchronized void m13963a(C6574d dVar) {
        synchronized (C6582f.class) {
            C6650b.m14185b();
            C6597n a = m13961a();
            for (C6564a next : dVar.mo21315b()) {
                a.mo21344a(next, dVar.mo21312a(next).mo21351b());
            }
            m13964a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.p032t.C6597n m13961a() {
        /*
            java.lang.Class<com.facebook.t.f> r0 = com.facebook.p032t.C6582f.class
            monitor-enter(r0)
            com.facebook.p032t.p181u.C6650b.m14185b()     // Catch:{ all -> 0x0091 }
            android.content.Context r1 = com.facebook.C4716f.m7696e()     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            com.facebook.t.f$a r4 = new com.facebook.t.f$a     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.t.n r3 = (com.facebook.p032t.C6597n) r3     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.internal.C6476x.m13504a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002e }
            r1.delete()     // Catch:{ Exception -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = f12224a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r2 = r3
            goto L_0x0088
        L_0x0038:
            r3 = move-exception
            goto L_0x0040
        L_0x003a:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x005e
        L_0x003e:
            r3 = move-exception
            r4 = r2
        L_0x0040:
            java.lang.String r5 = f12224a     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x005d }
            com.facebook.internal.C6476x.m13504a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0054 }
            r1.delete()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0088
        L_0x0054:
            r1 = move-exception
            java.lang.String r3 = f12224a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0059:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            com.facebook.internal.C6476x.m13504a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = f12224a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0073:
            throw r2     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r4 = r2
        L_0x0075:
            com.facebook.internal.C6476x.m13504a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            java.lang.String r3 = f12224a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0059
        L_0x0088:
            if (r2 != 0) goto L_0x008f
            com.facebook.t.n r2 = new com.facebook.t.n     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0095
        L_0x0094:
            throw r1
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.C6582f.m13961a():com.facebook.t.n");
    }

    /* renamed from: a */
    private static void m13964a(C6597n nVar) {
        Context e = C4716f.m7696e();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(e.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(nVar);
                C6476x.m13504a((Closeable) objectOutputStream2);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f12224a, "Got unexpected exception while persisting events: ", e);
                    try {
                        e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    C6476x.m13504a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C6476x.m13504a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C6476x.m13504a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.w(f12224a, "Got unexpected exception while persisting events: ", e);
            e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            C6476x.m13504a((Closeable) objectOutputStream);
        }
    }
}
