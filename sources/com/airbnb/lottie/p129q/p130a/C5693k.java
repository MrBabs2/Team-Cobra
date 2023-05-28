package com.airbnb.lottie.p129q.p130a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.p133s.p135j.C5752h;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.q.a.k */
/* compiled from: MergePathsContent */
public class C5693k implements C5695l, C5691i {

    /* renamed from: a */
    private final Path f10128a = new Path();

    /* renamed from: b */
    private final Path f10129b = new Path();

    /* renamed from: c */
    private final Path f10130c = new Path();

    /* renamed from: d */
    private final String f10131d;

    /* renamed from: e */
    private final List<C5695l> f10132e = new ArrayList();

    /* renamed from: f */
    private final C5752h f10133f;

    /* renamed from: com.airbnb.lottie.q.a.k$a */
    /* compiled from: MergePathsContent */
    static /* synthetic */ class C5694a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.s.j.h$a[] r0 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10134a = r0
                com.airbnb.lottie.s.j.h$a r1 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.Merge     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.s.j.h$a r1 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.Add     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.s.j.h$a r1 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.Subtract     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.s.j.h$a r1 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.Intersect     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10134a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.s.j.h$a r1 = com.airbnb.lottie.p133s.p135j.C5752h.C5753a.ExcludeIntersections     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p129q.p130a.C5693k.C5694a.<clinit>():void");
        }
    }

    public C5693k(C5752h hVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10131d = hVar.mo19604b();
            this.f10133f = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19500a(java.util.ListIterator<com.airbnb.lottie.p129q.p130a.C5684b> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.q.a.b r0 = (com.airbnb.lottie.p129q.p130a.C5684b) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.p129q.p130a.C5695l
            if (r1 == 0) goto L_0x000d
            java.util.List<com.airbnb.lottie.q.a.l> r1 = r2.f10132e
            com.airbnb.lottie.q.a.l r0 = (com.airbnb.lottie.p129q.p130a.C5695l) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p129q.p130a.C5693k.mo19500a(java.util.ListIterator):void");
    }

    public String getName() {
        return this.f10131d;
    }

    public Path getPath() {
        this.f10130c.reset();
        int i = C5694a.f10134a[this.f10133f.mo19603a().ordinal()];
        if (i == 1) {
            m10928a();
        } else if (i == 2) {
            m10929a(Path.Op.UNION);
        } else if (i == 3) {
            m10929a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m10929a(Path.Op.INTERSECT);
        } else if (i == 5) {
            m10929a(Path.Op.XOR);
        }
        return this.f10130c;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < this.f10132e.size(); i++) {
            this.f10132e.get(i).mo19495a(list, list2);
        }
    }

    /* renamed from: a */
    private void m10928a() {
        for (int i = 0; i < this.f10132e.size(); i++) {
            this.f10130c.addPath(this.f10132e.get(i).getPath());
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m10929a(Path.Op op) {
        this.f10129b.reset();
        this.f10128a.reset();
        for (int size = this.f10132e.size() - 1; size >= 1; size--) {
            C5695l lVar = this.f10132e.get(size);
            if (lVar instanceof C5685c) {
                C5685c cVar = (C5685c) lVar;
                List<C5695l> b = cVar.mo19497b();
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    Path path = b.get(size2).getPath();
                    path.transform(cVar.mo19498c());
                    this.f10129b.addPath(path);
                }
            } else {
                this.f10129b.addPath(lVar.getPath());
            }
        }
        C5695l lVar2 = this.f10132e.get(0);
        if (lVar2 instanceof C5685c) {
            C5685c cVar2 = (C5685c) lVar2;
            List<C5695l> b2 = cVar2.mo19497b();
            for (int i = 0; i < b2.size(); i++) {
                Path path2 = b2.get(i).getPath();
                path2.transform(cVar2.mo19498c());
                this.f10128a.addPath(path2);
            }
        } else {
            this.f10128a.set(lVar2.getPath());
        }
        this.f10130c.op(this.f10128a, this.f10129b, op);
    }
}
