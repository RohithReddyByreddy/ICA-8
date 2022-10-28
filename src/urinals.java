/*
Author : Rohith Reddy Byreddy
AsuId : rbyreddy@asu.edu
 */
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class urinals {
    public List<String> inputs=new ArrayList<String>();
    public List<Integer> outputs=new ArrayList<Integer>();
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
    void openFile(String path)
    {
        //Open the file
        path="src/"+path;
        try{
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                inputs.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    void writeFile(String path)
    {
        //the function should write output to th file
        for (String i : inputs){
            outputs.add(countUrinals(i));
        }
        try {
            File myObj = new File(path);
            int i=0;
            while(myObj.exists())
            {
                if(i==0)
                {
                    path="src/rule1.txt";
                }
                else
                {
                    int tr=path.indexOf(Integer.toString(i));
                    path=path.substring(0,tr)+Integer.toString(i+1)+path.substring(tr+1,path.length());
                }
                myObj = new File(path);
                i++;
            }
            myObj.createNewFile();
            FileWriter myWriter = new FileWriter(path);
            for (int j : outputs)
            {
                myWriter.write(Integer.toString(j)+"\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        urinals u=new urinals();
        Scanner sc=new Scanner(System.in);
        int option;
        String value;
        System.out.println("Select method through which you want to give input \n1.command line\n2.text file");
        option=sc.nextInt();
        if(option==1)
        {
            while(true)
            {
                System.out.println("Enter the string as input or -1 for exit");
                value=sc.next();
                if(Integer.parseInt(value) == -1)
                {
                    break;
                }
                else
                {
                    System.out.println(u.countUrinals(value));
                }
            }

        }
        else if (option==2)
        {
            System.out.println("Enter the input file");
            value=sc.next();
            u.openFile(value);
            u.writeFile("src/rule.txt");
            System.out.println("Output file created");
        }

    }
}
