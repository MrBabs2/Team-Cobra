package p015cm.aptoide.p016pt.reactions;

import java.util.HashMap;
import p015cm.aptoide.p016pt.reactions.network.LoadReactionModel;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p015cm.aptoide.p016pt.reactions.network.ReactionsService;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.reactions.ReactionsManager */
public class ReactionsManager {
    private final ReactionsService reactionsService;
    private HashMap<String, UserReaction> userReactions;

    public ReactionsManager(ReactionsService reactionsService2, HashMap<String, UserReaction> hashMap) {
        this.reactionsService = reactionsService2;
        this.userReactions = hashMap;
    }

    private String getUID(String str) {
        UserReaction userReaction = this.userReactions.get(str);
        return userReaction != null ? userReaction.getUserId() : "";
    }

    private Single<Boolean> hasNotReacted(String str, String str2) {
        boolean z;
        if (getUID(str + str2) != null) {
            if (!getUID(str + str2).equals("")) {
                z = false;
                return Single.m10119a(Boolean.valueOf(z));
            }
        }
        z = true;
        return Single.m10119a(Boolean.valueOf(z));
    }

    private boolean isSameReaction(String str, String str2, String str3) {
        HashMap<String, UserReaction> hashMap = this.userReactions;
        UserReaction userReaction = hashMap.get(str + str2);
        return userReaction != null && userReaction.getReaction().equals(str3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13900a(String str, String str2, LoadReactionModel loadReactionModel) {
        HashMap<String, UserReaction> hashMap = this.userReactions;
        hashMap.put(str + str2, new UserReaction(loadReactionModel.getUserId(), loadReactionModel.getMyReaction()));
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        ReactionsService reactionsService2 = this.reactionsService;
        return reactionsService2.deleteReaction(getUID(str + str2)).mo18564b(new C3949c(this, str, str2));
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return hasNotReacted(str, str2);
    }

    public Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.reactionsService.loadReactionModel(str, str2).mo18564b(new C3947a(this, str, str2));
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return hasNotReacted(str, str2).mo18559a(new C3948b(this, str, str2, str3));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13899a(String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            return this.reactionsService.setReaction(str, str2, str3);
        }
        if (isSameReaction(str, str2, str3)) {
            return Single.m10119a(new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.SAME_REACTION));
        }
        ReactionsService reactionsService2 = this.reactionsService;
        return reactionsService2.setSecondReaction(getUID(str + str2), str3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13901a(String str, String str2, ReactionsResponse reactionsResponse) {
        if (reactionsResponse.wasSuccess()) {
            HashMap<String, UserReaction> hashMap = this.userReactions;
            hashMap.remove(str + str2);
        }
    }
}
