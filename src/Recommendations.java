//Ben Geary     RKB18204

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Recommendations extends DecisionTreeMain1 {

    private String setDateTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyy @ HH:mm");
        Date date = new Date();
        return formatter.format(date);
    }

    public void ReccomendationsForUser() throws IOException{
        System.out.println("Here are your Recommendations:");
        System.out.println("Reccomednations for " + getFirstName() +"'s party created on " + setDateTime());

    }


}
