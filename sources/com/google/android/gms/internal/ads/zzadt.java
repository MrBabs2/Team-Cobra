package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzadt extends zzaeb {

    /* renamed from: n */
    private static final int f18024n = Color.rgb(12, 174, 206);

    /* renamed from: o */
    private static final int f18025o = Color.rgb(204, 204, 204);

    /* renamed from: p */
    private static final int f18026p = f18024n;

    /* renamed from: f */
    private final String f18027f;

    /* renamed from: g */
    private final List<zzadw> f18028g = new ArrayList();

    /* renamed from: h */
    private final List<zzaei> f18029h = new ArrayList();

    /* renamed from: i */
    private final int f18030i;

    /* renamed from: j */
    private final int f18031j;

    /* renamed from: k */
    private final int f18032k;

    /* renamed from: l */
    private final int f18033l;

    /* renamed from: m */
    private final int f18034m;

    public zzadt(String str, List<zzadw> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f18027f = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzadw zzadw = list.get(i3);
                this.f18028g.add(zzadw);
                this.f18029h.add(zzadw);
            }
        }
        this.f18030i = num != null ? num.intValue() : f18025o;
        this.f18031j = num2 != null ? num2.intValue() : f18026p;
        this.f18032k = num3 != null ? num3.intValue() : 12;
        this.f18033l = i;
        this.f18034m = i2;
    }

    /* renamed from: H */
    public final List<zzaei> mo27193H() {
        return this.f18029h;
    }

    /* renamed from: M */
    public final String mo27194M() {
        return this.f18027f;
    }

    /* renamed from: p1 */
    public final int mo27195p1() {
        return this.f18030i;
    }

    /* renamed from: q1 */
    public final int mo27196q1() {
        return this.f18031j;
    }

    /* renamed from: r1 */
    public final int mo27197r1() {
        return this.f18032k;
    }

    /* renamed from: s1 */
    public final List<zzadw> mo27198s1() {
        return this.f18028g;
    }

    /* renamed from: t1 */
    public final int mo27199t1() {
        return this.f18033l;
    }

    /* renamed from: u1 */
    public final int mo27200u1() {
        return this.f18034m;
    }
}
