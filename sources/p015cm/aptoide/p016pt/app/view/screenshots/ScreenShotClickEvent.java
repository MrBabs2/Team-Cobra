package p015cm.aptoide.p016pt.app.view.screenshots;

import android.net.Uri;
import java.util.ArrayList;

/* renamed from: cm.aptoide.pt.app.view.screenshots.ScreenShotClickEvent */
public class ScreenShotClickEvent {
    private final ArrayList<String> imagesUris;
    private final int index;
    private final Uri uri;

    public ScreenShotClickEvent(ArrayList<String> arrayList, int i) {
        this.imagesUris = arrayList;
        this.index = i;
        this.uri = Uri.EMPTY;
    }

    public int getImagesIndex() {
        return this.index;
    }

    public ArrayList<String> getImagesUris() {
        return this.imagesUris;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isVideo() {
        return this.uri != Uri.EMPTY;
    }

    public ScreenShotClickEvent(Uri uri2) {
        this.imagesUris = new ArrayList<>();
        this.index = -1;
        this.uri = uri2;
    }
}
