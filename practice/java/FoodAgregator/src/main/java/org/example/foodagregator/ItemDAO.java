package org.example.foodagregator;
import java.util.*;
public class ItemDAO {
    public void addItem(Item item)
    {

    }
    public void bulkCopy(List<Item> itemList)
    {
    for(Item i:itemList)
    {
        addItem(i);
    }
    }
    /*public List<item> findItem(String type)
    {
return
    }
    public List<item> findItem(Double price)
    {

    }*/
}
