package p015cm.aptoide.p016pt.editorial;

/* renamed from: cm.aptoide.pt.editorial.EditorialMedia */
class EditorialMedia {
    private final String description;
    private final String thumbnail;
    private final String type;
    private final String url;

    public EditorialMedia(String str, String str2, String str3, String str4) {
        this.type = str;
        this.description = str2;
        this.thumbnail = str3;
        this.url = str4;
    }

    public String getDescription() {
        return this.description;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean hasDescription() {
        String str = this.description;
        return str != null && !str.equals("");
    }

    public boolean hasType() {
        String str = this.type;
        return str != null && !str.equals("");
    }

    public boolean hasUrl() {
        String str = this.url;
        return str != null && !str.equals("");
    }

    public boolean isEmbedded() {
        return hasType() && this.type.equals("video_webview");
    }

    public boolean isImage() {
        return hasType() && this.type.equals("image");
    }

    public boolean isVideo() {
        return hasType() && this.type.equals("video");
    }
}
