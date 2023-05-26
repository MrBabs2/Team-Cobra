package kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q;

import java.util.Collection;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.h.q.j */
/* compiled from: ResolutionScope.kt */
public interface C10101j {

    /* renamed from: kotlin.h0.u.e.k0.h.q.j$a */
    /* compiled from: ResolutionScope.kt */
    public static final class C10102a {
        /* renamed from: a */
        public static /* synthetic */ Collection m34010a(C10101j jVar, C10088d dVar, C9113l<C9939f, Boolean> lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = C10088d.f27698n;
                }
                if ((i & 2) != 0) {
                    lVar = C10096h.f27718a.mo35313a();
                }
                return jVar.mo33914a(dVar, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: a */
    Collection<C10359m> mo33914a(C10088d dVar, C9113l<? super C9939f, Boolean> lVar);

    /* renamed from: b */
    C10349h mo33917b(C9939f fVar, C9398b bVar);
}
