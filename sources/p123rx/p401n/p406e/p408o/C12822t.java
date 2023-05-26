package p123rx.p401n.p406e.p408o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: rx.n.e.o.t */
/* compiled from: SpscArrayQueue */
abstract class C12822t<E> extends C12808f<E> {

    /* renamed from: k */
    private static final Integer f33040k = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);

    public C12822t(int i) {
        super(i);
        Math.min(i / 4, f33040k.intValue());
    }
}
