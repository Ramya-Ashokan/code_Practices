package org.example.hotel;
import org.example.hotel.HotelNotFoundException;
import java.util.*;
public class HotelMain {

    public static void main(String args[])throws Exception {

        Scanner sc = new Scanner(System.in);
        List<Hotel> list = new ArrayList<>();
        Hotel h1 = new Hotel(1, "ITC Chola", "comfortable and enjoyable stay", "spa,freeDinning and fitness facilities,", 4.5);
        Hotel h2 = new Hotel(2, "The Leela palace", "lavish and memorable stay", "Luxurious Accomadation,fine Dining Experience", 4.2);
        Hotel h3 = new Hotel(3, "The park chennai", "Comfortable stay", "Stylish Accomodation ,modern amentiesand divese Dinning ", 4.3);
        Hotel h4 = new Hotel(4, "Zone", "Plesant stay", "Comfortable Rooms", 4.1);
        Hotel h5 = new Hotel(5, "Taj Coramental", "Travelers seeking a high-end stay ", "luxurious rooms,attentive service", 4.6);
        Hotel h6 = new Hotel(6, "Hotel Green park", "Comfortable and convenient stay experience", "dining, fitness, and comfortable rooms.", 4.7);
        Hotel h7 = new Hotel(7, "Crownie Plazza", "", "", 4.6);
        Hotel h8 = new Hotel(8, "Hilton", "Luxury Accommodation", "comfortable rooms, dining, business facilities, and fitness centers", 4.0);
        Hotel h9 = new Hotel(9, "Park Hyatt", "It's a top choice for a sophisticated stay experience.", "elegant accommodations, dining options", 4.3);
        Hotel h10 = new Hotel(10, "Le Royal Meridian", " Destination for luxurious and memorable stay.", "lavish accommodations, upscale dining choices, and top-notch amenities", 4.8);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        list.add(h6);
        list.add(h7);
        list.add(h8);
        list.add(h9);
        list.add(h10);


        int choice;
       do {
           System.out.println("1.Sort by HotelName\n2.Sort by Hotel Rating\n3.Search by Hotel Name\n4.Exit\nEnter your choice");
           choice = sc.nextInt();
           sc.nextLine();
           switch (choice) {
               case 1:
                   Collections.sort(list, (t1, t2) -> (t1.getHName().compareTo(t2.getHName())));
                   System.out.println(list);
                   break;
               case 2:
                   Collections.sort(list, (t1, t2) -> (t1.getRating() < t2.getRating()) ? -1 : (t1.getRating() > t2.getRating()) ? 1 : 0);
                   System.out.println(list);
                   break;
               case 3:
                   boolean b = false;
                   System.out.println("Enter the hotel name to search");
                   String search = sc.nextLine();
                   try{
                   for (Hotel l : list) {
                           if (l.getHName().equals(search)) {
                               System.out.print(l);
                               b = true;
                               break;
                           }}
                          if (b == false) {

                           throw new HotelNotFoundException(search);
                             }}
                           catch(Exception e)
                           {
                            System.out.println(e);
                            }
                           break;
               case 4:
                   System.exit(0);
           }

       }while (choice < 5) ;
    }


}
