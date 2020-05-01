package first.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().trim().split(" ");

        int sum = 0;
        int lowercase;
        int uppercase;

        for (int i = 0; i < count; i++){

            if ( array[i].matches( "^[a-zA-Z]+$" ) && (array[i].length() % 2 == 0) ) {
                lowercase=0;
                uppercase=0;
                for (int j = 0; j < array[i].length(); j++){
                    if (Character.toString(array[i].charAt(j)).matches("(?i:[aeiouy]).*")){
                        lowercase++;
                    }else{
                        uppercase++;
                    }
                }
                if (lowercase == uppercase) {
                    sum++;
                }
            }

        }
        System.out.println(sum);
    }
}
