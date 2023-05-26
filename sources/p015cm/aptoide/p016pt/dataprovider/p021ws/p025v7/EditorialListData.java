package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessDataListResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.Appearance;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.EditorialListData */
public class EditorialListData extends BaseV7EndlessDataListResponse {
    public Appearance appearance;
    public String caption;
    public String date;
    public String flair;
    public String icon;

    /* renamed from: id */
    public String f4879id;
    public String title;
    public String type;
    public String views;

    public Appearance getAppearance() {
        return this.appearance;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getDate() {
        return this.date;
    }

    public String getFlair() {
        return this.flair;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f4879id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getViews() {
        return this.views;
    }
}
