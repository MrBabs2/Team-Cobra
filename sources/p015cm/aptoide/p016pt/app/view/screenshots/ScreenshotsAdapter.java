package p015cm.aptoide.p016pt.app.view.screenshots;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;
import p015cm.aptoide.p016pt.view.app.AppVideo;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.screenshots.ScreenshotsAdapter */
public class ScreenshotsAdapter extends RecyclerView.C0633g<ScreenshotViewHolder> {
    private ArrayList<String> imageUris;
    private int itemHeightDp;
    private C12871b<ScreenShotClickEvent> screenShotClick;
    private List<AppScreenshot> screenshots;
    private List<AppVideo> videos;

    public ScreenshotsAdapter(List<AppScreenshot> list, List<AppVideo> list2, C12871b<ScreenShotClickEvent> bVar) {
        this(list, list2, bVar, -1);
    }

    private boolean isScreenShot(int i) {
        List<AppScreenshot> list = this.screenshots;
        return list != null && i < list.size();
    }

    private boolean isVideo(int i) {
        List<AppVideo> list = this.videos;
        return list != null && i < list.size();
    }

    public int getItemCount() {
        List<AppVideo> list = this.videos;
        int i = 0;
        int size = list != null ? list.size() : 0;
        List<AppScreenshot> list2 = this.screenshots;
        if (list2 != null) {
            i = list2.size();
        }
        return size + i;
    }

    public void updateScreenshots(List<AppScreenshot> list) {
        this.screenshots = list;
        this.imageUris = new ArrayList<>(list.size());
        for (AppScreenshot url : list) {
            this.imageUris.add(url.getUrl());
        }
        notifyDataSetChanged();
    }

    public void updateVideos(List<AppVideo> list) {
        this.videos = list;
        notifyDataSetChanged();
    }

    public ScreenshotsAdapter(List<AppScreenshot> list, List<AppVideo> list2, C12871b<ScreenShotClickEvent> bVar, int i) {
        this.itemHeightDp = -1;
        this.screenshots = list;
        this.videos = list2;
        this.screenShotClick = bVar;
        this.itemHeightDp = i;
    }

    public void onBindViewHolder(ScreenshotViewHolder screenshotViewHolder, int i) {
        if (isVideo(i)) {
            screenshotViewHolder.bindView(this.videos.get(i));
            return;
        }
        List<AppVideo> list = this.videos;
        int size = i - (list != null ? list.size() : 0);
        if (isScreenShot(size)) {
            screenshotViewHolder.bindView(this.screenshots.get(size), size, this.imageUris);
        }
    }

    public ScreenshotViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ScreenshotViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.row_item_screenshots_gallery, viewGroup, false), this.screenShotClick, this.itemHeightDp);
    }
}
