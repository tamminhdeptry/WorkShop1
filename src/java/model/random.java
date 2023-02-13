package model;




import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;


public class random {
    
    public String randomday(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, (int) (Math.random() *
        calendar.getActualMaximum(Calendar.DAY_OF_MONTH)));
        calendar.set(Calendar.MONTH, (int) (Math.random() *
        calendar.getActualMaximum(Calendar.MONTH)));
        calendar.set(Calendar.YEAR, (int) (Math.random()*100)+1950);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = dateFormat.format(calendar.getTime());
        return dateString;
    }
    public String randomString() {
        int n = 8;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                  + "0123456789"
                                  + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()* Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
  public String randomGender() {
        String[] genderList = {"Male", "Female", "Other"};
        Random random = new Random();
        int n = random.nextInt(3);
        String gender = genderList[n];
        return gender;
    }
}
