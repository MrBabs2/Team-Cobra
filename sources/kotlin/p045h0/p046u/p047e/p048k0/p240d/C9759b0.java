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
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.b0 */
/* compiled from: ProtoBuf */
public final class C9759b0 extends C10427h implements C9770d0 {

    /* renamed from: j */
    private static final C9759b0 f26787j;

    /* renamed from: k */
    public static C10452q<C9759b0> f26788k = new C9760a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f26789f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C9762c> f26790g;

    /* renamed from: h */
    private byte f26791h;

    /* renamed from: i */
    private int f26792i;

    /* renamed from: kotlin.h0.u.e.k0.d.b0$a */
    /* compiled from: ProtoBuf */
    static class C9760a extends C10413b<C9759b0> {
        C9760a() {
        }

        /* renamed from: a */
        public C9759b0 m31635a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9759b0(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.b0$c */
    /* compiled from: ProtoBuf */
    public static final class C9762c extends C10427h implements C9768c0 {

        /* renamed from: m */
        private static final C9762c f26795m;

        /* renamed from: n */
        public static C10452q<C9762c> f26796n = new C9763a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f26797f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f26798g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f26799h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f26800i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C9765c f26801j;

        /* renamed from: k */
        private byte f26802k;

        /* renamed from: l */
        private int f26803l;

        /* renamed from: kotlin.h0.u.e.k0.d.b0$c$a */
        /* compiled from: ProtoBuf */
        static class C9763a extends C10413b<C9762c> {
            C9763a() {
            }

            /* renamed from: a */
            public C9762c m31678a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9762c(eVar, fVar);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.d.b0$c$c */
        /* compiled from: ProtoBuf */
        public enum C9765c implements C10436i.C10437a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: f */
            private final int f26812f;

            /* renamed from: kotlin.h0.u.e.k0.d.b0$c$c$a */
            /* compiled from: ProtoBuf */
            static class C9766a implements C10436i.C10438b<C9765c> {
                C9766a() {
                }

                /* renamed from: a */
                public C9765c m31700a(int i) {
                    return C9765c.m31697a(i);
                }
            }

            static {
                new C9766a();
            }

            private C9765c(int i, int i2) {
                this.f26812f = i2;
            }

            /* renamed from: a */
            public static C9765c m31697a(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            /* renamed from: b */
            public final int mo34424b() {
                return this.f26812f;
            }
        }

        static {
            C9762c cVar = new C9762c(true);
            f26795m = cVar;
            cVar.m31660p();
        }

        /* renamed from: o */
        public static C9762c m31659o() {
            return f26795m;
        }

        /* renamed from: p */
        private void m31660p() {
            this.f26799h = -1;
            this.f26800i = 0;
            this.f26801j = C9765c.PACKAGE;
        }

        /* renamed from: q */
        public static C9764b m31661q() {
            return C9764b.m31680l();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f26803l;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f26798g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35133f(1, this.f26799h);
            }
            if ((this.f26798g & 2) == 2) {
                i2 += CodedOutputStream.m35133f(2, this.f26800i);
            }
            if ((this.f26798g & 4) == 4) {
                i2 += CodedOutputStream.m35132e(3, this.f26801j.mo34424b());
            }
            int size = i2 + this.f26797f.size();
            this.f26803l = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9762c> mo34363g() {
            return f26796n;
        }

        /* renamed from: i */
        public C9765c mo34438i() {
            return this.f26801j;
        }

        public final boolean isInitialized() {
            byte b = this.f26802k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo34443n()) {
                this.f26802k = 0;
                return false;
            }
            this.f26802k = 1;
            return true;
        }

        /* renamed from: j */
        public int mo34439j() {
            return this.f26799h;
        }

        /* renamed from: k */
        public int mo34440k() {
            return this.f26800i;
        }

        /* renamed from: l */
        public boolean mo34441l() {
            return (this.f26798g & 4) == 4;
        }

        /* renamed from: m */
        public boolean mo34442m() {
            return (this.f26798g & 1) == 1;
        }

        /* renamed from: n */
        public boolean mo34443n() {
            return (this.f26798g & 2) == 2;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.b0$c$b */
        /* compiled from: ProtoBuf */
        public static final class C9764b extends C10427h.C10429b<C9762c, C9764b> implements C9768c0 {

            /* renamed from: g */
            private int f26804g;

            /* renamed from: h */
            private int f26805h = -1;

            /* renamed from: i */
            private int f26806i;

            /* renamed from: j */
            private C9765c f26807j = C9765c.PACKAGE;

            private C9764b() {
                m31681m();
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public static C9764b m31680l() {
                return new C9764b();
            }

            /* renamed from: m */
            private void m31681m() {
            }

            /* renamed from: i */
            public C9762c mo34448i() {
                C9762c cVar = new C9762c((C10427h.C10429b) this);
                int i = this.f26804g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = cVar.f26799h = this.f26805h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = cVar.f26800i = this.f26806i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                C9765c unused3 = cVar.f26801j = this.f26807j;
                int unused4 = cVar.f26798g = i2;
                return cVar;
            }

            public final boolean isInitialized() {
                return mo34449j();
            }

            /* renamed from: j */
            public boolean mo34449j() {
                return (this.f26804g & 2) == 2;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34446a((C9762c) hVar);
                return this;
            }

            /* renamed from: b */
            public C9762c m31694b() {
                return C9762c.m31659o();
            }

            public C9764b clone() {
                C9764b l = m31680l();
                l.mo34446a(mo34448i());
                return l;
            }

            /* renamed from: b */
            public C9764b mo34447b(int i) {
                this.f26804g |= 2;
                this.f26806i = i;
                return this;
            }

            /* renamed from: a */
            public C9762c m31690a() {
                C9762c i = mo34448i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9764b mo34446a(C9762c cVar) {
                if (cVar == C9762c.m31659o()) {
                    return this;
                }
                if (cVar.mo34442m()) {
                    mo34444a(cVar.mo34439j());
                }
                if (cVar.mo34443n()) {
                    mo34447b(cVar.mo34440k());
                }
                if (cVar.mo34441l()) {
                    mo34445a(cVar.mo34438i());
                }
                mo35761a(mo35762h().mo35686b(cVar.f26797f));
                return this;
            }

            /* renamed from: a */
            public C9764b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9762c cVar;
                C9762c cVar2 = null;
                try {
                    C9762c a = C9762c.f26796n.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34446a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    cVar = (C9762c) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo34446a(cVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9764b mo34444a(int i) {
                this.f26804g |= 1;
                this.f26805h = i;
                return this;
            }

            /* renamed from: a */
            public C9764b mo34445a(C9765c cVar) {
                if (cVar != null) {
                    this.f26804g |= 4;
                    this.f26807j = cVar;
                    return this;
                }
                throw null;
            }
        }

        /* renamed from: f */
        public C9764b m31669f() {
            return m31661q();
        }

        private C9762c(C10427h.C10429b bVar) {
            super(bVar);
            this.f26802k = -1;
            this.f26803l = -1;
            this.f26797f = bVar.mo35762h();
        }

        /* renamed from: b */
        public C9762c m31664b() {
            return f26795m;
        }

        /* renamed from: c */
        public C9764b m31666c() {
            return m31657b(this);
        }

        /* renamed from: b */
        public static C9764b m31657b(C9762c cVar) {
            C9764b q = m31661q();
            q.mo34446a(cVar);
            return q;
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f26798g & 1) == 1) {
                codedOutputStream.mo35635b(1, this.f26799h);
            }
            if ((this.f26798g & 2) == 2) {
                codedOutputStream.mo35635b(2, this.f26800i);
            }
            if ((this.f26798g & 4) == 4) {
                codedOutputStream.mo35621a(3, this.f26801j.mo34424b());
            }
            codedOutputStream.mo35638b(this.f26797f);
        }

        private C9762c(boolean z) {
            this.f26802k = -1;
            this.f26803l = -1;
            this.f26797f = C10417d.f28215f;
        }

        private C9762c(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f26802k = -1;
            this.f26803l = -1;
            m31660p();
            C10417d.C10419b j = C10417d.m35229j();
            CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = eVar.mo35733x();
                    if (x != 0) {
                        if (x == 8) {
                            this.f26798g |= 1;
                            this.f26799h = eVar.mo35719j();
                        } else if (x == 16) {
                            this.f26798g |= 2;
                            this.f26800i = eVar.mo35719j();
                        } else if (x == 24) {
                            int f = eVar.mo35715f();
                            C9765c a2 = C9765c.m31697a(f);
                            if (a2 == null) {
                                a.mo35650f(x);
                                a.mo35650f(f);
                            } else {
                                this.f26798g |= 4;
                                this.f26801j = a2;
                            }
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
                    try {
                        a.mo35614a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f26797f = j.mo35696a();
                        throw th2;
                    }
                    this.f26797f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f26797f = j.mo35696a();
                throw th3;
            }
            this.f26797f = j.mo35696a();
            mo35760h();
        }
    }

    static {
        C9759b0 b0Var = new C9759b0(true);
        f26787j = b0Var;
        b0Var.m31621k();
    }

    /* renamed from: j */
    public static C9759b0 m31620j() {
        return f26787j;
    }

    /* renamed from: k */
    private void m31621k() {
        this.f26790g = Collections.emptyList();
    }

    /* renamed from: l */
    public static C9761b m31622l() {
        return C9761b.m31637l();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26792i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26790g.size(); i3++) {
            i2 += CodedOutputStream.m35130d(1, (C10449o) this.f26790g.get(i3));
        }
        int size = i2 + this.f26789f.size();
        this.f26792i = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9759b0> mo34363g() {
        return f26788k;
    }

    /* renamed from: i */
    public int mo34433i() {
        return this.f26790g.size();
    }

    public final boolean isInitialized() {
        byte b = this.f26791h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34433i(); i++) {
            if (!mo34432a(i).isInitialized()) {
                this.f26791h = 0;
                return false;
            }
        }
        this.f26791h = 1;
        return true;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.b0$b */
    /* compiled from: ProtoBuf */
    public static final class C9761b extends C10427h.C10429b<C9759b0, C9761b> implements C9770d0 {

        /* renamed from: g */
        private int f26793g;

        /* renamed from: h */
        private List<C9762c> f26794h = Collections.emptyList();

        private C9761b() {
            m31639n();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static C9761b m31637l() {
            return new C9761b();
        }

        /* renamed from: m */
        private void m31638m() {
            if ((this.f26793g & 1) != 1) {
                this.f26794h = new ArrayList(this.f26794h);
                this.f26793g |= 1;
            }
        }

        /* renamed from: n */
        private void m31639n() {
        }

        /* renamed from: i */
        public C9759b0 mo34436i() {
            C9759b0 b0Var = new C9759b0((C10427h.C10429b) this);
            if ((this.f26793g & 1) == 1) {
                this.f26794h = Collections.unmodifiableList(this.f26794h);
                this.f26793g &= -2;
            }
            List unused = b0Var.f26790g = this.f26794h;
            return b0Var;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34437j(); i++) {
                if (!mo34435a(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int mo34437j() {
            return this.f26794h.size();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34434a((C9759b0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9759b0 m31650b() {
            return C9759b0.m31620j();
        }

        public C9761b clone() {
            C9761b l = m31637l();
            l.mo34434a(mo34436i());
            return l;
        }

        /* renamed from: a */
        public C9759b0 m31647a() {
            C9759b0 i = mo34436i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9761b mo34434a(C9759b0 b0Var) {
            if (b0Var == C9759b0.m31620j()) {
                return this;
            }
            if (!b0Var.f26790g.isEmpty()) {
                if (this.f26794h.isEmpty()) {
                    this.f26794h = b0Var.f26790g;
                    this.f26793g &= -2;
                } else {
                    m31638m();
                    this.f26794h.addAll(b0Var.f26790g);
                }
            }
            mo35761a(mo35762h().mo35686b(b0Var.f26789f));
            return this;
        }

        /* renamed from: a */
        public C9761b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9759b0 b0Var;
            C9759b0 b0Var2 = null;
            try {
                C9759b0 a = C9759b0.f26788k.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34434a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                b0Var = (C9759b0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                b0Var2 = b0Var;
            }
            if (b0Var2 != null) {
                mo34434a(b0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9762c mo34435a(int i) {
            return this.f26794h.get(i);
        }
    }

    /* renamed from: c */
    public static C9761b m31619c(C9759b0 b0Var) {
        C9761b l = m31622l();
        l.mo34434a(b0Var);
        return l;
    }

    /* renamed from: f */
    public C9761b m31631f() {
        return m31622l();
    }

    private C9759b0(C10427h.C10429b bVar) {
        super(bVar);
        this.f26791h = -1;
        this.f26792i = -1;
        this.f26789f = bVar.mo35762h();
    }

    /* renamed from: a */
    public C9762c mo34432a(int i) {
        return this.f26790g.get(i);
    }

    /* renamed from: b */
    public C9759b0 m31626b() {
        return f26787j;
    }

    /* renamed from: c */
    public C9761b m31628c() {
        return m31619c(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        for (int i = 0; i < this.f26790g.size(); i++) {
            codedOutputStream.mo35636b(1, (C10449o) this.f26790g.get(i));
        }
        codedOutputStream.mo35638b(this.f26789f);
    }

    private C9759b0(boolean z) {
        this.f26791h = -1;
        this.f26792i = -1;
        this.f26789f = C10417d.f28215f;
    }

    private C9759b0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26791h = -1;
        this.f26792i = -1;
        m31621k();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 10) {
                        if (!z2 || !true) {
                            this.f26790g = new ArrayList();
                            z2 |= true;
                        }
                        this.f26790g.add(eVar.mo35702a(C9762c.f26796n, fVar));
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
                if (z2 && true) {
                    this.f26790g = Collections.unmodifiableList(this.f26790g);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26789f = j.mo35696a();
                    throw th2;
                }
                this.f26789f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f26790g = Collections.unmodifiableList(this.f26790g);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26789f = j.mo35696a();
            throw th3;
        }
        this.f26789f = j.mo35696a();
        mo35760h();
    }
}
