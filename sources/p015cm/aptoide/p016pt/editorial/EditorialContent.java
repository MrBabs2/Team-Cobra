package p015cm.aptoide.p016pt.editorial;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

/* renamed from: cm.aptoide.pt.editorial.EditorialContent */
public class EditorialContent {
    private final String actionTitle;
    private final float avg;
    private final String graphic;
    private boolean hasAppc;
    private final String icon;

    /* renamed from: id */
    private final long f5114id;
    private final boolean isPlaceHolder;
    private final String md5sum;
    private final List<EditorialMedia> media;
    private final String message;
    private final String name;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final int position;
    private String rank;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final long storeId;
    private final String storeName;
    private final String title;
    private final String type;
    private final String url;
    private final int verCode;
    private final String verName;

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, long j, String str4, String str5, float f, String str6, long j2, String str7, Obb obb2, long j3, String str8, String str9, int i, String str10, String str11, String str12, String str13, String str14, int i2, List<Split> list2, List<String> list3, boolean z, String str15) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.f5114id = j;
        this.name = str4;
        this.icon = str5;
        this.avg = f;
        this.packageName = str6;
        this.size = j2;
        this.graphic = str7;
        this.obb = obb2;
        this.storeId = j3;
        this.storeName = str8;
        this.verName = str9;
        this.verCode = i;
        this.path = str10;
        this.pathAlt = str11;
        this.md5sum = str12;
        this.actionTitle = str13;
        this.url = str14;
        this.position = i2;
        this.splits = list2;
        this.requiredSplits = list3;
        this.rank = str15;
        this.isPlaceHolder = true;
        this.hasAppc = z;
    }

    public String getActionTitle() {
        return this.actionTitle;
    }

    public String getActionUrl() {
        return this.url;
    }

    public String getAppName() {
        return this.name;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f5114id;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public List<EditorialMedia> getMedia() {
        return this.media;
    }

    public String getMessage() {
        return this.message;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
    }

    public int getPosition() {
        return this.position;
    }

    public String getRank() {
        return this.rank;
    }

    public float getRating() {
        return this.avg;
    }

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public long getSize() {
        return this.size;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public int getVerCode() {
        return this.verCode;
    }

    public String getVerName() {
        return this.verName;
    }

    public boolean hasAction() {
        return !this.actionTitle.equals("");
    }

    public boolean hasAnyMediaDescription() {
        for (EditorialMedia hasDescription : this.media) {
            if (hasDescription.hasDescription()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean hasListOfMedia() {
        return hasMedia() && this.media.size() > 1;
    }

    public boolean hasMedia() {
        List<EditorialMedia> list = this.media;
        return list != null && !list.isEmpty();
    }

    public boolean hasMessage() {
        String str = this.message;
        return str != null && !str.equals("");
    }

    public boolean hasTitle() {
        String str = this.title;
        return str != null && !str.equals("");
    }

    public boolean isPlaceHolderType() {
        return this.isPlaceHolder;
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, String str4, String str5, int i) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.actionTitle = str4;
        this.url = str5;
        this.position = i;
        this.isPlaceHolder = false;
        this.f5114id = -1;
        this.name = "";
        this.icon = null;
        this.avg = 0.0f;
        this.packageName = "";
        this.size = 0;
        this.graphic = "";
        this.obb = null;
        this.storeId = -1;
        this.storeName = "";
        this.verName = "";
        this.verCode = -1;
        this.path = "";
        this.pathAlt = "";
        this.md5sum = "";
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = "";
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, long j, String str4, String str5, float f, String str6, long j2, String str7, Obb obb2, long j3, String str8, String str9, int i, String str10, String str11, String str12, int i2, List<Split> list2, List<String> list3, boolean z, String str13) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.f5114id = j;
        this.name = str4;
        this.icon = str5;
        this.avg = f;
        this.packageName = str6;
        this.size = j2;
        this.graphic = str7;
        this.obb = obb2;
        this.storeId = j3;
        this.storeName = str8;
        this.verName = str9;
        this.verCode = i;
        this.path = str10;
        this.pathAlt = str11;
        this.md5sum = str12;
        this.position = i2;
        this.splits = list2;
        this.requiredSplits = list3;
        this.hasAppc = z;
        this.rank = str13;
        this.isPlaceHolder = true;
        this.actionTitle = "";
        this.url = "";
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, int i) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.position = i;
        this.isPlaceHolder = false;
        this.f5114id = -1;
        this.name = "";
        this.icon = null;
        this.avg = 0.0f;
        this.packageName = "";
        this.size = 0;
        this.graphic = "";
        this.obb = null;
        this.storeId = -1;
        this.storeName = "";
        this.verName = "";
        this.verCode = -1;
        this.path = "";
        this.pathAlt = "";
        this.md5sum = "";
        this.actionTitle = "";
        this.url = "";
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = "";
    }
}
