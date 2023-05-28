package p015cm.aptoide.p016pt.donations;

import com.squareup.moshi.C4746e;
import java.util.List;

/* renamed from: cm.aptoide.pt.donations.BaseResponse */
public class BaseResponse {
    private List<Error> errors;
    private Info info;

    /* renamed from: cm.aptoide.pt.donations.BaseResponse$Details */
    static class Details {
        @C4746e(name = "store_links")
        private List<StoreLinks> storeLinks;

        Details() {
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Details;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            if (!details.canEqual(this)) {
                return false;
            }
            List<StoreLinks> storeLinks2 = getStoreLinks();
            List<StoreLinks> storeLinks3 = details.getStoreLinks();
            return storeLinks2 != null ? storeLinks2.equals(storeLinks3) : storeLinks3 == null;
        }

        /* access modifiers changed from: package-private */
        public List<StoreLinks> getStoreLinks() {
            return this.storeLinks;
        }

        public int hashCode() {
            int i;
            List<StoreLinks> storeLinks2 = getStoreLinks();
            if (storeLinks2 == null) {
                i = 43;
            } else {
                i = storeLinks2.hashCode();
            }
            return 59 + i;
        }

        /* access modifiers changed from: package-private */
        public void setStoreLinks(List<StoreLinks> list) {
            this.storeLinks = list;
        }

        public String toString() {
            return "BaseV7Response.Details(storeLinks=" + getStoreLinks() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.donations.BaseResponse$Error */
    static class Error {
        private String code;
        private String description;
        private Details details;

        Error() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof Error;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (!error.canEqual(this)) {
                return false;
            }
            String code2 = getCode();
            String code3 = error.getCode();
            if (code2 != null ? !code2.equals(code3) : code3 != null) {
                return false;
            }
            String description2 = getDescription();
            String description3 = error.getDescription();
            if (description2 != null ? !description2.equals(description3) : description3 != null) {
                return false;
            }
            Details details2 = getDetails();
            Details details3 = error.getDetails();
            return details2 != null ? details2.equals(details3) : details3 == null;
        }

        /* access modifiers changed from: package-private */
        public String getCode() {
            return this.code;
        }

        /* access modifiers changed from: package-private */
        public String getDescription() {
            return this.description;
        }

        /* access modifiers changed from: package-private */
        public Details getDetails() {
            return this.details;
        }

        public int hashCode() {
            int i;
            int i2;
            String code2 = getCode();
            int i3 = 43;
            if (code2 == null) {
                i = 43;
            } else {
                i = code2.hashCode();
            }
            String description2 = getDescription();
            int i4 = (i + 59) * 59;
            if (description2 == null) {
                i2 = 43;
            } else {
                i2 = description2.hashCode();
            }
            int i5 = i4 + i2;
            Details details2 = getDetails();
            int i6 = i5 * 59;
            if (details2 != null) {
                i3 = details2.hashCode();
            }
            return i6 + i3;
        }

        /* access modifiers changed from: package-private */
        public void setCode(String str) {
            this.code = str;
        }

        /* access modifiers changed from: package-private */
        public void setDescription(String str) {
            this.description = str;
        }

        /* access modifiers changed from: package-private */
        public void setDetails(Details details2) {
            this.details = details2;
        }

        public String toString() {
            return "BaseV7Response.Error(code=" + getCode() + ", description=" + getDescription() + ", details=" + getDetails() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.donations.BaseResponse$Info */
    static class Info {
        private Status status;
        private Time time;

        /* renamed from: cm.aptoide.pt.donations.BaseResponse$Info$Status */
        enum Status {
            OK,
            QUEUED,
            FAIL,
            Processing
        }

        /* renamed from: cm.aptoide.pt.donations.BaseResponse$Info$Time */
        static class Time {
            private String human;
            private double seconds;

            Time() {
            }

            public boolean canEqual(Object obj) {
                return obj instanceof Time;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Time)) {
                    return false;
                }
                Time time = (Time) obj;
                if (!time.canEqual(this) || Double.compare(getSeconds(), time.getSeconds()) != 0) {
                    return false;
                }
                String human2 = getHuman();
                String human3 = time.getHuman();
                return human2 != null ? human2.equals(human3) : human3 == null;
            }

            /* access modifiers changed from: package-private */
            public String getHuman() {
                return this.human;
            }

            /* access modifiers changed from: package-private */
            public double getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                int i;
                long doubleToLongBits = Double.doubleToLongBits(getSeconds());
                String human2 = getHuman();
                int i2 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 59) * 59;
                if (human2 == null) {
                    i = 43;
                } else {
                    i = human2.hashCode();
                }
                return i2 + i;
            }

            /* access modifiers changed from: package-private */
            public void setHuman(String str) {
                this.human = str;
            }

            /* access modifiers changed from: package-private */
            public void setSeconds(double d) {
                this.seconds = d;
            }

            public String toString() {
                return "BaseV7Response.Info.Time(seconds=" + getSeconds() + ", human=" + getHuman() + ")";
            }
        }

        Info() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof Info;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            if (!info.canEqual(this)) {
                return false;
            }
            Status status2 = getStatus();
            Status status3 = info.getStatus();
            if (status2 != null ? !status2.equals(status3) : status3 != null) {
                return false;
            }
            Time time2 = getTime();
            Time time3 = info.getTime();
            return time2 != null ? time2.equals(time3) : time3 == null;
        }

        /* access modifiers changed from: package-private */
        public Status getStatus() {
            return this.status;
        }

        /* access modifiers changed from: package-private */
        public Time getTime() {
            return this.time;
        }

        public int hashCode() {
            int i;
            Status status2 = getStatus();
            int i2 = 43;
            if (status2 == null) {
                i = 43;
            } else {
                i = status2.hashCode();
            }
            Time time2 = getTime();
            int i3 = (i + 59) * 59;
            if (time2 != null) {
                i2 = time2.hashCode();
            }
            return i3 + i2;
        }

        /* access modifiers changed from: package-private */
        public void setStatus(Status status2) {
            this.status = status2;
        }

        /* access modifiers changed from: package-private */
        public void setTime(Time time2) {
            this.time = time2;
        }

        public String toString() {
            return "BaseV7Response.Info(status=" + getStatus() + ", time=" + getTime() + ")";
        }

        Info(Status status2, Time time2) {
            this.status = status2;
            this.time = time2;
        }
    }

    /* renamed from: cm.aptoide.pt.donations.BaseResponse$StoreLinks */
    static class StoreLinks {
        private String error;
        private Type type;
        private String url;

        StoreLinks() {
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof StoreLinks;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreLinks)) {
                return false;
            }
            StoreLinks storeLinks = (StoreLinks) obj;
            if (!storeLinks.canEqual(this)) {
                return false;
            }
            Type type2 = getType();
            Type type3 = storeLinks.getType();
            if (type2 != null ? !type2.equals(type3) : type3 != null) {
                return false;
            }
            String url2 = getUrl();
            String url3 = storeLinks.getUrl();
            if (url2 != null ? !url2.equals(url3) : url3 != null) {
                return false;
            }
            String error2 = getError();
            String error3 = storeLinks.getError();
            return error2 != null ? error2.equals(error3) : error3 == null;
        }

        /* access modifiers changed from: package-private */
        public String getError() {
            return this.error;
        }

        /* access modifiers changed from: package-private */
        public Type getType() {
            return this.type;
        }

        /* access modifiers changed from: package-private */
        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int i;
            int i2;
            Type type2 = getType();
            int i3 = 43;
            if (type2 == null) {
                i = 43;
            } else {
                i = type2.hashCode();
            }
            String url2 = getUrl();
            int i4 = (i + 59) * 59;
            if (url2 == null) {
                i2 = 43;
            } else {
                i2 = url2.hashCode();
            }
            int i5 = i4 + i2;
            String error2 = getError();
            int i6 = i5 * 59;
            if (error2 != null) {
                i3 = error2.hashCode();
            }
            return i6 + i3;
        }

        /* access modifiers changed from: package-private */
        public void setError(String str) {
            this.error = str;
        }

        /* access modifiers changed from: package-private */
        public void setType(Type type2) {
            this.type = type2;
        }

        /* access modifiers changed from: package-private */
        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "BaseV7Response.StoreLinks(type=" + getType() + ", url=" + getUrl() + ", error=" + getError() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.donations.BaseResponse$Type */
    enum Type {
        FACEBOOK_1,
        FACEBOOK_2,
        TWITCH_1,
        TWITCH_2,
        TWITTER_1,
        TWITTER_2,
        YOUTUBE_1,
        YOUTUBE_2
    }

    BaseResponse() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof BaseResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (!baseResponse.canEqual(this)) {
            return false;
        }
        Info info2 = getInfo();
        Info info3 = baseResponse.getInfo();
        if (info2 != null ? !info2.equals(info3) : info3 != null) {
            return false;
        }
        List<Error> errors2 = getErrors();
        List<Error> errors3 = baseResponse.getErrors();
        return errors2 != null ? errors2.equals(errors3) : errors3 == null;
    }

    public Error getError() {
        List<Error> list = this.errors;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.errors.get(0);
    }

    /* access modifiers changed from: package-private */
    public List<Error> getErrors() {
        return this.errors;
    }

    /* access modifiers changed from: package-private */
    public Info getInfo() {
        return this.info;
    }

    public int hashCode() {
        int i;
        Info info2 = getInfo();
        int i2 = 43;
        if (info2 == null) {
            i = 43;
        } else {
            i = info2.hashCode();
        }
        List<Error> errors2 = getErrors();
        int i3 = (i + 59) * 59;
        if (errors2 != null) {
            i2 = errors2.hashCode();
        }
        return i3 + i2;
    }

    /* access modifiers changed from: package-private */
    public boolean isOk() {
        Info info2 = this.info;
        return info2 != null && info2.getStatus() == Info.Status.OK;
    }

    /* access modifiers changed from: package-private */
    public void setErrors(List<Error> list) {
        this.errors = list;
    }

    /* access modifiers changed from: package-private */
    public void setInfo(Info info2) {
        this.info = info2;
    }

    public String toString() {
        return "BaseV7Response(info=" + getInfo() + ", errors=" + getErrors() + ")";
    }
}
