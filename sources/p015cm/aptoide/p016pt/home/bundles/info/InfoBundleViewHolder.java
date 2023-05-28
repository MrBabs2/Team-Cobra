package p015cm.aptoide.p016pt.home.bundles.info;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.Translator;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.info.InfoBundleViewHolder */
public class InfoBundleViewHolder extends AppBundleViewHolder {
    private final Button dismissButton;
    private final ImageView icon;
    private View infoLayout;
    private final Button knowMoreButton;
    private final TextView message;
    private Skeleton skeleton;
    private final TextView title;
    private final C12871b<HomeEvent> uiEventsListener;

    public InfoBundleViewHolder(View view, C12871b<HomeEvent> bVar) {
        super(view);
        this.uiEventsListener = bVar;
        this.knowMoreButton = (Button) view.findViewById(C1086R.C1088id.action_button);
        this.dismissButton = (Button) view.findViewById(C1086R.C1088id.dismiss_button);
        this.icon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.title = (TextView) view.findViewById(C1086R.C1088id.title);
        this.message = (TextView) view.findViewById(C1086R.C1088id.message);
        View findViewById = view.findViewById(C1086R.C1088id.card_info_layout);
        this.infoLayout = findViewById;
        this.skeleton = SkeletonUtils.applySkeleton(findViewById, (ViewGroup) view.findViewById(C1086R.C1088id.root_layout), (int) C1086R.layout.info_action_item_card_skeleton);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12382a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.APPC_KNOW_MORE));
    }

    /* renamed from: b */
    public /* synthetic */ void mo12383b(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.DISMISS_BUNDLE));
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        ActionItem actionItem = ((ActionBundle) homeBundle).getActionItem();
        if (actionItem == null) {
            this.skeleton.showSkeleton();
            return;
        }
        this.skeleton.showOriginal();
        ImageLoader.with(this.itemView.getContext()).load(actionItem.getIcon(), this.icon);
        this.knowMoreButton.setText(C1086R.string.all_button_know_more);
        this.dismissButton.setText(C1086R.string.all_button_got_it);
        this.title.setText(Translator.translate(actionItem.getTitle(), this.itemView.getContext(), ""));
        this.message.setText(Translator.translate(actionItem.getSubTitle(), this.itemView.getContext(), ""));
        this.knowMoreButton.setOnClickListener(new C2910a(this, homeBundle));
        this.dismissButton.setOnClickListener(new C2911b(this, homeBundle));
    }
}
