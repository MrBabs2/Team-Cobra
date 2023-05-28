package p015cm.aptoide.p016pt.search.view.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenshotsAdapter;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.download.view.Download;
import p015cm.aptoide.p016pt.download.view.DownloadClick;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.download.view.DownloadViewStatusHelper;
import p015cm.aptoide.p016pt.home.AppSecondaryInfoViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo16641d2 = {"Lcm/aptoide/pt/search/view/item/SearchResultViewHolder;", "Lcm/aptoide/pt/search/view/item/SearchResultItemView;", "Lcm/aptoide/pt/search/model/SearchAppResult;", "itemView", "Landroid/view/View;", "itemClickSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/search/model/SearchAppResultWrapper;", "downloadClickSubject", "Lcm/aptoide/pt/download/view/DownloadClick;", "screenShotClick", "Lcm/aptoide/pt/app/view/screenshots/ScreenShotClickEvent;", "query", "", "(Landroid/view/View;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Ljava/lang/String;)V", "adapter", "Lcm/aptoide/pt/app/view/screenshots/ScreenshotsAdapter;", "appInfoViewHolder", "Lcm/aptoide/pt/home/AppSecondaryInfoViewHolder;", "downloadViewStatusHelper", "Lcm/aptoide/pt/download/view/DownloadViewStatusHelper;", "setAppInfo", "", "result", "setDownloadStatus", "app", "setup", "setupMediaAdapter", "screenshots", "", "Lcm/aptoide/pt/view/app/AppScreenshot;", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.view.item.SearchResultViewHolder */
/* compiled from: SearchResultViewHolder.kt */
public final class SearchResultViewHolder extends SearchResultItemView<SearchAppResult> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LAYOUT = 2131493179;
    private final ScreenshotsAdapter adapter = new ScreenshotsAdapter(Collections.emptyList(), Collections.emptyList(), this.screenShotClick, 128);
    private final AppSecondaryInfoViewHolder appInfoViewHolder;
    private final C12871b<DownloadClick> downloadClickSubject;
    private final DownloadViewStatusHelper downloadViewStatusHelper;
    /* access modifiers changed from: private */
    public final C12871b<SearchAppResultWrapper> itemClickSubject;
    /* access modifiers changed from: private */
    public final String query;
    private final C12871b<ScreenShotClickEvent> screenShotClick;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/search/view/item/SearchResultViewHolder$Companion;", "", "()V", "LAYOUT", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.search.view.item.SearchResultViewHolder$Companion */
    /* compiled from: SearchResultViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultViewHolder(View view, C12871b<SearchAppResultWrapper> bVar, C12871b<DownloadClick> bVar2, C12871b<ScreenShotClickEvent> bVar3, String str) {
        super(view);
        C10202j.m34178b(view, "itemView");
        C10202j.m34178b(bVar, "itemClickSubject");
        C10202j.m34178b(bVar2, "downloadClickSubject");
        C10202j.m34178b(bVar3, "screenShotClick");
        this.itemClickSubject = bVar;
        this.downloadClickSubject = bVar2;
        this.screenShotClick = bVar3;
        this.query = str;
        Context context = view.getContext();
        C10202j.m34174a((Object) context, "itemView.context");
        this.downloadViewStatusHelper = new DownloadViewStatusHelper(context);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, new DecimalFormat("0.0"));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.media_rv);
        C10202j.m34174a((Object) recyclerView, "itemView.media_rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C1086R.C1088id.media_rv);
        C10202j.m34174a((Object) recyclerView2, "itemView.media_rv");
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(C1086R.C1088id.media_rv);
        C10202j.m34174a((Object) recyclerView3, "itemView.media_rv");
        recyclerView3.setAdapter(this.adapter);
    }

    private final void setAppInfo(SearchAppResult searchAppResult) {
        View view = this.itemView;
        C10202j.m34174a((Object) view, "itemView");
        TextView textView = (TextView) view.findViewById(C1086R.C1088id.app_name);
        C10202j.m34174a((Object) textView, "itemView.app_name");
        textView.setText(searchAppResult.getAppName());
        View view2 = this.itemView;
        C10202j.m34174a((Object) view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(C1086R.C1088id.downloads);
        C10202j.m34174a((Object) textView2, "itemView.downloads");
        textView2.setText(AptoideUtils.StringU.withSuffix(searchAppResult.getTotalDownloads()));
        View view3 = this.itemView;
        C10202j.m34174a((Object) view3, "itemView");
        ImageView imageView = (ImageView) view3.findViewById(C1086R.C1088id.app_icon);
        C10202j.m34174a((Object) imageView, "itemView.app_icon");
        ImageLoader with = ImageLoader.with(imageView.getContext());
        String icon = searchAppResult.getIcon();
        View view4 = this.itemView;
        C10202j.m34174a((Object) view4, "itemView");
        with.load(icon, (ImageView) view4.findViewById(C1086R.C1088id.app_icon));
        float averageRating = searchAppResult.getAverageRating();
        if (averageRating <= ((float) 0)) {
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            ((TextView) view5.findViewById(C1086R.C1088id.rating)).setText(C1086R.string.appcardview_title_no_stars);
        } else {
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            TextView textView3 = (TextView) view6.findViewById(C1086R.C1088id.rating);
            C10202j.m34174a((Object) textView3, "itemView.rating");
            textView3.setVisibility(0);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            TextView textView4 = (TextView) view7.findViewById(C1086R.C1088id.rating);
            C10202j.m34174a((Object) textView4, "itemView.rating");
            textView4.setText(new DecimalFormat("0.0").format((double) averageRating));
        }
        View view8 = this.itemView;
        C10202j.m34174a((Object) view8, "itemView");
        TextView textView5 = (TextView) view8.findViewById(C1086R.C1088id.store_name);
        C10202j.m34174a((Object) textView5, "itemView.store_name");
        textView5.setText(searchAppResult.getStoreName());
        this.appInfoViewHolder.setInfo(searchAppResult.hasBilling() || searchAppResult.hasAdvertising(), searchAppResult.getAverageRating(), false, false);
        int rank = searchAppResult.getRank();
        if (rank == Malware.Rank.TRUSTED.ordinal()) {
            View view9 = this.itemView;
            C10202j.m34174a((Object) view9, "itemView");
            ImageView imageView2 = (ImageView) view9.findViewById(C1086R.C1088id.app_badge);
            C10202j.m34174a((Object) imageView2, "itemView.app_badge");
            ImageLoader with2 = ImageLoader.with(imageView2.getContext());
            View view10 = this.itemView;
            C10202j.m34174a((Object) view10, "itemView");
            with2.load((int) C1086R.C1087drawable.ic_badges_trusted, (ImageView) view10.findViewById(C1086R.C1088id.app_badge));
        } else if (rank == Malware.Rank.CRITICAL.ordinal()) {
            View view11 = this.itemView;
            C10202j.m34174a((Object) view11, "itemView");
            ImageView imageView3 = (ImageView) view11.findViewById(C1086R.C1088id.app_badge);
            C10202j.m34174a((Object) imageView3, "itemView.app_badge");
            ImageLoader with3 = ImageLoader.with(imageView3.getContext());
            View view12 = this.itemView;
            C10202j.m34174a((Object) view12, "itemView");
            with3.load((int) C1086R.C1087drawable.ic_badges_critical, (ImageView) view12.findViewById(C1086R.C1088id.app_badge));
        } else if (rank == Malware.Rank.WARNING.ordinal()) {
            View view13 = this.itemView;
            C10202j.m34174a((Object) view13, "itemView");
            ImageView imageView4 = (ImageView) view13.findViewById(C1086R.C1088id.app_badge);
            C10202j.m34174a((Object) imageView4, "itemView.app_badge");
            ImageLoader with4 = ImageLoader.with(imageView4.getContext());
            View view14 = this.itemView;
            C10202j.m34174a((Object) view14, "itemView");
            with4.load((int) C1086R.C1087drawable.ic_badges_warning, (ImageView) view14.findViewById(C1086R.C1088id.app_badge));
        } else if (rank == Malware.Rank.UNKNOWN.ordinal()) {
            View view15 = this.itemView;
            C10202j.m34174a((Object) view15, "itemView");
            ImageView imageView5 = (ImageView) view15.findViewById(C1086R.C1088id.app_badge);
            C10202j.m34174a((Object) imageView5, "itemView.app_badge");
            ImageLoader with5 = ImageLoader.with(imageView5.getContext());
            View view16 = this.itemView;
            C10202j.m34174a((Object) view16, "itemView");
            with5.load((int) C1086R.C1087drawable.ic_badges_unknown, (ImageView) view16.findViewById(C1086R.C1088id.app_badge));
        }
        this.itemView.setOnClickListener(new SearchResultViewHolder$setAppInfo$2(this, searchAppResult));
    }

    private final void setupMediaAdapter(List<? extends AppScreenshot> list) {
        this.adapter.updateScreenshots(list);
        this.adapter.updateVideos(Collections.emptyList());
    }

    public final void setDownloadStatus(SearchAppResult searchAppResult) {
        C10202j.m34178b(searchAppResult, "app");
        DownloadStatusModel downloadModel = searchAppResult.getDownloadModel();
        if (!searchAppResult.isHighlightedResult() || downloadModel == null) {
            View view = this.itemView;
            C10202j.m34174a((Object) view, "itemView");
            Button button = (Button) view.findViewById(C1086R.C1088id.install_button);
            C10202j.m34174a((Object) button, "itemView.install_button");
            button.setVisibility(8);
            View view2 = this.itemView;
            C10202j.m34174a((Object) view2, "itemView");
            DownloadProgressView downloadProgressView = (DownloadProgressView) view2.findViewById(C1086R.C1088id.download_progress_view);
            C10202j.m34174a((Object) downloadProgressView, "itemView.download_progress_view");
            downloadProgressView.setVisibility(8);
            View view3 = this.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            RecyclerView recyclerView = (RecyclerView) view3.findViewById(C1086R.C1088id.media_rv);
            C10202j.m34174a((Object) recyclerView, "itemView.media_rv");
            recyclerView.setVisibility(8);
            return;
        }
        DownloadViewStatusHelper downloadViewStatusHelper2 = this.downloadViewStatusHelper;
        Download download = searchAppResult.getDownload();
        C10202j.m34174a((Object) download, "app.download");
        View view4 = this.itemView;
        C10202j.m34174a((Object) view4, "itemView");
        Button button2 = (Button) view4.findViewById(C1086R.C1088id.install_button);
        C10202j.m34174a((Object) button2, "itemView.install_button");
        View view5 = this.itemView;
        C10202j.m34174a((Object) view5, "itemView");
        DownloadProgressView downloadProgressView2 = (DownloadProgressView) view5.findViewById(C1086R.C1088id.download_progress_view);
        C10202j.m34174a((Object) downloadProgressView2, "itemView.download_progress_view");
        downloadViewStatusHelper2.setDownloadStatus(download, button2, downloadProgressView2, this.downloadClickSubject);
        List<AppScreenshot> screenshots = searchAppResult.getScreenshots();
        C10202j.m34174a((Object) screenshots, "app.screenshots");
        setupMediaAdapter(screenshots);
        View view6 = this.itemView;
        C10202j.m34174a((Object) view6, "itemView");
        if (!((Button) view6.findViewById(C1086R.C1088id.install_button)).hasOnClickListeners()) {
            DownloadViewStatusHelper downloadViewStatusHelper3 = this.downloadViewStatusHelper;
            Download download2 = searchAppResult.getDownload();
            C10202j.m34174a((Object) download2, "app.download");
            C12871b<DownloadClick> bVar = this.downloadClickSubject;
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            Button button3 = (Button) view7.findViewById(C1086R.C1088id.install_button);
            C10202j.m34174a((Object) button3, "itemView.install_button");
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            DownloadProgressView downloadProgressView3 = (DownloadProgressView) view8.findViewById(C1086R.C1088id.download_progress_view);
            C10202j.m34174a((Object) downloadProgressView3, "itemView.download_progress_view");
            downloadViewStatusHelper3.setupListeners(download2, bVar, button3, downloadProgressView3);
        } else if (downloadModel.getAction().equals(DownloadStatusModel.Action.OPEN)) {
            DownloadViewStatusHelper downloadViewStatusHelper4 = this.downloadViewStatusHelper;
            Download download3 = searchAppResult.getDownload();
            C10202j.m34174a((Object) download3, "app.download");
            C12871b<DownloadClick> bVar2 = this.downloadClickSubject;
            View view9 = this.itemView;
            C10202j.m34174a((Object) view9, "itemView");
            Button button4 = (Button) view9.findViewById(C1086R.C1088id.install_button);
            C10202j.m34174a((Object) button4, "itemView.install_button");
            View view10 = this.itemView;
            C10202j.m34174a((Object) view10, "itemView");
            DownloadProgressView downloadProgressView4 = (DownloadProgressView) view10.findViewById(C1086R.C1088id.download_progress_view);
            C10202j.m34174a((Object) downloadProgressView4, "itemView.download_progress_view");
            downloadViewStatusHelper4.setupListeners(download3, bVar2, button4, downloadProgressView4);
        }
        View view11 = this.itemView;
        C10202j.m34174a((Object) view11, "itemView");
        RecyclerView recyclerView2 = (RecyclerView) view11.findViewById(C1086R.C1088id.media_rv);
        C10202j.m34174a((Object) recyclerView2, "itemView.media_rv");
        recyclerView2.setVisibility(0);
    }

    public void setup(SearchAppResult searchAppResult) {
        if (searchAppResult != null) {
            setAppInfo(searchAppResult);
            setDownloadStatus(searchAppResult);
        }
    }
}
