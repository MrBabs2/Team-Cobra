package p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.AppCoinsInfo */
public class AppCoinsInfo {
    private boolean advertising;
    private boolean billing;
    private List<String> flags;

    public List<String> getFlags() {
        return this.flags;
    }

    public boolean hasAdvertising() {
        return this.advertising;
    }

    public boolean hasBilling() {
        return this.billing;
    }

    public void setAdvertising(boolean z) {
        this.advertising = z;
    }

    public void setBilling(boolean z) {
        this.billing = z;
    }

    public void setFlags(List<String> list) {
        this.flags = list;
    }
}
