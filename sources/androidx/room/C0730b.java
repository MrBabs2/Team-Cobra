package androidx.room;

import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.room.b */
/* compiled from: EntityDeletionOrUpdateAdapter */
public abstract class C0730b<T> extends C0771q {
    public C0730b(C0753j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    public abstract void bind(C5173f fVar, T t);

    /* access modifiers changed from: protected */
    public abstract String createQuery();

    public final int handle(T t) {
        C5173f acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        C5173f acquire = acquire();
        int i = 0;
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        C5173f acquire = acquire();
        try {
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
