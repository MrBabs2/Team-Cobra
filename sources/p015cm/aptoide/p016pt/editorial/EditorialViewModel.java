package p015cm.aptoide.p016pt.editorial;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

/* renamed from: cm.aptoide.pt.editorial.EditorialViewModel */
public class EditorialViewModel {
    private final String appName;
    private final String background;
    private final String caption;
    private final String captionColor;
    private final String cardId;
    private final List<EditorialContent> contentList;
    private final Error error;
    private final String groupId;
    private final boolean hasAppc;
    private final String icon;

    /* renamed from: id */
    private final long f5116id;
    private final boolean loading;
    private final String md5sum;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<EditorialContent> placeHolderContent;
    private final List<Integer> placeHolderPositions;
    private final String rank;
    private final List<String> requiredSplits;
    private final boolean shouldHaveAnimation;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final String title;
    private final int versionCode;
    private final String versionName;

    /* renamed from: cm.aptoide.pt.editorial.EditorialViewModel$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public EditorialViewModel(List<EditorialContent> list, String str, String str2, String str3, List<Integer> list2, List<EditorialContent> list3, boolean z, String str4, String str5, String str6) {
        this.contentList = list;
        this.title = str;
        this.caption = str2;
        this.background = str3;
        this.placeHolderPositions = list2;
        this.placeHolderContent = list3;
        this.shouldHaveAnimation = z;
        this.cardId = str4;
        this.groupId = str5;
        this.captionColor = str6;
        this.appName = "";
        this.icon = null;
        this.f5116id = -1;
        this.packageName = "";
        this.md5sum = "";
        this.versionCode = -1;
        this.size = 0;
        this.versionName = "";
        this.path = "";
        this.pathAlt = "";
        this.obb = null;
        this.loading = false;
        this.error = null;
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = "";
        this.storeName = "";
    }

    /* access modifiers changed from: package-private */
    public String getBackgroundImage() {
        return this.background;
    }

    /* access modifiers changed from: package-private */
    public long getBottomCardAppId() {
        return this.f5116id;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardAppName() {
        return this.appName;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardIcon() {
        return this.icon;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardMd5() {
        return this.md5sum;
    }

    /* access modifiers changed from: package-private */
    public Obb getBottomCardObb() {
        return this.obb;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardPackageName() {
        return this.packageName;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardPath() {
        return this.path;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardPathAlt() {
        return this.pathAlt;
    }

    public List<String> getBottomCardRequiredSplits() {
        return this.requiredSplits;
    }

    public long getBottomCardSize() {
        return this.size;
    }

    public List<Split> getBottomCardSplits() {
        return this.splits;
    }

    /* access modifiers changed from: package-private */
    public int getBottomCardVersionCode() {
        return this.versionCode;
    }

    /* access modifiers changed from: package-private */
    public String getBottomCardVersionName() {
        return this.versionName;
    }

    /* access modifiers changed from: package-private */
    public String getCaption() {
        return this.caption;
    }

    public String getCaptionColor() {
        return this.captionColor;
    }

    public String getCardId() {
        return this.cardId;
    }

    public EditorialContent getContent(int i) {
        return this.contentList.get(i);
    }

    /* access modifiers changed from: package-private */
    public List<EditorialContent> getContentList() {
        return this.contentList;
    }

    public Error getError() {
        return this.error;
    }

    public String getGroupId() {
        return this.groupId;
    }

    /* access modifiers changed from: package-private */
    public List<EditorialContent> getPlaceHolderContent() {
        return this.placeHolderContent;
    }

    /* access modifiers changed from: package-private */
    public List<Integer> getPlaceHolderPositions() {
        return this.placeHolderPositions;
    }

    public String getRank() {
        return this.rank;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    /* access modifiers changed from: package-private */
    public boolean hasBackgroundImage() {
        return !this.background.equals("");
    }

    /* access modifiers changed from: package-private */
    public boolean hasContent() {
        List<EditorialContent> list = this.contentList;
        return list != null && !list.isEmpty();
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return list != null && !list.isEmpty();
    }

    public boolean isLoading() {
        return this.loading;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHaveAnimation() {
        return this.shouldHaveAnimation;
    }

    public EditorialViewModel(boolean z) {
        this.loading = z;
        this.title = "";
        this.caption = "";
        this.background = "";
        this.placeHolderPositions = Collections.emptyList();
        this.contentList = Collections.emptyList();
        this.placeHolderContent = Collections.emptyList();
        this.appName = "";
        this.icon = null;
        this.f5116id = -1;
        this.groupId = "";
        this.packageName = "";
        this.md5sum = "";
        this.versionCode = -1;
        this.size = 0;
        this.versionName = "";
        this.path = "";
        this.pathAlt = "";
        this.obb = null;
        this.cardId = "";
        this.shouldHaveAnimation = false;
        this.error = null;
        this.captionColor = "";
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = "";
        this.storeName = "";
    }

    public EditorialViewModel(Error error2) {
        this.error = error2;
        this.loading = false;
        this.contentList = Collections.emptyList();
        this.title = "";
        this.caption = "";
        this.background = "";
        this.placeHolderPositions = Collections.emptyList();
        this.placeHolderContent = Collections.emptyList();
        this.appName = "";
        this.icon = null;
        this.f5116id = -1;
        this.groupId = "";
        this.packageName = "";
        this.md5sum = "";
        this.versionCode = -1;
        this.size = 0;
        this.versionName = "";
        this.path = "";
        this.pathAlt = "";
        this.cardId = "";
        this.obb = null;
        this.shouldHaveAnimation = false;
        this.captionColor = "";
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = "";
        this.storeName = "";
    }

    public EditorialViewModel(List<EditorialContent> list, String str, String str2, String str3, List<Integer> list2, List<EditorialContent> list3, String str4, String str5, long j, String str6, String str7, int i, String str8, String str9, String str10, Obb obb2, boolean z, String str11, String str12, long j2, String str13, List<Split> list4, List<String> list5, boolean z2, String str14, String str15) {
        this.contentList = list;
        this.title = str;
        this.caption = str2;
        this.background = str3;
        this.placeHolderPositions = list2;
        this.placeHolderContent = list3;
        this.appName = str4;
        this.icon = str5;
        this.f5116id = j;
        this.packageName = str6;
        this.md5sum = str7;
        this.versionCode = i;
        this.versionName = str8;
        this.path = str9;
        this.pathAlt = str10;
        this.size = j2;
        this.obb = obb2;
        this.shouldHaveAnimation = z;
        this.cardId = str11;
        this.groupId = str12;
        this.captionColor = str13;
        this.splits = list4;
        this.requiredSplits = list5;
        this.hasAppc = z2;
        this.rank = str14;
        this.storeName = str15;
        this.error = null;
        this.loading = false;
    }
}
