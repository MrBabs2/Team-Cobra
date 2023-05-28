package com.flurry.sdk;

/* renamed from: com.flurry.sdk.n4 */
public final class C6941n4 implements C6823f7<C6893j7> {

    /* renamed from: com.flurry.sdk.n4$a */
    static /* synthetic */ class C6942a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13027a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.flurry.sdk.C6893j7.C6894a.m14644a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13027a = r0
                r1 = 1
                int r2 = com.flurry.sdk.C6893j7.C6894a.f12897h     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f13027a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C6893j7.C6894a.f12896g     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f13027a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C6893j7.C6894a.f12895f     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6941n4.C6942a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        int i = C6942a.f13027a[((C6893j7) obj).f12894a - 1];
        if (i == 1) {
            C6925m2.m14707a().mo23649a(new C6990q3(new C7005r3()));
        } else if (i == 2) {
            C6891j5.m14641a(true);
        } else if (i == 3) {
            C6891j5.m14641a(false);
        }
    }
}
