package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.c0 */
/* compiled from: ReceiverParameterDescriptorImpl */
public class C10285c0 extends C10284c {

    /* renamed from: i */
    private final C10359m f27967i;

    /* renamed from: j */
    private final C10116e f27968j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10285c0(C10359m mVar, C10116e eVar, C10249g gVar) {
        super(gVar);
        if (mVar == null) {
            m34391a(0);
            throw null;
        } else if (eVar == null) {
            m34391a(1);
            throw null;
        } else if (gVar != null) {
            this.f27967i = mVar;
            this.f27968j = eVar;
        } else {
            m34391a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34391a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = DonationsAnalytics.VALUE;
        } else if (i == 2) {
            objArr[0] = "annotations";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else if (i != 5) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        C10359m mVar = this.f27967i;
        if (mVar != null) {
            return mVar;
        }
        m34391a(4);
        throw null;
    }

    public C10116e getValue() {
        C10116e eVar = this.f27968j;
        if (eVar != null) {
            return eVar;
        }
        m34391a(3);
        throw null;
    }
}
