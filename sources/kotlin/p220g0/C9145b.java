package kotlin.p220g0;

import java.util.NoSuchElementException;
import kotlin.p262y.C10507e0;

/* renamed from: kotlin.g0.b */
/* compiled from: ProgressionIterators.kt */
public final class C9145b extends C10507e0 {

    /* renamed from: f */
    private final int f25684f;

    /* renamed from: g */
    private boolean f25685g;

    /* renamed from: h */
    private int f25686h;

    /* renamed from: i */
    private final int f25687i;

    public C9145b(int i, int i2, int i3) {
        this.f25687i = i3;
        this.f25684f = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f25685g = z;
        this.f25686h = !z ? this.f25684f : i;
    }

    /* renamed from: a */
    public int mo33492a() {
        int i = this.f25686h;
        if (i != this.f25684f) {
            this.f25686h = this.f25687i + i;
        } else if (this.f25685g) {
            this.f25685g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f25685g;
    }
}
