package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.BaseV3Response;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.GetPushNotificationsResponse */
public class GetPushNotificationsResponse extends BaseV3Response {
    private List<Notification> results;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v3.GetPushNotificationsResponse$Notification */
    public static class Notification {

        /* renamed from: id */
        private int f4872id;
        private Images images;
        private String message;
        @JsonProperty("target_url")
        private String targetUrl;
        private String title;
        @JsonProperty("track_url")
        private String trackUrl;

        /* renamed from: cm.aptoide.pt.dataprovider.ws.v3.GetPushNotificationsResponse$Notification$Images */
        public static class Images {
            @JsonProperty("banner_url")
            private String bannerUrl;
            @JsonProperty("icon_url")
            private String iconUrl;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Images;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                if (!images.canEqual(this)) {
                    return false;
                }
                String bannerUrl2 = getBannerUrl();
                String bannerUrl3 = images.getBannerUrl();
                if (bannerUrl2 != null ? !bannerUrl2.equals(bannerUrl3) : bannerUrl3 != null) {
                    return false;
                }
                String iconUrl2 = getIconUrl();
                String iconUrl3 = images.getIconUrl();
                return iconUrl2 != null ? iconUrl2.equals(iconUrl3) : iconUrl3 == null;
            }

            public String getBannerUrl() {
                return this.bannerUrl;
            }

            public String getIconUrl() {
                return this.iconUrl;
            }

            public int hashCode() {
                int i;
                String bannerUrl2 = getBannerUrl();
                int i2 = 43;
                if (bannerUrl2 == null) {
                    i = 43;
                } else {
                    i = bannerUrl2.hashCode();
                }
                String iconUrl2 = getIconUrl();
                int i3 = (i + 59) * 59;
                if (iconUrl2 != null) {
                    i2 = iconUrl2.hashCode();
                }
                return i3 + i2;
            }

            public void setBannerUrl(String str) {
                this.bannerUrl = str;
            }

            public void setIconUrl(String str) {
                this.iconUrl = str;
            }

            public String toString() {
                return "GetPushNotificationsResponse.Notification.Images(bannerUrl=" + getBannerUrl() + ", iconUrl=" + getIconUrl() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Notification;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) obj;
            if (!notification.canEqual(this) || getId() != notification.getId()) {
                return false;
            }
            String title2 = getTitle();
            String title3 = notification.getTitle();
            if (title2 != null ? !title2.equals(title3) : title3 != null) {
                return false;
            }
            String message2 = getMessage();
            String message3 = notification.getMessage();
            if (message2 != null ? !message2.equals(message3) : message3 != null) {
                return false;
            }
            String targetUrl2 = getTargetUrl();
            String targetUrl3 = notification.getTargetUrl();
            if (targetUrl2 != null ? !targetUrl2.equals(targetUrl3) : targetUrl3 != null) {
                return false;
            }
            String trackUrl2 = getTrackUrl();
            String trackUrl3 = notification.getTrackUrl();
            if (trackUrl2 != null ? !trackUrl2.equals(trackUrl3) : trackUrl3 != null) {
                return false;
            }
            Images images2 = getImages();
            Images images3 = notification.getImages();
            return images2 != null ? images2.equals(images3) : images3 == null;
        }

        public int getId() {
            return this.f4872id;
        }

        public Images getImages() {
            return this.images;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTargetUrl() {
            return this.targetUrl;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTrackUrl() {
            return this.trackUrl;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String title2 = getTitle();
            int id = (getId() + 59) * 59;
            int i5 = 43;
            if (title2 == null) {
                i = 43;
            } else {
                i = title2.hashCode();
            }
            int i6 = id + i;
            String message2 = getMessage();
            int i7 = i6 * 59;
            if (message2 == null) {
                i2 = 43;
            } else {
                i2 = message2.hashCode();
            }
            int i8 = i7 + i2;
            String targetUrl2 = getTargetUrl();
            int i9 = i8 * 59;
            if (targetUrl2 == null) {
                i3 = 43;
            } else {
                i3 = targetUrl2.hashCode();
            }
            int i10 = i9 + i3;
            String trackUrl2 = getTrackUrl();
            int i11 = i10 * 59;
            if (trackUrl2 == null) {
                i4 = 43;
            } else {
                i4 = trackUrl2.hashCode();
            }
            int i12 = i11 + i4;
            Images images2 = getImages();
            int i13 = i12 * 59;
            if (images2 != null) {
                i5 = images2.hashCode();
            }
            return i13 + i5;
        }

        public void setId(int i) {
            this.f4872id = i;
        }

        public void setImages(Images images2) {
            this.images = images2;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setTargetUrl(String str) {
            this.targetUrl = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTrackUrl(String str) {
            this.trackUrl = str;
        }

        public String toString() {
            return "GetPushNotificationsResponse.Notification(id=" + getId() + ", title=" + getTitle() + ", message=" + getMessage() + ", targetUrl=" + getTargetUrl() + ", trackUrl=" + getTrackUrl() + ", images=" + getImages() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetPushNotificationsResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPushNotificationsResponse)) {
            return false;
        }
        GetPushNotificationsResponse getPushNotificationsResponse = (GetPushNotificationsResponse) obj;
        if (!getPushNotificationsResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<Notification> results2 = getResults();
        List<Notification> results3 = getPushNotificationsResponse.getResults();
        return results2 != null ? results2.equals(results3) : results3 == null;
    }

    public List<Notification> getResults() {
        return this.results;
    }

    public int hashCode() {
        int i;
        List<Notification> results2 = getResults();
        int hashCode = (super.hashCode() + 59) * 59;
        if (results2 == null) {
            i = 43;
        } else {
            i = results2.hashCode();
        }
        return hashCode + i;
    }

    public void setResults(List<Notification> list) {
        this.results = list;
    }

    public String toString() {
        return "GetPushNotificationsResponse(results=" + getResults() + ")";
    }
}
