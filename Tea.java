public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }
    // creating a method to prepare tea.
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea has already been prepared.");
        }
    }
    // creating a method to add milk
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
    //creating a method to add sugar
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
//main
public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea(); // Prepare basic tea
        tea.addMilk(); // Add milk to the tea
        tea.addSugar(); // Add sugar to the tea
        tea.addMilk(); // Try adding milk again (already added)
        tea.prepareTea(); // Try preparing tea again (already prepared)
    }
}
