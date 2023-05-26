package p015cm.aptoide.p016pt.home.bundles.apps;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.Translator;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.apps.AppsBundleViewHolder */
public class AppsBundleViewHolder extends AppBundleViewHolder {
    private final AppsInBundleAdapter appsInBundleAdapter;
    private final RecyclerView appsList;
    private final TextView bundleTitle;
    private final String marketName;
    private final Button moreButton;
    private final Skeleton skeleton;
    /* access modifiers changed from: private */
    public final C12871b<HomeEvent> uiEventsListener;

    public AppsBundleViewHolder(View view, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = bVar;
        this.bundleTitle = (TextView) view.findViewById(C1086R.C1088id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1086R.C1088id.bundle_more);
        this.appsList = (RecyclerView) view.findViewById(C1086R.C1088id.apps_list);
        this.appsInBundleAdapter = new AppsInBundleAdapter(new ArrayList(), decimalFormat, bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        this.appsList.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        this.appsList.setLayoutManager(linearLayoutManager);
        this.appsList.setAdapter(this.appsInBundleAdapter);
        this.appsList.setNestedScrollingEnabled(false);
        this.skeleton = SkeletonUtils.applySkeleton(this.appsList, (int) C1086R.layout.app_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(view.getContext().getResources(), (WindowManager) view.getContext().getSystemService("window")) * 3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12285a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE));
    }

    public void setBundle(final HomeBundle homeBundle, int i) {
        if (homeBundle instanceof AppBundle) {
            this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
            if (homeBundle.getContent() == null) {
                this.skeleton.showSkeleton();
                return;
            }
            this.appsInBundleAdapter.updateBundle(homeBundle, i);
            this.appsInBundleAdapter.update(homeBundle.getContent());
            this.skeleton.showOriginal();
            this.appsList.addOnScrollListener(new RecyclerView.C0653t() {
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (i > 0) {
                        AppsBundleViewHolder.this.uiEventsListener.onNext(new HomeEvent(homeBundle, AppsBundleViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                    }
                }
            });
            this.moreButton.setOnClickListener(new C2888b(this, homeBundle));
            return;
        }
        throw new IllegalStateException(AppsBundleViewHolder.class.getName() + " is getting non AppBundle instance!");
    }
}
