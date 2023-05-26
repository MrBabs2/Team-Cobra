package com.trello.rxlifecycle.p209g;

import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import com.trello.rxlifecycle.OutsideLifecycleException;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

/* renamed from: com.trello.rxlifecycle.g.c */
/* compiled from: RxLifecycleAndroid */
public class C9009c {

    /* renamed from: a */
    private static final C5379n<C9007a, C9007a> f25515a = new C9010a();

    /* renamed from: b */
    private static final C5379n<C9008b, C9008b> f25516b = new C9011b();

    /* renamed from: com.trello.rxlifecycle.g.c$a */
    /* compiled from: RxLifecycleAndroid */
    static class C9010a implements C5379n<C9007a, C9007a> {
        C9010a() {
        }

        /* renamed from: a */
        public C9007a call(C9007a aVar) {
            switch (C9012c.f25517a[aVar.ordinal()]) {
                case 1:
                    return C9007a.DESTROY;
                case 2:
                    return C9007a.STOP;
                case 3:
                    return C9007a.PAUSE;
                case 4:
                    return C9007a.STOP;
                case 5:
                    return C9007a.DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + aVar + " not yet implemented");
            }
        }
    }

    /* renamed from: com.trello.rxlifecycle.g.c$b */
    /* compiled from: RxLifecycleAndroid */
    static class C9011b implements C5379n<C9008b, C9008b> {
        C9011b() {
        }

        /* renamed from: a */
        public C9008b call(C9008b bVar) {
            switch (C9012c.f25518b[bVar.ordinal()]) {
                case 1:
                    return C9008b.DETACH;
                case 2:
                    return C9008b.DESTROY;
                case 3:
                    return C9008b.DESTROY_VIEW;
                case 4:
                    return C9008b.STOP;
                case 5:
                    return C9008b.PAUSE;
                case 6:
                    return C9008b.STOP;
                case 7:
                    return C9008b.DESTROY_VIEW;
                case 8:
                    return C9008b.DESTROY;
                case 9:
                    return C9008b.DETACH;
                case 10:
                    throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + bVar + " not yet implemented");
            }
        }
    }

    /* renamed from: com.trello.rxlifecycle.g.c$c */
    /* compiled from: RxLifecycleAndroid */
    static /* synthetic */ class C9012c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25517a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25518b;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b1 */
        static {
            /*
                com.trello.rxlifecycle.g.b[] r0 = com.trello.rxlifecycle.p209g.C9008b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25518b = r0
                r1 = 1
                com.trello.rxlifecycle.g.b r2 = com.trello.rxlifecycle.p209g.C9008b.ATTACH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25518b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.trello.rxlifecycle.g.b r3 = com.trello.rxlifecycle.p209g.C9008b.CREATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25518b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.trello.rxlifecycle.g.b r4 = com.trello.rxlifecycle.p209g.C9008b.CREATE_VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f25518b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.trello.rxlifecycle.g.b r5 = com.trello.rxlifecycle.p209g.C9008b.START     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f25518b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.trello.rxlifecycle.g.b r6 = com.trello.rxlifecycle.p209g.C9008b.RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f25518b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.trello.rxlifecycle.g.b r7 = com.trello.rxlifecycle.p209g.C9008b.PAUSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r6 = f25518b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.trello.rxlifecycle.g.b r7 = com.trello.rxlifecycle.p209g.C9008b.STOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r6 = f25518b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.trello.rxlifecycle.g.b r7 = com.trello.rxlifecycle.p209g.C9008b.DESTROY_VIEW     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8 = 8
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r6 = f25518b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.trello.rxlifecycle.g.b r7 = com.trello.rxlifecycle.p209g.C9008b.DESTROY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r8 = 9
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r6 = f25518b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.trello.rxlifecycle.g.b r7 = com.trello.rxlifecycle.p209g.C9008b.DETACH     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r8 = 10
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.trello.rxlifecycle.g.a[] r6 = com.trello.rxlifecycle.p209g.C9007a.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f25517a = r6
                com.trello.rxlifecycle.g.a r7 = com.trello.rxlifecycle.p209g.C9007a.CREATE     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r1 = f25517a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.trello.rxlifecycle.g.a r6 = com.trello.rxlifecycle.p209g.C9007a.START     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f25517a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.RESUME     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f25517a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.PAUSE     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = f25517a     // Catch:{ NoSuchFieldError -> 0x00b1 }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.STOP     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                int[] r0 = f25517a     // Catch:{ NoSuchFieldError -> 0x00bb }
                com.trello.rxlifecycle.g.a r1 = com.trello.rxlifecycle.p209g.C9007a.DESTROY     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.trello.rxlifecycle.p209g.C9009c.C9012c.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static <T> C4749b<T> m29570a(C5368e<C9007a> eVar) {
        return C4750c.m7796a(eVar, f25515a);
    }

    /* renamed from: b */
    public static <T> C4749b<T> m29571b(C5368e<C9008b> eVar) {
        return C4750c.m7796a(eVar, f25516b);
    }
}
