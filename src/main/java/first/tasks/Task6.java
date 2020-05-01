package first.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] array = reader.readLine().trim().split(" ");


        boolean found = true;
        for (int i = 0; i < count; i++){
            found = true;
            for (int j = 0; j < array[i].length()-1; j++) {
                if (array[i].charAt(j) >= array[i].charAt(j + 1)) {
                    found = false;
                    break;
                }

            }
            if (array[i].length()==1){found = false;}
            if (found){System.out.println(array[i]);break;}

        }
        if (!found){System.out.println("NOT FOUND");}

    }
}
