package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.C8887b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p112n.p312h.p313a.p318f0.C10761b;

/* renamed from: com.liulishuo.filedownloader.message.d */
/* compiled from: MessageSnapshotThreadPool */
public class C8891d {

    /* renamed from: a */
    private final List<C8892a> f25250a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8887b.C8889b f25251b;

    /* renamed from: com.liulishuo.filedownloader.message.d$a */
    /* compiled from: MessageSnapshotThreadPool */
    public class C8892a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<Integer> f25252a = new ArrayList();

        /* renamed from: b */
        private final Executor f25253b;

        /* renamed from: com.liulishuo.filedownloader.message.d$a$a */
        /* compiled from: MessageSnapshotThreadPool */
        class C8893a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ MessageSnapshot f25255f;

            C8893a(MessageSnapshot messageSnapshot) {
                this.f25255f = messageSnapshot;
            }

            public void run() {
                C8891d.this.f25251b.mo32715a(this.f25255f);
                C8892a.this.f25252a.remove(Integer.valueOf(this.f25255f.mo32709e()));
            }
        }

        public C8892a(int i) {
            this.f25253b = C10761b.m36477a(1, "Flow-" + i);
        }

        /* renamed from: a */
        public void mo32717a(int i) {
            this.f25252a.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        public void mo32718a(MessageSnapshot messageSnapshot) {
            this.f25253b.execute(new C8893a(messageSnapshot));
        }
    }

    C8891d(int i, C8887b.C8889b bVar) {
        this.f25251b = bVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f25250a.add(new C8892a(i2));
        }
    }

    /* renamed from: a */
    public void mo32716a(MessageSnapshot messageSnapshot) {
        C8892a aVar = null;
        try {
            synchronized (this.f25250a) {
                int e = messageSnapshot.mo32709e();
                Iterator<C8892a> it = this.f25250a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8892a next = it.next();
                    if (next.f25252a.contains(Integer.valueOf(e))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int i = 0;
                    Iterator<C8892a> it2 = this.f25250a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C8892a next2 = it2.next();
                        if (next2.f25252a.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (i == 0 || next2.f25252a.size() < i) {
                            i = next2.f25252a.size();
                            aVar = next2;
                        }
                    }
                }
                aVar.mo32717a(e);
            }
            aVar.mo32718a(messageSnapshot);
        } catch (Throwable th) {
            aVar.mo32718a(messageSnapshot);
            throw th;
        }
    }
}
