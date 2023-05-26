package p015cm.aptoide.p016pt.home.bundles.editorschoice;

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

/* renamed from: cm.aptoide.pt.home.bundles.editorschoice.EditorsBundleViewHolder */
public class EditorsBundleViewHolder extends AppBundleViewHolder {
    private final TextView bundleTitle;
    private final EditorsAppsAdapter graphicAppsAdapter;
    private final RecyclerView graphicsList;
    private final String marketName;
    private final Button moreButton;
    private final Skeleton skeleton;
    /* access modifiers changed from: private */
    public final C12871b<HomeEvent> uiEventsListener;

    public EditorsBundleViewHolder(View view, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = bVar;
        this.bundleTitle = (TextView) view.findViewById(C1086R.C1088id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1086R.C1088id.bundle_more);
        this.graphicsList = (RecyclerView) view.findViewById(C1086R.C1088id.featured_graphic_list);
        this.graphicAppsAdapter = new EditorsAppsAdapter(new ArrayList(), decimalFormat, bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        this.graphicsList.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(2, view.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        this.graphicsList.setLayoutManager(linearLayoutManager);
        this.graphicsList.setAdapter(this.graphicAppsAdapter);
        this.graphicsList.setNestedScrollingEnabled(false);
        this.skeleton = SkeletonUtils.applySkeleton(this.graphicsList, (int) C1086R.layout.feature_graphic_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(view.getContext().getResources(), (WindowManager) view.getContext().getSystemService("window")) * 3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12377a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE));
    }

    public void setBundle(final HomeBundle homeBundle, int i) {
        if (homeBundle instanceof AppBundle) {
            this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
            if (homeBundle.getContent() == null) {
                this.skeleton.showSkeleton();
                return;
            }
            this.skeleton.showOriginal();
            this.graphicAppsAdapter.updateBundle(homeBundle, i);
            this.graphicAppsAdapter.update(homeBundle.getContent());
            this.graphicsList.addOnScrollListener(new RecyclerView.C0653t() {
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (i > 0) {
                        EditorsBundleViewHolder.this.uiEventsListener.onNext(new HomeEvent(homeBundle, EditorsBundleViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                    }
                }
            });
            this.moreButton.setOnClickListener(new C2904a(this, homeBundle));
            return;
        }
        throw new IllegalStateException(EditorsBundleViewHolder.class.getName() + " is getting non AppBundle instance!");
    }
}
