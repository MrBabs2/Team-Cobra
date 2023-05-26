package p015cm.aptoide.p016pt.app.view;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import java.util.Date;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.GridAppListWidget */
public class GridAppListWidget extends Widget<GridAppListDisplayable> {
    public ImageView icon;
    public TextView name;
    private TextView tvStoreName;
    private TextView tvTimeSinceModified;

    public GridAppListWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7525a(App app, GridAppListDisplayable gridAppListDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), gridAppListDisplayable.getTag()), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.name = (TextView) view.findViewById(C1086R.C1088id.name);
        this.icon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.tvTimeSinceModified = (TextView) view.findViewById(C1086R.C1088id.timeSinceModified);
        this.tvStoreName = (TextView) view.findViewById(C1086R.C1088id.storeName);
    }

    public void bindView(GridAppListDisplayable gridAppListDisplayable, int i) {
        App app = (App) gridAppListDisplayable.getPojo();
        this.name.setText(app.getName());
        Date updated = app.getUpdated();
        if (updated != null) {
            this.tvTimeSinceModified.setText(AptoideUtils.DateTimeU.getInstance(this.itemView.getContext()).getTimeDiffString(this.itemView.getContext(), updated.getTime(), getContext().getResources()));
        }
        this.name.setText(app.getName());
        this.name.setTypeface((Typeface) null, 1);
        this.tvStoreName.setText(app.getStore().getName());
        this.tvStoreName.setTypeface((Typeface) null, 1);
        C0456c context = getContext();
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C1569fe(this, app, gridAppListDisplayable), (C5378b<Throwable>) C1551ee.f4075f));
        ImageLoader.with(context).load(app.getIcon(), this.icon);
    }
}
