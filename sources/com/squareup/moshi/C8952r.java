package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.p206u.C8973c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.r */
/* compiled from: Moshi */
public final class C8952r {

    /* renamed from: d */
    static final List<C8924f.C8929e> f25429d;

    /* renamed from: a */
    private final List<C8924f.C8929e> f25430a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ThreadLocal<C8955c> f25431b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Object, C8924f<?>> f25432c = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.r$b */
    /* compiled from: Moshi */
    static final class C8954b<T> extends C8924f<T> {

        /* renamed from: a */
        final Type f25434a;

        /* renamed from: b */
        final String f25435b;

        /* renamed from: c */
        final Object f25436c;

        /* renamed from: d */
        C8924f<T> f25437d;

        C8954b(Type type, String str, Object obj) {
            this.f25434a = type;
            this.f25435b = str;
            this.f25436c = obj;
        }

        public T fromJson(C8930i iVar) throws IOException {
            C8924f<T> fVar = this.f25437d;
            if (fVar != null) {
                return fVar.fromJson(iVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void toJson(C8939o oVar, T t) throws IOException {
            C8924f<T> fVar = this.f25437d;
            if (fVar != null) {
                fVar.toJson(oVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C8924f<T> fVar = this.f25437d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f25429d = arrayList;
        arrayList.add(C8956s.f25442a);
        f25429d.add(C8920d.f25340b);
        f25429d.add(C8950q.f25426c);
        f25429d.add(C8910a.f25320c);
        f25429d.add(C8917c.f25333d);
    }

    C8952r(C8953a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f25433a.size() + f25429d.size());
        arrayList.addAll(aVar.f25433a);
        arrayList.addAll(f25429d);
        this.f25430a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.squareup.moshi.r$a */
    /* compiled from: Moshi */
    public static final class C8953a {

        /* renamed from: a */
        final List<C8924f.C8929e> f25433a = new ArrayList();

        /* renamed from: a */
        public C8953a mo32972a(C8924f.C8929e eVar) {
            if (eVar != null) {
                this.f25433a.add(eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: a */
        public C8952r mo32973a() {
            return new C8952r(this);
        }
    }

    /* renamed from: b */
    private Object m29492b(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    /* renamed from: a */
    public <T> C8924f<T> mo32969a(Type type) {
        return mo32970a(type, C8973c.f25465a);
    }

    /* renamed from: a */
    public <T> C8924f<T> mo32968a(Class<T> cls) {
        return mo32970a(cls, C8973c.f25465a);
    }

    /* renamed from: a */
    public <T> C8924f<T> mo32970a(Type type, Set<? extends Annotation> set) {
        return mo32971a(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.f25431b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = new com.squareup.moshi.C8952r.C8955c(r4);
        r4.f25431b.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r7 = r1.mo32975a(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1.mo32978a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.f25430a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2 >= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r4.f25430a.get(r2).mo32832a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.mo32977a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1.mo32978a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + com.squareup.moshi.p206u.C8973c.m29534a(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        throw r1.mo32976a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1.mo32978a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.squareup.moshi.C8924f<T> mo32971a(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x008b
            java.lang.reflect.Type r5 = com.squareup.moshi.p206u.C8973c.m29535a((java.lang.reflect.Type) r5)
            java.lang.reflect.Type r5 = com.squareup.moshi.p206u.C8973c.m29546c(r5)
            java.lang.Object r0 = r4.m29492b(r5, r6)
            java.util.Map<java.lang.Object, com.squareup.moshi.f<?>> r1 = r4.f25432c
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.squareup.moshi.f<?>> r2 = r4.f25432c     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0088 }
            com.squareup.moshi.f r2 = (com.squareup.moshi.C8924f) r2     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            java.lang.ThreadLocal<com.squareup.moshi.r$c> r1 = r4.f25431b
            java.lang.Object r1 = r1.get()
            com.squareup.moshi.r$c r1 = (com.squareup.moshi.C8952r.C8955c) r1
            if (r1 != 0) goto L_0x0034
            com.squareup.moshi.r$c r1 = new com.squareup.moshi.r$c
            r1.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.r$c> r2 = r4.f25431b
            r2.set(r1)
        L_0x0034:
            com.squareup.moshi.f r7 = r1.mo32975a(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003f
            r1.mo32978a((boolean) r0)
            return r7
        L_0x003f:
            java.util.List<com.squareup.moshi.f$e> r7 = r4.f25430a     // Catch:{ IllegalArgumentException -> 0x007e }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2 = 0
        L_0x0046:
            if (r2 >= r7) goto L_0x0061
            java.util.List<com.squareup.moshi.f$e> r3 = r4.f25430a     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.f$e r3 = (com.squareup.moshi.C8924f.C8929e) r3     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.f r3 = r3.mo32832a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            if (r3 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r1.mo32977a(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            r5 = 1
            r1.mo32978a((boolean) r5)
            return r3
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = com.squareup.moshi.p206u.C8973c.m29534a((java.lang.reflect.Type) r5, (java.util.Set<? extends java.lang.annotation.Annotation>) r6)     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007e }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007c:
            r5 = move-exception
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo32976a((java.lang.IllegalArgumentException) r5)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x0084:
            r1.mo32978a((boolean) r0)
            throw r5
        L_0x0088:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r5
        L_0x008b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            goto L_0x009c
        L_0x009b:
            throw r5
        L_0x009c:
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8952r.mo32971a(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.f");
    }

    /* renamed from: com.squareup.moshi.r$c */
    /* compiled from: Moshi */
    final class C8955c {

        /* renamed from: a */
        final List<C8954b<?>> f25438a = new ArrayList();

        /* renamed from: b */
        final Deque<C8954b<?>> f25439b = new ArrayDeque();

        /* renamed from: c */
        boolean f25440c;

        C8955c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> C8924f<T> mo32975a(Type type, String str, Object obj) {
            int size = this.f25438a.size();
            for (int i = 0; i < size; i++) {
                C8954b bVar = this.f25438a.get(i);
                if (bVar.f25436c.equals(obj)) {
                    this.f25439b.add(bVar);
                    C8924f<T> fVar = bVar.f25437d;
                    return fVar != null ? fVar : bVar;
                }
            }
            C8954b bVar2 = new C8954b(type, str, obj);
            this.f25438a.add(bVar2);
            this.f25439b.add(bVar2);
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> void mo32977a(C8924f<T> fVar) {
            this.f25439b.getLast().f25437d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32978a(boolean z) {
            this.f25439b.removeLast();
            if (this.f25439b.isEmpty()) {
                C8952r.this.f25431b.remove();
                if (z) {
                    synchronized (C8952r.this.f25432c) {
                        int size = this.f25438a.size();
                        for (int i = 0; i < size; i++) {
                            C8954b bVar = this.f25438a.get(i);
                            C8924f<T> fVar = (C8924f) C8952r.this.f25432c.put(bVar.f25436c, bVar.f25437d);
                            if (fVar != null) {
                                bVar.f25437d = fVar;
                                C8952r.this.f25432c.put(bVar.f25436c, fVar);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public IllegalArgumentException mo32976a(IllegalArgumentException illegalArgumentException) {
            if (this.f25440c) {
                return illegalArgumentException;
            }
            this.f25440c = true;
            if (this.f25439b.size() == 1 && this.f25439b.getFirst().f25435b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C8954b<?>> descendingIterator = this.f25439b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C8954b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f25434a);
                if (next.f25435b != null) {
                    sb.append(' ');
                    sb.append(next.f25435b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }
    }
}
