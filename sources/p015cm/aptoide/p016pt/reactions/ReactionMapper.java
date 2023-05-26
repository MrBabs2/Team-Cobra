package p015cm.aptoide.p016pt.reactions;

import p015cm.aptoide.p016pt.reactions.data.ReactionType;

/* renamed from: cm.aptoide.pt.reactions.ReactionMapper */
public class ReactionMapper {

    /* renamed from: cm.aptoide.pt.reactions.ReactionMapper$1 */
    static /* synthetic */ class C39461 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.reactions.data.ReactionType[] r0 = p015cm.aptoide.p016pt.reactions.data.ReactionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType = r0
                cm.aptoide.pt.reactions.data.ReactionType r1 = p015cm.aptoide.p016pt.reactions.data.ReactionType.LIKE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$reactions$data$ReactionType     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.reactions.data.ReactionType r1 = p015cm.aptoide.p016pt.reactions.data.ReactionType.DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.reactions.ReactionMapper.C39461.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int mapReaction(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = -1
            switch(r0) {
                case -1117280700: goto L_0x0035;
                case 3327858: goto L_0x002b;
                case 3559430: goto L_0x0021;
                case 102745729: goto L_0x0017;
                case 1330679997: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "thumbs_up"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 0
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "laugh"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 4
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "thug"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 3
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "love"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "thumbs_down"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = -1
        L_0x0040:
            if (r6 == 0) goto L_0x005b
            if (r6 == r4) goto L_0x0057
            if (r6 == r3) goto L_0x0053
            if (r6 == r2) goto L_0x004f
            if (r6 == r1) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            r5 = 2131231297(0x7f080241, float:1.8078671E38)
            goto L_0x005e
        L_0x004f:
            r5 = 2131231300(0x7f080244, float:1.8078677E38)
            goto L_0x005e
        L_0x0053:
            r5 = 2131231298(0x7f080242, float:1.8078673E38)
            goto L_0x005e
        L_0x0057:
            r5 = 2131231301(0x7f080245, float:1.807868E38)
            goto L_0x005e
        L_0x005b:
            r5 = 2131231302(0x7f080246, float:1.8078681E38)
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.reactions.ReactionMapper.mapReaction(java.lang.String):int");
    }

    public static String mapUserReaction(ReactionType reactionType) {
        int i = C39461.$SwitchMap$cm$aptoide$pt$reactions$data$ReactionType[reactionType.ordinal()];
        if (i != 1) {
            return i != 2 ? reactionType.toString().toLowerCase() : "thumbs_down";
        }
        return "thumbs_up";
    }
}
