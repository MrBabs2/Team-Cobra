package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.room.c */
/* compiled from: EntityInsertionAdapter */
public abstract class C0731c<T> extends C0771q {
    public C0731c(C0753j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    public abstract void bind(C5173f fVar, T t);

    public final void insert(T t) {
        C5173f acquire = acquire();
        try {
            bind(acquire, t);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t) {
        C5173f acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        C5173f acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                jArr[i] = acquire.executeInsert();
                i++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        C5173f acquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                lArr[i] = Long.valueOf(acquire.executeInsert());
                i++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        C5173f acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                arrayList.add(i, Long.valueOf(acquire.executeInsert()));
                i++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] tArr) {
        C5173f acquire = acquire();
        try {
            for (T bind : tArr) {
                bind(acquire, bind);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        C5173f acquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                jArr[i] = acquire.executeInsert();
                i++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        C5173f acquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                lArr[i] = Long.valueOf(acquire.executeInsert());
                i++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        C5173f acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            for (Object bind : collection) {
                bind(acquire, bind);
                arrayList.add(i, Long.valueOf(acquire.executeInsert()));
                i++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        C5173f acquire = acquire();
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
