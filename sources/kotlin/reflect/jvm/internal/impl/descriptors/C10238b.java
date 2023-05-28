package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b */
/* compiled from: CallableMemberDescriptor */
public interface C10238b extends C10230a, C10385v {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b$a */
    /* compiled from: CallableMemberDescriptor */
    public enum C10239a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean mo35424a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: a */
    C10238b mo35404a();

    /* renamed from: a */
    C10238b mo35421a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10239a aVar, boolean z);

    /* renamed from: a */
    void mo35422a(Collection<? extends C10238b> collection);

    /* renamed from: d */
    Collection<? extends C10238b> mo35406d();

    /* renamed from: g */
    C10239a mo35423g();
}
