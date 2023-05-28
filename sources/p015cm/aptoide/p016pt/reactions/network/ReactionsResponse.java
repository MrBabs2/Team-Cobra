package p015cm.aptoide.p016pt.reactions.network;

import retrofit2.Response;

/* renamed from: cm.aptoide.pt.reactions.network.ReactionsResponse */
public class ReactionsResponse {
    private final ReactionResponseMessage reactionResponseMessage;

    /* renamed from: cm.aptoide.pt.reactions.network.ReactionsResponse$ReactionResponseMapper */
    public static class ReactionResponseMapper {
        public static ReactionResponseMessage mapReactionResponse(Response response) {
            ReactionResponseMessage reactionResponseMessage = ReactionResponseMessage.GENERAL_ERROR;
            int code = response.code();
            if (code == 200 || code == 201 || code == 204) {
                return ReactionResponseMessage.SUCCESS;
            }
            if (code != 403) {
                if (code == 429) {
                    return ReactionResponseMessage.REACTIONS_EXCEEDED;
                }
                if (!(code == 500 || code == 400 || code == 401 || code == 405 || code == 406)) {
                    return reactionResponseMessage;
                }
            }
            return ReactionResponseMessage.GENERAL_ERROR;
        }
    }

    /* renamed from: cm.aptoide.pt.reactions.network.ReactionsResponse$ReactionResponseMessage */
    public enum ReactionResponseMessage {
        SUCCESS,
        GENERAL_ERROR,
        REACTIONS_EXCEEDED,
        SAME_REACTION,
        NETWORK_ERROR
    }

    public ReactionsResponse(ReactionResponseMessage reactionResponseMessage2) {
        this.reactionResponseMessage = reactionResponseMessage2;
    }

    public boolean differentReaction() {
        return this.reactionResponseMessage != ReactionResponseMessage.SAME_REACTION;
    }

    public boolean reactionsExceeded() {
        return this.reactionResponseMessage == ReactionResponseMessage.REACTIONS_EXCEEDED;
    }

    public boolean wasGeneralError() {
        return this.reactionResponseMessage == ReactionResponseMessage.GENERAL_ERROR;
    }

    public boolean wasNetworkError() {
        return this.reactionResponseMessage == ReactionResponseMessage.NETWORK_ERROR;
    }

    public boolean wasSuccess() {
        return this.reactionResponseMessage == ReactionResponseMessage.SUCCESS;
    }
}
