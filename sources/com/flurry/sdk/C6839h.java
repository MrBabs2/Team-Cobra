package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.h */
public final class C6839h extends C6798d7<C6913l> {

    /* renamed from: o */
    protected C6913l f12798o = null;

    /* renamed from: p */
    protected C6852h7 f12799p;

    /* renamed from: q */
    protected C6878j f12800q;

    /* renamed from: r */
    protected C6824g f12801r;

    /* renamed from: s */
    protected C6813f f12802s;

    /* renamed from: t */
    protected AtomicBoolean f12803t = new AtomicBoolean(false);

    /* renamed from: u */
    protected C6823f7<C6877i7> f12804u = new C6844d();

    /* renamed from: com.flurry.sdk.h$a */
    class C6840a extends C6816f2 {
        C6840a() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6839h.this.f12800q.mo23615a();
        }
    }

    /* renamed from: com.flurry.sdk.h$b */
    class C6841b extends C6816f2 {
        C6841b() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6826g0.m14532b();
            C6826g0.m14533b("IdProvider: Provider start", Collections.emptyMap());
            C6839h.this.mo23600b();
        }
    }

    /* renamed from: com.flurry.sdk.h$c */
    class C6842c extends C6816f2 {

        /* renamed from: com.flurry.sdk.h$c$a */
        class C6843a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ boolean f12808h;

            /* renamed from: i */
            final /* synthetic */ String f12809i;

            C6843a(boolean z, String str) {
                this.f12808h = z;
                this.f12809i = str;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                C6839h.this.f12802s.mo23570a();
                boolean z = this.f12808h;
                C6813f fVar = C6839h.this.f12802s;
                if (z != fVar.f12713o || !this.f12809i.equals(fVar.f12712n)) {
                    C6826g0.m14532b();
                    C6826g0.m14533b("IdProvider: Advertising Info update", Collections.emptyMap());
                    C6839h.this.mo23600b();
                }
            }
        }

        C6842c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x012f A[Catch:{ Exception -> 0x0139 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0162 A[Catch:{ Exception -> 0x01c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01ba A[Catch:{ Exception -> 0x01c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23531a() {
            /*
                r13 = this;
                java.lang.String r0 = "IdProvider"
                com.flurry.sdk.h r1 = com.flurry.sdk.C6839h.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.f12803t
                r2 = 0
                r1.set(r2)
                com.flurry.sdk.h r1 = com.flurry.sdk.C6839h.this
                com.flurry.sdk.j r1 = r1.f12800q
                r1.mo23615a()
                r1 = 6
                r3 = 1
                r4 = 0
                com.flurry.sdk.h r5 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.f r5 = r5.f12802s     // Catch:{ Exception -> 0x007e }
                java.lang.String r6 = "advertising_id"
                java.lang.String r6 = com.flurry.sdk.C6971p2.m14813b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ Exception -> 0x007e }
                java.lang.String r7 = "ad_tracking_enabled"
                android.content.Context r8 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ Exception -> 0x007e }
                java.lang.String r9 = "FLURRY_SHARED_PREFERENCES"
                android.content.SharedPreferences r8 = r8.getSharedPreferences(r9, r2)     // Catch:{ Exception -> 0x007e }
                java.util.Locale r9 = java.util.Locale.US     // Catch:{ Exception -> 0x007e }
                java.lang.String r10 = "com.flurry.sdk.%s"
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007e }
                r11[r2] = r7     // Catch:{ Exception -> 0x007e }
                java.lang.String r7 = java.lang.String.format(r9, r10, r11)     // Catch:{ Exception -> 0x007e }
                boolean r2 = r8.getBoolean(r7, r2)     // Catch:{ Exception -> 0x007e }
                r2 = r2 ^ r3
                if (r6 == 0) goto L_0x0042
                r5.f12712n = r6     // Catch:{ Exception -> 0x007e }
                r5.f12713o = r2     // Catch:{ Exception -> 0x007e }
                goto L_0x0045
            L_0x0042:
                r5.mo23570a()     // Catch:{ Exception -> 0x007e }
            L_0x0045:
                com.flurry.sdk.h r2 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.f r2 = r2.f12802s     // Catch:{ Exception -> 0x007e }
                java.lang.String r2 = r2.f12712n     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.h r5 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.f r5 = r5.f12802s     // Catch:{ Exception -> 0x007e }
                boolean r5 = r5.f12713o     // Catch:{ Exception -> 0x007e }
                boolean r6 = r2.isEmpty()     // Catch:{ Exception -> 0x007e }
                if (r6 != 0) goto L_0x0066
                com.flurry.sdk.h r6 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.l r6 = r6.f12798o     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.m r7 = com.flurry.sdk.C6922m.AndroidAdvertisingId     // Catch:{ Exception -> 0x007e }
                r6.mo23644a(r7, r2)     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.h r6 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.l r6 = r6.f12798o     // Catch:{ Exception -> 0x007e }
                r6.f12958b = r5     // Catch:{ Exception -> 0x007e }
            L_0x0066:
                com.flurry.sdk.h r6 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.f r6 = r6.f12802s     // Catch:{ Exception -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r6 = r6.f12714p     // Catch:{ Exception -> 0x007e }
                boolean r6 = r6.get()     // Catch:{ Exception -> 0x007e }
                r6 = r6 ^ r3
                if (r6 == 0) goto L_0x009e
                com.flurry.sdk.h r6 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x007e }
                com.flurry.sdk.h$c$a r7 = new com.flurry.sdk.h$c$a     // Catch:{ Exception -> 0x007e }
                r7.<init>(r5, r2)     // Catch:{ Exception -> 0x007e }
                java.util.concurrent.Future unused = r6.mo23563c(r7)     // Catch:{ Exception -> 0x007e }
                goto L_0x009e
            L_0x007e:
                r2 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Error Fetching Ad Id - "
                r5.<init>(r6)
                java.lang.String r6 = r2.getLocalizedMessage()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r5)
                com.flurry.sdk.C6826g0.m14532b()
                java.lang.String r5 = "Error fetching Ad Id"
                java.lang.String r6 = "Exception happened during fetching Ad Id"
                com.flurry.sdk.C6826g0.m14530a(r5, r6, r2)
            L_0x009e:
                com.flurry.sdk.h r2 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x0139 }
                com.flurry.sdk.g r2 = r2.f12801r     // Catch:{ Exception -> 0x0139 }
                java.lang.String r5 = r2.f12756a     // Catch:{ Exception -> 0x0139 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0139 }
                if (r5 == 0) goto L_0x012b
                android.content.Context r5 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ Exception -> 0x0139 }
                android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = "android_id"
                java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r6)     // Catch:{ Exception -> 0x0139 }
                java.util.Set<java.lang.String> r6 = r2.f12757b     // Catch:{ Exception -> 0x0139 }
                java.util.Locale r7 = java.util.Locale.US     // Catch:{ Exception -> 0x0139 }
                java.lang.String r7 = r5.toLowerCase(r7)     // Catch:{ Exception -> 0x0139 }
                boolean r6 = r6.contains(r7)     // Catch:{ Exception -> 0x0139 }
                if (r6 == 0) goto L_0x00c8
                r5 = r4
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r6 = "AND"
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r5 = r6.concat(r5)     // Catch:{ Exception -> 0x0139 }
            L_0x00d2:
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0139 }
                if (r6 != 0) goto L_0x00d9
                goto L_0x012d
            L_0x00d9:
                java.lang.String r5 = com.flurry.sdk.C6824g.m14528b()     // Catch:{ Exception -> 0x0139 }
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0139 }
                if (r6 == 0) goto L_0x0129
                java.lang.String r5 = r2.mo23587a()     // Catch:{ Exception -> 0x0139 }
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0139 }
                if (r6 == 0) goto L_0x0126
                java.security.SecureRandom r5 = new java.security.SecureRandom     // Catch:{ Exception -> 0x0139 }
                r5.<init>()     // Catch:{ Exception -> 0x0139 }
                double r5 = r5.nextDouble()     // Catch:{ Exception -> 0x0139 }
                long r5 = java.lang.Double.doubleToLongBits(r5)     // Catch:{ Exception -> 0x0139 }
                long r7 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x0139 }
                android.content.Context r9 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ Exception -> 0x0139 }
                java.lang.String r9 = com.flurry.sdk.C6737a2.m14372a(r9)     // Catch:{ Exception -> 0x0139 }
                long r9 = com.flurry.sdk.C6766c2.m14424d(r9)     // Catch:{ Exception -> 0x0139 }
                r11 = 37
                long r9 = r9 * r11
                long r7 = r7 + r9
                long r7 = r7 * r11
                long r5 = r5 + r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
                java.lang.String r8 = "ID"
                r7.<init>(r8)     // Catch:{ Exception -> 0x0139 }
                r8 = 16
                java.lang.String r5 = java.lang.Long.toString(r5, r8)     // Catch:{ Exception -> 0x0139 }
                r7.append(r5)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0139 }
            L_0x0126:
                com.flurry.sdk.C6824g.m14527a(r5)     // Catch:{ Exception -> 0x0139 }
            L_0x0129:
                r2.f12756a = r5     // Catch:{ Exception -> 0x0139 }
            L_0x012b:
                java.lang.String r5 = r2.f12756a     // Catch:{ Exception -> 0x0139 }
            L_0x012d:
                if (r5 == 0) goto L_0x0159
                com.flurry.sdk.h r2 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x0139 }
                com.flurry.sdk.l r2 = r2.f12798o     // Catch:{ Exception -> 0x0139 }
                com.flurry.sdk.m r6 = com.flurry.sdk.C6922m.DeviceId     // Catch:{ Exception -> 0x0139 }
                r2.mo23644a(r6, r5)     // Catch:{ Exception -> 0x0139 }
                goto L_0x0159
            L_0x0139:
                r2 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Error Fetching Device Id - "
                r5.<init>(r6)
                java.lang.String r6 = r2.getLocalizedMessage()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r5)
                com.flurry.sdk.C6826g0.m14532b()
                java.lang.String r5 = "Error fetching Device Id"
                java.lang.String r6 = "Exception happened during fetching Device Id"
                com.flurry.sdk.C6826g0.m14530a(r5, r6, r2)
            L_0x0159:
                com.flurry.sdk.h r2 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x01c8 }
                com.flurry.sdk.j r2 = r2.f12800q     // Catch:{ Exception -> 0x01c8 }
                byte[] r5 = r2.f12865b     // Catch:{ Exception -> 0x01c8 }
                r6 = 2
                if (r5 != 0) goto L_0x01b8
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01c8 }
                r7 = 23
                if (r5 >= r7) goto L_0x016b
                com.flurry.sdk.b7$a r5 = com.flurry.sdk.C6756b7.C6757a.CRYPTO_ALGO_PADDING_5     // Catch:{ Exception -> 0x01c8 }
                goto L_0x016d
            L_0x016b:
                com.flurry.sdk.b7$a r5 = com.flurry.sdk.C6756b7.C6757a.CRYPTO_ALGO_PADDING_7     // Catch:{ Exception -> 0x01c8 }
            L_0x016d:
                java.security.Key r7 = r2.mo23618b()     // Catch:{ Exception -> 0x01c8 }
                byte[] r7 = r2.mo23617a(r7)     // Catch:{ Exception -> 0x01c8 }
                if (r7 != 0) goto L_0x01b5
                java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x01c8 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01c8 }
                java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01c8 }
                java.lang.String r7 = r7.toLowerCase(r8)     // Catch:{ Exception -> 0x01c8 }
                boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x01c8 }
                if (r8 == 0) goto L_0x018c
                goto L_0x01b0
            L_0x018c:
                java.lang.String r8 = "[^a-f0-9]+"
                java.lang.String r9 = ""
                java.lang.String r7 = r7.replaceAll(r8, r9)     // Catch:{ Exception -> 0x01c8 }
                int r8 = r7.length()     // Catch:{ Exception -> 0x01c8 }
                int r8 = r8 % r6
                if (r8 == 0) goto L_0x01ac
                r8 = 4
                java.lang.String r9 = "InstallationIdProvider"
                java.lang.String r10 = "Input string must contain an even number of characters "
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x01c8 }
                java.lang.String r7 = r10.concat(r7)     // Catch:{ Exception -> 0x01c8 }
                com.flurry.sdk.C6792d1.m14476a((int) r8, (java.lang.String) r9, (java.lang.String) r7)     // Catch:{ Exception -> 0x01c8 }
                goto L_0x01b0
            L_0x01ac:
                byte[] r4 = com.flurry.sdk.C6766c2.m14423c(r7)     // Catch:{ Exception -> 0x01c8 }
            L_0x01b0:
                r2.mo23616a(r4, r5)     // Catch:{ Exception -> 0x01c8 }
                r5 = r4
                goto L_0x01b6
            L_0x01b5:
                r5 = r7
            L_0x01b6:
                r2.f12865b = r5     // Catch:{ Exception -> 0x01c8 }
            L_0x01b8:
                if (r5 == 0) goto L_0x01e8
                java.lang.String r2 = android.util.Base64.encodeToString(r5, r6)     // Catch:{ Exception -> 0x01c8 }
                com.flurry.sdk.h r4 = com.flurry.sdk.C6839h.this     // Catch:{ Exception -> 0x01c8 }
                com.flurry.sdk.l r4 = r4.f12798o     // Catch:{ Exception -> 0x01c8 }
                com.flurry.sdk.m r5 = com.flurry.sdk.C6922m.AndroidInstallationId     // Catch:{ Exception -> 0x01c8 }
                r4.mo23644a(r5, r2)     // Catch:{ Exception -> 0x01c8 }
                goto L_0x01e8
            L_0x01c8:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Error Fetching Install Id - "
                r4.<init>(r5)
                java.lang.String r5 = r2.getLocalizedMessage()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r4)
                com.flurry.sdk.C6826g0.m14532b()
                java.lang.String r0 = "Error fetching Install Id"
                java.lang.String r1 = "Exception happened during fetching Install Id"
                com.flurry.sdk.C6826g0.m14530a(r0, r1, r2)
            L_0x01e8:
                com.flurry.sdk.h r0 = com.flurry.sdk.C6839h.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f12803t
                r0.set(r3)
                com.flurry.sdk.h r0 = com.flurry.sdk.C6839h.this
                boolean r0 = r0.mo23601c()
                if (r0 == 0) goto L_0x0202
                com.flurry.sdk.h r0 = com.flurry.sdk.C6839h.this
                com.flurry.sdk.l r1 = r0.f12798o
                com.flurry.sdk.l r1 = r1.mo23645b()
                r0.mo23583a(r1)
            L_0x0202:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6839h.C6842c.mo23531a():void");
        }
    }

    /* renamed from: com.flurry.sdk.h$d */
    class C6844d implements C6823f7<C6877i7> {
        C6844d() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            C6839h.this.mo23600b();
            C6839h.m14557a((C6877i7) obj);
        }
    }

    public C6839h(C6852h7 h7Var) {
        super("IdProvider");
        this.f12799p = h7Var;
        this.f12800q = new C6878j();
        this.f12801r = new C6824g();
        this.f12802s = new C6813f();
        this.f12798o = new C6913l();
        this.f12799p.mo23582a(this.f12804u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23600b() {
        mo23563c(new C6842c());
    }

    /* renamed from: c */
    public final boolean mo23601c() {
        boolean z = this.f12803t.get();
        C6913l lVar = this.f12798o;
        return z && (lVar != null && lVar.mo23643a() != null && this.f12798o.mo23643a().size() > 0);
    }

    /* renamed from: d */
    public final void mo23585d() {
        mo23563c(new C6840a());
        mo23563c(new C6841b());
    }

    /* renamed from: a */
    public final void mo23582a(C6823f7<C6913l> f7Var) {
        super.mo23582a(f7Var);
    }

    /* renamed from: a */
    static /* synthetic */ void m14557a(C6877i7 i7Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("previous_state", i7Var.f12862a.name());
        hashMap.put("current_state", i7Var.f12863b.name());
        C6826g0.m14532b();
        C6826g0.m14533b("IdProvider: App State Change", hashMap);
    }
}
