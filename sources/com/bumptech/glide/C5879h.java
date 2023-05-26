package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C5963j;
import com.bumptech.glide.p162p.C6265a;
import com.bumptech.glide.p162p.C6266b;
import com.bumptech.glide.p162p.C6267c;
import com.bumptech.glide.p162p.C6268d;
import com.bumptech.glide.p162p.C6269e;
import com.bumptech.glide.p162p.C6270f;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.C6273h;
import com.bumptech.glide.p162p.C6275j;
import com.bumptech.glide.p162p.p163l.C6287i;
import com.bumptech.glide.p162p.p163l.C6288j;
import com.bumptech.glide.p165q.C6299a;
import com.bumptech.glide.p166r.C6308e;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.h */
/* compiled from: RequestBuilder */
public class C5879h<TranscodeType> extends C6265a<C5879h<TranscodeType>> implements Cloneable {

    /* renamed from: F */
    private final Context f10654F;

    /* renamed from: G */
    private final C5881i f10655G;

    /* renamed from: H */
    private final Class<TranscodeType> f10656H;

    /* renamed from: I */
    private final C5876e f10657I;

    /* renamed from: J */
    private C5885j<?, ? super TranscodeType> f10658J;

    /* renamed from: K */
    private Object f10659K;

    /* renamed from: L */
    private List<C6272g<TranscodeType>> f10660L;

    /* renamed from: M */
    private C5879h<TranscodeType> f10661M;

    /* renamed from: N */
    private C5879h<TranscodeType> f10662N;

    /* renamed from: O */
    private Float f10663O;

    /* renamed from: P */
    private boolean f10664P = true;

    /* renamed from: Q */
    private boolean f10665Q;

    /* renamed from: R */
    private boolean f10666R;

    /* renamed from: com.bumptech.glide.h$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C5880a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10667a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10668b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.C5878g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10668b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.C5878g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10668b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.C5878g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10668b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.C5878g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f10668b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.C5878g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10667a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f10667a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f10667a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5879h.C5880a.<clinit>():void");
        }
    }

    static {
        C6273h hVar = (C6273h) ((C6273h) ((C6273h) new C6273h().mo20643a(C5963j.f10939b)).mo20641a(C5878g.LOW)).mo20652a(true);
    }

    @SuppressLint({"CheckResult"})
    protected C5879h(C5874c cVar, C5881i iVar, Class<TranscodeType> cls, Context context) {
        this.f10655G = iVar;
        this.f10656H = cls;
        this.f10654F = context;
        this.f10658J = iVar.mo20005b(cls);
        this.f10657I = cVar.mo19961f();
        m11521a(iVar.mo20007c());
        m11535a((C6265a<?>) iVar.mo20008d());
    }

    /* renamed from: O */
    public C6267c<TranscodeType> mo19981O() {
        return mo19993b(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public C5879h<TranscodeType> mo19992b(C6272g<TranscodeType> gVar) {
        this.f10660L = null;
        mo19985a(gVar);
        return this;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m11521a(List<C6272g<Object>> list) {
        for (C6272g<Object> a : list) {
            mo19985a(a);
        }
    }

    /* renamed from: b */
    private C5879h<TranscodeType> m11524b(Object obj) {
        this.f10659K = obj;
        this.f10665Q = true;
        return this;
    }

    public C5879h<TranscodeType> clone() {
        C5879h<TranscodeType> hVar = (C5879h) super.clone();
        hVar.f10658J = hVar.f10658J.clone();
        return hVar;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> m11535a(C6265a<?> aVar) {
        C6315j.m12978a(aVar);
        return (C5879h) super.mo19984a(aVar);
    }

    /* renamed from: b */
    private <Y extends C6287i<TranscodeType>> Y m11526b(Y y, C6272g<TranscodeType> gVar, C6265a<?> aVar, Executor executor) {
        C6315j.m12978a(y);
        if (this.f10665Q) {
            C6268d a = m11519a(y, gVar, aVar, executor);
            C6268d request = y.getRequest();
            if (!a.mo20682b(request) || m11522a(aVar, request)) {
                this.f10655G.mo20002a((C6287i<?>) y);
                y.setRequest(a);
                this.f10655G.mo20003a(y, a);
                return y;
            }
            a.mo20678a();
            C6315j.m12978a(request);
            if (!request.isRunning()) {
                request.mo20681b();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19983a(C5885j<?, ? super TranscodeType> jVar) {
        C6315j.m12978a(jVar);
        this.f10658J = jVar;
        this.f10664P = false;
        return this;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19985a(C6272g<TranscodeType> gVar) {
        if (gVar != null) {
            if (this.f10660L == null) {
                this.f10660L = new ArrayList();
            }
            this.f10660L.add(gVar);
        }
        return this;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19987a(Object obj) {
        m11524b(obj);
        return this;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19988a(String str) {
        m11524b((Object) str);
        return this;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19982a(Uri uri) {
        m11524b((Object) uri);
        return this;
    }

    /* renamed from: a */
    public C5879h<TranscodeType> mo19986a(Integer num) {
        m11524b((Object) num);
        return m11535a((C6265a<?>) C6273h.m12846b(C6299a.m12945b(this.f10654F)));
    }

    /* renamed from: a */
    public <Y extends C6287i<TranscodeType>> Y mo19989a(Y y) {
        mo19990a(y, (C6272g) null, C6308e.m12963b());
        return y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Y extends C6287i<TranscodeType>> Y mo19990a(Y y, C6272g<TranscodeType> gVar, Executor executor) {
        m11526b(y, gVar, this, executor);
        return y;
    }

    /* renamed from: a */
    private boolean m11522a(C6265a<?> aVar, C6268d dVar) {
        return !aVar.mo20626C() && dVar.mo20692g();
    }

    /* renamed from: a */
    public C6288j<ImageView, TranscodeType> mo19991a(ImageView imageView) {
        C6265a aVar;
        C6316k.m12998b();
        C6315j.m12978a(imageView);
        if (!mo20631I() && mo20629G() && imageView.getScaleType() != null) {
            switch (C5880a.f10667a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo20634L();
                    break;
                case 2:
                    aVar = clone().mo20635M();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo20636N();
                    break;
                case 6:
                    aVar = clone().mo20635M();
                    break;
            }
        }
        aVar = this;
        C6288j<ImageView, TranscodeType> a = this.f10657I.mo19974a(imageView, this.f10656H);
        m11526b(a, (C6272g) null, aVar, C6308e.m12963b());
        return a;
    }

    /* renamed from: b */
    public C6267c<TranscodeType> mo19993b(int i, int i2) {
        C6270f fVar = new C6270f(i, i2);
        mo19990a(fVar, fVar, C6308e.m12962a());
        return fVar;
    }

    /* renamed from: b */
    private C5878g m11523b(C5878g gVar) {
        int i = C5880a.f10668b[gVar.ordinal()];
        if (i == 1) {
            return C5878g.NORMAL;
        }
        if (i == 2) {
            return C5878g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C5878g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo20672s());
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [com.bumptech.glide.p.a, com.bumptech.glide.p.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.p162p.C6268d m11525b(com.bumptech.glide.p162p.p163l.C6287i<TranscodeType> r22, com.bumptech.glide.p162p.C6272g<TranscodeType> r23, com.bumptech.glide.p162p.C6269e r24, com.bumptech.glide.C5885j<?, ? super TranscodeType> r25, com.bumptech.glide.C5878g r26, int r27, int r28, com.bumptech.glide.p162p.C6265a<?> r29, java.util.concurrent.Executor r30) {
        /*
            r21 = this;
            r10 = r21
            r4 = r24
            r11 = r26
            com.bumptech.glide.h<TranscodeType> r0 = r10.f10661M
            if (r0 == 0) goto L_0x0091
            boolean r1 = r10.f10666R
            if (r1 != 0) goto L_0x0089
            com.bumptech.glide.j<?, ? super TranscodeType> r1 = r0.f10658J
            boolean r0 = r0.f10664P
            if (r0 == 0) goto L_0x0017
            r15 = r25
            goto L_0x0018
        L_0x0017:
            r15 = r1
        L_0x0018:
            com.bumptech.glide.h<TranscodeType> r0 = r10.f10661M
            boolean r0 = r0.mo20627E()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.h<TranscodeType> r0 = r10.f10661M
            com.bumptech.glide.g r0 = r0.mo20672s()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.g r0 = r10.m11523b((com.bumptech.glide.C5878g) r11)
        L_0x002b:
            r16 = r0
            com.bumptech.glide.h<TranscodeType> r0 = r10.f10661M
            int r0 = r0.mo20669n()
            com.bumptech.glide.h<TranscodeType> r1 = r10.f10661M
            int r1 = r1.mo20668m()
            boolean r2 = com.bumptech.glide.p166r.C6316k.m12999b((int) r27, (int) r28)
            if (r2 == 0) goto L_0x004f
            com.bumptech.glide.h<TranscodeType> r2 = r10.f10661M
            boolean r2 = r2.mo20632J()
            if (r2 != 0) goto L_0x004f
            int r0 = r29.mo20669n()
            int r1 = r29.mo20668m()
        L_0x004f:
            r17 = r0
            r18 = r1
            com.bumptech.glide.p.k r14 = new com.bumptech.glide.p.k
            r14.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r14
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            com.bumptech.glide.p.d r0 = r0.m11518a(r1, r2, (com.bumptech.glide.p162p.C6265a<?>) r3, (com.bumptech.glide.p162p.C6269e) r4, r5, (com.bumptech.glide.C5878g) r6, (int) r7, (int) r8, (java.util.concurrent.Executor) r9)
            r1 = 1
            r10.f10666R = r1
            com.bumptech.glide.h<TranscodeType> r1 = r10.f10661M
            r11 = r1
            r12 = r22
            r13 = r23
            r2 = r14
            r19 = r1
            r20 = r30
            com.bumptech.glide.p.d r1 = r11.m11520a(r12, r13, (com.bumptech.glide.p162p.C6269e) r14, r15, (com.bumptech.glide.C5878g) r16, (int) r17, (int) r18, (com.bumptech.glide.p162p.C6265a<?>) r19, (java.util.concurrent.Executor) r20)
            r3 = 0
            r10.f10666R = r3
            r2.mo20711a(r0, r1)
            return r2
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0091:
            java.lang.Float r0 = r10.f10663O
            if (r0 == 0) goto L_0x00cf
            com.bumptech.glide.p.k r12 = new com.bumptech.glide.p.k
            r12.<init>(r4)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r12
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            com.bumptech.glide.p.d r13 = r0.m11518a(r1, r2, (com.bumptech.glide.p162p.C6265a<?>) r3, (com.bumptech.glide.p162p.C6269e) r4, r5, (com.bumptech.glide.C5878g) r6, (int) r7, (int) r8, (java.util.concurrent.Executor) r9)
            com.bumptech.glide.p.a r0 = r29.clone()
            java.lang.Float r1 = r10.f10663O
            float r1 = r1.floatValue()
            com.bumptech.glide.p.a r3 = r0.mo20637a((float) r1)
            com.bumptech.glide.g r6 = r10.m11523b((com.bumptech.glide.C5878g) r11)
            r0 = r21
            r1 = r22
            com.bumptech.glide.p.d r0 = r0.m11518a(r1, r2, (com.bumptech.glide.p162p.C6265a<?>) r3, (com.bumptech.glide.p162p.C6269e) r4, r5, (com.bumptech.glide.C5878g) r6, (int) r7, (int) r8, (java.util.concurrent.Executor) r9)
            r12.mo20711a(r13, r0)
            return r12
        L_0x00cf:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r29
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            com.bumptech.glide.p.d r0 = r0.m11518a(r1, r2, (com.bumptech.glide.p162p.C6265a<?>) r3, (com.bumptech.glide.p162p.C6269e) r4, r5, (com.bumptech.glide.C5878g) r6, (int) r7, (int) r8, (java.util.concurrent.Executor) r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5879h.m11525b(com.bumptech.glide.p.l.i, com.bumptech.glide.p.g, com.bumptech.glide.p.e, com.bumptech.glide.j, com.bumptech.glide.g, int, int, com.bumptech.glide.p.a, java.util.concurrent.Executor):com.bumptech.glide.p.d");
    }

    /* renamed from: a */
    private C6268d m11519a(C6287i<TranscodeType> iVar, C6272g<TranscodeType> gVar, C6265a<?> aVar, Executor executor) {
        return m11520a(iVar, gVar, (C6269e) null, this.f10658J, aVar.mo20672s(), aVar.mo20669n(), aVar.mo20668m(), aVar, executor);
    }

    /* renamed from: a */
    private C6268d m11520a(C6287i<TranscodeType> iVar, C6272g<TranscodeType> gVar, C6269e eVar, C5885j<?, ? super TranscodeType> jVar, C5878g gVar2, int i, int i2, C6265a<?> aVar, Executor executor) {
        C6266b bVar;
        C6266b bVar2;
        if (this.f10662N != null) {
            bVar2 = new C6266b(eVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        C6268d b = m11525b(iVar, gVar, bVar2, jVar, gVar2, i, i2, aVar, executor);
        if (bVar == null) {
            return b;
        }
        int n = this.f10662N.mo20669n();
        int m = this.f10662N.mo20668m();
        if (C6316k.m12999b(i, i2) && !this.f10662N.mo20632J()) {
            n = aVar.mo20669n();
            m = aVar.mo20668m();
        }
        C5879h<TranscodeType> hVar = this.f10662N;
        C6266b bVar3 = bVar;
        bVar3.mo20680a(b, hVar.m11520a(iVar, gVar, (C6269e) bVar, hVar.f10658J, hVar.mo20672s(), n, m, (C6265a<?>) this.f10662N, executor));
        return bVar3;
    }

    /* renamed from: a */
    private C6268d m11518a(C6287i<TranscodeType> iVar, C6272g<TranscodeType> gVar, C6265a<?> aVar, C6269e eVar, C5885j<?, ? super TranscodeType> jVar, C5878g gVar2, int i, int i2, Executor executor) {
        Context context = this.f10654F;
        C5876e eVar2 = this.f10657I;
        return C6275j.m12858b(context, eVar2, this.f10659K, this.f10656H, aVar, i, i2, gVar2, iVar, gVar, this.f10660L, eVar, eVar2.mo19977d(), jVar.mo20018b(), executor);
    }
}
