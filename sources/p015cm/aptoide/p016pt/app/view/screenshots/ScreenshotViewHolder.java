package p015cm.aptoide.p016pt.app.view.screenshots;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;
import p015cm.aptoide.p016pt.view.app.AppVideo;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.screenshots.ScreenshotViewHolder */
public class ScreenshotViewHolder extends RecyclerView.C0629c0 {
    static final int LAYOUT_ID = 2131493173;
    private static final String PORTRAIT = "PORTRAIT";
    private FrameLayout media_layout;
    private ImageView play_button;
    private final C12871b<ScreenShotClickEvent> screenShotClick;
    private ImageView screenshot;

    ScreenshotViewHolder(View view, C12871b<ScreenShotClickEvent> bVar, int i) {
        super(view);
        assignViews(view, i);
        this.screenShotClick = bVar;
    }

    private int getPlaceholder(String str) {
        return viewIsInPortrait(str) ? C1086R.attr.placeholder_9_16 : C1086R.attr.placeholder_16_9;
    }

    private boolean isLollipopOrHigher() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private boolean viewIsInPortrait(String str) {
        return !TextUtils.isEmpty(str) && str.toUpperCase().equals(PORTRAIT);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7707a(AppVideo appVideo, View view) {
        this.screenShotClick.onNext(new ScreenShotClickEvent(Uri.parse(appVideo.getUrl())));
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view, int i) {
        this.screenshot = (ImageView) view.findViewById(C1086R.C1088id.screenshot_image_item);
        this.play_button = (ImageView) view.findViewById(C1086R.C1088id.play_button);
        this.media_layout = (FrameLayout) view.findViewById(C1086R.C1088id.media_layout);
        if (i > 0) {
            this.screenshot.getLayoutParams().height = (int) TypedValue.applyDimension(1, 128.0f, view.getResources().getDisplayMetrics());
        }
    }

    public void bindView(AppVideo appVideo) {
        Context context = this.screenshot.getContext();
        if (context != null) {
            ImageLoader.with(context).load(appVideo.getThumbnail(), C1086R.attr.placeholder_square, this.screenshot);
            if (isLollipopOrHigher()) {
                this.media_layout.setForeground(context.getResources().getDrawable(C1086R.color.overlay_black, context.getTheme()));
            } else {
                this.media_layout.setForeground(context.getResources().getDrawable(C1086R.color.overlay_black));
            }
            this.play_button.setVisibility(0);
            this.itemView.setOnClickListener(new C1803b(this, appVideo));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7708a(ArrayList arrayList, int i, View view) {
        this.screenShotClick.onNext(new ScreenShotClickEvent(arrayList, i));
    }

    public void bindView(AppScreenshot appScreenshot, int i, ArrayList<String> arrayList) {
        Context context = this.screenshot.getContext();
        if (context != null) {
            this.media_layout.setForeground((Drawable) null);
            this.play_button.setVisibility(8);
            ImageLoader.with(context).loadScreenshotToThumb(appScreenshot.getUrl(), appScreenshot.getOrientation(), getPlaceholder(appScreenshot.getOrientation()), this.screenshot);
            this.itemView.setOnClickListener(new C1802a(this, arrayList, i));
        }
    }
}
