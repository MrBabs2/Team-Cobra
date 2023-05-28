package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: cm.aptoide.pt.home.ChipManager */
public class ChipManager {
    private Chip currentChip;

    /* renamed from: cm.aptoide.pt.home.ChipManager$Chip */
    public enum Chip {
        APPS(DeepLinkIntentReceiver.DeepLinksTargets.APPS),
        GAMES("games");
        
        private String name;

        private Chip(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public Chip getCurrentChip() {
        return this.currentChip;
    }

    public void setCurrentChip(Chip chip) {
        this.currentChip = chip;
    }
}
