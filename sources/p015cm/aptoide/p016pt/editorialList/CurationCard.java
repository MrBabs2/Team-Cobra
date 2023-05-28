package p015cm.aptoide.p016pt.editorialList;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;

/* renamed from: cm.aptoide.pt.editorialList.CurationCard */
public class CurationCard {
    private final String captionColor;
    private final String date;
    private final String flair;
    private final String icon;

    /* renamed from: id */
    private final String f5424id;
    private int numberOfReactions;
    private List<TopReaction> reactions;
    private final String subTitle;
    private final String title;
    private final String type;
    private String userReaction;
    private final String views;

    public CurationCard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f5424id = str;
        this.subTitle = str2;
        this.icon = str3;
        this.title = str4;
        this.views = str5;
        this.type = str6;
        this.date = str7;
        this.captionColor = str8;
        this.flair = str9;
        this.reactions = Collections.emptyList();
        this.userReaction = "";
        this.numberOfReactions = -1;
    }

    public String getCaptionColor() {
        return this.captionColor;
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
        return this.f5424id;
    }

    public int getNumberOfReactions() {
        return this.numberOfReactions;
    }

    public List<TopReaction> getReactions() {
        return this.reactions;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUserReaction() {
        return this.userReaction;
    }

    public String getViews() {
        return this.views;
    }

    public void setNumberOfReactions(int i) {
        this.numberOfReactions = i;
    }

    public void setReactions(List<TopReaction> list) {
        this.reactions = list;
    }

    public void setUserReaction(String str) {
        this.userReaction = str;
    }

    public CurationCard() {
        this.f5424id = "";
        this.subTitle = "";
        this.icon = "";
        this.title = "";
        this.views = "";
        this.type = "";
        this.date = "";
        this.captionColor = "";
        this.flair = "";
    }
}
