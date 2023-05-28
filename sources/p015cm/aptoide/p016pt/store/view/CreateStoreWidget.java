package p015cm.aptoide.p016pt.store.view;

import android.text.ParcelableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreViewModel;
import p015cm.aptoide.p016pt.account.view.user.CreateStoreDisplayable;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p015cm.aptoide.p016pt.view.spannable.SpannableFactory;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.CreateStoreWidget */
public class CreateStoreWidget extends Widget<CreateStoreDisplayable> {
    private Button button;
    private final CrashReport crashReport = CrashReport.getInstance();
    private TextView followers;
    private TextView following;

    public CreateStoreWidget(View view) {
        super(view);
    }

    /* renamed from: b */
    static /* synthetic */ void m7303b(Void voidR) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo14620a(Void voidR) {
        getFragmentNavigator().navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), false), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.button = (Button) view.findViewById(C1086R.C1088id.create_store_action);
        this.followers = (TextView) view.findViewById(C1086R.C1088id.followers);
        this.following = (TextView) view.findViewById(C1086R.C1088id.following);
    }

    public void bindView(CreateStoreDisplayable createStoreDisplayable, int i) {
        SpannableFactory spannableFactory = new SpannableFactory();
        String format = String.format(getContext().getString(C1086R.string.storetab_short_followers), new Object[]{String.valueOf(createStoreDisplayable.getFollowers())});
        ParcelableSpan[] parcelableSpanArr = {new StyleSpan(1), new ForegroundColorSpan(createStoreDisplayable.getTextAccentColor())};
        this.followers.setText(spannableFactory.createMultiSpan(format, parcelableSpanArr, String.valueOf(createStoreDisplayable.getFollowers())));
        String format2 = String.format(getContext().getString(C1086R.string.storetab_short_followings), new Object[]{String.valueOf(createStoreDisplayable.getFollowings())});
        this.following.setText(spannableFactory.createMultiSpan(format2, parcelableSpanArr, String.valueOf(createStoreDisplayable.getFollowings())));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.button).mo18644a(C5376a.m10346b()).mo18664b(new C4384y(this)).mo18664b(new C4381x(createStoreDisplayable)).mo18655a(C4264a0.f7351f, (C5378b<Throwable>) new C4387z(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14619a(Throwable th) {
        this.crashReport.log(th);
    }
}
