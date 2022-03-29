package com.question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Source
{
    public static void main(String[] args) {
        GenerateReceipt g = new GenerateReceipt();
        Receipt r = new Receipt(new TransactionParty("Daniel'o brien","Giselle dwight"),"250,10@100,3@50,7");
        System.out.println(g.verifyParty(r));
        System.out.println(g.calcGST(r));
    }
}
class TransactionParty
{
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }

}
class Receipt
{
    TransactionParty transactionParty;
    String productsQR;

    public Receipt(TransactionParty transactionParty, String productsQR) {
        this.transactionParty = transactionParty;
        this.productsQR = productsQR;
    }

}
 class GenerateReceipt
 {
     int GST;
     public int  verifyParty(Receipt r)
     {
         String seller = r.transactionParty.seller;
         String buyer= r.transactionParty.buyer;
         boolean isvalidSeller= Pattern.matches("^[a-zA-Z]['a-zA-Z- ]+[A-Za-z]$",seller);
         boolean isvalidBuyer= Pattern.matches("^[a-zA-Z]['a-zA-Z- ]+[A-Za-z]$",buyer);

         if(isvalidBuyer && isvalidSeller)
         {
             return 2;
         }
         else if(isvalidBuyer || isvalidSeller)
         {
             return  1;
         }
         return 0;
     }
     public String calcGST(Receipt r)
     {
         String productQr = r.productsQR;
         List<String> spilts1 = new ArrayList<>();
         spilts1= Arrays.asList(productQr.split("@"));
         //System.out.println(spilts1);
         List<Integer> rate = new ArrayList<>();
         List<Integer> quantity = new ArrayList<>();
         for(String i : spilts1)
         {
             List<String> j = new ArrayList<String>(Arrays.asList(i.split(",")));
             //System.out.println(j);
             rate.add(Integer.parseInt(j.get(0)));
             quantity.add(Integer.parseInt(j.get(1)));
         }
         GST = (int)((rate.get(0)*quantity.get(0)+rate.get(1)*quantity.get(1)+rate.get(2)*quantity.get(2))*0.12);
         return toString();
     }
     public String toString()
     {
         return Integer.toString(GST);
     }
 }