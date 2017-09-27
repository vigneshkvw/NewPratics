
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class LinkedList_Demo {
    Scanner scan;
	LinkedList<String> list;

	int n;
public static void main(String args[]){
		Scanner in = new Scanner(System.in);
    LinkedList_Demo obj=new LinkedList_Demo();

    obj.create();
            try {
			while (true) {
				System.out.println("1.Display list\t2.Add First \t3remove First\t4add Last\t5remove Last\t6Add Index\t7remove Index\t8Add Middle\t9Remove Middle\t10 exit.");
				int ch = in.nextInt();
				switch (ch) {


               case 1:
					obj.display();
					break;


				case 2:
					obj.addfirst();
					break;

				case 3:
					obj.removeFirst();
					break;

				case 4:
					obj.addlast();
					break;

				case 5:
					obj.removeLast();
					break;

				case 6:
					obj.addIndex();
					break;

				case 7:
					obj.removeIndex();
					break;

				case 8:
					obj.addmiddle();
					break;

				case 9:
					obj.removeMiddle();
					break;
                    case 10:
                        System.exit(11);
				default:
					System.out.println("Invalid Option");
				}
			}
		} catch (Exception e) {
			System.out.println("SELF THROWN EXCEPTION IS--->" + e);
		} finally {
			in.close();
		}

}
    private int index;

    private void addIndex() {
        System.out.println("Enter the index");
		int index = scan.nextInt();

		System.out.println("Enter the data");
		String item = scan.next();

		list.add(index - 1, item);

		display();
    }

    private void addfirst() {
        System.out.println("\nAdd First");
		System.out.println("Enter the data");
		String item = scan.next();

		list.addFirst(item);

		display();
    }

    private void addlast() {
        System.out.println("\nAdd Last");
		System.out.println("Enter the data");
		String item = scan.next();

		list.addLast(item);

		display();
    }

    private void addmiddle() {
        index = (list.size()) / 2;

		System.out.println("Enter the data");
		String item = scan.next();

		list.add(index, item);

		display();
    }

    private void create() {
        scan = new Scanner(System.in);
		list = new LinkedList<String>();

		System.out.println("Linked List - Create & Insert");

		System.out.println("\nEnter 'n' value");
		n = scan.nextInt();

		System.out.println("Enter the data");

		for(int i=0; i<n; i++) {

			list.add(scan.next());
		}
        display();
    }

    private void display() {
        System.out.println("\nThe Linked List");

		for(int i=0; i<list.size(); i++) {

			System.out.println(list.get(i));
		}
    }

    private void removeFirst() {
        System.out.println("\nRemove First");

		list.removeFirst();

		display();
    }

    private void removeIndex() {
        System.out.println("Enter the index");
		int index = scan.nextInt();

		list.remove(index-1);

		display();
    }

    private void removeLast() {

		System.out.println("\nRemove Last");

		list.removeLast();

		display();
    }

    private void removeMiddle() {
        System.out.println("\nRemove Middle");

		list.remove(index);

		display();
    }
}
