package p015cm.aptoide.p016pt.blacklist;

/* renamed from: cm.aptoide.pt.blacklist.Blacklister */
public class Blacklister {
    private BlacklistPersistence blacklistPersistence;

    public Blacklister(BlacklistPersistence blacklistPersistence2) {
        this.blacklistPersistence = blacklistPersistence2;
    }

    public void addImpression(BlacklistUnit blacklistUnit) {
        this.blacklistPersistence.addImpression(blacklistUnit.getId(), blacklistUnit.getMaxImpressions());
    }

    public void blacklist(BlacklistUnit blacklistUnit) {
        this.blacklistPersistence.blacklist(blacklistUnit.getId());
    }

    public boolean isBlacklisted(BlacklistUnit blacklistUnit) {
        return this.blacklistPersistence.isBlacklisted(blacklistUnit.getId(), blacklistUnit.getMaxImpressions());
    }
}
