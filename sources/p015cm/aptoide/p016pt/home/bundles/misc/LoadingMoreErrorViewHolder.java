package p015cm.aptoide.p016pt.home.bundles.misc;

import android.view.View;
import android.widget.Button;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.misc.LoadingMoreErrorViewHolder */
public class LoadingMoreErrorViewHolder extends AppBundleViewHolder {
    private Button retry;
    private C12871b<HomeEvent> uiEventsListener;

    public LoadingMoreErrorViewHolder(View view, C12871b<HomeEvent> bVar) {
        super(view);
        this.retry = (Button) view.findViewById(C1086R.C1088id.load_more_retry_button);
        this.uiEventsListener = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12386a(HomeBundle homeBundle, int i, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, i, HomeEvent.Type.LOAD_MORE_RETRY));
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        this.retry.setOnClickListener(new C2916a(this, homeBundle, i));
    }
}
