package p050l.p100o.p101a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p050l.p066e.C4868a;
import p050l.p075h.p076e.C4949a;

/* renamed from: l.o.a.b */
/* compiled from: Palette */
public final class C5153b {

    /* renamed from: f */
    static final C5157c f9114f = new C5154a();

    /* renamed from: a */
    private final List<C5159e> f9115a;

    /* renamed from: b */
    private final List<C5160c> f9116b;

    /* renamed from: c */
    private final Map<C5160c, C5159e> f9117c = new C4868a();

    /* renamed from: d */
    private final SparseBooleanArray f9118d = new SparseBooleanArray();

    /* renamed from: e */
    private final C5159e f9119e = m9548b();

    /* renamed from: l.o.a.b$a */
    /* compiled from: Palette */
    static class C5154a implements C5157c {
        C5154a() {
        }

        /* renamed from: b */
        private boolean m9554b(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: c */
        private boolean m9555c(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        /* renamed from: a */
        public boolean mo17822a(int i, float[] fArr) {
            return !m9555c(fArr) && !m9553a(fArr) && !m9554b(fArr);
        }

        /* renamed from: a */
        private boolean m9553a(float[] fArr) {
            return fArr[2] <= 0.05f;
        }
    }

    /* renamed from: l.o.a.b$b */
    /* compiled from: Palette */
    public static final class C5155b {

        /* renamed from: a */
        private final List<C5159e> f9120a;

        /* renamed from: b */
        private final Bitmap f9121b;

        /* renamed from: c */
        private final List<C5160c> f9122c = new ArrayList();

        /* renamed from: d */
        private int f9123d = 16;

        /* renamed from: e */
        private int f9124e = 12544;

        /* renamed from: f */
        private int f9125f = -1;

        /* renamed from: g */
        private final List<C5157c> f9126g = new ArrayList();

        /* renamed from: h */
        private Rect f9127h;

        public C5155b(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.f9126g.add(C5153b.f9114f);
            this.f9121b = bitmap;
            this.f9120a = null;
            this.f9122c.add(C5160c.f9139e);
            this.f9122c.add(C5160c.f9140f);
            this.f9122c.add(C5160c.f9141g);
            this.f9122c.add(C5160c.f9142h);
            this.f9122c.add(C5160c.f9143i);
            this.f9122c.add(C5160c.f9144j);
        }

        /* renamed from: b */
        private Bitmap m9558b(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f9124e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f9124e;
                if (width > i2) {
                    double d2 = (double) i2;
                    double d3 = (double) width;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    d = Math.sqrt(d2 / d3);
                }
            } else if (this.f9125f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f9125f)) {
                double d4 = (double) i;
                double d5 = (double) max;
                Double.isNaN(d4);
                Double.isNaN(d5);
                d = d4 / d5;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d), false);
        }

        /* renamed from: a */
        public C5155b mo17824a(int i) {
            this.f9123d = i;
            return this;
        }

        /* renamed from: l.o.a.b$b$a */
        /* compiled from: Palette */
        class C5156a extends AsyncTask<Bitmap, Void, C5153b> {

            /* renamed from: a */
            final /* synthetic */ C5158d f9128a;

            C5156a(C5158d dVar) {
                this.f9128a = dVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C5153b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C5155b.this.mo17825a();
                } catch (Exception e) {
                    Log.e("Palette", "Exception thrown during async generate", e);
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void onPostExecute(C5153b bVar) {
                this.f9128a.mo13107a(bVar);
            }
        }

        /* renamed from: a */
        public C5153b mo17825a() {
            List<C5159e> list;
            C5157c[] cVarArr;
            Bitmap bitmap = this.f9121b;
            if (bitmap != null) {
                Bitmap b = m9558b(bitmap);
                Rect rect = this.f9127h;
                if (!(b == this.f9121b || rect == null)) {
                    double width = (double) b.getWidth();
                    double width2 = (double) this.f9121b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d = width / width2;
                    double d2 = (double) rect.left;
                    Double.isNaN(d2);
                    rect.left = (int) Math.floor(d2 * d);
                    double d3 = (double) rect.top;
                    Double.isNaN(d3);
                    rect.top = (int) Math.floor(d3 * d);
                    double d4 = (double) rect.right;
                    Double.isNaN(d4);
                    rect.right = Math.min((int) Math.ceil(d4 * d), b.getWidth());
                    double d5 = (double) rect.bottom;
                    Double.isNaN(d5);
                    rect.bottom = Math.min((int) Math.ceil(d5 * d), b.getHeight());
                }
                int[] a = m9557a(b);
                int i = this.f9123d;
                if (this.f9126g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<C5157c> list2 = this.f9126g;
                    cVarArr = (C5157c[]) list2.toArray(new C5157c[list2.size()]);
                }
                C5150a aVar = new C5150a(a, i, cVarArr);
                if (b != this.f9121b) {
                    b.recycle();
                }
                list = aVar.mo17809a();
            } else {
                list = this.f9120a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C5153b bVar = new C5153b(list, this.f9122c);
            bVar.mo17821a();
            return bVar;
        }

        /* renamed from: a */
        public AsyncTask<Bitmap, Void, C5153b> mo17823a(C5158d dVar) {
            if (dVar != null) {
                return new C5156a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f9121b});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* renamed from: a */
        private int[] m9557a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f9127h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f9127h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.f9127h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }
    }

    /* renamed from: l.o.a.b$c */
    /* compiled from: Palette */
    public interface C5157c {
        /* renamed from: a */
        boolean mo17822a(int i, float[] fArr);
    }

    /* renamed from: l.o.a.b$d */
    /* compiled from: Palette */
    public interface C5158d {
        /* renamed from: a */
        void mo13107a(C5153b bVar);
    }

    /* renamed from: l.o.a.b$e */
    /* compiled from: Palette */
    public static final class C5159e {

        /* renamed from: a */
        private final int f9130a;

        /* renamed from: b */
        private final int f9131b;

        /* renamed from: c */
        private final int f9132c;

        /* renamed from: d */
        private final int f9133d;

        /* renamed from: e */
        private final int f9134e;

        /* renamed from: f */
        private boolean f9135f;

        /* renamed from: g */
        private int f9136g;

        /* renamed from: h */
        private int f9137h;

        /* renamed from: i */
        private float[] f9138i;

        public C5159e(int i, int i2) {
            this.f9130a = Color.red(i);
            this.f9131b = Color.green(i);
            this.f9132c = Color.blue(i);
            this.f9133d = i;
            this.f9134e = i2;
        }

        /* renamed from: f */
        private void m9566f() {
            int i;
            int i2;
            if (!this.f9135f) {
                int a = C4949a.m8698a(-1, this.f9133d, 4.5f);
                int a2 = C4949a.m8698a(-1, this.f9133d, 3.0f);
                if (a == -1 || a2 == -1) {
                    int a3 = C4949a.m8698a(-16777216, this.f9133d, 4.5f);
                    int a4 = C4949a.m8698a(-16777216, this.f9133d, 3.0f);
                    if (a3 == -1 || a4 == -1) {
                        if (a != -1) {
                            i = C4949a.m8709d(-1, a);
                        } else {
                            i = C4949a.m8709d(-16777216, a3);
                        }
                        this.f9137h = i;
                        if (a2 != -1) {
                            i2 = C4949a.m8709d(-1, a2);
                        } else {
                            i2 = C4949a.m8709d(-16777216, a4);
                        }
                        this.f9136g = i2;
                        this.f9135f = true;
                        return;
                    }
                    this.f9137h = C4949a.m8709d(-16777216, a3);
                    this.f9136g = C4949a.m8709d(-16777216, a4);
                    this.f9135f = true;
                    return;
                }
                this.f9137h = C4949a.m8709d(-1, a);
                this.f9136g = C4949a.m8709d(-1, a2);
                this.f9135f = true;
            }
        }

        /* renamed from: a */
        public int mo17830a() {
            m9566f();
            return this.f9137h;
        }

        /* renamed from: b */
        public float[] mo17831b() {
            if (this.f9138i == null) {
                this.f9138i = new float[3];
            }
            C4949a.m8703a(this.f9130a, this.f9131b, this.f9132c, this.f9138i);
            return this.f9138i;
        }

        /* renamed from: c */
        public int mo17832c() {
            return this.f9134e;
        }

        /* renamed from: d */
        public int mo17833d() {
            return this.f9133d;
        }

        /* renamed from: e */
        public int mo17834e() {
            m9566f();
            return this.f9136g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5159e.class != obj.getClass()) {
                return false;
            }
            C5159e eVar = (C5159e) obj;
            if (this.f9134e == eVar.f9134e && this.f9133d == eVar.f9133d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f9133d * 31) + this.f9134e;
        }

        public String toString() {
            return C5159e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(mo17833d()) + ']' + " [HSL: " + Arrays.toString(mo17831b()) + ']' + " [Population: " + this.f9134e + ']' + " [Title Text: #" + Integer.toHexString(mo17834e()) + ']' + " [Body Text: #" + Integer.toHexString(mo17830a()) + ']';
        }
    }

    C5153b(List<C5159e> list, List<C5160c> list2) {
        this.f9115a = list;
        this.f9116b = list2;
    }

    /* renamed from: a */
    public static C5155b m9546a(Bitmap bitmap) {
        return new C5155b(bitmap);
    }

    /* renamed from: b */
    private C5159e m9549b(C5160c cVar) {
        int size = this.f9115a.size();
        float f = 0.0f;
        C5159e eVar = null;
        for (int i = 0; i < size; i++) {
            C5159e eVar2 = this.f9115a.get(i);
            if (m9550b(eVar2, cVar)) {
                float a = m9545a(eVar2, cVar);
                if (eVar == null || a > f) {
                    eVar = eVar2;
                    f = a;
                }
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public int mo17820a(int i) {
        C5159e eVar = this.f9119e;
        return eVar != null ? eVar.mo17833d() : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17821a() {
        int size = this.f9116b.size();
        for (int i = 0; i < size; i++) {
            C5160c cVar = this.f9116b.get(i);
            cVar.mo17848k();
            this.f9117c.put(cVar, m9547a(cVar));
        }
        this.f9118d.clear();
    }

    /* renamed from: b */
    private boolean m9550b(C5159e eVar, C5160c cVar) {
        float[] b = eVar.mo17831b();
        if (b[1] < cVar.mo17842e() || b[1] > cVar.mo17840c() || b[2] < cVar.mo17841d() || b[2] > cVar.mo17839b() || this.f9118d.get(eVar.mo17833d())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C5159e m9547a(C5160c cVar) {
        C5159e b = m9549b(cVar);
        if (b != null && cVar.mo17847j()) {
            this.f9118d.append(b.mo17833d(), true);
        }
        return b;
    }

    /* renamed from: b */
    private C5159e m9548b() {
        int size = this.f9115a.size();
        int i = Integer.MIN_VALUE;
        C5159e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C5159e eVar2 = this.f9115a.get(i2);
            if (eVar2.mo17832c() > i) {
                i = eVar2.mo17832c();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private float m9545a(C5159e eVar, C5160c cVar) {
        float[] b = eVar.mo17831b();
        C5159e eVar2 = this.f9119e;
        int c = eVar2 != null ? eVar2.mo17832c() : 1;
        float f = 0.0f;
        float g = cVar.mo17844g() > 0.0f ? cVar.mo17844g() * (1.0f - Math.abs(b[1] - cVar.mo17846i())) : 0.0f;
        float a = cVar.mo17838a() > 0.0f ? cVar.mo17838a() * (1.0f - Math.abs(b[2] - cVar.mo17845h())) : 0.0f;
        if (cVar.mo17843f() > 0.0f) {
            f = cVar.mo17843f() * (((float) eVar.mo17832c()) / ((float) c));
        }
        return g + a + f;
    }
}
