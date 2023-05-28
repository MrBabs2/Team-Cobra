package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10424g;
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10472w;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* compiled from: GeneratedMessageLite */
public abstract class C10427h extends C10410a implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    /* compiled from: GeneratedMessageLite */
    static /* synthetic */ class C10428a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28246a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.w$c[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28246a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28246a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10427h.C10428a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$b */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C10429b<MessageType extends C10427h, BuilderType extends C10429b> extends C10410a.C10411a<BuilderType> {

        /* renamed from: f */
        private C10417d f28247f = C10417d.f28215f;

        protected C10429b() {
        }

        /* renamed from: a */
        public final BuilderType mo35761a(C10417d dVar) {
            this.f28247f = dVar;
            return this;
        }

        /* renamed from: a */
        public abstract BuilderType mo34379a(MessageType messagetype);

        /* renamed from: b */
        public abstract MessageType m35343b();

        /* renamed from: h */
        public final C10417d mo35762h() {
            return this.f28247f;
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C10430c<MessageType extends C10431d<MessageType>, BuilderType extends C10430c<MessageType, BuilderType>> extends C10429b<MessageType, BuilderType> implements C10433e<MessageType> {

        /* renamed from: g */
        private C10424g<C10434f> f28248g = C10424g.m35312e();

        /* renamed from: h */
        private boolean f28249h;

        protected C10430c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public C10424g<C10434f> mo34502j() {
            this.f28248g.mo35752d();
            this.f28249h = false;
            return this.f28248g;
        }

        /* renamed from: k */
        private void mo34503k() {
            if (!this.f28249h) {
                this.f28248g = this.f28248g.clone();
                this.f28249h = true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public boolean mo35764i() {
            return this.f28248g.mo35748b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo35763a(MessageType messagetype) {
            mo34503k();
            this.f28248g.mo35745a(messagetype.f28250f);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C10431d<MessageType extends C10431d<MessageType>> extends C10427h implements C10433e<MessageType> {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10424g<C10434f> f28250f;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d$a */
        /* compiled from: GeneratedMessageLite */
        protected class C10432a {

            /* renamed from: a */
            private final Iterator<Map.Entry<C10434f, Object>> f28251a;

            /* renamed from: b */
            private Map.Entry<C10434f, Object> f28252b;

            /* renamed from: c */
            private final boolean f28253c;

            /* synthetic */ C10432a(C10431d dVar, boolean z, C10428a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo35772a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C10434f, Object> entry = this.f28252b;
                    if (entry != null && entry.getKey().mo35756b() < i) {
                        C10434f key = this.f28252b.getKey();
                        if (!this.f28253c || key.mo35753E() != C10472w.C10479c.MESSAGE || key.mo35757h()) {
                            C10424g.m35307a((C10424g.C10426b<?>) key, this.f28252b.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.mo35643c(key.mo35756b(), (C10449o) this.f28252b.getValue());
                        }
                        if (this.f28251a.hasNext()) {
                            this.f28252b = this.f28251a.next();
                        } else {
                            this.f28252b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private C10432a(boolean z) {
                Iterator<Map.Entry<C10434f, Object>> c = C10431d.this.f28250f.mo35749c();
                this.f28251a = c;
                if (c.hasNext()) {
                    this.f28252b = this.f28251a.next();
                }
                this.f28253c = z;
            }
        }

        protected C10431d() {
            this.f28250f = C10424g.m35313f();
        }

        /* renamed from: d */
        private void m35351d(C10435g<MessageType, ?> gVar) {
            if (gVar.mo35777a() != mo34359b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* renamed from: b */
        public final <Type> int mo35767b(C10435g<MessageType, List<Type>> gVar) {
            m35351d(gVar);
            return this.f28250f.mo35746b(gVar.f28263d);
        }

        /* renamed from: c */
        public final <Type> boolean mo35768c(C10435g<MessageType, Type> gVar) {
            m35351d(gVar);
            return this.f28250f.mo35750c(gVar.f28263d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo35760h() {
            this.f28250f.mo35752d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public boolean mo35769i() {
            return this.f28250f.mo35748b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public int mo35770j() {
            return this.f28250f.mo35741a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C10431d<MessageType>.C0000a mo35771k() {
            return new C10432a(this, false, (C10428a) null);
        }

        /* renamed from: a */
        public final <Type> Type mo35765a(C10435g<MessageType, Type> gVar) {
            m35351d(gVar);
            Object a = this.f28250f.mo35742a(gVar.f28263d);
            if (a == null) {
                return gVar.f28261b;
            }
            return gVar.mo35776a(a);
        }

        protected C10431d(C10430c<MessageType, ?> cVar) {
            this.f28250f = cVar.mo34502j();
        }

        /* renamed from: a */
        public final <Type> Type mo35766a(C10435g<MessageType, List<Type>> gVar, int i) {
            m35351d(gVar);
            return gVar.mo35778b(this.f28250f.mo35743a(gVar.f28263d, i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo35759a(C10420e eVar, CodedOutputStream codedOutputStream, C10422f fVar, int i) throws IOException {
            return C10427h.m35336b(this.f28250f, mo34359b(), eVar, codedOutputStream, fVar, i);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$e */
    /* compiled from: GeneratedMessageLite */
    public interface C10433e<MessageType extends C10431d> extends C10451p {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$f */
    /* compiled from: GeneratedMessageLite */
    static final class C10434f implements C10424g.C10426b<C10434f> {

        /* renamed from: f */
        final C10436i.C10438b<?> f28255f;

        /* renamed from: g */
        final int f28256g;

        /* renamed from: h */
        final C10472w.C10474b f28257h;

        /* renamed from: i */
        final boolean f28258i;

        /* renamed from: j */
        final boolean f28259j;

        C10434f(C10436i.C10438b<?> bVar, int i, C10472w.C10474b bVar2, boolean z, boolean z2) {
            this.f28255f = bVar;
            this.f28256g = i;
            this.f28257h = bVar2;
            this.f28258i = z;
            this.f28259j = z2;
        }

        /* renamed from: E */
        public C10472w.C10479c mo35753E() {
            return this.f28257h.mo35884a();
        }

        /* renamed from: F */
        public boolean mo35754F() {
            return this.f28259j;
        }

        /* renamed from: a */
        public C10436i.C10438b<?> mo35774a() {
            return this.f28255f;
        }

        /* renamed from: b */
        public int mo35756b() {
            return this.f28256g;
        }

        /* renamed from: h */
        public boolean mo35757h() {
            return this.f28258i;
        }

        /* renamed from: j */
        public C10472w.C10474b mo35758j() {
            return this.f28257h;
        }

        /* renamed from: a */
        public C10449o.C10450a mo35755a(C10449o.C10450a aVar, C10449o oVar) {
            return ((C10429b) aVar).mo34379a((C10427h) oVar);
        }

        /* renamed from: a */
        public int compareTo(C10434f fVar) {
            return this.f28256g - fVar.f28256g;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$g */
    /* compiled from: GeneratedMessageLite */
    public static class C10435g<ContainingType extends C10449o, Type> {

        /* renamed from: a */
        final ContainingType f28260a;

        /* renamed from: b */
        final Type f28261b;

        /* renamed from: c */
        final C10449o f28262c;

        /* renamed from: d */
        final C10434f f28263d;

        /* renamed from: e */
        final Method f28264e;

        C10435g(ContainingType containingtype, Type type, C10449o oVar, C10434f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (fVar.mo35758j() == C10472w.C10474b.MESSAGE && oVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f28260a = containingtype;
                this.f28261b = type;
                this.f28262c = oVar;
                this.f28263d = fVar;
                if (C10436i.C10437a.class.isAssignableFrom(cls)) {
                    this.f28264e = C10427h.m35332a(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.f28264e = null;
            }
        }

        /* renamed from: a */
        public ContainingType mo35777a() {
            return this.f28260a;
        }

        /* renamed from: b */
        public C10449o mo35779b() {
            return this.f28262c;
        }

        /* renamed from: c */
        public int mo35780c() {
            return this.f28263d.mo35756b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo35776a(Object obj) {
            if (!this.f28263d.mo35757h()) {
                return mo35778b(obj);
            }
            if (this.f28263d.mo35753E() != C10472w.C10479c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b : (List) obj) {
                arrayList.add(mo35778b(b));
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object mo35778b(Object obj) {
            if (this.f28263d.mo35753E() != C10472w.C10479c.ENUM) {
                return obj;
            }
            return C10427h.m35331a(this.f28264e, (Object) null, (Integer) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Object mo35781c(Object obj) {
            return this.f28263d.mo35753E() == C10472w.C10479c.ENUM ? Integer.valueOf(((C10436i.C10437a) obj).mo34424b()) : obj;
        }
    }

    protected C10427h() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.C10449o> boolean m35336b(kotlin.reflect.jvm.internal.impl.protobuf.C10424g<kotlin.reflect.jvm.internal.impl.protobuf.C10427h.C10434f> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.C10420e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r9, int r10) throws java.io.IOException {
        /*
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.m35490b(r10)
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.m35488a(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.h$g r6 = r9.mo35737a(r6, r1)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            goto L_0x003d
        L_0x0013:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r3 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.mo35758j()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C10424g.m35302a((kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b) r3, (boolean) r1)
            if (r0 != r3) goto L_0x0021
            r0 = 0
            goto L_0x0011
        L_0x0021:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r3 = r6.f28263d
            boolean r4 = r3.f28258i
            if (r4 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.f28257h
            boolean r3 = r3.mo35886e()
            if (r3 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r3 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.mo35758j()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C10424g.m35302a((kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b) r3, (boolean) r2)
            if (r0 != r3) goto L_0x0010
            r0 = 0
            r3 = 1
        L_0x003d:
            if (r0 == 0) goto L_0x0044
            boolean r5 = r7.mo35707a((int) r10, (kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream) r8)
            return r5
        L_0x0044:
            if (r3 == 0) goto L_0x0094
            int r8 = r7.mo35724o()
            int r8 = r7.mo35710c(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r9 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = r9.mo35758j()
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.ENUM
            if (r9 != r10) goto L_0x0079
        L_0x0058:
            int r9 = r7.mo35701a()
            if (r9 <= 0) goto L_0x008f
            int r9 = r7.mo35715f()
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.i$b r10 = r10.mo35774a()
            kotlin.reflect.jvm.internal.impl.protobuf.i$a r9 = r10.mo34425a(r9)
            if (r9 != 0) goto L_0x006f
            return r2
        L_0x006f:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            java.lang.Object r9 = r6.mo35781c(r9)
            r5.mo35744a(r10, (java.lang.Object) r9)
            goto L_0x0058
        L_0x0079:
            int r9 = r7.mo35701a()
            if (r9 <= 0) goto L_0x008f
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r9 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = r9.mo35758j()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.C10424g.m35304a((kotlin.reflect.jvm.internal.impl.protobuf.C10420e) r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b) r9, (boolean) r1)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            r5.mo35744a(r10, (java.lang.Object) r9)
            goto L_0x0079
        L_0x008f:
            r7.mo35708b(r8)
            goto L_0x0120
        L_0x0094:
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10427h.C10428a.f28246a
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r3 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r3 = r3.mo35753E()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L_0x00cb
            r9 = 2
            if (r0 == r9) goto L_0x00b2
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r8 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r8 = r8.mo35758j()
            java.lang.Object r7 = kotlin.reflect.jvm.internal.impl.protobuf.C10424g.m35304a((kotlin.reflect.jvm.internal.impl.protobuf.C10420e) r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b) r8, (boolean) r1)
            goto L_0x0105
        L_0x00b2:
            int r7 = r7.mo35715f()
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r9 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.i$b r9 = r9.mo35774a()
            kotlin.reflect.jvm.internal.impl.protobuf.i$a r9 = r9.mo34425a(r7)
            if (r9 != 0) goto L_0x00c9
            r8.mo35650f((int) r10)
            r8.mo35655i((int) r7)
            return r2
        L_0x00c9:
            r7 = r9
            goto L_0x0105
        L_0x00cb:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            boolean r10 = r10.mo35757h()
            if (r10 != 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            java.lang.Object r10 = r5.mo35742a(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = (kotlin.reflect.jvm.internal.impl.protobuf.C10449o) r10
            if (r10 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.o$a r8 = r10.mo34360c()
        L_0x00e2:
            if (r8 != 0) goto L_0x00ec
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r6.mo35779b()
            kotlin.reflect.jvm.internal.impl.protobuf.o$a r8 = r8.mo34362f()
        L_0x00ec:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r10 = r6.f28263d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = r10.mo35758j()
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.GROUP
            if (r10 != r0) goto L_0x00fe
            int r10 = r6.mo35780c()
            r7.mo35704a(r10, r8, r9)
            goto L_0x0101
        L_0x00fe:
            r7.mo35706a((kotlin.reflect.jvm.internal.impl.protobuf.C10449o.C10450a) r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r9)
        L_0x0101:
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r8.mo34378a()
        L_0x0105:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r8 = r6.f28263d
            boolean r8 = r8.mo35757h()
            if (r8 == 0) goto L_0x0117
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r8 = r6.f28263d
            java.lang.Object r6 = r6.mo35781c(r7)
            r5.mo35744a(r8, (java.lang.Object) r6)
            goto L_0x0120
        L_0x0117:
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r8 = r6.f28263d
            java.lang.Object r6 = r6.mo35781c(r7)
            r5.mo35747b(r8, (java.lang.Object) r6)
        L_0x0120:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10427h.m35336b(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    /* renamed from: g */
    public C10452q<? extends C10449o> mo34363g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo35760h() {
    }

    protected C10427h(C10429b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo35759a(C10420e eVar, CodedOutputStream codedOutputStream, C10422f fVar, int i) throws IOException {
        return eVar.mo35707a(i, codedOutputStream);
    }

    /* renamed from: a */
    public static <ContainingType extends C10449o, Type> C10435g<ContainingType, Type> m35333a(ContainingType containingtype, Type type, C10449o oVar, C10436i.C10438b<?> bVar, int i, C10472w.C10474b bVar2, Class cls) {
        return new C10435g(containingtype, type, oVar, new C10434f(bVar, i, bVar2, false, false), cls);
    }

    /* renamed from: a */
    public static <ContainingType extends C10449o, Type> C10435g<ContainingType, Type> m35334a(ContainingType containingtype, C10449o oVar, C10436i.C10438b<?> bVar, int i, C10472w.C10474b bVar2, boolean z, Class cls) {
        return new C10435g(containingtype, Collections.emptyList(), oVar, new C10434f(bVar, i, bVar2, true, z), cls);
    }

    /* renamed from: a */
    static Method m35332a(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    static Object m35331a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}
