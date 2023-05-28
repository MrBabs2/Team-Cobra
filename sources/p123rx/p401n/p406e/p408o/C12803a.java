package p123rx.p401n.p406e.p408o;

import java.util.Iterator;
import p123rx.p401n.p406e.p407n.C12797c;

/* renamed from: rx.n.e.o.a */
/* compiled from: BaseLinkedQueue */
abstract class C12803a<E> extends C12804b<E> {
    C12803a() {
    }

    public final boolean isEmpty() {
        return mo41004c() == mo41005a();
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        C12797c c;
        C12797c c2 = mo41004c();
        C12797c a = mo41005a();
        int i = 0;
        while (c2 != a && i < Integer.MAX_VALUE) {
            do {
                c = c2.mo40935c();
            } while (c == null);
            i++;
            c2 = c;
        }
        return i;
    }
}
