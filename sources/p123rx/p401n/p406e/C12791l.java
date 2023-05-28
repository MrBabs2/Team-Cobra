package p123rx.p401n.p406e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;

/* renamed from: rx.n.e.l */
/* compiled from: SubscriptionList */
public final class C12791l implements C5375k {

    /* renamed from: f */
    private List<C5375k> f32990f;

    /* renamed from: g */
    private volatile boolean f32991g;

    public C12791l() {
    }

    /* renamed from: a */
    public void mo40914a(C5375k kVar) {
        if (!kVar.isUnsubscribed()) {
            if (!this.f32991g) {
                synchronized (this) {
                    if (!this.f32991g) {
                        List list = this.f32990f;
                        if (list == null) {
                            list = new LinkedList();
                            this.f32990f = list;
                        }
                        list.add(kVar);
                        return;
                    }
                }
            }
            kVar.unsubscribe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r3.unsubscribe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40915b(p123rx.C5375k r3) {
        /*
            r2 = this;
            boolean r0 = r2.f32991g
            if (r0 != 0) goto L_0x001e
            monitor-enter(r2)
            java.util.List<rx.k> r0 = r2.f32990f     // Catch:{ all -> 0x001b }
            boolean r1 = r2.f32991g     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            r3.unsubscribe()
            goto L_0x001e
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p406e.C12791l.mo40915b(rx.k):void");
    }

    public boolean isUnsubscribed() {
        return this.f32991g;
    }

    public void unsubscribe() {
        if (!this.f32991g) {
            synchronized (this) {
                if (!this.f32991g) {
                    this.f32991g = true;
                    List<C5375k> list = this.f32990f;
                    this.f32990f = null;
                    m41295a((Collection<C5375k>) list);
                }
            }
        }
    }

    public C12791l(C5375k... kVarArr) {
        this.f32990f = new LinkedList(Arrays.asList(kVarArr));
    }

    public C12791l(C5375k kVar) {
        LinkedList linkedList = new LinkedList();
        this.f32990f = linkedList;
        linkedList.add(kVar);
    }

    /* renamed from: a */
    private static void m41295a(Collection<C5375k> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (C5375k unsubscribe : collection) {
                try {
                    unsubscribe.unsubscribe();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            C12472a.m40943a((List<? extends Throwable>) arrayList);
        }
    }
}
