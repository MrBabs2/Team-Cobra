package p015cm.aptoide.p016pt.home.bundles.top;

import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.Translator;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.top.TopBundleViewHolder */
public class TopBundleViewHolder extends AppBundleViewHolder {
    private final TextView bundleTitle;
    private final String marketName;
    private final Button moreButton;
    private final TopBundleAdapter topBundleAdapter;
    private final RecyclerView topList;
    private final C12871b<HomeEvent> uiEventsListener;

    public TopBundleViewHolder(View view, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = bVar;
        this.bundleTitle = (TextView) view.findViewById(C1086R.C1088id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1086R.C1088id.bundle_more);
        this.topList = (RecyclerView) view.findViewById(C1086R.C1088id.top_list);
        this.topBundleAdapter = new TopBundleAdapter(new ArrayList(), decimalFormat, bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        this.topList.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources());
                int pixelsForDip2 = AptoideUtils.ScreenU.getPixelsForDip(4, view.getResources());
                rect.set(pixelsForDip, pixelsForDip2, pixelsForDip, pixelsForDip2);
            }
        });
        this.topList.setLayoutManager(linearLayoutManager);
        this.topList.setAdapter(this.topBundleAdapter);
        this.topList.setNestedScrollingEnabled(false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12409a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE_TOP));
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        if (homeBundle instanceof AppBundle) {
            this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
            this.topBundleAdapter.updateBundle(homeBundle, i);
            this.topBundleAdapter.update(homeBundle.getContent());
            this.moreButton.setOnClickListener(new C2926b(this, homeBundle));
            return;
        }
        throw new IllegalStateException(TopBundleViewHolder.class.getName() + " is getting non AppBundle instance!");
    }
}
