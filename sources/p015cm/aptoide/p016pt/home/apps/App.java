package p015cm.aptoide.p016pt.home.apps;

/* renamed from: cm.aptoide.pt.home.apps.App */
public interface App {

    /* renamed from: cm.aptoide.pt.home.apps.App$Type */
    public enum Type {
        UPDATE,
        DOWNLOAD,
        INSTALLED
    }

    String getIdentifier();

    Type getType();
}
