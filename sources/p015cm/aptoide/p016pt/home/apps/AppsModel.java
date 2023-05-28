package p015cm.aptoide.p016pt.home.apps;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/AppsModel;", "", "updates", "", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "installed", "Lcm/aptoide/pt/home/apps/model/InstalledApp;", "downloads", "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDownloads", "()Ljava/util/List;", "getInstalled", "getUpdates", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.AppsModel */
/* compiled from: AppsModel.kt */
public final class AppsModel {
    private final List<DownloadApp> downloads;
    private final List<InstalledApp> installed;
    private final List<UpdateApp> updates;

    public AppsModel(List<UpdateApp> list, List<? extends InstalledApp> list2, List<DownloadApp> list3) {
        C10202j.m34178b(list, "updates");
        C10202j.m34178b(list2, "installed");
        C10202j.m34178b(list3, RoomStore.DOWNLOADS);
        this.updates = list;
        this.installed = list2;
        this.downloads = list3;
    }

    public static /* synthetic */ AppsModel copy$default(AppsModel appsModel, List<UpdateApp> list, List<InstalledApp> list2, List<DownloadApp> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appsModel.updates;
        }
        if ((i & 2) != 0) {
            list2 = appsModel.installed;
        }
        if ((i & 4) != 0) {
            list3 = appsModel.downloads;
        }
        return appsModel.copy(list, list2, list3);
    }

    public final List<UpdateApp> component1() {
        return this.updates;
    }

    public final List<InstalledApp> component2() {
        return this.installed;
    }

    public final List<DownloadApp> component3() {
        return this.downloads;
    }

    public final AppsModel copy(List<UpdateApp> list, List<? extends InstalledApp> list2, List<DownloadApp> list3) {
        C10202j.m34178b(list, "updates");
        C10202j.m34178b(list2, "installed");
        C10202j.m34178b(list3, RoomStore.DOWNLOADS);
        return new AppsModel(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsModel)) {
            return false;
        }
        AppsModel appsModel = (AppsModel) obj;
        return C10202j.m34176a((Object) this.updates, (Object) appsModel.updates) && C10202j.m34176a((Object) this.installed, (Object) appsModel.installed) && C10202j.m34176a((Object) this.downloads, (Object) appsModel.downloads);
    }

    public final List<DownloadApp> getDownloads() {
        return this.downloads;
    }

    public final List<InstalledApp> getInstalled() {
        return this.installed;
    }

    public final List<UpdateApp> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        List<UpdateApp> list = this.updates;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<InstalledApp> list2 = this.installed;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<DownloadApp> list3 = this.downloads;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AppsModel(updates=" + this.updates + ", installed=" + this.installed + ", downloads=" + this.downloads + ")";
    }
}
