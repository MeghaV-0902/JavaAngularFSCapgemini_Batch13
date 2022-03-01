import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class citiesLinkedList
{
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> myCities = new LinkedList<>();
        String city;
        boolean foward = false;
        boolean showOptions = true;
        System.out.println("enter choice");
        int choice = scanner.nextInt();
        scanner.nextLine();
        while (showOptions && choice!=5) {
            switch (choice) {
                case 0: //enter list items
                    city = scanner.next();
                    insertInOrder(myCities, city);
                    break;
                case 1: //move front

                    foward = getNextCity(myCities,foward);
                    break;
                case 2: //next city
                    foward = getPreviousCity(myCities,foward);
                    break;
                case 3:
                    printCity(myCities);
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    showOptions = false;
                    break;
            }
            System.out.println("enter choice");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void insertInOrder(LinkedList<String> myCities, String city)
    {
        //System.out.println(city);
        ListIterator<String> listIterator = myCities.listIterator();
        if (!myCities.isEmpty()) {
            while (listIterator.hasNext()) {
                int compare = listIterator.next().compareTo(city);
                if (compare > 0) {
                    listIterator.previous();
                    listIterator.add(city);
                } else if (compare == 0) {
                    System.out.println("City already in list");
                    //break;
                } else {
                    //continue
                }
                if (!listIterator.hasNext() && !myCities.contains(city)) {
                    listIterator.add(city);
                }

            }
        }
        else
            myCities.add(city);
        //System.out.println(myCities);
    }
    private static boolean getNextCity(LinkedList<String> myCities, boolean foward)
    {

        ListIterator<String> listIterator = myCities.listIterator();
        if(foward == false)
        {
            if(listIterator.hasNext())
                listIterator.next();
        }
        foward = true;
        if(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        else{
            System.out.println("Reached end of list");
        }
        return foward;
    }


    private static boolean getPreviousCity(LinkedList<String> myCities, boolean foward)
    {
        ListIterator<String> listIterator = myCities.listIterator();
        if(foward == true)
        {
            if(listIterator.hasPrevious())
                listIterator.previous();
        }
        foward = false;
        if(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
        else{
            System.out.println("Still at the start of the list");
        }
        return foward;
    }


    private static void printMenu()
    {
        System.out.println("menu");
        System.out.println("0 : Add\n1 : Foward\n2 : back\n3 : print all\n4 : menu\n5: exit");
    }

    private static void printCity(LinkedList<String> myCities)
    {
        ListIterator<String> listIterator = myCities.listIterator();
        System.out.println(myCities);
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------------------------------------------------");
    }
}
