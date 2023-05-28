package com.facebook.internal.p173b0.p174e;

import android.content.Context;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import com.facebook.internal.p173b0.C6399a;
import com.facebook.internal.p173b0.C6402d;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.facebook.internal.b0.e.d */
/* compiled from: MonitorLoggingStore */
public class C6408d implements C6402d {

    /* renamed from: a */
    private static C6408d f11778a;

    private C6408d() {
    }

    /* renamed from: b */
    public static synchronized C6408d m13293b() {
        C6408d dVar;
        synchronized (C6408d.class) {
            if (f11778a == null) {
                f11778a = new C6408d();
            }
            dVar = f11778a;
        }
        return dVar;
    }

    /* renamed from: a */
    public Collection<C6399a> mo20965a() {
        ArrayList arrayList = new ArrayList();
        Context e = C4716f.m7696e();
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new BufferedInputStream(e.openFileInput("facebooksdk.monitoring.persistedlogs")));
            try {
                Collection<C6399a> collection = (Collection) objectInputStream2.readObject();
                C6476x.m13504a((Closeable) objectInputStream2);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused) {
                }
                return collection;
            } catch (Exception unused2) {
                objectInputStream = objectInputStream2;
                C6476x.m13504a((Closeable) objectInputStream);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                    return arrayList;
                } catch (Exception unused3) {
                    return arrayList;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream = objectInputStream2;
                C6476x.m13504a((Closeable) objectInputStream);
                try {
                    e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
            C6476x.m13504a((Closeable) objectInputStream);
            e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            C6476x.m13504a((Closeable) objectInputStream);
            e.getFileStreamPath("facebooksdk.monitoring.persistedlogs").delete();
            throw th;
        }
    }
}
