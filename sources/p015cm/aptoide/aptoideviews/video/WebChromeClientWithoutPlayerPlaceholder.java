package p015cm.aptoide.aptoideviews.video;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/video/WebChromeClientWithoutPlayerPlaceholder;", "Landroid/webkit/WebChromeClient;", "()V", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.WebChromeClientWithoutPlayerPlaceholder */
/* compiled from: WebChromeClientWithoutPlayerPlaceholder.kt */
public final class WebChromeClientWithoutPlayerPlaceholder extends WebChromeClient {
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }
}
