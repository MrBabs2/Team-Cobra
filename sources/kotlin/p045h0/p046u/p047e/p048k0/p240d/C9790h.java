package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.h */
/* compiled from: ProtoBuf */
public final class C9790h extends C10427h.C10431d<C9790h> implements C9794i {

    /* renamed from: n */
    private static final C9790h f26926n;

    /* renamed from: o */
    public static C10452q<C9790h> f26927o = new C9791a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f26928g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26929h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f26930i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C9831p0> f26931j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<Integer> f26932k;

    /* renamed from: l */
    private byte f26933l;

    /* renamed from: m */
    private int f26934m;

    /* renamed from: kotlin.h0.u.e.k0.d.h$a */
    /* compiled from: ProtoBuf */
    static class C9791a extends C10413b<C9790h> {
        C9791a() {
        }

        /* renamed from: a */
        public C9790h m32040a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9790h(eVar, fVar);
        }
    }

    static {
        C9790h hVar = new C9790h(true);
        f26926n = hVar;
        hVar.m32022r();
    }

    /* renamed from: d */
    public static C9792b m32020d(C9790h hVar) {
        C9792b s = m32023s();
        s.mo34582a(hVar);
        return s;
    }

    /* renamed from: q */
    public static C9790h m32021q() {
        return f26926n;
    }

    /* renamed from: r */
    private void m32022r() {
        this.f26930i = 6;
        this.f26931j = Collections.emptyList();
        this.f26932k = Collections.emptyList();
    }

    /* renamed from: s */
    public static C9792b m32023s() {
        return C9792b.m32042m();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26934m;
        if (i != -1) {
            return i;
        }
        int f = (this.f26929h & 1) == 1 ? CodedOutputStream.m35133f(1, this.f26930i) + 0 : 0;
        for (int i2 = 0; i2 < this.f26931j.size(); i2++) {
            f += CodedOutputStream.m35130d(2, (C10449o) this.f26931j.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f26932k.size(); i4++) {
            i3 += CodedOutputStream.m35140l(this.f26932k.get(i4).intValue());
        }
        int size = f + i3 + (mo34580o().size() * 2) + mo35770j() + this.f26928g.size();
        this.f26934m = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9790h> mo34363g() {
        return f26927o;
    }

    public final boolean isInitialized() {
        byte b = this.f26933l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34578m(); i++) {
            if (!mo34576a(i).isInitialized()) {
                this.f26933l = 0;
                return false;
            }
        }
        if (!mo35769i()) {
            this.f26933l = 0;
            return false;
        }
        this.f26933l = 1;
        return true;
    }

    /* renamed from: l */
    public int mo34577l() {
        return this.f26930i;
    }

    /* renamed from: m */
    public int mo34578m() {
        return this.f26931j.size();
    }

    /* renamed from: n */
    public List<C9831p0> mo34579n() {
        return this.f26931j;
    }

    /* renamed from: o */
    public List<Integer> mo34580o() {
        return this.f26932k;
    }

    /* renamed from: p */
    public boolean mo34581p() {
        return (this.f26929h & 1) == 1;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.h$b */
    /* compiled from: ProtoBuf */
    public static final class C9792b extends C10427h.C10430c<C9790h, C9792b> implements C9794i {

        /* renamed from: i */
        private int f26935i;

        /* renamed from: j */
        private int f26936j = 6;

        /* renamed from: k */
        private List<C9831p0> f26937k = Collections.emptyList();

        /* renamed from: l */
        private List<Integer> f26938l = Collections.emptyList();

        private C9792b() {
            m32045r();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static C9792b m32042m() {
            return new C9792b();
        }

        /* renamed from: n */
        private void m32043n() {
            if ((this.f26935i & 2) != 2) {
                this.f26937k = new ArrayList(this.f26937k);
                this.f26935i |= 2;
            }
        }

        /* renamed from: q */
        private void m32044q() {
            if ((this.f26935i & 4) != 4) {
                this.f26938l = new ArrayList(this.f26938l);
                this.f26935i |= 4;
            }
        }

        /* renamed from: r */
        private void m32045r() {
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34503k(); i++) {
                if (!mo34583a(i).isInitialized()) {
                    return false;
                }
            }
            if (!mo35764i()) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public C9790h mo34502j() {
            C9790h hVar = new C9790h((C10427h.C10430c) this);
            int i = 1;
            if ((this.f26935i & 1) != 1) {
                i = 0;
            }
            int unused = hVar.f26930i = this.f26936j;
            if ((this.f26935i & 2) == 2) {
                this.f26937k = Collections.unmodifiableList(this.f26937k);
                this.f26935i &= -3;
            }
            List unused2 = hVar.f26931j = this.f26937k;
            if ((this.f26935i & 4) == 4) {
                this.f26938l = Collections.unmodifiableList(this.f26938l);
                this.f26935i &= -5;
            }
            List unused3 = hVar.f26932k = this.f26938l;
            int unused4 = hVar.f26929h = i;
            return hVar;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f26937k.size();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34582a((C9790h) hVar);
            return this;
        }

        /* renamed from: b */
        public C9790h m32057b() {
            return C9790h.m32021q();
        }

        public C9792b clone() {
            C9792b m = m32042m();
            m.mo34582a(mo34502j());
            return m;
        }

        /* renamed from: b */
        public C9792b mo34584b(int i) {
            this.f26935i |= 1;
            this.f26936j = i;
            return this;
        }

        /* renamed from: a */
        public C9790h m32053a() {
            C9790h j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9792b mo34582a(C9790h hVar) {
            if (hVar == C9790h.m32021q()) {
                return this;
            }
            if (hVar.mo34581p()) {
                mo34584b(hVar.mo34577l());
            }
            if (!hVar.f26931j.isEmpty()) {
                if (this.f26937k.isEmpty()) {
                    this.f26937k = hVar.f26931j;
                    this.f26935i &= -3;
                } else {
                    m32043n();
                    this.f26937k.addAll(hVar.f26931j);
                }
            }
            if (!hVar.f26932k.isEmpty()) {
                if (this.f26938l.isEmpty()) {
                    this.f26938l = hVar.f26932k;
                    this.f26935i &= -5;
                } else {
                    m32044q();
                    this.f26938l.addAll(hVar.f26932k);
                }
            }
            mo35763a(hVar);
            mo35761a(mo35762h().mo35686b(hVar.f26928g));
            return this;
        }

        /* renamed from: a */
        public C9792b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9790h hVar;
            C9790h hVar2 = null;
            try {
                C9790h a = C9790h.f26927o.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34582a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                hVar = (C9790h) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                mo34582a(hVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9831p0 mo34583a(int i) {
            return this.f26937k.get(i);
        }
    }

    /* renamed from: f */
    public C9792b m32032f() {
        return m32023s();
    }

    private C9790h(C10427h.C10430c<C9790h, ?> cVar) {
        super(cVar);
        this.f26933l = -1;
        this.f26934m = -1;
        this.f26928g = cVar.mo35762h();
    }

    /* renamed from: c */
    public C9792b m32029c() {
        return m32020d(this);
    }

    /* renamed from: a */
    public C9831p0 mo34576a(int i) {
        return this.f26931j.get(i);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f26929h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f26930i);
        }
        for (int i = 0; i < this.f26931j.size(); i++) {
            codedOutputStream.mo35636b(2, (C10449o) this.f26931j.get(i));
        }
        for (int i2 = 0; i2 < this.f26932k.size(); i2++) {
            codedOutputStream.mo35635b(31, this.f26932k.get(i2).intValue());
        }
        k.mo35772a(19000, codedOutputStream);
        codedOutputStream.mo35638b(this.f26928g);
    }

    /* renamed from: b */
    public C9790h m32027b() {
        return f26926n;
    }

    private C9790h(boolean z) {
        this.f26933l = -1;
        this.f26934m = -1;
        this.f26928g = C10417d.f28215f;
    }

    private C9790h(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26933l = -1;
        this.f26934m = -1;
        m32022r();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f26929h |= 1;
                        this.f26930i = eVar.mo35719j();
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.f26931j = new ArrayList();
                            z2 |= true;
                        }
                        this.f26931j.add(eVar.mo35702a(C9831p0.f27069r, fVar));
                    } else if (x == 248) {
                        if (!(z2 & true)) {
                            this.f26932k = new ArrayList();
                            z2 |= true;
                        }
                        this.f26932k.add(Integer.valueOf(eVar.mo35719j()));
                    } else if (x == 250) {
                        int c = eVar.mo35710c(eVar.mo35724o());
                        if (!(z2 & true) && eVar.mo35701a() > 0) {
                            this.f26932k = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo35701a() > 0) {
                            this.f26932k.add(Integer.valueOf(eVar.mo35719j()));
                        }
                        eVar.mo35708b(c);
                    } else if (!mo35759a(eVar, a, fVar, x)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                e.mo35656a(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.mo35656a(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f26931j = Collections.unmodifiableList(this.f26931j);
                }
                if (z2 & true) {
                    this.f26932k = Collections.unmodifiableList(this.f26932k);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26928g = j.mo35696a();
                    throw th2;
                }
                this.f26928g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f26931j = Collections.unmodifiableList(this.f26931j);
        }
        if (z2 & true) {
            this.f26932k = Collections.unmodifiableList(this.f26932k);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26928g = j.mo35696a();
            throw th3;
        }
        this.f26928g = j.mo35696a();
        mo35760h();
    }
}
