package p015cm.aptoide.p016pt.dataprovider.model.p017v1;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v1.GetPullNotificationsResponse */
public class GetPullNotificationsResponse {
    private String abTestingGroup;
    private Attr attr;
    private String body;
    private int campaignId;
    private Long expire;
    private String img;
    private String lang;
    private String title;
    private int type;
    private String url;
    private String urlTrack;
    private String urlTrackNc;
    private List<String> whitelistedPackages;

    public String getAbTestingGroup() {
        return this.abTestingGroup;
    }

    public Attr getAttr() {
        return this.attr;
    }

    public String getBody() {
        return this.body;
    }

    public int getCampaignId() {
        return this.campaignId;
    }

    public Long getExpire() {
        return this.expire;
    }

    public String getImg() {
        return this.img;
    }

    public String getLang() {
        return this.lang;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlTrack() {
        return this.urlTrack;
    }

    public String getUrlTrackNc() {
        return this.urlTrackNc;
    }

    public List<String> getWhitelistedPackages() {
        return this.whitelistedPackages;
    }

    public void setAbTestingGroup(String str) {
        this.abTestingGroup = str;
    }

    public void setAttr(Attr attr2) {
        this.attr = attr2;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCampaignId(int i) {
        this.campaignId = i;
    }

    public void setExpire(long j) {
        this.expire = Long.valueOf(j);
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrlTrack(String str) {
        this.urlTrack = str;
    }

    public void setUrlTrackNc(String str) {
        this.urlTrackNc = str;
    }

    public void setWhitelistedPackages(List<String> list) {
        this.whitelistedPackages = list;
    }
}
