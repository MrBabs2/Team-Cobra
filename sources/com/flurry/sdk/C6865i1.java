package com.flurry.sdk;

import com.flurry.sdk.C6897k1;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.i1 */
public final class C6865i1<RequestObjectType, ResponseObjectType> extends C6897k1 {

    /* renamed from: C */
    public C6867b<RequestObjectType, ResponseObjectType> f12842C;

    /* renamed from: D */
    public RequestObjectType f12843D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ResponseObjectType f12844E;

    /* renamed from: F */
    public C7048v1<RequestObjectType> f12845F;

    /* renamed from: G */
    public C7048v1<ResponseObjectType> f12846G;

    /* renamed from: com.flurry.sdk.i1$b */
    public interface C6867b<RequestObjectType, ResponseObjectType> {
        /* renamed from: a */
        void mo23611a(C6865i1<RequestObjectType, ResponseObjectType> i1Var, ResponseObjectType responseobjecttype);
    }

    /* renamed from: d */
    static /* synthetic */ void m14598d(C6865i1 i1Var) {
        if (i1Var.f12842C != null && !i1Var.mo23634c()) {
            i1Var.f12842C.mo23611a(i1Var, i1Var.f12844E);
        }
    }

    /* renamed from: com.flurry.sdk.i1$a */
    class C6866a implements C6897k1.C6901d {
        C6866a() {
        }

        /* renamed from: a */
        public final void mo23610a(OutputStream outputStream) throws Exception {
            if (C6865i1.this.f12843D != null && C6865i1.this.f12845F != null) {
                C6865i1.this.f12845F.mo23605a(outputStream, C6865i1.this.f12843D);
            }
        }

        /* renamed from: a */
        public final void mo23609a(InputStream inputStream) throws Exception {
            if (C6865i1.this.f12846G != null) {
                C6865i1 i1Var = C6865i1.this;
                Object unused = i1Var.f12844E = i1Var.f12846G.mo23604a(inputStream);
            }
        }

        /* renamed from: a */
        public final void mo23608a() {
            C6865i1.m14598d(C6865i1.this);
        }
    }

    /* renamed from: a */
    public final void mo23531a() {
        this.f12913q = new C6866a();
        super.mo23531a();
    }
}
