package classesobjects.exercises;

import java.util.ArrayList;
import java.util.List;

public class Programmer {

    private String name;
    private String lastname;
    private List<String> languages;
    private String company;

    public Programmer(String name, String lastname, String company) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        languages = new ArrayList<String>();
    }

    public List<String> getLanguages() {
        return languages.stream().toList();
    }

    public void addLanguage(String lang) {
        languages.add(lang);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {

        Programmer ramai = new Programmer("Ramai", "Alexandria", "Apple");
        ramai.addLanguage("Java");
        ramai.addLanguage("Python");
        ramai.addLanguage("C++");
        ramai.addLanguage("Php");

        System.out.println(ramai.getName());
        System.out.println(ramai.getLastname());
        System.out.println(ramai.getCompany());
        System.out.println(ramai.getLanguages());
    }
}
