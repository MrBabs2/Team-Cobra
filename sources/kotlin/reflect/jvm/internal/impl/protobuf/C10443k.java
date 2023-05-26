package kotlin.reflect.jvm.internal.impl.protobuf;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.k */
/* compiled from: LazyFieldLite */
public class C10443k {

    /* renamed from: a */
    private C10417d f28269a;

    /* renamed from: b */
    private C10422f f28270b;

    /* renamed from: c */
    private volatile boolean f28271c;

    /* renamed from: d */
    protected volatile C10449o f28272d;

    /* renamed from: a */
    public int mo35792a() {
        if (this.f28271c) {
            return this.f28272d.mo34361e();
        }
        return this.f28269a.size();
    }

    /* renamed from: b */
    public C10449o mo35794b(C10449o oVar) {
        mo35793a(oVar);
        return this.f28272d;
    }

    /* renamed from: c */
    public C10449o mo35795c(C10449o oVar) {
        C10449o oVar2 = this.f28272d;
        this.f28272d = oVar;
        this.f28269a = null;
        this.f28271c = true;
        return oVar2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35793a(kotlin.reflect.jvm.internal.impl.protobuf.C10449o r3) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.o r0 = r2.f28272d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.o r0 = r2.f28272d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.f28269a     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            kotlin.reflect.jvm.internal.impl.protobuf.q r3 = r3.mo34363g()     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r2.f28269a     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = r2.f28270b     // Catch:{ IOException -> 0x0023 }
            java.lang.Object r3 = r3.mo35666a((kotlin.reflect.jvm.internal.impl.protobuf.C10417d) r0, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r1)     // Catch:{ IOException -> 0x0023 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r3 = (kotlin.reflect.jvm.internal.impl.protobuf.C10449o) r3     // Catch:{ IOException -> 0x0023 }
            r2.f28272d = r3     // Catch:{ IOException -> 0x0023 }
            goto L_0x0023
        L_0x0021:
            r2.f28272d = r3     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10443k.mo35793a(kotlin.reflect.jvm.internal.impl.protobuf.o):void");
    }
}
