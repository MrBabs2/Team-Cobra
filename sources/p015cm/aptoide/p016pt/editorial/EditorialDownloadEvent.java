package p015cm.aptoide.p016pt.editorial;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.editorial.EditorialEvent;

/* renamed from: cm.aptoide.pt.editorial.EditorialDownloadEvent */
public class EditorialDownloadEvent {
    private final DownloadModel.Action action;
    private final long appId;
    private final String appName;
    private final EditorialEvent.Type button;
    private final String icon;
    private final String md5sum;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final String trustedBadge;
    private final int verCode;
    private final String verName;

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb2, long j, List<Split> list, List<String> list2) {
        this.button = type;
        this.appName = str;
        this.packageName = str2;
        this.md5sum = str3;
        this.icon = str4;
        this.verName = str5;
        this.verCode = i;
        this.path = str6;
        this.pathAlt = str7;
        this.obb = obb2;
        this.trustedBadge = "";
        this.storeName = "";
        this.appId = -1;
        this.action = null;
        this.size = j;
        this.splits = list;
        this.requiredSplits = list2;
    }

    public DownloadModel.Action getAction() {
        return this.action;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public EditorialEvent.Type getClickType() {
        return this.button;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getMd5() {
        return this.md5sum;
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

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public long getSize() {
        return this.size;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTrustedBadge() {
        return this.trustedBadge;
    }

    public int getVerCode() {
        return this.verCode;
    }

    public String getVerName() {
        return this.verName;
    }

    public EditorialDownloadEvent(EditorialViewModel editorialViewModel, DownloadModel.Action action2) {
        this.button = null;
        this.appName = editorialViewModel.getBottomCardAppName();
        this.packageName = editorialViewModel.getBottomCardPackageName();
        this.md5sum = editorialViewModel.getBottomCardMd5();
        this.icon = editorialViewModel.getBottomCardIcon();
        this.verName = editorialViewModel.getBottomCardVersionName();
        this.verCode = editorialViewModel.getBottomCardVersionCode();
        this.path = editorialViewModel.getBottomCardPath();
        this.pathAlt = editorialViewModel.getBottomCardPathAlt();
        this.obb = editorialViewModel.getBottomCardObb();
        this.appId = editorialViewModel.getBottomCardAppId();
        this.size = editorialViewModel.getBottomCardSize();
        this.splits = editorialViewModel.getBottomCardSplits();
        this.requiredSplits = editorialViewModel.getBottomCardRequiredSplits();
        this.action = action2;
        this.storeName = editorialViewModel.getStoreName();
        this.trustedBadge = editorialViewModel.getRank();
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, int i, long j) {
        this.button = type;
        this.appName = "";
        this.packageName = str;
        this.md5sum = str2;
        this.icon = "";
        this.verName = "";
        this.size = 0;
        this.verCode = i;
        this.path = "";
        this.pathAlt = "";
        this.obb = null;
        this.appId = j;
        this.splits = null;
        this.requiredSplits = null;
        this.action = null;
        this.trustedBadge = "";
        this.storeName = "";
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, int i, long j, DownloadModel.Action action2) {
        this.button = type;
        this.appName = "";
        this.packageName = str;
        this.md5sum = str2;
        this.icon = "";
        this.verName = "";
        this.size = 0;
        this.verCode = i;
        this.path = "";
        this.pathAlt = "";
        this.obb = null;
        this.appId = j;
        this.splits = null;
        this.requiredSplits = null;
        this.trustedBadge = "";
        this.storeName = "";
        this.action = action2;
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb2, DownloadModel.Action action2, long j, List<Split> list, List<String> list2, String str8, String str9) {
        this.button = type;
        this.appName = str;
        this.packageName = str2;
        this.md5sum = str3;
        this.icon = str4;
        this.verName = str5;
        this.verCode = i;
        this.path = str6;
        this.pathAlt = str7;
        this.obb = obb2;
        this.trustedBadge = str8;
        this.storeName = str9;
        this.appId = -1;
        this.action = action2;
        this.size = j;
        this.splits = list;
        this.requiredSplits = list2;
    }
}
