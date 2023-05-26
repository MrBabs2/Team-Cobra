package com.facebook.internal.p173b0.p174e;

import com.facebook.internal.p173b0.C6399a;
import com.facebook.internal.p173b0.C6400b;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.facebook.internal.b0.e.c */
/* compiled from: MonitorLoggingQueue */
public class C6407c implements C6400b {

    /* renamed from: b */
    private static C6407c f11775b;

    /* renamed from: c */
    private static final Integer f11776c = 100;

    /* renamed from: a */
    private Queue<C6399a> f11777a = new LinkedList();

    private C6407c() {
    }

    /* renamed from: b */
    public static synchronized C6407c m13289b() {
        C6407c cVar;
        synchronized (C6407c.class) {
            if (f11775b == null) {
                f11775b = new C6407c();
            }
            cVar = f11775b;
        }
        return cVar;
    }

    /* renamed from: c */
    private boolean m13290c() {
        return this.f11777a.size() >= f11776c.intValue();
    }

    /* renamed from: a */
    public boolean mo20962a(Collection<? extends C6399a> collection) {
        if (collection != null) {
            this.f11777a.addAll(collection);
        }
        return m13290c();
    }

    public boolean isEmpty() {
        return this.f11777a.isEmpty();
    }

    /* renamed from: a */
    public C6399a mo20961a() {
        return this.f11777a.poll();
    }
}
