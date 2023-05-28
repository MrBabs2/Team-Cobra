package p120q.p326a.p329d0.p345j;

import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10862p;

/* renamed from: q.a.d0.j.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C11425a<T> {

    /* renamed from: a */
    final int f30608a;

    /* renamed from: b */
    final Object[] f30609b;

    /* renamed from: c */
    Object[] f30610c;

    /* renamed from: d */
    int f30611d;

    /* renamed from: q.a.d0.j.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C11426a<T> extends C10862p<T> {
        /* renamed from: a */
        boolean mo36663a(T t);
    }

    public C11425a(int i) {
        this.f30608a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f30609b = objArr;
        this.f30610c = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37163a(T r4) {
        /*
            r3 = this;
            int r0 = r3.f30608a
            int r1 = r3.f30611d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f30610c
            r2[r0] = r1
            r3.f30610c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f30610c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f30611d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p345j.C11425a.mo37163a(java.lang.Object):void");
    }

    /* renamed from: b */
    public void mo37166b(T t) {
        this.f30609b[0] = t;
    }

    /* renamed from: a */
    public void mo37164a(C11426a<? super T> aVar) {
        int i = this.f30608a;
        for (Object[] objArr = this.f30609b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.mo36663a(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public <U> boolean mo37165a(C11490u<? super U> uVar) {
        Object[] objArr = this.f30609b;
        int i = this.f30608a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C11439m.m37480b(objArr2, uVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
