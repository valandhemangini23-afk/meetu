import java.util.Scanner;

class WRITER {
    String writer_name;
    int writer_age;
    String email_id;
    String area_of_interest;

    Scanner sc = new Scanner(System.in);

    WRITER() {
        System.out.println("Enter Writer Name:");
        writer_name = sc.nextLine();

        System.out.println("Enter Writer Age:");
        writer_age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Email ID:");
        email_id = sc.nextLine();

        System.out.println("Enter Area of Interest:");
        area_of_interest = sc.nextLine();
    }
}

class BOOK extends WRITER {
    String book_title;
    int no_of_pages;

    BOOK() {
        System.out.println("Enter Book Title:");
        book_title = sc.nextLine();

        System.out.println("Enter Number of Pages:");
        no_of_pages = sc.nextInt();
    }
}

class REMUNERATION extends BOOK {
    double rate_per_page;
    double remuneration;

    void getDetails() {
        System.out.println("Enter Rate per Page:");
        rate_per_page = sc.nextDouble();
    }

    void calculate() {
        remuneration = no_of_pages * rate_per_page;
    }

    void display() {
        System.out.println("Writer Name: " + writer_name);
        System.out.println("Book Title: " + book_title);
        System.out.println("Pages: " + no_of_pages);
        System.out.println("Remuneration: " + remuneration);
    }
}

public class Main {
    public static void main(String args[]) {
        REMUNERATION r = new REMUNERATION();

        r.getDetails();
        r.calculate();
        r.display();
    }
}