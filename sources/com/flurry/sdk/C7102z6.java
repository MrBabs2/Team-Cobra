package com.flurry.sdk;

import com.flurry.sdk.C6868i2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.flurry.sdk.z6 */
public final class C7102z6 extends C6916l2 implements C7094y6 {

    /* renamed from: n */
    public C6745a7 f13375n = null;

    /* renamed from: o */
    public C7055v6 f13376o;

    /* renamed from: com.flurry.sdk.z6$a */
    public class C7103a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7094y6 f13377h;

        public C7103a(C7094y6 y6Var) {
            this.f13377h = y6Var;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6745a7 unused = C7102z6.this.f13375n = new C6745a7(C6988q2.m14842b(), this.f13377h);
            C7102z6.this.f13375n.startWatching();
        }
    }

    /* renamed from: com.flurry.sdk.z6$b */
    class C7104b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ List f13379h;

        C7104b(List list) {
            this.f13379h = list;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6792d1.m14476a(2, "VNodeFileProcessor", "Number of files already pending: in VNodeListener " + this.f13379h.size());
            ArrayList arrayList = new ArrayList();
            for (File file : this.f13379h) {
                if (file.exists()) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
            if (C7102z6.this.f13376o != null) {
                C7102z6.this.f13376o.mo23624a(arrayList);
            }
        }
    }

    public C7102z6(C7055v6 v6Var) {
        super("VNodeFileProcessor", C6868i2.m14604a(C6868i2.C6870b.DATA_PROCESSOR));
        this.f13376o = v6Var;
    }

    /* renamed from: a */
    public final void mo23749a(List<File> list) {
        if (list != null && list.size() != 0) {
            mo23563c(new C7104b(list));
        }
    }

    /* renamed from: a */
    public final void mo23740a(String str) {
        String b = C6988q2.m14842b();
        File file = new File(b + File.separator + str);
        if (file.exists()) {
            mo23749a((List<File>) Arrays.asList(new File[]{file}));
        }
    }
}
