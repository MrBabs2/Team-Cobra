package p112n.p277e.p279b.p282b.p295x;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p050l.p075h.p076e.C4949a;

/* renamed from: n.e.b.b.x.b */
/* compiled from: RippleUtils */
public class C10629b {

    /* renamed from: a */
    public static final boolean f28531a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f28532b = {16842919};

    /* renamed from: c */
    private static final int[] f28533c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f28534d = {16842908};

    /* renamed from: e */
    private static final int[] f28535e = {16843623};

    /* renamed from: f */
    private static final int[] f28536f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f28537g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f28538h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f28539i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f28540j = {16842913};

    /* renamed from: k */
    private static final int[] f28541k = {16842910, 16842919};

    /* renamed from: l */
    static final String f28542l = C10629b.class.getSimpleName();

    private C10629b() {
    }

    /* renamed from: a */
    public static ColorStateList m35981a(ColorStateList colorStateList) {
        if (f28531a) {
            return new ColorStateList(new int[][]{f28540j, StateSet.NOTHING}, new int[]{m35980a(colorStateList, f28536f), m35980a(colorStateList, f28532b)});
        }
        int[] iArr = f28536f;
        int[] iArr2 = f28537g;
        int[] iArr3 = f28538h;
        int[] iArr4 = f28539i;
        int[] iArr5 = f28532b;
        int[] iArr6 = f28533c;
        int[] iArr7 = f28534d;
        int[] iArr8 = f28535e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f28540j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m35980a(colorStateList, iArr), m35980a(colorStateList, iArr2), m35980a(colorStateList, iArr3), m35980a(colorStateList, iArr4), 0, m35980a(colorStateList, iArr5), m35980a(colorStateList, iArr6), m35980a(colorStateList, iArr7), m35980a(colorStateList, iArr8), 0});
    }

    /* renamed from: b */
    public static ColorStateList m35983b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f28541k, 0)) != 0) {
            Log.w(f28542l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: a */
    public static boolean m35982a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: a */
    private static int m35980a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f28531a ? m35979a(colorForState) : colorForState;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m35979a(int i) {
        return C4949a.m8709d(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
