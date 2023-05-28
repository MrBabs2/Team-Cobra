package p015cm.aptoide.p016pt.blacklist;

/* renamed from: cm.aptoide.pt.blacklist.BlacklistUnitMapper */
public class BlacklistUnitMapper {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p015cm.aptoide.p016pt.blacklist.BlacklistUnit mapActionCardToBlacklistUnit(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -1817393869(0xffffffff93acc533, float:-4.3613358E-27)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = -174115577(0xfffffffff59f3507, float:-4.0363805E32)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "WALLET_ADS_OFFER"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "INFO_BUNDLE"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x0052
            if (r4 != r2) goto L_0x004a
            cm.aptoide.pt.blacklist.BlacklistUnit r4 = new cm.aptoide.pt.blacklist.BlacklistUnit
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            cm.aptoide.pt.blacklist.BlacklistManager$BlacklistType r1 = p015cm.aptoide.p016pt.blacklist.BlacklistManager.BlacklistType.APPC_CARD_INFO
            java.lang.String r1 = r1.getType()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cm.aptoide.pt.blacklist.BlacklistManager$BlacklistType r0 = p015cm.aptoide.p016pt.blacklist.BlacklistManager.BlacklistType.APPC_CARD_INFO
            int r0 = r0.getMaxPossibleImpressions()
            r4.<init>(r5, r0)
            return r4
        L_0x004a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong blacklist key. Please, make sure you are passing the correct action card type and id."
            r4.<init>(r5)
            throw r4
        L_0x0052:
            cm.aptoide.pt.blacklist.BlacklistUnit r4 = new cm.aptoide.pt.blacklist.BlacklistUnit
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            cm.aptoide.pt.blacklist.BlacklistManager$BlacklistType r1 = p015cm.aptoide.p016pt.blacklist.BlacklistManager.BlacklistType.WALLET_ADS_OFFER
            java.lang.String r1 = r1.getType()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cm.aptoide.pt.blacklist.BlacklistManager$BlacklistType r0 = p015cm.aptoide.p016pt.blacklist.BlacklistManager.BlacklistType.WALLET_ADS_OFFER
            int r0 = r0.getMaxPossibleImpressions()
            r4.<init>(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.blacklist.BlacklistUnitMapper.mapActionCardToBlacklistUnit(java.lang.String, java.lang.String):cm.aptoide.pt.blacklist.BlacklistUnit");
    }
}
