package p015cm.aptoide.p016pt.social.commentslist;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.social.commentslist.CommentDataWrapper */
public class CommentDataWrapper {
    private final Long longAsId;
    private final Long previousCommentId;
    private final BaseV7Response response;
    private final String stringAsId;

    public CommentDataWrapper(BaseV7Response baseV7Response, Long l, Long l2, String str) {
        this.response = baseV7Response;
        this.longAsId = l;
        this.previousCommentId = l2;
        this.stringAsId = str;
    }

    public Long getLongAsId() {
        return this.longAsId;
    }

    public Long getPreviousCommentId() {
        return this.previousCommentId;
    }

    public BaseV7Response getResponse() {
        return this.response;
    }

    public String getStringAsId() {
        return this.stringAsId;
    }
}
