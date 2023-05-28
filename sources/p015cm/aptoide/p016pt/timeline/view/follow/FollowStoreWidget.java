package p015cm.aptoide.p016pt.timeline.view.follow;

import android.view.View;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowStoreDisplayable;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;

/* renamed from: cm.aptoide.pt.timeline.view.follow.FollowStoreWidget */
public class FollowStoreWidget extends Widget<FollowStoreDisplayable> {
    private View storeLayout;

    public FollowStoreWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.storeLayout = view.findViewById(C1086R.C1088id.store_tab_follow_store_layout);
    }

    public void bindView(FollowStoreDisplayable followStoreDisplayable, int i) {
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.storeLayout).mo18675c(new C4399a(getContext().getSupportFragmentManager())));
    }
}
