public class Main {
    public static void main(String[] args) {
        Tea[] teas = new Tea[4];

        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        for (Tea tea : teas) {
            tea.prepareTea();
            tea.addMilk();
            tea.addSugar();
            System.out.println("--------------------");
        }
    }
}
