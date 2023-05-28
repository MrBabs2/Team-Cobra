package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.Card */
public class Card {
    private App app;
    private String type;
    private String uid;
    private Review.User user;

    public App getApp() {
        return this.app;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public Review.User getUser() {
        return this.user;
    }

    public boolean hasUser() {
        return this.user != null;
    }

    public void setApp(App app2) {
        this.app = app2;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUser(Review.User user2) {
        this.user = user2;
    }
}
