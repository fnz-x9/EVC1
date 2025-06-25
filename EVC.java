import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EVC {
    private static double haraa = 300.0;
    private static ArrayList<String> history = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static Date currentDateAndTime = new Date();

    public static void main(String[] args) {

        System.out.println("Fadlan gali *code-ka* ka dibna # (tusaale: *770#)");
        String n = input.nextLine();

        if (n.startsWith("*") && n.endsWith("#")) {
            System.out.println("Fadlan gali pinkaaga:");
            int password = input.nextInt();
            input.nextLine();
            if (password == 1111) {
                boolean running = true;
                while (running) {
                    showMainMenu();
                    int option = input.nextInt();
                    input.nextLine();

                    switch (option) {
                        case 0:
                            System.out.println("Waxaad dooratay inaad ka baxdo.");
                            running = false;
                            break;
                        case 1:
                            showBalance();
                            break;
                        case 2:
                            kaarkaHadalkaMenu();
                            break;
                        case 3:
                            bixiBillMenu();
                            break;
                        case 4:
                            wareejiEVCPlus();
                            break;
                        case 5:
                            warbixinKooban();
                            break;
                        case 6:
                            salaamBankMenu();
                            break;
                        case 7:
                            maareynta();
                            break;
                        case 8:
                            taaj();
                            break;
                        case 9:
                            billPayment();
                            break;
                        default:
                            System.out.println("Fadlan dooro number sax ah.");
                            break;
                    }
                }
                System.out.println("\nMahadsanid macmiil, soo laabo mar kale!");
            } else {
                System.out.println("Password khaldan!");
            }
        } else {
            System.out.println("Fadlan geli *code-ka* sax ah sida tusaalaha.");
        }
        input.close();
    }

    private static void showMainMenu() {
        System.out.println("\nEVPLus Menu:");
        System.out.println("1. Itus Haraagaga");
        System.out.println("2. Karka ku hadalka");
        System.out.println("3. Bixi bill");
        System.out.println("4. U wareeji EVCplus");
        System.out.println("5. Warbixin kooban");
        System.out.println("6. Salam bank");
        System.out.println("7. Maareynta");
        System.out.println("8. TAAJ");
        System.out.println("9. Bill payment");
        System.out.println("0. Ka bax (Exit)");
        System.out.print("Fadlan dooro option: ");
    }

    private static void showBalance() {
        System.out.println("Haraagaga waa $" + haraa);
        history.add("Checked balance: $" + haraa + " at " + new Date());
    }

    private static void kaarkaHadalkaMenu() {
        System.out.println("Kaarka hadalka:");
        System.out.println("1. Ku shuba Airtime");
        System.out.println("2. Ugu dhub airtime");
        System.out.println("3. MIFI Packages");
        System.out.println("4. Ku shuba internet");
        System.out.println("5. Ugu shub qof kale (MMT)");
        System.out.print("Dooro: ");
        int op2 = input.nextInt();
        input.nextLine();

        switch (op2) {
            case 1:
                kuShubAirtime();
                break;
            case 2:
                uguDhubAirtime();
                break;
            default:
                System.out.println("Fadlan dooro number sax ah.");
                break;
        }
    }

    private static void kuShubAirtime() {
        System.out.print("Fadlan geli lacagta: ");
        double money = input.nextDouble();
        input.nextLine();
        System.out.println("Ma hubtaa inaad $" + money + " ugu shubtid? \n1.haa \n2.maya");
        int opp = input.nextInt();
        input.nextLine();
        if (opp == 1) {
            if (money > haraa) {
                System.out.println("Xisaabtaada kugu ma filna.");
            } else {
                haraa -= money;
                String record = "Ku shub Airtime $" + money + " at " + new Date();
                history.add(record);
                System.out.println("EVC PLUS");
                System.out.println("Waxaad ku shubatay $" + money + "\nTaariikh: " + currentDateAndTime + "\nHaraagaagu waa $" + haraa);
            }
        } else {
            System.out.println("Mahadsanid.");
        }
    }

    private static void uguDhubAirtime() {
        System.out.print("Fadlan geli numberka: ");
        int phone = input.nextInt();
        input.nextLine();

        System.out.print("Fadlan geli lacagta: ");
        double money = input.nextDouble();
        input.nextLine();

        System.out.println("Ma hubtaa inaad $" + money + " ugu shubtid " + phone + "? \n1.haa \n2.maya");
        int opp = input.nextInt();
        input.nextLine();

        if (opp == 1) {
            if (money > haraa) {
                System.out.println("Haraaga kugu ma filna.");
            } else {
                haraa -= money;
                String record = "Ugu dhub Airtime $" + money + " to " + phone + " at " + new Date();
                history.add(record);
                System.out.println("EVC PLUS \nWaxaad ugu shubtay $" + money + "\nlambarka " + phone + "\nTaariikh: " + currentDateAndTime + "\nHaraagaaga waa $" + haraa);
            }
        } else {
            System.out.println("Mahadsanid.");
        }
    }

    private static void bixiBillMenu() {
        System.out.println("Bixi Biil:");
        System.out.println("1. Post paid");
        System.out.println("2. Ku libso");
        System.out.print("Dooro: ");
        int opp = input.nextInt();
        input.nextLine();

        if (opp == 1) {
            System.out.println("Post paid:");
            System.out.println("1. Ogow Biilka");
            System.out.println("2. Bixi Bill");
            System.out.println("3. Ka Bixi Bill");
            System.out.print("Dooro: ");
            int subOption = input.nextInt();
            input.nextLine();

            switch (subOption) {
                case 1:
                    System.out.println("Error occurred, please try again.");
                    break;
                case 2:
                    System.out.print("Fadlan geli lacagta: ");
                    double money = input.nextDouble();
                    input.nextLine();
                    System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + money + "?\n1.haa\n2.maya");
                    opp = input.nextInt();
                    input.nextLine();
                    if (opp == 1) {
                        if (money > haraa) {
                            System.out.println("Haraaga xisaabtaada kugu ma filna.");
                        } else {
                            haraa -= money;
                            history.add("Bixi Bill: $" + money + " at " + new Date());
                            System.out.println("Waxaad bixisay bill \nlacagtiisu tahay $" + money + "\nTaariikh: " + currentDateAndTime + "\nHaraagaagu waa $" + haraa);
                        }
                    } else {
                        System.out.println("Mahadsanid.");
                    }
                    break;
                case 3:
                    System.out.print("Fadlan geli numberka: ");
                    int phone = input.nextInt();
                    input.nextLine();
                    System.out.print("Fadlan geli lacagta: ");
                    money = input.nextDouble();
                    input.nextLine();
                    System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay $" + money + " oo laga rabo tel No " + phone + "?\n1.haa\n2.maya");
                    opp = input.nextInt();
                    input.nextLine();
                    if (opp == 1) {
                        if (money > haraa) {
                            System.out.println("Haraaga xisaabtaada kugu ma filna.");
                        } else {
                            haraa -= money;
                            history.add("Bixi Bill: $" + money + " for phone " + phone + " at " + new Date());
                            System.out.println("Waxaad bixisay bill lacagtiisu tahay $" + money + " oo laga rabay tel No " + phone + "\nTaariikh: " + currentDateAndTime + "\nHaraagaagu waa $" + haraa);
                        }
                    } else {
                        System.out.println("Mahadsanid.");
                    }
                    break;
                default:
                    System.out.println("Fadlan dooro numberka saxda ah.");
                    break;
            }
        } else if (opp == 2) {
            System.out.print("Fadlan geli aqoonsiga ganacsigaaga: ");
            int ganacsiId = input.nextInt();
            input.nextLine();

            System.out.print("Fadlan geli lacagta aad rabto inaad ku libsatid: ");
            double amount = input.nextDouble();
            input.nextLine();

            if (amount <= 0) {
                System.out.println("Fadlan geli lacag sax ah.");
            } else if (amount > haraa) {
                System.out.println("Haraaga xisaabtaada kuma filna lacag bixintan.");
            } else {
                haraa -= amount;
                String transaction = "Waxaad ku libsatay $" + amount +
                        " ganacsiga ID: " + ganacsiId +
                        " - Haraaga cusub: $" + haraa;
                System.out.println(transaction);

            }
        }

    }

    private static void wareejiEVCPlus() {
        System.out.print("Fadlan geli numberka: ");
        int phone = input.nextInt();
        input.nextLine();
        System.out.print("Fadlan geli lacagta: ");
        double money = input.nextDouble();
        input.nextLine();
        System.out.println("Ma hubtaa inaad $" + money + " u wareejisay " + phone + "?\n1.haa\n2.maya");
        int opp = input.nextInt();
        input.nextLine();
        if (opp == 1) {
            if (money > haraa) {
                System.out.println("Haraaga xisaabtaada kugu ma filna.");
            } else {
                haraa -= money;
                history.add("Wareejiyey $" + money + " to " + phone + " at " + new Date());
                System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + phone + " Taariikh: " + currentDateAndTime + " Haraagaagu waa $" + haraa);
            }
        } else {
            System.out.println("Mahadsanid.");
        }
    }

    private static void warbixinKooban() {
        System.out.println("Warbixin Kooban:");
        System.out.println("1: Last Action");
        System.out.println("2: Wareejintii Udambeeyay");
        System.out.println("3: Iibsashadii Udambeeyay");
        System.out.println("4: Last 3-Action");
        System.out.print("Dooro: ");
        int opp = input.nextInt();
        input.nextLine();

        if (history.isEmpty()) {
            System.out.println("Ma jirto wax taariikh ah.");
            return;
        }

        switch (opp) {
            case 1:
                System.out.println("Last Action:");
                System.out.println(history.get(history.size() - 1));
                break;
            case 2:
                System.out.println("Wareejintii Udambeeyay:");
                boolean found = false;
                for (int i = history.size() - 1; i >= 0; i--) {
                    if (history.get(i).toLowerCase().contains("wareejiyey") || history.get(i).toLowerCase().contains("wareejisay")) {
                        System.out.println(history.get(i));
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Wareejin ma jirto.");
                break;
            case 3:
                System.out.println("Iibsashadii Udambeeyay:");
                found = false;
                for (int i = history.size() - 1; i >= 0; i--) {
                    String rec = history.get(i).toLowerCase();
                    if (rec.contains("ku shub") || rec.contains("bixi bill")) {
                        System.out.println(history.get(i));
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Iibsasho ma jirto.");
                break;
            case 4:
                System.out.println("Last 3-Actions:");
                int start = Math.max(history.size() - 3, 0);
                for (int i = start; i < history.size(); i++) {
                    System.out.println(history.get(i));
                }
                break;
            default:
                System.out.println("Fadlan dooro number sax ah.");
                break;
        }
    }

    private static double salaamBankBalance = 500.00;

    private static void salaamBankMenu() {
        if (accountLocked) {
            System.out.println("Account-kaaga waa la xannibay, fadlan la xiriir adeegga macaamiisha Salaam Bank.");
            return;
        }

        boolean salaamRunning = true;
        while (salaamRunning) {
            System.out.println("\nSalaam Bank:");
            System.out.println("1. Itus Haraagaaga");
            System.out.println("2. Lacag dhigasho");
            System.out.println("3. Lacag qaadasho");
            System.out.println("4. Ka Wareeji EVCPLUS");
            System.out.println("5. Ka Wareeji Account-kaaga");
            System.out.println("6. Hubi wareejin account");
            System.out.println("7. Maareynta bankiga");
            System.out.println("8. Ka Bax");
            System.out.print("Dooro: ");
            int opp = input.nextInt();
            input.nextLine();

            switch (opp) {
                case 1:
                    System.out.println("Haraaga Salaam Bank waa: $" + salaamBankBalance);
                    break;

                case 2:
                    System.out.print("Fadlan geli lacagta aad dhigeyso: ");
                    double deposit = input.nextDouble();
                    input.nextLine();
                    if(deposit > 0) {
                        salaamBankBalance += deposit;
                        System.out.println("Waad ku shubtay Salaam Bank $" + deposit);
                        history.add("Salaam Bank: Lacag dhigasho $" + deposit + " at " + new Date());
                    } else {
                        System.out.println("Fadlan geli lacag sax ah.");
                    }
                    break;

                case 3:
                    System.out.print("Fadlan geli lacagta aad qaadayso: ");
                    double withdraw = input.nextDouble();
                    input.nextLine();
                    if(withdraw > 0 && withdraw <= salaamBankBalance) {
                        salaamBankBalance -= withdraw;
                        System.out.println("Waad ka qaaday Salaam Bank $" + withdraw);
                        history.add("Salaam Bank: Lacag qaadasho $" + withdraw + " at " + new Date());
                    } else {
                        System.out.println("Lacagta aad codsatay kama bixin kartid ama waa mid aan sax ahayn.");
                    }
                    break;

                case 4:
                    // Ka Wareeji EVCPLUS
                    System.out.print("Fadlan geli lacagta aad u wareejinayso EVCPLUS: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    if(amount > 0 && amount <= salaamBankBalance) {
                        if (amount <= haraa) {
                            salaamBankBalance -= amount;
                            haraa += amount;
                            System.out.println("Waad u wareejisay $" + amount + " EVCPLUS.");
                            history.add("Salaam Bank: Wareejin EVCPLUS $" + amount + " at " + new Date());
                        } else {
                            System.out.println("Haraaga EVCPLUS kuma filna in lacag lagu helo.");
                        }
                    } else {
                        System.out.println("Lacagta ma aha mid sax ah ama kama bixin kartid Salaam Bank.");
                    }
                    break;

                case 5:
                    // Ka Wareeji Account-kaaga (Tusaale fudud)
                    System.out.print("Fadlan geli lacagta aad u wareejinayso account-kaaga: ");
                    double accAmount = input.nextDouble();
                    input.nextLine();
                    if(accAmount > 0 && accAmount <= haraa) {
                        haraa -= accAmount;
                        salaamBankBalance += accAmount;
                        System.out.println("Waad u wareejisay $" + accAmount + " account-ka Salaam Bank.");
                        history.add("Salaam Bank: Wareejin Account $" + accAmount + " at " + new Date());
                    } else {
                        System.out.println("Lacagta ma aha mid sax ah ama kama bixin kartid EVCPLUS.");
                    }
                    break;

                case 6:
                    // Hubinta wareejinta (muujin taariikhaha Salaam Bank)
                    System.out.println("Taariikhda wareejinta Salaam Bank:");
                    boolean found = false;
                    for (String rec : history) {
                        if (rec.startsWith("Salaam Bank:")) {
                            System.out.println(rec);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Ma jiraan wareejinno la diiwaangeliyay.");
                    }
                    break;

                case 7:
                    // Maareynta bankiga (menu fudud)
                    System.out.println("Maareynta bankiga:");
                    System.out.println("1. Beddel PIN Salaam Bank");
                    System.out.println("2. Xannib Account Salaam Bank");
                    System.out.println("3. Ka Bax");
                    System.out.print("Dooro: ");
                    int bankChoice = input.nextInt();
                    input.nextLine();

                    switch(bankChoice) {
                        case 1:
                            System.out.print("Fadlan geli PIN-ka hadda: ");
                            String oldPin = input.nextLine();
                            if (oldPin.equals(currentPin)) {
                                System.out.print("Fadlan geli PIN cusub (4 digit): ");
                                String newPin = input.nextLine();
                                if (newPin.length() == 4 && newPin.matches("\\d+")) {
                                    currentPin = newPin;
                                    System.out.println("PIN-kaaga Salaam Bank waa la bedelay si guul leh.");
                                } else {
                                    System.out.println("PIN cusub waa inuu ahaadaa 4 digit oo keliya.");
                                }
                            } else {
                                System.out.println("PIN-ka hadda waa khalad.");
                            }
                            break;
                        case 2:
                            System.out.println("Ma hubtaa inaad xannibto account-kaaga Salaam Bank? \n1.haa\n2.maya");
                            int confirm = input.nextInt();
                            input.nextLine();
                            if (confirm == 1) {
                                accountLocked = true;
                                System.out.println("Account-ka Salaam Bank waa la xannibay. Fadlan la xiriir adeegga macaamiisha si aad u furo.");
                            } else {
                                System.out.println("Account-ka lama xannibin.");
                            }
                            break;
                        case 3:
                            System.out.println("Ka bax Maareynta bankiga.");
                            break;
                        default:
                            System.out.println("Doorasho khaldan.");
                            break;
                    }
                    break;

                case 8:
                    System.out.println("Ka bax Salaam Bank menu.");
                    salaamRunning = false;
                    break;

                default:
                    System.out.println("Fadlan dooro number sax ah.");
                    break;
            }
        }
    }

    private static boolean accountLocked = false;
    private static String currentPin = "1111";




    private static void maareynta() {
        if (accountLocked) {
            System.out.println("Account-ka waa xanniban yahay, fadlan la xiriir adeegga macaamiisha.");
            return;
        }
        System.out.println("Maareynta:");
        System.out.println("1. Beddel PIN");
        System.out.println("2. Eeg Taariikhda Macaamilka");
        System.out.println("3. Xannib Account");
        System.out.println("4. Ka Bax");
        System.out.print("Dooro: ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Fadlan geli PIN-ka hadda: ");
                String oldPin = input.nextLine();
                if (oldPin.equals(currentPin)) {
                    System.out.print("Fadlan geli PIN cusub (4 digit): ");
                    String newPin = input.nextLine();
                    if (newPin.length() == 4 && newPin.matches("\\d+")) {
                        currentPin = newPin;
                        System.out.println("PIN-kaaga waa la bedelay si guul leh.");
                    } else {
                        System.out.println("PIN cusub waa inuu ahaadaa 4 digit oo keliya.");
                    }
                } else {
                    System.out.println("PIN-ka hadda waa khalad.");
                }
                break;
            case 2:
                if (history.isEmpty()) {
                    System.out.println("Ma jiraan wax macaamil ah oo la diiwaan geliyay.");
                } else {
                    System.out.println("Taariikhda macaamilka:");
                    for (String record : history) {
                        System.out.println(record);
                    }
                }
                break;
            case 3:
                System.out.println("Ma hubtaa inaad xannibto account-kaaga? \n1.haa\n2.maya");
                int confirm = input.nextInt();
                input.nextLine();
                if (confirm == 1) {
                    accountLocked = true;
                    System.out.println("Account-ka waa la xannibay. Fadlan la xiriir adeegga macaamiisha si aad u furo.");
                } else {
                    System.out.println("Account-ka lama xannibin.");
                }
                break;
            case 4:
                System.out.println("Ka bax Maareynta.");
                break;
            default:
                System.out.println("Doorasho khaldan.");
                break;
        }
    }

    private static void taaj() {
        System.out.println("TAAJ - Adeegga Lacag Diridda:");
        System.out.println("1. Dir Lacag");
        System.out.println("2. Eeg Taariikhda Lacag Diridda");
        System.out.println("3. Ka Bax");
        System.out.print("Dooro: ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Fadlan geli lambarka qaataha: ");
                int recipient = input.nextInt();
                input.nextLine();

                System.out.print("Fadlan geli lacagta aad dirayso: ");
                double amount = input.nextDouble();
                input.nextLine();

                if (amount > haraa) {
                    System.out.println("Haraagaagu kuma filna inaad lacagtaas dirto.");
                } else {
                    haraa -= amount;
                    String record = "TAAJ: Lacag $" + amount + " ayaa loo diray " + recipient + " at " + new Date();
                    history.add(record);
                    System.out.println("Waxaad si guul leh ugu dirtay $" + amount + " lambarka " + recipient);
                    System.out.println("Haraagaagu waa $" + haraa);
                }
                break;

            case 2:
                System.out.println("Taariikhda Lacag Diridda TAAJ:");
                boolean found = false;
                for (String rec : history) {
                    if (rec.startsWith("TAAJ:")) {
                        System.out.println(rec);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Ma jiraan lacag dirid TAAJ ah.");
                }
                break;

            case 3:
                System.out.println("Ka bax TAAJ menu.");
                break;

            default:
                System.out.println("Doorasho khaldan.");
                break;
        }
    }


    private static void billPayment() {
        System.out.println("Bill Payment:");
        System.out.println("1. Bixi Biil Caadi ah");
        System.out.println("2. Eeg Taariikhda Biil Bixinta");
        System.out.println("3. Ka Bax");
        System.out.print("Dooro: ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Fadlan geli magaca shirkadda/biilka: ");
                String company = input.nextLine();

                System.out.print("Fadlan geli lacagta biilka: ");
                double amount = input.nextDouble();
                input.nextLine();

                if (amount > haraa) {
                    System.out.println("Haraagaagu kuma filna inaad bixiso biilka.");
                } else {
                    haraa -= amount;
                    String record = "Bill Payment: Biilka " + company + " lacagta $" + amount + " ayaa la bixiyay at " + new Date();
                    history.add(record);
                    System.out.println("Waad bixisay biilka shirkadda " + company);
                    System.out.println("Haraagaagu waa $" + haraa);
                }
                break;

            case 2:
                System.out.println("Taariikhda Biil Bixinta:");
                boolean found = false;
                for (String rec : history) {
                    if (rec.startsWith("Bill Payment:")) {
                        System.out.println(rec);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Ma jiraan taariikh biil bixinta ah.");
                }
                break;

            case 3:
                System.out.println("Ka bax Bill Payment menu.");
                break;

            default:
                System.out.println("Doorasho khaldan.");
                break;
        }
    }
}