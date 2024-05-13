public class Tea {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea has already been prepared.");
        }
    }

    public void addMilk() {
        if (isPrepared) {
            if (!hasMilk) {
                System.out.println("Adding milk to the tea.");
                hasMilk = true;
            } else {
                System.out.println("Milk has already been added to the tea.");
            }
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }

    public void addSugar() {
        if (isPrepared) {
            if (!hasSugar) {
                System.out.println("Adding sugar to the tea.");
                hasSugar = true;
            } else {
                System.out.println("Sugar has already been added to the tea.");
            }
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }
}

//black tea subclass
public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing black tea with hot water and black tea leaves.");
            System.out.println("Brewing time: 5 minutes");
            isPrepared = true;
        } else {
            System.out.println("Black tea has already been prepared.");
        }
    }
}
//green tea subclass
public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing green tea with hot water and green tea leaves.");
            System.out.println("Brewing time: 3 minutes");
            isPrepared = true;
        } else {
            System.out.println("Green tea has already been prepared.");
        }
    }
}

//herbal tea subclass
public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing herbal tea with hot water and herbal tea ingredients.");
            System.out.println("Brewing time: 7 minutes");
            isPrepared = true;
        } else {
            System.out.println("Herbal tea has already been prepared.");
        }
    }
}

//main

public class Main {
    public static void main(String[] args) {
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea(); // Prepare black tea
        blackTea.addMilk(); // Add milk to black tea
        blackTea.addSugar(); // Add sugar to black tea

        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea(); // Prepare green tea
        greenTea.addSugar(); // Add sugar to green tea

        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea(); // Prepare herbal tea
        herbalTea.addMilk(); // Try adding milk to herbal tea (not applicable)
    }
}

