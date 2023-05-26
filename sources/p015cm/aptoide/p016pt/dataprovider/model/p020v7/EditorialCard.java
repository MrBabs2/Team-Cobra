package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.Appearance;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.EditorialCard */
public class EditorialCard extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.EditorialCard$Action */
    public static class Action {
        private String title;
        private String url;

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.EditorialCard$Content */
    public static class Content {
        private Action action;
        private App app;
        private List<Media> media;
        private String message;
        private String title;
        private String type;

        public Action getAction() {
            return this.action;
        }

        public App getApp() {
            return this.app;
        }

        public List<Media> getMedia() {
            return this.media;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setAction(Action action2) {
            this.action = action2;
        }

        public void setApp(App app2) {
            this.app = app2;
        }

        public void setMedia(List<Media> list) {
            this.media = list;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.EditorialCard$Data */
    public static class Data {
        private Appearance appearance;
        private String background;
        private String caption;
        private List<Content> content;

        /* renamed from: id */
        private String f4846id;
        private String title;
        private String type;

        public Appearance getAppearance() {
            return this.appearance;
        }

        public String getBackground() {
            return this.background;
        }

        public String getCaption() {
            return this.caption;
        }

        public List<Content> getContent() {
            return this.content;
        }

        public String getId() {
            return this.f4846id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setAppearance(Appearance appearance2) {
            this.appearance = appearance2;
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setCaption(String str) {
            this.caption = str;
        }

        public void setContent(List<Content> list) {
            this.content = list;
        }

        public void setId(String str) {
            this.f4846id = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.EditorialCard$Media */
    public static class Media {
        private String description;
        private String image;
        private String thumbnail;
        private String type;
        private String url;

        public String getDescription() {
            return this.description;
        }

        public String getImage() {
            return this.image;
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

        public void setDescription(String str) {
            this.description = str;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setThumbnail(String str) {
            this.thumbnail = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
