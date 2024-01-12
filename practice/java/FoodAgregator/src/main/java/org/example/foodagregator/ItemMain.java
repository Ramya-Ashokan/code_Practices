package org.example.foodagregator;
import java.util.*;
public class ItemMain {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> list = new ArrayList<>();
        list.add(Item.itemSplit("Gulab jamun,300.55,dessert"));
        list.add(Item.itemSplit("Pani puri,100.342,chat"));
        list.add(Item.itemSplit("Biriyani,250.1234,Meal"));
        list.add(Item.itemSplit("Bread Halwa,300.78,Sweet"));
        list.add(Item.itemSplit("hot and sour,350.89,soup"));
        list.add(Item.itemSplit("Masala dosa,100,breakfast"));
        list.add(Item.itemSplit("Cookies,50.50,Snacks"));
        ItemDAO itemdao=new ItemDAO();
        System.out.println(list);
        itemdao.bulkCopy(list);

    }
}
