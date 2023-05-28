package com.airbnb.lottie.p129q.p130a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5754i;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.m */
/* compiled from: PolystarContent */
public class C5696m implements C5695l, C5703a.C5704a, C5692j {

    /* renamed from: a */
    private final Path f10135a = new Path();

    /* renamed from: b */
    private final String f10136b;

    /* renamed from: c */
    private final C5656f f10137c;

    /* renamed from: d */
    private final C5754i.C5755a f10138d;

    /* renamed from: e */
    private final C5703a<?, Float> f10139e;

    /* renamed from: f */
    private final C5703a<?, PointF> f10140f;

    /* renamed from: g */
    private final C5703a<?, Float> f10141g;

    /* renamed from: h */
    private final C5703a<?, Float> f10142h;

    /* renamed from: i */
    private final C5703a<?, Float> f10143i;

    /* renamed from: j */
    private final C5703a<?, Float> f10144j;

    /* renamed from: k */
    private final C5703a<?, Float> f10145k;

    /* renamed from: l */
    private C5702r f10146l;

    /* renamed from: m */
    private boolean f10147m;

    /* renamed from: com.airbnb.lottie.q.a.m$a */
    /* compiled from: PolystarContent */
    static /* synthetic */ class C5697a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10148a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.s.j.i$a[] r0 = com.airbnb.lottie.p133s.p135j.C5754i.C5755a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10148a = r0
                com.airbnb.lottie.s.j.i$a r1 = com.airbnb.lottie.p133s.p135j.C5754i.C5755a.Star     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10148a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.s.j.i$a r1 = com.airbnb.lottie.p133s.p135j.C5754i.C5755a.Polygon     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p129q.p130a.C5696m.C5697a.<clinit>():void");
        }
    }

    public C5696m(C5656f fVar, C5768a aVar, C5754i iVar) {
        this.f10137c = fVar;
        this.f10136b = iVar.mo19608c();
        this.f10138d = iVar.mo19614i();
        this.f10139e = iVar.mo19611f().mo19562a();
        this.f10140f = iVar.mo19612g().mo19562a();
        this.f10141g = iVar.mo19613h().mo19562a();
        this.f10143i = iVar.mo19609d().mo19562a();
        this.f10145k = iVar.mo19610e().mo19562a();
        if (this.f10138d == C5754i.C5755a.Star) {
            this.f10142h = iVar.mo19606a().mo19562a();
            this.f10144j = iVar.mo19607b().mo19562a();
        } else {
            this.f10142h = null;
            this.f10144j = null;
        }
        aVar.mo19658a((C5703a<?, ?>) this.f10139e);
        aVar.mo19658a((C5703a<?, ?>) this.f10140f);
        aVar.mo19658a((C5703a<?, ?>) this.f10141g);
        aVar.mo19658a((C5703a<?, ?>) this.f10143i);
        aVar.mo19658a((C5703a<?, ?>) this.f10145k);
        if (this.f10138d == C5754i.C5755a.Star) {
            aVar.mo19658a((C5703a<?, ?>) this.f10142h);
            aVar.mo19658a((C5703a<?, ?>) this.f10144j);
        }
        this.f10139e.mo19509a((C5703a.C5704a) this);
        this.f10140f.mo19509a((C5703a.C5704a) this);
        this.f10141g.mo19509a((C5703a.C5704a) this);
        this.f10143i.mo19509a((C5703a.C5704a) this);
        this.f10145k.mo19509a((C5703a.C5704a) this);
        if (this.f10138d == C5754i.C5755a.Star) {
            this.f10142h.mo19509a((C5703a.C5704a) this);
            this.f10144j.mo19509a((C5703a.C5704a) this);
        }
    }

    /* renamed from: b */
    private void m10932b() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) this.f10139e.mo19513d().floatValue());
        C5703a<?, Float> aVar = this.f10141g;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo19513d().floatValue()) - 90.0d);
        double d4 = (double) floor;
        Double.isNaN(d4);
        float floatValue = this.f10145k.mo19513d().floatValue() / 100.0f;
        float floatValue2 = this.f10143i.mo19513d().floatValue();
        double d5 = (double) floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d5);
        float f = (float) (cos * d5);
        double sin = Math.sin(radians);
        Double.isNaN(d5);
        float f2 = (float) (sin * d5);
        this.f10135a.moveTo(f, f2);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        Double.isNaN(d6);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            double cos2 = Math.cos(d7);
            Double.isNaN(d5);
            float f3 = (float) (cos2 * d5);
            double sin2 = Math.sin(d7);
            Double.isNaN(d5);
            double d8 = ceil;
            float f4 = (float) (d5 * sin2);
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) f4, (double) f3) - 1.5707963267948966d));
                float f5 = floatValue2 * floatValue * 0.25f;
                this.f10135a.cubicTo(f - (cos3 * f5), f2 - (((float) Math.sin(atan2)) * f5), f3 + (((float) Math.cos(atan22)) * f5), f4 + (f5 * ((float) Math.sin(atan22))), f3, f4);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f10135a.lineTo(f3, f4);
            }
            Double.isNaN(d);
            d7 = d2 + d;
            i2 = i + 1;
            f2 = f4;
            f = f3;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF d9 = this.f10140f.mo19513d();
        this.f10135a.offset(d9.x, d9.y);
        this.f10135a.close();
    }

    /* renamed from: c */
    private void m10933c() {
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        double d3;
        float f9;
        float f10;
        float f11;
        float f12;
        float floatValue = this.f10139e.mo19513d().floatValue();
        C5703a<?, Float> aVar = this.f10141g;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo19513d().floatValue()) - 90.0d);
        double d4 = (double) floatValue;
        Double.isNaN(d4);
        float f13 = (float) (6.283185307179586d / d4);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((float) ((int) floatValue));
        if (f15 != 0.0f) {
            double d5 = (double) ((1.0f - f15) * f14);
            Double.isNaN(d5);
            radians += d5;
        }
        float floatValue2 = this.f10143i.mo19513d().floatValue();
        float floatValue3 = this.f10142h.mo19513d().floatValue();
        C5703a<?, Float> aVar2 = this.f10144j;
        float floatValue4 = aVar2 != null ? aVar2.mo19513d().floatValue() / 100.0f : 0.0f;
        C5703a<?, Float> aVar3 = this.f10145k;
        float floatValue5 = aVar3 != null ? aVar3.mo19513d().floatValue() / 100.0f : 0.0f;
        if (f15 != 0.0f) {
            float f16 = ((floatValue2 - floatValue3) * f15) + floatValue3;
            double d6 = (double) f16;
            double cos = Math.cos(radians);
            Double.isNaN(d6);
            d = d4;
            float f17 = (float) (d6 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d6);
            float f18 = (float) (d6 * sin);
            this.f10135a.moveTo(f17, f18);
            double d7 = (double) ((f13 * f15) / 2.0f);
            Double.isNaN(d7);
            d2 = radians + d7;
            f3 = f17;
            f = f16;
            f5 = floatValue2;
            float f19 = f14;
            f2 = f18;
            f4 = f19;
        } else {
            d = d4;
            f5 = floatValue2;
            double d8 = (double) f5;
            double cos2 = Math.cos(radians);
            Double.isNaN(d8);
            f4 = f14;
            f3 = (float) (d8 * cos2);
            double sin2 = Math.sin(radians);
            Double.isNaN(d8);
            f2 = (float) (d8 * sin2);
            this.f10135a.moveTo(f3, f2);
            double d9 = (double) f4;
            Double.isNaN(d9);
            d2 = radians + d9;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        int i = 0;
        float f20 = floatValue5;
        boolean z = false;
        while (true) {
            double d10 = (double) i;
            if (d10 < ceil) {
                float f21 = z ? f5 : floatValue3;
                float f22 = (f == 0.0f || d10 != ceil - 2.0d) ? f4 : (f13 * f15) / 2.0f;
                if (f == 0.0f || d10 != ceil - 1.0d) {
                    f6 = f13;
                    f8 = f21;
                    f7 = f5;
                } else {
                    f6 = f13;
                    f7 = f5;
                    f8 = f;
                }
                double d11 = (double) f8;
                double cos3 = Math.cos(d2);
                Double.isNaN(d11);
                double d12 = d10;
                float f23 = (float) (d11 * cos3);
                double sin3 = Math.sin(d2);
                Double.isNaN(d11);
                float f24 = (float) (d11 * sin3);
                if (floatValue4 == 0.0f && f20 == 0.0f) {
                    this.f10135a.lineTo(f23, f24);
                    d3 = d2;
                    f10 = floatValue3;
                    f9 = floatValue4;
                    f11 = f4;
                    f12 = f22;
                } else {
                    f10 = floatValue3;
                    f9 = floatValue4;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    d3 = d2;
                    f11 = f4;
                    f12 = f22;
                    double atan22 = (double) ((float) (Math.atan2((double) f24, (double) f23) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f25 = z ? f9 : f20;
                    float f26 = z ? f20 : f9;
                    float f27 = (z ? f10 : f7) * f25 * 0.47829f;
                    float f28 = cos4 * f27;
                    float f29 = f27 * sin4;
                    float f30 = (z ? f7 : f10) * f26 * 0.47829f;
                    float f31 = cos5 * f30;
                    float f32 = f30 * sin5;
                    if (f15 != 0.0f) {
                        if (i == 0) {
                            f28 *= f15;
                            f29 *= f15;
                        } else if (d12 == ceil - 1.0d) {
                            f31 *= f15;
                            f32 *= f15;
                        }
                    }
                    this.f10135a.cubicTo(f3 - f28, f2 - f29, f23 + f31, f24 + f32, f23, f24);
                }
                double d13 = (double) f12;
                Double.isNaN(d13);
                z = !z;
                i++;
                f2 = f24;
                d2 = d3 + d13;
                f4 = f11;
                f3 = f23;
                f5 = f7;
                f13 = f6;
                floatValue3 = f10;
                floatValue4 = f9;
            } else {
                PointF d14 = this.f10140f.mo19513d();
                this.f10135a.offset(d14.x, d14.y);
                this.f10135a.close();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m10934d() {
        this.f10147m = false;
        this.f10137c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19490a() {
        m10934d();
    }

    public String getName() {
        return this.f10136b;
    }

    public Path getPath() {
        if (this.f10147m) {
            return this.f10135a;
        }
        this.f10135a.reset();
        int i = C5697a.f10148a[this.f10138d.ordinal()];
        if (i == 1) {
            m10933c();
        } else if (i == 2) {
            m10932b();
        }
        this.f10135a.close();
        C5829f.m11381a(this.f10135a, this.f10146l);
        this.f10147m = true;
        return this.f10135a;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5684b bVar = list.get(i);
            if (bVar instanceof C5702r) {
                C5702r rVar = (C5702r) bVar;
                if (rVar.mo19505e() == C5766q.C5767a.Simultaneously) {
                    this.f10146l = rVar;
                    rVar.mo19501a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        C5703a<?, Float> aVar;
        C5703a<?, Float> aVar2;
        if (t == C5670j.f10036o) {
            this.f10139e.mo19510a(cVar);
        } else if (t == C5670j.f10037p) {
            this.f10141g.mo19510a(cVar);
        } else if (t == C5670j.f10029h) {
            this.f10140f.mo19510a(cVar);
        } else if (t == C5670j.f10038q && (aVar2 = this.f10142h) != null) {
            aVar2.mo19510a((C5832c<Float>) cVar);
        } else if (t == C5670j.f10039r) {
            this.f10143i.mo19510a(cVar);
        } else if (t == C5670j.f10040s && (aVar = this.f10144j) != null) {
            aVar.mo19510a((C5832c<Float>) cVar);
        } else if (t == C5670j.f10041t) {
            this.f10145k.mo19510a(cVar);
        }
    }
}
