import java.util.Scanner;

class Cake extends Item {
    Scanner scan = new Scanner(System.in);

    int flavor;
    int type;
    int[] flavours_price = { 500, 300, 400, 900 };

    void chooseFlavor() {
        System.out.println("Choose your flavor: \n 1. Chocolate\n 2. Vanilla \n 3. Strawberry\n");
        flavor = scan.nextInt();
    }

    void type() {
        System.out.println("Do you want a cake(1) or a pastry(2) ?");
        type = scan.nextInt();
    }

    public void buildCake() {
        chooseFlavor();
        type();
        if (type == 1) {
            this.price = flavours_price[flavor - 1];
        } else if (type == 2) {
            System.out.println("How many pieces? ");
            int qty = scan.nextInt();
            if (flavor == 1)
                this.price += 200;
            else if (flavor == 2)
                this.price += 100;
            else if (flavor == 3)
                this.price += 150;
            this.price = this.price * qty;
            System.out.println(qty + " pieces added! ");
        }

    }
}