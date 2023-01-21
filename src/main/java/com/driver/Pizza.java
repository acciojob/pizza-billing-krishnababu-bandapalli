package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private final int cheeseAdded = 80;
    private int toppingsAdded;
    private final int paperBag = 20;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isExtraCheeseAdded = false;
        isExtraToppingsAdded = false;
        isPaperBagAdded = false;
        isBillGenerated = false;

        if(isVeg) {
            this.price = 300;
            this.toppingsAdded = 70;
        }
        else {
            this.price = 400;
            this.toppingsAdded = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            this.price += this.cheeseAdded;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!isExtraToppingsAdded) {
            this.price += this.toppingsAdded;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded) {
            this.price += this.paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: "+ this.cheeseAdded + "\n";
            if (isExtraToppingsAdded)
                this.bill += "Extra Toppings Added: " + this.toppingsAdded + "\n";
            if (isPaperBagAdded)
                this.bill += "Paperbag Added: " + this.paperBag +"\n";

            this.bill += "Total Price: " + this.price + "\n";

            isBillGenerated = true;
        }

        return this.bill;
    }
}
