package hu.helixlab.homework.homework10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SacramentoUtil {

    public static void printCSVFromSacramentoList(ArrayList<Sacramento> arrayList, String placeTo) {

        try {
            FileWriter fileWriter = new FileWriter(placeTo);

            for (Sacramento item : arrayList) {

                fileWriter.write(String.valueOf(item));
                fileWriter.write("\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("IOException - " + e.getMessage());
        }
    }
}
