import java.util.*;
class library{
    
    Scanner s = new Scanner(System.in);
    public int btotal = 0;
    public String bName[] = new String[10];
    public int bId[] = new int[10];

    public void display(int loop){
        System.out.println("Currently available books in library are:");
        System.out.println("SR.NO.\t\tBOOK NAME\t\tBOOK ID");

        for(int i = 0; i<loop;i++){
            System.out.println((i+1)+"\t\t"+bName[i]+"\t\t\t"+bId[i]);
        }
    }
    public void add_book(int count){
        System.out.println("\nProvide details of book(s):");
        for(int i=btotal; i<count;i++){
            System.out.print("Enter name of book: ");
            bName[i] = s.next();
            System.out.print("Enter Id of book: ");
            bId[i] = s.nextInt();
        }
        btotal = count;
    }
    public void issue_book(){

    }
}
public class librarymanagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library obj = new library();
        int issue;

        int addbook = 0, surplus;
        System.out.println("Total books to be added to library: ");
        addbook = sc.nextInt();
        obj.add_book(addbook);

        System.out.println("---------------------------------------------------------");
        System.out.println("\t\t*WELCOME TO DJ LIBRARY*");
        System.out.println("---------------------------------------------------------");

        int loop = 1;
        int decision;
        while(loop==1){
            System.out.print("\n1.Show available books.\n2.Add new book.\n3.Issue Book.\n4.Exit, Enter your choice: ");
            decision = sc.nextInt();

            switch(decision){
                case 1:{
                    System.out.println("**************");
                    obj.display(addbook);
                    break;
                }
                case 2:{
                    System.out.println("**************");
                    System.out.print("Enter number of books you want to add: ");
                    surplus = sc.nextInt();
                    addbook = addbook + surplus;
                    obj.add_book(addbook);
                    break;
                }
                case 3:{
                    System.out.println("**************");
                    System.out.println("These are books available in library:");
                    System.out.println("Currently available books in library are:");
                    System.out.println("SR.NO.\t\tBOOK NAME\t\tBOOK ID");

                    for(int i = 0; i<addbook;i++){
                        System.out.println((i+1)+"\t\t"+obj.bName[i]+"\t\t\t"+obj.bId[i]);
                    }
                    System.out.print("Which book would you like to borrow?: ");
                    issue = sc.nextInt();
                    issue = issue - 1;
                    System.out.println(obj.bName[issue]+" succesfully issued to you.\n");
                    obj.bName[issue] = "";
                    obj.bId[issue] = 0;
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("**************");
                    System.out.println("You entered an incorrect option.");
                }
            }
            System.out.print("Do you wish to continue?(0-No/1-Yes): ");
            loop = sc.nextInt();
        }
        System.out.println("Thankyou for accessing our library.");
    }
}