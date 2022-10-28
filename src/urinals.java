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

    public static void main(String[] args)
    {

    }
}
