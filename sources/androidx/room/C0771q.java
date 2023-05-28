package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.room.q */
/* compiled from: SharedSQLiteStatement */
public abstract class C0771q {
    private final C0753j mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile C5173f mStmt;

    public C0771q(C0753j jVar) {
        this.mDatabase = jVar;
    }

    private C5173f createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private C5173f getStmt(boolean z) {
        if (!z) {
            return createNewStatement();
        }
        if (this.mStmt == null) {
            this.mStmt = createNewStatement();
        }
        return this.mStmt;
    }

    public C5173f acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    /* access modifiers changed from: protected */
    public abstract String createQuery();

    public void release(C5173f fVar) {
        if (fVar == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
