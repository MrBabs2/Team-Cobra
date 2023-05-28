package com.bumptech.glide.load.engine.p147z;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p166r.C6316k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.z.n */
/* compiled from: SizeConfigStrategy */
public class C6018n implements C6016l {

    /* renamed from: d */
    private static final Bitmap.Config[] f11084d;

    /* renamed from: e */
    private static final Bitmap.Config[] f11085e;

    /* renamed from: f */
    private static final Bitmap.Config[] f11086f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f11087g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f11088h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C6021c f11089a = new C6021c();

    /* renamed from: b */
    private final C6007h<C6020b, Bitmap> f11090b = new C6007h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f11091c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.z.n$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C6019a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11092a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11092a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11092a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11092a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11092a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.p147z.C6018n.C6019a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.z.n$c */
    /* compiled from: SizeConfigStrategy */
    static class C6021c extends C6003d<C6020b> {
        C6021c() {
        }

        /* renamed from: a */
        public C6020b mo20307a(int i, Bitmap.Config config) {
            C6020b bVar = (C6020b) mo20279b();
            bVar.mo20303a(i, config);
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C6020b m12059a() {
            return new C6020b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f11084d = configArr;
        f11085e = configArr;
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m12050b(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f11091c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11091c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public void mo20265a(Bitmap bitmap) {
        C6020b a = this.f11089a.mo20307a(C6316k.m12988a(bitmap), bitmap.getConfig());
        this.f11090b.mo20288a(a, bitmap);
        NavigableMap<Integer, Integer> b = m12050b(bitmap.getConfig());
        Integer num = (Integer) b.get(Integer.valueOf(a.f11094b));
        Integer valueOf = Integer.valueOf(a.f11094b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: c */
    public String mo20268c(Bitmap bitmap) {
        return m12049b(C6316k.m12988a(bitmap), bitmap.getConfig());
    }

    public Bitmap removeLast() {
        Bitmap a = this.f11090b.mo20286a();
        if (a != null) {
            m12047a(Integer.valueOf(C6316k.m12988a(a)), a);
        }
        return a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f11090b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f11091c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f11091c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: com.bumptech.glide.load.engine.z.n$b */
    /* compiled from: SizeConfigStrategy */
    static final class C6020b implements C6017m {

        /* renamed from: a */
        private final C6021c f11093a;

        /* renamed from: b */
        int f11094b;

        /* renamed from: c */
        private Bitmap.Config f11095c;

        public C6020b(C6021c cVar) {
            this.f11093a = cVar;
        }

        /* renamed from: a */
        public void mo20303a(int i, Bitmap.Config config) {
            this.f11094b = i;
            this.f11095c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6020b)) {
                return false;
            }
            C6020b bVar = (C6020b) obj;
            if (this.f11094b != bVar.f11094b || !C6316k.m13000b((Object) this.f11095c, (Object) bVar.f11095c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f11094b * 31;
            Bitmap.Config config = this.f11095c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C6018n.m12049b(this.f11094b, this.f11095c);
        }

        /* renamed from: a */
        public void mo20271a() {
            this.f11093a.mo20278a(this);
        }
    }

    /* renamed from: b */
    public String mo20267b(int i, int i2, Bitmap.Config config) {
        return m12049b(C6316k.m12986a(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo20266b(Bitmap bitmap) {
        return C6316k.m12988a(bitmap);
    }

    /* renamed from: b */
    static String m12049b(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public Bitmap mo20264a(int i, int i2, Bitmap.Config config) {
        C6020b a = m12046a(C6316k.m12986a(i, i2, config), config);
        Bitmap a2 = this.f11090b.mo20287a(a);
        if (a2 != null) {
            m12047a(Integer.valueOf(a.f11094b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    /* renamed from: a */
    private C6020b m12046a(int i, Bitmap.Config config) {
        C6020b a = this.f11089a.mo20307a(i, config);
        Bitmap.Config[] a2 = m12048a(config);
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = a2[i2];
            Integer ceilingKey = m12050b(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f11089a.mo20278a(a);
                return this.f11089a.mo20307a(ceilingKey.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: a */
    private void m12047a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> b = m12050b(bitmap.getConfig());
        Integer num2 = (Integer) b.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo20268c(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            b.remove(num);
        } else {
            b.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private static Bitmap.Config[] m12048a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f11085e;
        }
        int i = C6019a.f11092a[config.ordinal()];
        if (i == 1) {
            return f11084d;
        }
        if (i == 2) {
            return f11086f;
        }
        if (i == 3) {
            return f11087g;
        }
        if (i == 4) {
            return f11088h;
        }
        return new Bitmap.Config[]{config};
    }
}
