package testjava;
import java.util.ArrayList;
import java.util.Scanner;


import coursechoice.Hanacourse;
import coursechoice.Kikucourse;
import coursechoice.Kurocourse;
import samclassjava.Day;
import samclassjava.Customer;
import samclassjava.Omagase;
import samclassjava.Wasblevel;



public class Main {
    static Scanner keyboard = new Scanner(System.in);
    private static Scanner input;


    public static void main(String[] args) {

        Omagase omagase = new Omagase();
             int course = 0;
            Day booking = new Day();

            Hanacourse hanaCourse = new Hanacourse();
            Kikucourse kikuCourse = new Kikucourse();
            Kurocourse kuroCourse = new Kurocourse();

            Customer cus = new Customer();

            cus.setbkday(booking);

            System.out.println(" -----WELCOME:)----");
            System.out.println(" ---KURO OMAGASE---");
            System.out.println("COURSE////////////\n1.Hana course (2750 THB)\nAppetizer\nSashimi\nGrilled\nSteamed\nSoup\nSushi\nDessert");
            System.out.println("--------------------------------");
            System.out.println(" 2.Kiku course (4500 THB)\nAppetizer\nSashimi\nSimmered\nGrilled\nDeepfried\nSteamed\nSoup\nSushi\nDessert ");
            System.out.println("--------------------------------");
            System.out.println("3.Kuro course (6900 THB)\nZensai\nAppetizer\nSushi\nDish\nSpecial Menu\nKatsutera\nDessert");
            System.out.println("--------------------------------");
            System.out.println("Start booking...");
            System.out.println("**enter number only**");
            System.out.println(" 1.Yes or 2.No ");

            int choice = omagase.tryPaseInt("Your Answer.. ");


            if (choice != 2) 
            {
                System.out.println("--------------------------------");       
                System.out.println("Every course start on 12:00 p.m.  "); 
                System.out.print("This month course are on \n12/04/2023 \n24/04/2023 \n30/04/2023  ");
                System.out.println();
                System.out.print("Choose the date (dd/mm/yyyy): ");
                booking.setDate(keyboard.nextLine());
                System.out.println("--------------------------------");    
                System.out.println("**No more than 3 people per course** ");           
                System.out.print("How many people?: ");
                cus.setMember(keyboard.nextInt());  
                Scanner Keyboard = new Scanner(System.in);                
                System.out.print("Booking name : ");
                String txt = Keyboard.nextLine();             
                System.out.print("Phone number : ");
                int Int = Keyboard.nextInt();
                                 

                do {

                    if (cus.getMember() <= 3) {

                        System.out.println("--------------------------------");     
                        ArrayList<String> menu = new ArrayList<String>();
                        menu.add("Hana Course");
                        menu.add("Kiku Course");
                        menu.add("Kuro Course");
                        System.out.println("Select your course ");
                        for(int i = 0; i < menu.size(); i++) {
                        System.out.println((i + 1) + ". " + menu.get(i));
                        }

                        course = omagase.tryPaseInt(" You Choose :");


                        switch (course) {
                        
                            case 1:

                                cus.setChooseCourse(hanaCourse);

                                
                            System.out.println(" Your course will be " + ((Hanacourse) cus.getChooseCourse()).getcourse() + ". The price is " + cus.getChooseCourse().getCost()  + " bath per person.");

                                break;

                            case 2:

                            cus.setChooseCourse(kikuCourse);

                                System.out.println(" Your course will be " + ((Kikucourse) cus.getChooseCourse()).getcourse() + ". The price is " + cus.getChooseCourse().getCost() + " bath per person.");

                                break;

                            case 3:

                            cus.setChooseCourse(kuroCourse);

                            System.out.println(" Your course will be " + ((Kurocourse) cus.getChooseCourse()).getcourse() + ". The price is " + cus.getChooseCourse().getCost()  + " bath per person.");

                            break;


                            default:

                                System.out.println("try again ");
                                System.out.println();
                                break;
                        
                        } 

                    } 

                    else 
                    {
                        System.out.println("Maximum is 3 people ");
                        break;
                
                    }                  
                            
                } while (course >=4);
                System.out.println(); 
                System.out.println("********************************************************************");  
                System.out.println("Please give me your wasabi level:");
                for (Wasblevel r : Wasblevel.values()) {
                            System.out.println(r.name() + " - " + r.ordinal());
                        }
                        int rating = omagase.tryPaseInt("Your Answer.. ");
                    }
                System.out.println("********************************************************************"); 
                System.out.println("**Confirm this booking**");
                System.out.println(" 1.Yes or 2.No ");

                int Answer = omagase.tryPaseInt("Your Answer.. ");

                System.out.println();
                System.out.println("********************************************************************");  
                System.out.println("This is booking confirmation");  
                System.out.println();          
                System.out.println("Booking day :" + cus.getbkday().getDate());
                System.out.println("Customer number :" + cus.getMember() + " people");
                 
                if (course == 1)
                {
                    System.out.println("The course: Hana Course");
                }
                if (course == 2)
                {
                    System.out.println("The course: Kiku Course");
                }
                if (course == 3)
                {
                    System.out.println("The course: Kuro Course");
                }

                if (course == 1)
                {
                	 System.out.println("Total price for " + cus.getMember() + " people is " + cus.getMember() * hanaCourse.getCost() + " bath.");
                     System.out.println("Total price with vat 7% and service charge 5 % " + ((cus.getMember() * hanaCourse.getCost()) +  (cus.getMember() * hanaCourse.getCost()*5/100)  + (cus.getMember() * hanaCourse.getCost()*7/100)) + " bath.");
                }
                if (course == 2)
                {
                	 System.out.println("Total price for " + cus.getMember() + " people is " + cus.getMember() * kikuCourse.getCost() + " bath.");
                     System.out.println("Total price with vat 7% and service charge 5 % " + ((cus.getMember() * kikuCourse.getCost()) +  (cus.getMember() * kikuCourse.getCost()*5/100)  + (cus.getMember() * kikuCourse.getCost()*7/100)) + " bath.");
                }
                if (course == 3)
                {
                	 System.out.println("Total price for " + cus.getMember() + " people is " + cus.getMember() * kuroCourse.getCost() + " bath.");
                     System.out.println("Total price with vat 7% and service charge 5 % " + ((cus.getMember() * kuroCourse.getCost()) +  (cus.getMember() * kuroCourse.getCost()*5/100)  + (cus.getMember() * kuroCourse.getCost()*7/100)) + " bath.");
                }


                System.out.println(); 
                System.out.println("********************************************************************");  
                System.out.println(); 
                System.out.println("**please contact us if you want to cancle**");  
                System.out.println("**We will contact you in 24 hour after booking**");  
                System.out.println(); 
                System.out.println("********************************************************************");  
                System.out.println(); 
                System.out.println("Thank you :)");
                System.out.println(); 
                System.out.println("********************************************************************");   
                    
                }     

        }
                 
    