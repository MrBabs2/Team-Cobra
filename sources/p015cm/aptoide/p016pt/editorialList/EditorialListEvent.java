package p015cm.aptoide.p016pt.editorialList;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListEvent */
class EditorialListEvent {
    private final String cardId;
    private final int position;

    public EditorialListEvent(String str, int i) {
        this.cardId = str;
        this.position = i;
    }

    public String getCardId() {
        return this.cardId;
    }

    public int getPosition() {
        return this.position;
    }
}
