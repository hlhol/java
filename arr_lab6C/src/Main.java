import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*String[] names = new String[10];
        names[0] = "Ahmed";
        names[1] = "Maryam";
        names[2] = "Abdulla";
        names[3] = "Younis";
        names[4] = "Saeed";
        names[5] = "Zahra";
        names[6] = "Latifa";
        addName(names);*/

        String[] names = new String[10];
        names[0]="Ahmed";
        names[1]="Maryam";
        names[2]="Abdulla";
        names[3]="Younis";
        names[4]="Saeed";
        names[5]="Zahra";
        names[6]="Latifa";
        names[7]="Philippe";
        names[8]="Osama";
        deleteItem(names, "Zahra");

    }

    public static String[] deleteItem(String[] names, String name) {
        boolean isNameFound = false;
        String temp = null;

        for (int j = 0; j < names.length; j++) {
            if (names[j] == name) {
                isNameFound = true;
                System.out.println(name + " was deleted\n" + "Updated Array");
                for (int i = 0; i < names.length; i++) {
                    if (names[i] == name) {
                        names[i] = temp;
                    }
                    if (names[i] != null) {
                        System.out.println(names[i]);
                    }
                }
            }
        }
        if (!isNameFound) {
            System.out.println(name + " was not found");
        }
        return names;
    }


















/*
    public static String[] addName(String[] names) {
        Scanner get = new Scanner(System.in);
        int i = 0;
        String resp;
        while (i < names.length && names[i] != null) {
            i++;
        }

        if (i < names.length) {
            do {
                System.out.println("Add a student name");
                names[i] = get.nextLine();
                i++;
                System.out.println("Name added successfully. Add another? Enter y or n");
                resp = get.nextLine();
            } while (i < names.length && resp.equalsIgnoreCase("y"));

            if (i == names.length) {
                System.out.println("Array full");
            }
            System.out.println("Updated Array");

        } else {
            System.out.println("Array full");
        }

        for (int r = 0; r < names.length; r++) {
            if (names[r] != null) {
                System.out.println(names[r]);
            }
        }

        return names;
    }*/

}