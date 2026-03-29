import java.util.Scanner;

class Coffee extends Item {

    Scanner scan = new Scanner(System.in);

    int extraCreamPrice = 110;
    int customLatteArtPrice = 70;

    void buildCoffee() {

        System.out.println("Do you want extra cream? (Y/N) ");
        String cream = scan.next();
        String yes = "Yyes";
        boolean ch1, ch2;
        if (yes.contains(cream)) {
            ch1 = true;
            System.out.println("Extra cream added! ");
        } else
            ch1 = false;
        System.out.println("Do you want custom Latte Art? (Y/N) ");
        String art = scan.next();
        if (yes.contains(art)) {
            ch2 = true;
            System.out.println("Custom Latte Art added!");
        } else
            ch2 = false;
        addExtraCream(ch1);
        addCustomLatteArt(ch2);
    }

    void addExtraCream(boolean ch1) {
        this.price += extraCreamPrice;
    }

    void addCustomLatteArt(boolean ch2) {
        this.price += customLatteArtPrice;
    }
}