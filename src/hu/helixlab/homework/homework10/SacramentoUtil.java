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

    public static void findBiggestGridByDistricts(ArrayList<Sacramento> arrayList) {

        int numberOfDistrict = 1;
        int maximumOfGrid = 0;

        for (int i = 1; i < 7; i++) {

            for (Sacramento item : arrayList) {

                if (item.getDistrict() == numberOfDistrict) {

                    if (item.getGrid() > maximumOfGrid) {

                        maximumOfGrid = item.getGrid();
                    }
                }
            }

            for (Sacramento item : arrayList) {

                if (item.getGrid() == maximumOfGrid) {

                    System.out.println(item);
                    break;
                }
            }
            numberOfDistrict++;
            maximumOfGrid = 0;
        }
    }

    public static void getStreets(ArrayList<Sacramento> arrayList) {

        for (Sacramento item : arrayList) {

            if(item.getAddress().contains(" ST")){

                System.out.println(item);
            }
        }
    }

    public static int countCrimeType(ArrayList<Sacramento> arrayList, String crimeType) {

        int quantity = 0;

        for (Sacramento item : arrayList) {

            if (item.getCrimedescr().contains(crimeType)) {

                quantity++;
            }
        }
        System.out.println("There were " + quantity + " crimes from this type: " + crimeType);

        return quantity;
    }
}
