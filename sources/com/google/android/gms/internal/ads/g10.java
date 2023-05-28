package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class g10 implements zzlx {

    /* renamed from: b */
    private int f15250b = -1;

    /* renamed from: c */
    private int f15251c = -1;

    /* renamed from: d */
    private int[] f15252d;

    /* renamed from: e */
    private boolean f15253e;

    /* renamed from: f */
    private int[] f15254f;

    /* renamed from: g */
    private ByteBuffer f15255g;

    /* renamed from: h */
    private ByteBuffer f15256h;

    /* renamed from: i */
    private boolean f15257i;

    public g10() {
        ByteBuffer byteBuffer = zzlx.f22232a;
        this.f15255g = byteBuffer;
        this.f15256h = byteBuffer;
    }

    /* renamed from: a */
    public final void mo25941a(int[] iArr) {
        this.f15252d = iArr;
    }

    /* renamed from: b */
    public final boolean mo25943b() {
        return this.f15253e;
    }

    /* renamed from: c */
    public final void mo25944c() {
        this.f15257i = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo25945d() {
        ByteBuffer byteBuffer = this.f15256h;
        this.f15256h = zzlx.f22232a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final int mo25946e() {
        int[] iArr = this.f15254f;
        return iArr == null ? this.f15250b : iArr.length;
    }

    /* renamed from: f */
    public final int mo25947f() {
        return 2;
    }

    public final void flush() {
        this.f15256h = zzlx.f22232a;
        this.f15257i = false;
    }

    /* renamed from: n */
    public final boolean mo25949n() {
        return this.f15257i && this.f15256h == zzlx.f22232a;
    }

    /* renamed from: a */
    public final boolean mo25942a(int i, int i2, int i3) throws zzly {
        boolean z = !Arrays.equals(this.f15252d, this.f15254f);
        int[] iArr = this.f15252d;
        this.f15254f = iArr;
        if (iArr == null) {
            this.f15253e = false;
            return z;
        } else if (i3 != 2) {
            throw new zzly(i, i2, i3);
        } else if (!z && this.f15251c == i && this.f15250b == i2) {
            return false;
        } else {
            this.f15251c = i;
            this.f15250b = i2;
            this.f15253e = i2 != this.f15254f.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f15254f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f15253e = (i5 != i4) | this.f15253e;
                    i4++;
                } else {
                    throw new zzly(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25940a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f15250b * 2)) * this.f15254f.length) << 1;
        if (this.f15255g.capacity() < length) {
            this.f15255g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f15255g.clear();
        }
        while (position < limit) {
            for (int i : this.f15254f) {
                this.f15255g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f15250b << 1;
        }
        byteBuffer.position(limit);
        this.f15255g.flip();
        this.f15256h = this.f15255g;
    }

    /* renamed from: a */
    public final void mo25939a() {
        flush();
        this.f15255g = zzlx.f22232a;
        this.f15250b = -1;
        this.f15251c = -1;
        this.f15254f = null;
        this.f15253e = false;
    }
}
