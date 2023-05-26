package p123rx.p401n.p406e.p408o;

/* renamed from: rx.n.e.o.j */
/* compiled from: Pow2 */
public final class C12812j {
    /* renamed from: a */
    public static boolean m41366a(int i) {
        return (i & (i + -1)) == 0;
    }

    /* renamed from: b */
    public static int m41367b(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
