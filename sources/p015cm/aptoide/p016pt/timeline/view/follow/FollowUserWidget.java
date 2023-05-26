package p015cm.aptoide.p016pt.timeline.view.follow;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowUserDisplayable;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.timeline.view.follow.FollowUserWidget */
public class FollowUserWidget extends Widget<FollowUserDisplayable> {
    private LinearLayout followNumbers;
    private TextView followersNumber;
    private TextView followingNumber;
    private ImageView mainIcon;
    private ImageView secondaryIcon;
    private View separatorView;
    private TextView storeNameTv;
    private TextView userNameTv;

    public FollowUserWidget(View view) {
        super(view);
    }

    private void setupStoreNameTv(String str) {
        Drawable drawable;
        this.storeNameTv.setText(str);
        this.storeNameTv.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = getContext().getResources().getDrawable(C1086R.C1087drawable.ic_store, (Resources.Theme) null);
        } else {
            drawable = getContext().getResources().getDrawable(C1086R.C1087drawable.ic_store);
        }
        drawable.setBounds(0, 0, 30, 30);
        drawable.mutate();
        this.storeNameTv.setCompoundDrawablePadding(5);
        this.storeNameTv.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14941a(FollowUserDisplayable followUserDisplayable, Void voidR) {
        followUserDisplayable.viewClicked(getFragmentNavigator());
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.userNameTv = (TextView) view.findViewById(C1086R.C1088id.user_name);
        this.storeNameTv = (TextView) view.findViewById(C1086R.C1088id.store_name);
        this.followingNumber = (TextView) view.findViewById(C1086R.C1088id.following_number);
        this.followersNumber = (TextView) view.findViewById(C1086R.C1088id.followers_number);
        this.mainIcon = (ImageView) view.findViewById(C1086R.C1088id.main_icon);
        this.secondaryIcon = (ImageView) view.findViewById(C1086R.C1088id.secondary_icon);
        this.followNumbers = (LinearLayout) view.findViewById(C1086R.C1088id.followers_following_numbers);
        this.separatorView = view.findViewById(C1086R.C1088id.separator_vertical);
    }

    public void bindView(FollowUserDisplayable followUserDisplayable, int i) {
        this.followNumbers.setVisibility(0);
        this.separatorView.setVisibility(0);
        this.followingNumber.setText(followUserDisplayable.getFollowing());
        this.followersNumber.setText(followUserDisplayable.getFollowers());
        C0456c context = getContext();
        if (followUserDisplayable.hasStoreAndUser()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getStoreAvatar(), this.mainIcon);
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getUserAvatar(), this.secondaryIcon);
            this.mainIcon.setVisibility(0);
            this.secondaryIcon.setVisibility(0);
        } else if (followUserDisplayable.hasUser()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getUserAvatar(), this.mainIcon);
            this.secondaryIcon.setVisibility(8);
        } else if (followUserDisplayable.hasStore()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getStoreAvatar(), this.mainIcon);
            this.secondaryIcon.setVisibility(8);
        } else {
            this.mainIcon.setVisibility(8);
            this.secondaryIcon.setVisibility(8);
        }
        if (followUserDisplayable.hasUser()) {
            this.userNameTv.setText(followUserDisplayable.getUserName());
            this.userNameTv.setVisibility(0);
        } else {
            this.userNameTv.setVisibility(8);
        }
        if (followUserDisplayable.hasStore()) {
            setupStoreNameTv(followUserDisplayable.storeName());
        } else {
            this.storeNameTv.setVisibility(8);
        }
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4401c(this, followUserDisplayable), (C5378b<Throwable>) C4400b.f7558f));
    }
}
