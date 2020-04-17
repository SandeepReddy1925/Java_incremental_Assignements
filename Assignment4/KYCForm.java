import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.*;
import java.util.*;



public class KYCForm {
    public static int[] formatDate(String Date){
        String[] DateList=Date.split("-");
        int[] DateArray=new int[3];
        for(int i=0;i<3;i++){
            DateArray[i]= Integer.parseInt(DateList[i]);
        }
        return DateArray;
    }
    public static Calendar calendarInstance(Calendar calendar,int[] date){
        calendar.set(Calendar.DATE,date[0]);
        calendar.set(Calendar.MONTH,date[1]-1);
        calendar.set(Calendar.YEAR,date[2]);
        return calendar;
    }
    public static String[] calculateKYCRange(Calendar calAnniversary,Calendar calPresent){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        String[] dateStore=new String[2];
        calAnniversary.add(Calendar.DATE, -30);
        Date beforeDate=calAnniversary.getTime();
        calAnniversary.add(Calendar.DATE,60);
        Date afterDate=calAnniversary.getTime();
        Date presentDate=calPresent.getTime();

        if(beforeDate.before(presentDate) && presentDate.before(afterDate)) {
            dateStore[0] = dateFormat.format(beforeDate);
            dateStore[1] = dateFormat.format(presentDate);
        }
        else if(afterDate.before(presentDate)){
            dateStore[0]=dateFormat.format(beforeDate);
            dateStore[1]=dateFormat.format(afterDate);
        }
        return dateStore;
    }
    public static int verifyRange(String signUpDate,String currentDate){
        int[] SignUpDate=formatDate(signUpDate);
        int[] CurrentDate=formatDate(currentDate);

        //Getting the Current Year's SignUp Date(Anniversary)
        Calendar calendarAnniversary=Calendar.getInstance();
        calendarAnniversary.set(Calendar.DATE,SignUpDate[0]);
        calendarAnniversary.set(Calendar.MONTH,SignUpDate[1]-1);
        calendarAnniversary.set(Calendar.YEAR,CurrentDate[2]);
        System.out.println(calendarAnniversary.getTime());

        //Getting the present date
        Calendar calendarPresent=Calendar.getInstance();
        calendarPresent=calendarInstance(calendarPresent,CurrentDate);
        System.out.println("calenderpresen  "+calendarPresent.getTime());

        //Getting the current signup date
        Calendar givenSignUpDate=Calendar.getInstance();
        givenSignUpDate=calendarInstance(givenSignUpDate,SignUpDate);
        System.out.println("given signup +"+givenSignUpDate.getTime());
        if(givenSignUpDate.getTime().after(calendarPresent.getTime())) {
            System.out.println("No range");
            return 0;
        }
        String[] s1=calculateKYCRange(calendarAnniversary,calendarPresent);
        System.out.println(s1[0] + " " + s1[1]);
        return 1;
    }
    public static void main(String args[]) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<String> signUpList=new ArrayList<>();
        ArrayList<String> currentList=new ArrayList<>();
        while (q-- > 0) {
            String signUpDate =sc.next();
            signUpList.add(signUpDate);
            String currentDate = sc.next();
            currentList.add(currentDate);
        }
        for(int i=0;i<currentList.size();i++){
            verifyRange(signUpList.get(i),currentList.get(i));
        }
    }
}