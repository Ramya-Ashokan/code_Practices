/*package org.example.hotel;
import java.util.*;
import java.util.LinkedHashSet;
public class HotelService
{
   public List<Hotel> addElements()
   {

   }



    public  List<Hotel>  sortByName()
    {
      List<Hotel> l1=addElements();
      Collections.sort(l1, new Comparator<Hotel>(){
          @Override
                  public int compare(Hotel t1,Hotel t2)
        {
         if(t1.getHName().compareTo(t2.getHName())<0)
            {
                return -1;
            }
         else if(t1.getHName().compareTo(t2.getHName())>0)
            {
                return 1;
            }
         else {
             return 0;
         }
        }
      });
System.out.println(l1);
return l1;
    }
    public void sortByRating()
    {

    List l2=addElements();
        Collections.sort(l2,new Comparator<Hotel>(){
        @Override
            public int compare(Hotel t1,Hotel t2)
        {
          if(t1.getRating()<t2.getRating())
          {
              return -1;
          }
          else if(t1.getRating()<t2.getRating())
          {
              return 1;
          }
          else {
              return 0;
          }
        }


    });
        System.out.println(l2);
    }
    public void searchByName()throws HotelNotFoundException
    {
        Scanner sc= new Scanner (System.in);
        List<Hotel> l3=sortByName();
        System.out.println("Enter Name");
        String search=sc.nextLine();
        Hotel searchName=new Hotel(0,search,"","",0.0);
        int index=Collections.binarySearch(l3, searchName, new Comparator<Hotel>(){
            @Override
            public int compare(Hotel t1,Hotel t2)
            {
                if(t1.getHName().compareTo(t2.getHName())<0)
                {
                    return -1;
                }
                else if(t1.getHName().compareTo(t2.getHName())>0)
                {
                    return 1;
                }
                else {
                    return 0;
                }
            }

        });
        if(index>=0)
        {
         System.out.println(l3.get(index));
        }
        else {
            throw new HotelNotFoundException(search);
        }


    }
}*/
