package p015cm.aptoide.p016pt.app;

/* renamed from: cm.aptoide.pt.app.ReviewUser */
public class ReviewUser {
    private final String avatar;

    /* renamed from: id */
    private final long f3852id;
    private final String name;

    public ReviewUser(long j, String str, String str2) {
        this.f3852id = j;
        this.avatar = str;
        this.name = str2;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f3852id;
    }

    public String getName() {
        return this.name;
    }
}
