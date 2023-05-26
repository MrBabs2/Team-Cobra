package p015cm.aptoide.p016pt.view;

import android.content.Context;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

@Deprecated
/* renamed from: cm.aptoide.pt.view.Translator */
public final class Translator {
    public static String translate(String str, Context context, String str2) {
        if (str == null) {
            return str;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2137395588:
                if (str.equals("Health")) {
                    c = ')';
                    break;
                }
                break;
            case -2118305922:
                if (str.equals("Game of the Week")) {
                    c = '_';
                    break;
                }
                break;
            case -2061360222:
                if (str.equals("Brain & Puzzle")) {
                    c = 'C';
                    break;
                }
                break;
            case -2031379405:
                if (str.equals("Get rewarded with AppCoins")) {
                    c = '\\';
                    break;
                }
                break;
            case -2012006303:
                if (str.equals("Timeline")) {
                    c = 6;
                    break;
                }
                break;
            case -1892828066:
                if (str.equals("Puzzle")) {
                    c = '3';
                    break;
                }
                break;
            case -1854741650:
                if (str.equals("Racing")) {
                    c = 'G';
                    break;
                }
                break;
            case -1813183603:
                if (str.equals("Social")) {
                    c = 22;
                    break;
                }
                break;
            case -1811893345:
                if (str.equals("Sports")) {
                    c = 24;
                    break;
                }
                break;
            case -1808199726:
                if (str.equals("Stores")) {
                    c = 2;
                    break;
                }
                break;
            case -1791609619:
                if (str.equals("News & Weather")) {
                    c = 17;
                    break;
                }
                break;
            case -1790955542:
                if (str.equals("Themes")) {
                    c = 25;
                    break;
                }
                break;
            case -1781830854:
                if (str.equals("Travel")) {
                    c = 27;
                    break;
                }
                break;
            case -1781592413:
                if (str.equals("Trivia")) {
                    c = '=';
                    break;
                }
                break;
            case -1689537935:
                if (str.equals("Medical")) {
                    c = '&';
                    break;
                }
                break;
            case -1644804512:
                if (str.equals("Editors' Choice")) {
                    c = 'T';
                    break;
                }
                break;
            case -1546396700:
                if (str.equals("Featured Stores")) {
                    c = 'Y';
                    break;
                }
                break;
            case -1530360837:
                if (str.equals("Reviews")) {
                    c = 16;
                    break;
                }
                break;
            case -1524721952:
                if (str.equals("Sports Games")) {
                    c = 'F';
                    break;
                }
                break;
            case -1406873644:
                if (str.equals("Weather")) {
                    c = ' ';
                    break;
                }
                break;
            case -1283672907:
                if (str.equals("Use Your AppCoins")) {
                    c = 'a';
                    break;
                }
                break;
            case -1249904381:
                if (str.equals("Earn AppCoins Credits")) {
                    c = 'b';
                    break;
                }
                break;
            case -1238034679:
                if (str.equals("Transport")) {
                    c = '-';
                    break;
                }
                break;
            case -1113305055:
                if (str.equals("Music & Audio")) {
                    c = 31;
                    break;
                }
                break;
            case -1112902953:
                if (str.equals("Aptoide Publishers")) {
                    c = 'M';
                    break;
                }
                break;
            case -1094268730:
                if (str.equals("Music & Video")) {
                    c = 'N';
                    break;
                }
                break;
            case -1082186784:
                if (str.equals("Business")) {
                    c = 23;
                    break;
                }
                break;
            case -1073649596:
                if (str.equals("Essential Apps")) {
                    c = 'O';
                    break;
                }
                break;
            case -1062937150:
                if (str.equals("Followed Stores")) {
                    c = 'W';
                    break;
                }
                break;
            case -1049499468:
                if (str.equals("Comments on this store")) {
                    c = 'V';
                    break;
                }
                break;
            case -1039412629:
                if (str.equals("Multimedia")) {
                    c = '0';
                    break;
                }
                break;
            case -978294581:
                if (str.equals("Downloads")) {
                    c = 3;
                    break;
                }
                break;
            case -961061219:
                if (str.equals("Top Apps")) {
                    c = 'H';
                    break;
                }
                break;
            case -955424387:
                if (str.equals("Photography")) {
                    c = '!';
                    break;
                }
                break;
            case -897418454:
                if (str.equals("Health & Fitness")) {
                    c = '.';
                    break;
                }
                break;
            case -857147262:
                if (str.equals("AppCoins Enabled")) {
                    c = 'Z';
                    break;
                }
                break;
            case -733713896:
                if (str.equals("News & Magazines")) {
                    c = 19;
                    break;
                }
                break;
            case -704707964:
                if (str.equals("Role Playing")) {
                    c = '?';
                    break;
                }
                break;
            case -658248308:
                if (str.equals("Cards & Casino")) {
                    c = 'D';
                    break;
                }
                break;
            case -579226340:
                if (str.equals("Latest Applications")) {
                    c = 'J';
                    break;
                }
                break;
            case -570295317:
                if (str.equals("Travel & Local")) {
                    c = '$';
                    break;
                }
                break;
            case -559276497:
                if (str.equals("Apps Timeline")) {
                    c = 5;
                    break;
                }
                break;
            case -352711613:
                if (str.equals("Summer Apps")) {
                    c = 'P';
                    break;
                }
                break;
            case -335032828:
                if (str.equals("Personalization")) {
                    c = '#';
                    break;
                }
                break;
            case -279816824:
                if (str.equals("Shopping")) {
                    c = 21;
                    break;
                }
                break;
            case -236322890:
                if (str.equals("Communication")) {
                    c = '\"';
                    break;
                }
                break;
            case -226683580:
                if (str.equals("Libraries & Demo")) {
                    c = '*';
                    break;
                }
                break;
            case -161518821:
                if (str.equals("Books & Reference")) {
                    c = '+';
                    break;
                }
                break;
            case -140581837:
                if (str.equals("Highlighted")) {
                    c = 11;
                    break;
                }
                break;
            case 65921:
                if (str.equals("All")) {
                    c = '2';
                    break;
                }
                break;
            case 2092848:
                if (str.equals("Card")) {
                    c = '>';
                    break;
                }
                break;
            case 2126339:
                if (str.equals("Demo")) {
                    c = 29;
                    break;
                }
                break;
            case 2255103:
                if (str.equals("Home")) {
                    c = 0;
                    break;
                }
                break;
            case 2702122:
                if (str.equals("Word")) {
                    c = ':';
                    break;
                }
                break;
            case 64356038:
                if (str.equals("Board")) {
                    c = 'B';
                    break;
                }
                break;
            case 68567713:
                if (str.equals("Games")) {
                    c = 10;
                    break;
                }
                break;
            case 74710533:
                if (str.equals("Music")) {
                    c = 'A';
                    break;
                }
                break;
            case 80992699:
                if (str.equals("Tools")) {
                    c = 26;
                    break;
                }
                break;
            case 111439712:
                if (str.equals("Software Libraries")) {
                    c = 28;
                    break;
                }
                break;
            case 276964342:
                if (str.equals("Top Games")) {
                    c = 15;
                    break;
                }
                break;
            case 357128477:
                if (str.equals("Top Stores")) {
                    c = 14;
                    break;
                }
                break;
            case 471515264:
                if (str.equals("Arcade & Action")) {
                    c = '<';
                    break;
                }
                break;
            case 523718601:
                if (str.equals("Community")) {
                    c = 4;
                    break;
                }
                break;
            case 640838532:
                if (str.equals("Mysterious Donor")) {
                    c = '`';
                    break;
                }
                break;
            case 701694503:
                if (str.equals("Simulation")) {
                    c = '8';
                    break;
                }
                break;
            case 710918574:
                if (str.equals("Comments in this store")) {
                    c = 'U';
                    break;
                }
                break;
            case 811395002:
                if (str.equals("Finance")) {
                    c = '(';
                    break;
                }
                break;
            case 857024639:
                if (str.equals("Featured AppCoins Apps")) {
                    c = 'c';
                    break;
                }
                break;
            case 891620482:
                if (str.equals("Latest Reviews")) {
                    c = 7;
                    break;
                }
                break;
            case 927605132:
                if (str.equals("Transportation")) {
                    c = '%';
                    break;
                }
                break;
            case 983921684:
                if (str.equals("The cryptocurrency for the app economy is here! Get free AppCoins by using your favorite apps.")) {
                    c = '^';
                    break;
                }
                break;
            case 994268114:
                if (str.equals("Local Top Apps")) {
                    c = 13;
                    break;
                }
                break;
            case 1078812459:
                if (str.equals("Reference")) {
                    c = 20;
                    break;
                }
                break;
            case 1101527363:
                if (str.equals("Applications")) {
                    c = 9;
                    break;
                }
                break;
            case 1188177138:
                if (str.equals("Productivity")) {
                    c = 18;
                    break;
                }
                break;
            case 1298968424:
                if (str.equals("Entertainment")) {
                    c = '\'';
                    break;
                }
                break;
            case 1309873904:
                if (str.equals("Adventure")) {
                    c = '9';
                    break;
                }
                break;
            case 1413249359:
                if (str.equals("You can get AppCoins now!")) {
                    c = ']';
                    break;
                }
                break;
            case 1423561139:
                if (str.equals("Educational")) {
                    c = '@';
                    break;
                }
                break;
            case 1430223018:
                if (str.equals(UpdatesAnalytics.UPDATE_EVENT)) {
                    c = 1;
                    break;
                }
                break;
            case 1459599685:
                if (str.equals("Trending")) {
                    c = 12;
                    break;
                }
                break;
            case 1529205357:
                if (str.equals("Latest Comments")) {
                    c = 8;
                    break;
                }
                break;
            case 1559628443:
                if (str.equals("Editors Choice")) {
                    c = 'R';
                    break;
                }
                break;
            case 1639783301:
                if (str.equals("Media & Video")) {
                    c = '/';
                    break;
                }
                break;
            case 1713211272:
                if (str.equals("Education")) {
                    c = '1';
                    break;
                }
                break;
            case 1716292629:
                if (str.equals("Lifestyle")) {
                    c = ',';
                    break;
                }
                break;
            case 1753516375:
                if (str.equals("Recommended Stores")) {
                    c = 'X';
                    break;
                }
                break;
            case 1785707127:
                if (str.equals("Top Apps in this store")) {
                    c = 'K';
                    break;
                }
                break;
            case 1852442515:
                if (str.equals("Strategy")) {
                    c = '6';
                    break;
                }
                break;
            case 1855032658:
                if (str.equals("Apps for Kids")) {
                    c = 'L';
                    break;
                }
                break;
            case 1887347784:
                if (str.equals("Editor's Choice")) {
                    c = 'S';
                    break;
                }
                break;
            case 1942241885:
                if (str.equals("Play-it!")) {
                    c = 'Q';
                    break;
                }
                break;
            case 1955883606:
                if (str.equals("Action")) {
                    c = '5';
                    break;
                }
                break;
            case 1969221936:
                if (str.equals("Arcade")) {
                    c = ';';
                    break;
                }
                break;
            case 2011265045:
                if (str.equals("Casino")) {
                    c = '4';
                    break;
                }
                break;
            case 2011276171:
                if (str.equals("Casual")) {
                    c = 'E';
                    break;
                }
                break;
            case 2024015256:
                if (str.equals("Comics")) {
                    c = 30;
                    break;
                }
                break;
            case 2043863915:
                if (str.equals("Latest Apps")) {
                    c = 'I';
                    break;
                }
                break;
            case 2060928108:
                if (str.equals("Spend your AppCoins")) {
                    c = '[';
                    break;
                }
                break;
            case 2096973700:
                if (str.equals("Family")) {
                    c = '7';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return context.getString(C1086R.string.home_title);
            case 1:
                return context.getString(C1086R.string.updates);
            case 2:
                return context.getString(C1086R.string.stores);
            case 3:
                return context.getString(C1086R.string.downloads);
            case 4:
                return context.getString(C1086R.string.community);
            case 5:
                return context.getString(C1086R.string.apps_timeline);
            case 6:
                return context.getString(C1086R.string.timeline);
            case 7:
                return context.getString(C1086R.string.latest_reviews);
            case 8:
                return context.getString(C1086R.string.latest_comments);
            case 9:
                return context.getString(C1086R.string.applications);
            case 10:
                return context.getString(C1086R.string.games);
            case 11:
                return context.getString(C1086R.string.highlighted);
            case 12:
                return context.getString(C1086R.string.trending);
            case 13:
                return context.getString(C1086R.string.local_top_apps);
            case 14:
                return context.getString(C1086R.string.top_stores_fragment_title);
            case 15:
                return context.getString(C1086R.string.top_games);
            case 16:
                return context.getString(C1086R.string.reviews);
            case 17:
                return context.getString(C1086R.string.news_weather);
            case 18:
                return context.getString(C1086R.string.productivity);
            case 19:
                return context.getString(C1086R.string.news_magazines);
            case 20:
                return context.getString(C1086R.string.reference);
            case 21:
                return context.getString(C1086R.string.shopping);
            case 22:
                return context.getString(C1086R.string.social);
            case 23:
                return context.getString(C1086R.string.business);
            case 24:
                return context.getString(C1086R.string.sports);
            case 25:
                return context.getString(C1086R.string.themes);
            case 26:
                return context.getString(C1086R.string.tools);
            case 27:
                return context.getString(C1086R.string.travel);
            case 28:
                return context.getString(C1086R.string.software_libraries);
            case 29:
                return context.getString(C1086R.string.demo);
            case 30:
                return context.getString(C1086R.string.comics);
            case 31:
                return context.getString(C1086R.string.music_audio);
            case ' ':
                return context.getString(C1086R.string.weather);
            case '!':
                return context.getString(C1086R.string.photography);
            case '\"':
                return context.getString(C1086R.string.communication);
            case '#':
                return context.getString(C1086R.string.personalization);
            case '$':
                return context.getString(C1086R.string.travel_local);
            case '%':
                return context.getString(C1086R.string.transportation);
            case '&':
                return context.getString(C1086R.string.medical);
            case '\'':
                return context.getString(C1086R.string.entertainment);
            case '(':
                return context.getString(C1086R.string.finance);
            case ')':
                return context.getString(C1086R.string.health);
            case '*':
                return context.getString(C1086R.string.libraries_demo);
            case '+':
                return context.getString(C1086R.string.books_reference);
            case ',':
                return context.getString(C1086R.string.lifestyle);
            case '-':
                return context.getString(C1086R.string.transport);
            case '.':
                return context.getString(C1086R.string.health_fitness);
            case '/':
                return context.getString(C1086R.string.media_video);
            case '0':
                return context.getString(C1086R.string.multimedia);
            case '1':
                return context.getString(C1086R.string.education);
            case '2':
                return context.getString(C1086R.string.all);
            case '3':
                return context.getString(C1086R.string.puzzle);
            case '4':
                return context.getString(C1086R.string.casino);
            case '5':
                return context.getString(C1086R.string.action);
            case '6':
                return context.getString(C1086R.string.strategy);
            case '7':
                return context.getString(C1086R.string.family);
            case '8':
                return context.getString(C1086R.string.simulation);
            case '9':
                return context.getString(C1086R.string.adventure);
            case ':':
                return context.getString(C1086R.string.word);
            case ';':
                return context.getString(C1086R.string.arcade);
            case '<':
                return context.getString(C1086R.string.arcade_action);
            case '=':
                return context.getString(C1086R.string.trivia);
            case '>':
                return context.getString(C1086R.string.card);
            case '?':
                return context.getString(C1086R.string.role_playing);
            case '@':
                return context.getString(C1086R.string.educational);
            case 'A':
                return context.getString(C1086R.string.music);
            case 'B':
                return context.getString(C1086R.string.board);
            case 'C':
                return context.getString(C1086R.string.brain_puzzle);
            case 'D':
                return context.getString(C1086R.string.cards_casino);
            case 'E':
                return context.getString(C1086R.string.casual);
            case 'F':
                return context.getString(C1086R.string.sports_games);
            case 'G':
                return context.getString(C1086R.string.racing);
            case 'H':
                return context.getString(C1086R.string.top_apps);
            case 'I':
            case 'J':
                return context.getString(C1086R.string.latest_applications);
            case 'K':
                return context.getString(C1086R.string.top_apps_in_store);
            case 'L':
                return context.getString(C1086R.string.apps_for_kids);
            case 'M':
                return AptoideUtils.StringU.getFormattedString(C1086R.string.aptoide_publishers, context.getResources(), str2);
            case 'N':
                return context.getString(C1086R.string.music_video);
            case 'O':
                return context.getString(C1086R.string.essential_apps);
            case 'P':
                return context.getString(C1086R.string.summer_apps);
            case 'Q':
                return context.getString(C1086R.string.title_play_it);
            case 'R':
            case 'S':
            case 'T':
                return context.getString(C1086R.string.home_title_editors_choice);
            case 'U':
            case 'V':
                return context.getString(C1086R.string.comment_store_title);
            case 'W':
                return context.getString(C1086R.string.followed_stores);
            case 'X':
                return context.getString(C1086R.string.recommended_stores);
            case 'Y':
                return context.getString(C1086R.string.featured_stores);
            case 'Z':
            case '[':
                return context.getString(C1086R.string.appc_title_iab);
            case '\\':
                return context.getString(C1086R.string.appc_title_ads);
            case ']':
                return context.getString(C1086R.string.appc_title_homepage_card);
            case '^':
                return context.getString(C1086R.string.appc_message_homepage_card);
            case '_':
                return context.getString(C1086R.string.home_game_of_the_week);
            case '`':
                return context.getString(C1086R.string.appview_title_donations_leaderboard_unknown);
            case 'a':
                return context.getString(C1086R.string.appc_home_bundle_iab);
            case 'b':
                return context.getString(C1086R.string.appc_home_bundle_poa);
            case 'c':
                return context.getString(C1086R.string.appc_title_featured);
            default:
                return str;
        }
    }

    public static String[] translateToMultiple(String str, Context context) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1846398218) {
            if (hashCode == 1904461492 && str.equals("Your store doesn't have any applications yet. Install Aptoide Uploader and upload apps to share them with the world!")) {
                c = 0;
            }
        } else if (str.equals("Your store does not have any applications yet. Install Aptoide Uploader and upload apps to share them with the world!")) {
            c = 1;
        }
        if (c != 0 && c != 1) {
            return null;
        }
        return new String[]{context.getString(C1086R.string.install_app_outter_pt1), context.getString(C1086R.string.install_app_outter_pt2), context.getString(C1086R.string.install_app_inner), context.getString(C1086R.string.open_app_inner)};
    }
}
