import java.util.ArrayList;
import java.util.Scanner;

class Data {
    String name;
    String pass;
    String phone;

    Data(String name, String pass, String phone) {
        this.name = name;
        this.pass = pass;
        this.phone = phone;
    }
}

public class array {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Input Data");
            System.out.println("2. Show Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    deleteData();
                    break;
                case 4:
                    System.out.println("\nExiting program...");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void inputData() {
        System.out.print("\nName: ");
        String name = scanner.nextLine();
        System.out.print("Pass: ");
        String pass = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        Data data = new Data(name, pass, phone);
        dataList.add(data);
        
        System.out.println("\nNew data is added.");
    }

    private static void showData() {
        if (dataList.isEmpty()) {
            System.out.println("\nNo data exists!");
            
        } else {
        	System.out.println("\n==================================================================");
            System.out.printf("| %-3s | %-15s | %-15s | %-20s |\n","No","Name","Pass","Phone");
            System.out.println("==================================================================");
            
            for (int i = 0; i < dataList.size(); i++) {
                Data data = dataList.get(i);
                System.out.printf("| %-3d | %-15s | %-15s | %-20s | %n", (i + 1), data.name, data.pass, data.phone);
            }
        }
    }

    private static void deleteData() {
        if (dataList.isEmpty()) {
            System.out.println("\nNo data to delete!");
            return;
        }

        showData();
        
        System.out.print("\nInput data number to be deleted: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < dataList.size()) {
            dataList.remove(index);
            System.out.println("\nData is removed.");
            
        } else {
            System.out.println("\nInvalid data number.");
        }
    }
}