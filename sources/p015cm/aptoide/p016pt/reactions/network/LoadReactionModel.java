package p015cm.aptoide.p016pt.reactions.network;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;

/* renamed from: cm.aptoide.pt.reactions.network.LoadReactionModel */
public class LoadReactionModel {
    private final String myReaction;
    private final List<TopReaction> topReactionList;
    private final int total;
    private final String userId;

    public LoadReactionModel(int i, String str, String str2, List<TopReaction> list) {
        this.userId = str2;
        this.topReactionList = list;
        this.total = i;
        this.myReaction = str;
    }

    public String getMyReaction() {
        return this.myReaction;
    }

    public List<TopReaction> getTopReactionList() {
        return this.topReactionList;
    }

    public int getTotal() {
        return this.total;
    }

    public String getUserId() {
        return this.userId;
    }

    public LoadReactionModel() {
        this.total = -1;
        this.myReaction = "";
        this.userId = "";
        this.topReactionList = Collections.emptyList();
    }
}
