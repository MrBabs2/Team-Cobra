package p015cm.aptoide.p016pt.reactions;

/* renamed from: cm.aptoide.pt.reactions.ReactionEvent */
public class ReactionEvent {
    private final String cardId;
    private final String groupId;
    private final String reactionType;

    public ReactionEvent(String str, String str2, String str3) {
        this.cardId = str;
        this.reactionType = str2;
        this.groupId = str3;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getReactionType() {
        return this.reactionType;
    }
}
