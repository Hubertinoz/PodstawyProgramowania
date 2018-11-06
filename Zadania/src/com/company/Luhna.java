package com.company;

public class Luhna {
    public static void main() {
        int[] card = {9,2,0,8,4,3};
        int y = 0;
        int temp = 0;

        for (int i = 0; i < card.length; i++) {
            int x = card[i];
            if (i%2==0)
            {
                temp += x*1;
            }
            else
            {
                y = x*2;
                if(y>9) {
                    y -= 9;
                    temp += y;
                }
                else
                    temp += y;
            }
        }
        temp = temp%10;
        if(temp == 0)
        System.out.println("This Debit Card Code working");
        else
            System.out.println("This Debit Card Code is wrong");
    }
}
