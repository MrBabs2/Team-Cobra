package p015cm.aptoide.p016pt.editorial;

import java.util.List;

/* renamed from: cm.aptoide.pt.editorial.EditorialEvent */
public class EditorialEvent {
    private final Type clickType;
    private final int firstVisibleItemPosition;

    /* renamed from: id */
    private final long f5115id;
    private final int lastVisibleItemPosition;
    private final List<EditorialMedia> media;
    private final String packageName;
    private final int position;
    private final String url;

    /* renamed from: cm.aptoide.pt.editorial.EditorialEvent$Type */
    public enum Type {
        ACTION,
        APPCARD,
        BUTTON,
        CANCEL,
        PAUSE,
        RESUME,
        MEDIA,
        MEDIA_LIST
    }

    public EditorialEvent(Type type, String str) {
        this.clickType = type;
        this.url = str;
        this.firstVisibleItemPosition = -1;
        this.lastVisibleItemPosition = -1;
        this.media = null;
        this.f5115id = -1;
        this.packageName = "";
        this.position = -1;
    }

    public Type getClickType() {
        return this.clickType;
    }

    public int getFirstVisiblePosition() {
        return this.firstVisibleItemPosition;
    }

    public long getId() {
        return this.f5115id;
    }

    public int getLastVisibleItemPosition() {
        return this.lastVisibleItemPosition;
    }

    public List<EditorialMedia> getMedia() {
        return this.media;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPosition() {
        return this.position;
    }

    public String getUrl() {
        return this.url;
    }

    public EditorialEvent(Type type, long j, String str) {
        this.clickType = type;
        this.f5115id = j;
        this.packageName = str;
        this.url = "";
        this.firstVisibleItemPosition = -1;
        this.lastVisibleItemPosition = -1;
        this.media = null;
        this.position = -1;
    }

    public EditorialEvent(Type type, int i, int i2, int i3, List<EditorialMedia> list) {
        this.clickType = type;
        this.firstVisibleItemPosition = i;
        this.lastVisibleItemPosition = i2;
        this.position = i3;
        this.media = list;
        this.url = "";
        this.f5115id = -1;
        this.packageName = "";
    }
}
