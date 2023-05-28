package com.liulishuo.filedownloader.message;

/* renamed from: com.liulishuo.filedownloader.message.b */
/* compiled from: MessageSnapshotFlow */
public class C8887b {

    /* renamed from: a */
    private volatile C8891d f25247a;

    /* renamed from: b */
    private volatile C8889b f25248b;

    /* renamed from: com.liulishuo.filedownloader.message.b$a */
    /* compiled from: MessageSnapshotFlow */
    public static final class C8888a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8887b f25249a = new C8887b();
    }

    /* renamed from: com.liulishuo.filedownloader.message.b$b */
    /* compiled from: MessageSnapshotFlow */
    public interface C8889b {
        /* renamed from: a */
        void mo32715a(MessageSnapshot messageSnapshot);
    }

    /* renamed from: a */
    public static C8887b m29133a() {
        return C8888a.f25249a;
    }

    /* renamed from: a */
    public void mo32714a(C8889b bVar) {
        this.f25248b = bVar;
        if (bVar == null) {
            this.f25247a = null;
        } else {
            this.f25247a = new C8891d(5, bVar);
        }
    }

    /* renamed from: a */
    public void mo32713a(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof C8886a) {
            if (this.f25248b != null) {
                this.f25248b.mo32715a(messageSnapshot);
            }
        } else if (this.f25247a != null) {
            this.f25247a.mo32716a(messageSnapshot);
        }
    }
}
