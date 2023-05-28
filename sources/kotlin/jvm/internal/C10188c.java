package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.C9178q;
import kotlin.p045h0.C9182t;
import kotlin.p215c0.C9101b;

/* renamed from: kotlin.jvm.internal.c */
/* compiled from: CallableReference */
public abstract class C10188c implements C9153b, Serializable {
    public static final Object NO_RECEIVER = C10189a.f27834f;
    protected final Object receiver;
    private transient C9153b reflected;

    /* renamed from: kotlin.jvm.internal.c$a */
    /* compiled from: CallableReference */
    private static class C10189a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C10189a f27834f = new C10189a();

        private C10189a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f27834f;
        }
    }

    public C10188c() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C9153b compute() {
        C9153b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C9153b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C9153b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public C9156e getOwner() {
        throw new AbstractMethodError();
    }

    public List<C9166k> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C9153b getReflected() {
        C9153b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C9101b();
    }

    public C9177p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public List<C9178q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C9182t getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C10188c(Object obj) {
        this.receiver = obj;
    }
}
