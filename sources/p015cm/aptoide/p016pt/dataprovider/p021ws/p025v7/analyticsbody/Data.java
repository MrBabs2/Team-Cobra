package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.Data */
public class Data {
    private String abTestGroup;
    private App app;
    private Integer campaignId;
    private String network;
    private List<Obb> obb;
    private DataOrigin origin;
    private String previousContext;
    private String previousTag;
    private Result result;
    private Root root;
    private String store;
    private String teleco;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.Data$DataOrigin */
    public enum DataOrigin {
        INSTALL,
        UPDATE,
        DOWNGRADE,
        UPDATE_ALL
    }

    public String getAbTestGroup() {
        return this.abTestGroup;
    }

    public App getApp() {
        return this.app;
    }

    public Integer getCampaignId() {
        return this.campaignId;
    }

    public String getNetwork() {
        return this.network;
    }

    public List<Obb> getObb() {
        return this.obb;
    }

    public DataOrigin getOrigin() {
        return this.origin;
    }

    public String getPreviousContext() {
        return this.previousContext;
    }

    public String getPreviousTag() {
        return this.previousTag;
    }

    public Result getResult() {
        return this.result;
    }

    public Root getRoot() {
        return this.root;
    }

    public String getStore() {
        return this.store;
    }

    public String getTeleco() {
        return this.teleco;
    }

    public void setAbTestGroup(String str) {
        this.abTestGroup = str;
    }

    public void setApp(App app2) {
        this.app = app2;
    }

    public void setCampaignId(int i) {
        this.campaignId = Integer.valueOf(i);
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setObb(List<Obb> list) {
        this.obb = list;
    }

    public void setOrigin(DataOrigin dataOrigin) {
        this.origin = dataOrigin;
    }

    public void setPreviousContext(String str) {
        this.previousContext = str;
    }

    public void setPreviousTag(String str) {
        this.previousTag = str;
    }

    public void setResult(Result result2) {
        this.result = result2;
    }

    public void setRoot(Root root2) {
        this.root = root2;
    }

    public void setStore(String str) {
        this.store = str;
    }

    public void setTeleco(String str) {
        this.teleco = str;
    }
}
