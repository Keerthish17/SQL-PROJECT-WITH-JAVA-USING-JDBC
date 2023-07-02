package Insertdao;

import java.util.Scanner;
import bean.Bean_class;
import mainservice.Passingdata;
import updateStatus.statusUpdate;
import deleteRow.rowDelete;
import printTable.tablePrint;

public class Entry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Task Management System\n-----------------------");

		System.out.println("1. Add task \n2. View task \n3. Update task status\n4. Delete task\n0. Exit");

		Bean_class bcobj = new Bean_class();

		System.out.println("Enter your choice:");
		int option = sc.nextInt();

		sc.nextLine();
		while (option != 0) {
			switch (option) {
			case 1:

				System.out.println("Enter task name:");
				String nm = sc.nextLine();
				bcobj.setName(nm);
				bcobj.setStatus("In Progress");
				int ans = Passingdata.enterdata(bcobj);
				System.out.println("Task added successfully!");

				break;

			case 2: 
				System.out.println("Tasks:");
				System.out.println("ID     Name               Status");
				System.out.println("---------------------------------");
				tablePrint.printData();
				break;

			case 3:
				System.out.println("Enter Task ID:");
				int id = sc.nextInt();
				sc.nextLine();
				bcobj.setID(id);
				System.out.println("Enter new status:");
				String newStatus = sc.nextLine();
				bcobj.setStatus(newStatus);
				ans = statusUpdate.updatedata(bcobj);
				System.out.println("Task updated successfully!");
				break;
			case 4:
				System.out.println("Enter Task ID:");
				int deleteid = sc.nextInt();
				sc.nextLine();
				bcobj.setID(deleteid);
				ans = rowDelete.deleteData(bcobj);
				System.out.println("Task Deleted Successfully");
				break;
				
			default:
				System.out.println("0.Exit");
				break;
			}

			System.out.println("Enter your choice:");
			option = sc.nextInt();
			if (option == 0) {
				break;
			}
		}
		System.out.println("Exit program");

	}
}
