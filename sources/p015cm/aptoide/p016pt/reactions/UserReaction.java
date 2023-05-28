package p015cm.aptoide.p016pt.reactions;

/* renamed from: cm.aptoide.pt.reactions.UserReaction */
class UserReaction {
    private final String reaction;
    private final String userId;

    public UserReaction(String str, String str2) {
        this.userId = str;
        this.reaction = str2;
    }

    public String getReaction() {
        return this.reaction;
    }

    public String getUserId() {
        return this.userId;
    }
}
