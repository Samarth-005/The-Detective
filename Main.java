import java.util.Scanner;

class Case{
    String Description;

    String brief(){
        return "Last evening at 7:45 PM, the local city library’s private study room was found locked from the outside.\n" +
                "\n" +
                "Inside, Mr. Arjun Sharma, a 42-year-old accountant, was found unconscious with a head injury.\n" +
                "He survived, but had no memory of the attack.\n" +
                "\n" +
                "The motive seems to be a missing confidential financial file he carried with him.\n" +
                "\n" +
                "The library had only three people around the study room during the time of the incident.";
    }
}
class Evidence{
    String evvi(){

        return "Evidence 1: Coffee Mug with Lipstick\n" +
                "\n" +
                "Found on the victim’s table.\n" +
                "Victim does not drink coffee.\n" +
                "\n" +
                "Evidence 2: Torn Page From Borrowed Book\n" +
                "\n" +
                "Found near the victim’s chair.\n" +
                "The book belongs to the library.\n" +
                "\n" +
                "Evidence 3: Shoeprint in Dust\n" +
                "\n" +
                "Size: 7\n" +
                "The victim wears size 9.\n" +
                "\n" +
                "Evidence 4: Library Computer Log\n" +
                "\n" +
                "Someone accessed the victim's file folder at 7:30 PM using a guest login.\n" +
                "\n" +
                "Evidence 5: CCTV Footage (Hallway)\n" +
                "\n" +
                "At 7:35 PM, the hallway camera shows a shadow near the study room door,\n" +
                "but face is not visible.";
    }
}
class Interrogate {
    String statements() {
        return "Suspect 1 — Ms. Rhea Kapoor\n \n" +
                "\n" +
                "“I was studying in the main hall.\n" +
                "I did go to get coffee around 7:30 PM, but I never entered the study room.\n" +
                "I don’t even know the victim.”\n \n" +
                "Suspect 2 — Mr. Varun Mehta\n" +
                "“Yes, I came to meet Arjun.\n" +
                "I waited outside the study room but he didn’t open the door.\n" +
                "Maybe he was busy.\n" +
                "I left before anything happened.”\n \n " +
                "Suspect 3 — Mr. Suresh Gupta (Librarian)\n" +
                "“I was organizing books in the back room.\n" +
                "I didn’t see anyone near the study room.\n" +
                "The torn page must have been an accident.”";

    }
}
class suspects{
    int[] susp = {1,2,3};

    String sus(){
        return "1. Ms. Rhea Kapoor\n" +
                "\n" +
                "26, college student\n" +
                "\n" +
                "Studies in the library every day\n" +
                "\n" +
                "Often seen drinking coffee\n" +
                "\n" +
                "2. Mr. Varun Mehta\n" +
                "\n" +
                "38, co-worker of the victim\n" +
                "\n" +
                "Came to meet the victim for “urgent documents”\n" +
                "\n" +
                "Claims he never entered the study room\n" +
                "\n" +
                "3. Mr. Suresh Gupta\n" +
                "\n" +
                "54, librarian\n" +
                "\n" +
                "Handles book records\n" +
                "\n" +
                "Has access to all rooms and keys";
    }
}

class Mainn{
    static int x;
    static int a;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Case c = new Case();
        Evidence e = new Evidence();
        Interrogate i = new Interrogate();
        suspects s = new suspects();

    do {


        System.out.println(" \n \n \n ----- Welcome to 'The Detective' ----- ");
        System.out.println(" ----- Menu -----1 ");
        System.out.println(" Select 1.Briefing of the case \n" +
                " Select 2.Evidences Discovered \n" +
                " Select 3.Suspects \n" +
                " Select 4.Statements of the Suspecst \n" +
                " Select 5.Accuse \n" +
                " Select 6.Exit");

        System.out.println(" --- Enter Your Choice --- ");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println(" ----- Briefing of the Case ----- ");
                System.out.println(c.brief());
                break;
            case 2:
                System.out.println(" ----- Evidences Discovered ----- ");
                System.out.println(e.evvi());
                break;
            case 3:
                System.out.println(" ----- Suspects ----- ");
                System.out.println(s.sus());
                System.out.println(s.susp);
                break;
            case 4:
                System.out.println(" ----- Statments ----- ");
                System.out.println(i.statements());
                break;
            case 5:
                System.out.println(" ----- Enter the number of suspect you are accusing ----- ");
                System.out.println(" --- 1.Ms. Rhea Kapoor --- ");
                System.out.println(" --- 2.Mr. Varun Mehta --- ");
                System.out.println(" --- 3.Mr. Suresh Gupta --- ");
                a = sc.nextInt();
                if(a == 3){
                    System.out.println(" ----- CONGRATULATIONS YOU FOUND THE CRIMINAL....CASE SOLVED -----");
                }
                else {
                    System.out.println(" ----- Wrong suspect accuesed...Case Failed ----- ");
                }
                  break;
            case 6:
                System.out.println("EXITING...");
                break;
            default:
                System.out.println(" ----- Invalid Input...Try Again ----- ");
                break;
        }
    }while (x == 1 || x==2 || x==3 || x==4);


    }
}