package p015cm.aptoide.p016pt.account.view.store;

/* renamed from: cm.aptoide.pt.account.view.store.StoreValidationException */
class StoreValidationException extends Throwable {
    public static final int EMPTY_AVATAR = 1;
    public static final int EMPTY_NAME = 0;
    public static final String FACEBOOK_1 = "FACEBOOK_1";
    public static final String FACEBOOK_2 = "FACEBOOK_2";
    public static final String TWITCH_1 = "TWITCH_1";
    public static final String TWITCH_2 = "TWITCH_2";
    public static final String TWITTER_1 = "TWITTER_1";
    public static final String TWITTER_2 = "TWITTER_2";
    public static final String YOUTUBE_1 = "YOUTUBE_1";
    public static final String YOUTUBE_2 = "YOUTUBE_2";
    private final int errorCode;

    public StoreValidationException(int i) {
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
