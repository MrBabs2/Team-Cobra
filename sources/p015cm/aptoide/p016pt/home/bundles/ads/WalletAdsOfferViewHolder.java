package p015cm.aptoide.p016pt.home.bundles.ads;

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
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.ads.WalletAdsOfferViewHolder */
public class WalletAdsOfferViewHolder extends AppBundleViewHolder {
    private final Button dismissButton;
    private final ImageView icon;
    private View infoLayout;
    private final Button installWalletButton;
    private final TextView message;
    private Skeleton skeleton;
    private final TextView title;
    private final C12871b<HomeEvent> uiEventsListener;

    public WalletAdsOfferViewHolder(View view, C12871b<HomeEvent> bVar) {
        super(view);
        this.uiEventsListener = bVar;
        this.installWalletButton = (Button) view.findViewById(C1086R.C1088id.action_button);
        this.dismissButton = (Button) view.findViewById(C1086R.C1088id.dismiss_button);
        this.icon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.title = (TextView) view.findViewById(C1086R.C1088id.title);
        this.message = (TextView) view.findViewById(C1086R.C1088id.message);
        View findViewById = view.findViewById(C1086R.C1088id.card_info_layout);
        this.infoLayout = findViewById;
        this.skeleton = SkeletonUtils.applySkeleton(findViewById, (ViewGroup) view.findViewById(C1086R.C1088id.root_layout), (int) C1086R.layout.info_action_item_card_skeleton);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12252a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.INSTALL_WALLET));
    }

    /* renamed from: b */
    public /* synthetic */ void mo12253b(HomeBundle homeBundle, View view) {
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
        this.installWalletButton.setText(C1086R.string.wallet_promotion_install_button);
        this.dismissButton.setText(C1086R.string.wallet_promotion_no_button);
        this.title.setText(actionItem.getTitle());
        this.message.setText(actionItem.getSubTitle());
        this.installWalletButton.setOnClickListener(new C2880d(this, homeBundle));
        this.dismissButton.setOnClickListener(new C2879c(this, homeBundle));
    }
}
