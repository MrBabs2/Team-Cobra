package p050l.p075h.p081i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p003c.C0398c;
import androidx.core.content.p003c.C0406f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p050l.p066e.C4874e;
import p050l.p066e.C4881g;
import p050l.p075h.p076e.C4954d;
import p050l.p075h.p076e.C4964k;
import p050l.p075h.p081i.C4979c;
import p050l.p075h.p083k.C5008h;

/* renamed from: l.h.i.b */
/* compiled from: FontsContractCompat */
public class C4971b {

    /* renamed from: a */
    static final C4874e<String, Typeface> f8779a = new C4874e<>(16);

    /* renamed from: b */
    private static final C4979c f8780b = new C4979c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f8781c = new Object();

    /* renamed from: d */
    static final C4881g<String, ArrayList<C4979c.C4984d<C4978g>>> f8782d = new C4881g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f8783e = new C4975d();

    /* renamed from: l.h.i.b$a */
    /* compiled from: FontsContractCompat */
    class C4972a implements Callable<C4978g> {

        /* renamed from: f */
        final /* synthetic */ Context f8784f;

        /* renamed from: g */
        final /* synthetic */ C4970a f8785g;

        /* renamed from: h */
        final /* synthetic */ int f8786h;

        /* renamed from: i */
        final /* synthetic */ String f8787i;

        C4972a(Context context, C4970a aVar, int i, String str) {
            this.f8784f = context;
            this.f8785g = aVar;
            this.f8786h = i;
            this.f8787i = str;
        }

        public C4978g call() throws Exception {
            C4978g a = C4971b.m8815a(this.f8784f, this.f8785g, this.f8786h);
            Typeface typeface = a.f8798a;
            if (typeface != null) {
                C4971b.f8779a.mo16949a(this.f8787i, typeface);
            }
            return a;
        }
    }

    /* renamed from: l.h.i.b$b */
    /* compiled from: FontsContractCompat */
    class C4973b implements C4979c.C4984d<C4978g> {

        /* renamed from: a */
        final /* synthetic */ C0406f.C0407a f8788a;

        /* renamed from: b */
        final /* synthetic */ Handler f8789b;

        C4973b(C0406f.C0407a aVar, Handler handler) {
            this.f8788a = aVar;
            this.f8789b = handler;
        }

        /* renamed from: a */
        public void mo17392a(C4978g gVar) {
            if (gVar == null) {
                this.f8788a.mo2315a(1, this.f8789b);
                return;
            }
            int i = gVar.f8799b;
            if (i == 0) {
                this.f8788a.mo2316a(gVar.f8798a, this.f8789b);
            } else {
                this.f8788a.mo2315a(i, this.f8789b);
            }
        }
    }

    /* renamed from: l.h.i.b$c */
    /* compiled from: FontsContractCompat */
    class C4974c implements C4979c.C4984d<C4978g> {

        /* renamed from: a */
        final /* synthetic */ String f8790a;

        C4974c(String str) {
            this.f8790a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p050l.p075h.p081i.C4979c.C4984d) r1.get(r0)).mo17392a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17392a(p050l.p075h.p081i.C4971b.C4978g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p050l.p075h.p081i.C4971b.f8781c
                monitor-enter(r0)
                l.e.g<java.lang.String, java.util.ArrayList<l.h.i.c$d<l.h.i.b$g>>> r1 = p050l.p075h.p081i.C4971b.f8782d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f8790a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                l.e.g<java.lang.String, java.util.ArrayList<l.h.i.c$d<l.h.i.b$g>>> r2 = p050l.p075h.p081i.C4971b.f8782d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f8790a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                l.h.i.c$d r2 = (p050l.p075h.p081i.C4979c.C4984d) r2
                r2.mo17392a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p081i.C4971b.C4974c.mo17392a(l.h.i.b$g):void");
        }
    }

    /* renamed from: l.h.i.b$d */
    /* compiled from: FontsContractCompat */
    class C4975d implements Comparator<byte[]> {
        C4975d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p081i.C4971b.C4975d.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: l.h.i.b$e */
    /* compiled from: FontsContractCompat */
    public static class C4976e {

        /* renamed from: a */
        private final int f8791a;

        /* renamed from: b */
        private final C4977f[] f8792b;

        public C4976e(int i, C4977f[] fVarArr) {
            this.f8791a = i;
            this.f8792b = fVarArr;
        }

        /* renamed from: a */
        public C4977f[] mo17397a() {
            return this.f8792b;
        }

        /* renamed from: b */
        public int mo17398b() {
            return this.f8791a;
        }
    }

    /* renamed from: l.h.i.b$f */
    /* compiled from: FontsContractCompat */
    public static class C4977f {

        /* renamed from: a */
        private final Uri f8793a;

        /* renamed from: b */
        private final int f8794b;

        /* renamed from: c */
        private final int f8795c;

        /* renamed from: d */
        private final boolean f8796d;

        /* renamed from: e */
        private final int f8797e;

        public C4977f(Uri uri, int i, int i2, boolean z, int i3) {
            C5008h.m8899a(uri);
            this.f8793a = uri;
            this.f8794b = i;
            this.f8795c = i2;
            this.f8796d = z;
            this.f8797e = i3;
        }

        /* renamed from: a */
        public int mo17399a() {
            return this.f8797e;
        }

        /* renamed from: b */
        public int mo17400b() {
            return this.f8794b;
        }

        /* renamed from: c */
        public Uri mo17401c() {
            return this.f8793a;
        }

        /* renamed from: d */
        public int mo17402d() {
            return this.f8795c;
        }

        /* renamed from: e */
        public boolean mo17403e() {
            return this.f8796d;
        }
    }

    /* renamed from: l.h.i.b$g */
    /* compiled from: FontsContractCompat */
    private static final class C4978g {

        /* renamed from: a */
        final Typeface f8798a;

        /* renamed from: b */
        final int f8799b;

        C4978g(Typeface typeface, int i) {
            this.f8798a = typeface;
            this.f8799b = i;
        }
    }

    /* renamed from: a */
    static C4978g m8815a(Context context, C4970a aVar, int i) {
        try {
            C4976e a = m8814a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo17398b() == 0) {
                Typeface a2 = C4954d.m8729a(context, (CancellationSignal) null, a.mo17397a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C4978g(a2, i2);
            }
            if (a.mo17398b() == 1) {
                i2 = -2;
            }
            return new C4978g((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C4978g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        f8780b.mo17407a(r1, new p050l.p075h.p081i.C4971b.C4974c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m8810a(android.content.Context r2, p050l.p075h.p081i.C4970a r3, androidx.core.content.p003c.C0406f.C0407a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo17386c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            l.e.e<java.lang.String, android.graphics.Typeface> r1 = f8779a
            java.lang.Object r1 = r1.mo16953b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1795a((android.graphics.Typeface) r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            l.h.i.b$g r2 = m8815a((android.content.Context) r2, (p050l.p075h.p081i.C4970a) r3, (int) r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f8799b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f8798a
            r4.mo2316a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x0040
        L_0x003d:
            r4.mo2315a((int) r3, (android.os.Handler) r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f8798a
            return r2
        L_0x0043:
            l.h.i.b$a r1 = new l.h.i.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            l.h.i.c r3 = f8780b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo17404a(r1, (int) r7)     // Catch:{ InterruptedException -> 0x0055 }
            l.h.i.b$g r3 = (p050l.p075h.p081i.C4971b.C4978g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f8798a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            l.h.i.b$b r3 = new l.h.i.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f8781c
            monitor-enter(r4)
            l.e.g<java.lang.String, java.util.ArrayList<l.h.i.c$d<l.h.i.b$g>>> r5 = f8782d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            l.e.g<java.lang.String, java.util.ArrayList<l.h.i.c$d<l.h.i.b$g>>> r3 = f8782d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            l.h.i.c r3 = f8780b
            l.h.i.b$c r4 = new l.h.i.b$c
            r4.<init>(r0)
            r3.mo17407a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p081i.C4971b.m8810a(android.content.Context, l.h.i.a, androidx.core.content.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m8813a(Context context, C4977f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C4977f fVar : fVarArr) {
            if (fVar.mo17399a() == 0) {
                Uri c = fVar.mo17401c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C4964k.m8793a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C4976e m8814a(Context context, CancellationSignal cancellationSignal, C4970a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo a = m8809a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C4976e(1, (C4977f[]) null);
        }
        return new C4976e(0, m8817a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m8809a(PackageManager packageManager, C4970a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String d = aVar.mo17387d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.mo17388e())) {
            List<byte[]> a = m8812a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f8783e);
            List<List<byte[]>> a2 = m8811a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList(a2.get(i));
                Collections.sort(arrayList, f8783e);
                if (m8816a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.mo17388e());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m8811a(C4970a aVar, Resources resources) {
        if (aVar.mo17384a() != null) {
            return aVar.mo17384a();
        }
        return C0398c.m1940a(resources, aVar.mo17385b());
    }

    /* renamed from: a */
    private static boolean m8816a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m8812a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p050l.p075h.p081i.C4971b.C4977f[] m8817a(android.content.Context r23, p050l.p075h.p081i.C4970a r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
            r0 = r25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0147 }
            r5 = 16
            java.lang.String r9 = "font_variation_settings"
            r11 = 2
            r12 = 7
            java.lang.String r13 = "result_code"
            java.lang.String r14 = "font_italic"
            java.lang.String r15 = "font_weight"
            java.lang.String r3 = "font_ttc_index"
            java.lang.String r6 = "file_id"
            java.lang.String r7 = "_id"
            r8 = 1
            r10 = 0
            if (r4 <= r5) goto L_0x0083
            android.content.ContentResolver r4 = r23.getContentResolver()     // Catch:{ all -> 0x0147 }
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x0147 }
            r12[r10] = r7     // Catch:{ all -> 0x0147 }
            r12[r8] = r6     // Catch:{ all -> 0x0147 }
            r12[r11] = r3     // Catch:{ all -> 0x0147 }
            r5 = 3
            r12[r5] = r9     // Catch:{ all -> 0x0147 }
            r5 = 4
            r12[r5] = r15     // Catch:{ all -> 0x0147 }
            r5 = 5
            r12[r5] = r14     // Catch:{ all -> 0x0147 }
            r5 = 6
            r12[r5] = r13     // Catch:{ all -> 0x0147 }
            java.lang.String r9 = "query = ?"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ all -> 0x0147 }
            java.lang.String r5 = r24.mo17389f()     // Catch:{ all -> 0x0147 }
            r11[r10] = r5     // Catch:{ all -> 0x0147 }
            r16 = 0
            r5 = r2
            r20 = r1
            r1 = r6
            r6 = r12
            r12 = r7
            r7 = r9
            r9 = 1
            r8 = r11
            r11 = 1
            r9 = r16
            r11 = 0
            r10 = r26
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0147 }
            r10 = r12
            r11 = 1
            goto L_0x00b5
        L_0x0083:
            r20 = r1
            r1 = r6
            r10 = r7
            r4 = 2
            r11 = 0
            android.content.ContentResolver r5 = r23.getContentResolver()     // Catch:{ all -> 0x0147 }
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ all -> 0x0147 }
            r6[r11] = r10     // Catch:{ all -> 0x0147 }
            r6[r8] = r1     // Catch:{ all -> 0x0147 }
            r6[r4] = r3     // Catch:{ all -> 0x0147 }
            r4 = 3
            r6[r4] = r9     // Catch:{ all -> 0x0147 }
            r4 = 4
            r6[r4] = r15     // Catch:{ all -> 0x0147 }
            r4 = 5
            r6[r4] = r14     // Catch:{ all -> 0x0147 }
            r4 = 6
            r6[r4] = r13     // Catch:{ all -> 0x0147 }
            java.lang.String r7 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0147 }
            java.lang.String r4 = r24.mo17389f()     // Catch:{ all -> 0x0147 }
            r9[r11] = r4     // Catch:{ all -> 0x0147 }
            r12 = 0
            r4 = r5
            r5 = r2
            r11 = 1
            r8 = r9
            r9 = r12
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0147 }
        L_0x00b5:
            if (r4 == 0) goto L_0x0136
            int r5 = r4.getCount()     // Catch:{ all -> 0x0133 }
            if (r5 <= 0) goto L_0x0136
            int r5 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x0133 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0133 }
            r6.<init>()     // Catch:{ all -> 0x0133 }
            int r7 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x0133 }
            int r1 = r4.getColumnIndex(r1)     // Catch:{ all -> 0x0133 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0133 }
            int r8 = r4.getColumnIndex(r15)     // Catch:{ all -> 0x0133 }
            int r9 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0133 }
        L_0x00da:
            boolean r10 = r4.moveToNext()     // Catch:{ all -> 0x0133 }
            if (r10 == 0) goto L_0x0131
            r10 = -1
            if (r5 == r10) goto L_0x00ea
            int r12 = r4.getInt(r5)     // Catch:{ all -> 0x0133 }
            r22 = r12
            goto L_0x00ec
        L_0x00ea:
            r22 = 0
        L_0x00ec:
            if (r3 == r10) goto L_0x00f5
            int r12 = r4.getInt(r3)     // Catch:{ all -> 0x0133 }
            r19 = r12
            goto L_0x00f7
        L_0x00f5:
            r19 = 0
        L_0x00f7:
            if (r1 != r10) goto L_0x0102
            long r12 = r4.getLong(r7)     // Catch:{ all -> 0x0133 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch:{ all -> 0x0133 }
            goto L_0x010a
        L_0x0102:
            long r12 = r4.getLong(r1)     // Catch:{ all -> 0x0133 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x0133 }
        L_0x010a:
            r18 = r12
            if (r8 == r10) goto L_0x0115
            int r12 = r4.getInt(r8)     // Catch:{ all -> 0x0133 }
            r20 = r12
            goto L_0x0119
        L_0x0115:
            r12 = 400(0x190, float:5.6E-43)
            r20 = 400(0x190, float:5.6E-43)
        L_0x0119:
            if (r9 == r10) goto L_0x0124
            int r10 = r4.getInt(r9)     // Catch:{ all -> 0x0133 }
            if (r10 != r11) goto L_0x0124
            r21 = 1
            goto L_0x0126
        L_0x0124:
            r21 = 0
        L_0x0126:
            l.h.i.b$f r10 = new l.h.i.b$f     // Catch:{ all -> 0x0133 }
            r17 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0133 }
            r6.add(r10)     // Catch:{ all -> 0x0133 }
            goto L_0x00da
        L_0x0131:
            r1 = r6
            goto L_0x0138
        L_0x0133:
            r0 = move-exception
            r3 = r4
            goto L_0x0149
        L_0x0136:
            r1 = r20
        L_0x0138:
            if (r4 == 0) goto L_0x013d
            r4.close()
        L_0x013d:
            r0 = 0
            l.h.i.b$f[] r0 = new p050l.p075h.p081i.C4971b.C4977f[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            l.h.i.b$f[] r0 = (p050l.p075h.p081i.C4971b.C4977f[]) r0
            return r0
        L_0x0147:
            r0 = move-exception
            r3 = 0
        L_0x0149:
            if (r3 == 0) goto L_0x014e
            r3.close()
        L_0x014e:
            goto L_0x0150
        L_0x014f:
            throw r0
        L_0x0150:
            goto L_0x014f
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p081i.C4971b.m8817a(android.content.Context, l.h.i.a, java.lang.String, android.os.CancellationSignal):l.h.i.b$f[]");
    }
}
