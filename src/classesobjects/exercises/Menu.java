package classesobjects.exercises;

public class Menu {

    private String menuText;
    private int optionCount;

    public Menu() {
        menuText = "";
        optionCount = 0;
    }

    public void display() {
        System.out.println(menuText);
    }

    public void addOption(String option) {
        optionCount++;
        menuText += optionCount + ") " + option + "\n";
    }

    public String getOption(int k) {
        String[] options = menuText.split("\n");
        String option = options[k - 1];
        int position = option.indexOf(") ");
        return option.substring(position + 2);
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addOption("Open new account");
        menu.addOption("Log into existing account");
        menu.addOption("Help");
        menu.addOption("Quit");
        menu.display();
    }

}
