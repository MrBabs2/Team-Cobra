package p015cm.aptoide.p016pt.blacklist;

/* renamed from: cm.aptoide.pt.blacklist.BlacklistManager */
public class BlacklistManager {
    private BlacklistUnitMapper blacklistUnitMapper;
    private Blacklister blacklister;

    /* renamed from: cm.aptoide.pt.blacklist.BlacklistManager$BlacklistType */
    public enum BlacklistType {
        WALLET_ADS_OFFER("Wallet_Ads_Offer", 10),
        APPC_CARD_INFO("Appc_Card_Info", 10);
        
        private int maxPossibleImpressions;
        private String type;

        private BlacklistType(String str, int i) {
            this.type = str;
            this.maxPossibleImpressions = i;
        }

        public int getMaxPossibleImpressions() {
            return this.maxPossibleImpressions;
        }

        public String getType() {
            return this.type;
        }
    }

    public BlacklistManager(Blacklister blacklister2, BlacklistUnitMapper blacklistUnitMapper2) {
        this.blacklister = blacklister2;
        this.blacklistUnitMapper = blacklistUnitMapper2;
    }

    public void addImpression(String str, String str2) {
        this.blacklister.addImpression(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }

    public void blacklist(String str, String str2) {
        this.blacklister.blacklist(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }

    public boolean isBlacklisted(String str, String str2) {
        return this.blacklister.isBlacklisted(this.blacklistUnitMapper.mapActionCardToBlacklistUnit(str, str2));
    }
}
