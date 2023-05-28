package p015cm.aptoide.p016pt.dataprovider.interfaces;

import java.util.List;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.dataprovider.interfaces.EndlessController */
public interface EndlessController<U> {
    C5368e<List<U>> get();

    C5368e<List<U>> loadMore();
}
