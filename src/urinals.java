/*
Author : Rohith Reddy Byreddy
AsuId : rbyreddy@asu.edu
 */
import java.util.*;
public class urinals {
    boolean goodString(String str)
    {
        //verify that string is in correct format or not
        boolean good=true;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) == '1' && str.charAt(i+1) == '1')
            {
                good=false;
                break;
            }
        }
        return good;
    }
    int countUrinals(String str)
    {
        //counts the free urinals
        int count=0;
        if(goodString(str))
        {
            int temp=0;
            int flag=0;
            int flag1=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='0')
                {
                   temp++;
                   if(i==0)
                   {
                       flag1=1;
                   }
                }
                if(str.charAt(i)=='1')
                {
                    flag=1;
                    if(temp>=3 && flag1==0)
                    {
                            count=count+(temp-1)/2;
                    }
                    if(flag1==1 && temp>1)
                    {
                        count=count+temp/2;
                    }
                    temp=0;
                }
                if(i == str.length()-1 && flag == 1)
                {
                    count=count+temp/2;
                }
                if(i == str.length()-1 && flag == 0)
                {
                    count=(temp+1)/2;
                }
            }
        }
        else
        {
            count=-1;
        }


        return count;
    }

    public static void main(String[] args)
    {

    }
}
