package p015cm.aptoide.p016pt.dataprovider.interfaces;

import java.util.List;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.dataprovider.interfaces.EndlessControllerWithCache */
public interface EndlessControllerWithCache<U> extends EndlessController<U> {
    C5368e<List<U>> loadMore(boolean z);
}
