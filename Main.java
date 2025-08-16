import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  
    {
        ToDoList tList = new ToDoList();
        Scanner sScanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int iChoice = sScanner.nextInt();
            sScanner.nextLine(); 

            if (iChoice == 1)
            {
                System.out.print("Enter task title: ");
                String sTitle = sScanner.nextLine();
                tList.addTask(sTitle);
            } 
            else if (iChoice == 2) 
            {
                System.out.print("Enter title to delete: ");
                String sDelete = sScanner.nextLine();
               tList.deleteTask(sDelete);
            } 
            else if (iChoice == 3) 
            {
                tList.printTasks();
            } 
            else if (iChoice == 4) 
            {
                System.out.print("Enter title to search: ");
                String sSearch = sScanner.nextLine();
                if (tList.contains(sSearch)) 
                {
                    System.out.println("Found!");
                } 
                else 
                {
                    System.out.println("Not found.");
                }
            } 
                else if (iChoice == 5) 
                {
                    System.out.println("Bye!");
                    break;
                } 
                else 
                {
                    System.out.println("Invalid choice.");
                }
        }
        sScanner.close();
    }
    
}