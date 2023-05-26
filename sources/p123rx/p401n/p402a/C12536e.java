package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import p123rx.C5328b;
import p123rx.exceptions.CompositeException;

/* renamed from: rx.n.a.e */
/* compiled from: CompletableOnSubscribeMerge */
public final class C12536e implements C5328b.C5366w {
    /* renamed from: a */
    public static Throwable m40998a(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Throwable) arrayList.get(0);
        }
        return new CompositeException((Collection<? extends Throwable>) arrayList);
    }
}
