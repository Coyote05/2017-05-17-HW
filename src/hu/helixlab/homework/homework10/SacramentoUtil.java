package hu.helixlab.homework.homework10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SacramentoUtil {

    public static void printCSVFromSacramentoList(ArrayList<Sacramento> arrayList, String placeTo) {

        try {
            FileWriter fileWriter = new FileWriter(placeTo);

            for (Sacramento item : arrayList) {

                fileWriter.append(item.getcDateTime() + "," + item.getAddress() + "," + item.getDistrict() + "," + item.getBeat() + "," + item.getGrid() + "," + item.getCrimedescr() + "," + item.getUcr_ncic_code() + "," + item.getLatitude() + "," + item.getLongitude());
                fileWriter.append("\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("IOException - " + e.getMessage());
        }
    }

    public static void findBiggestGridByDistricts(ArrayList<Sacramento> arrayList) {


        HashMap<Integer, Sacramento> hashMap = new HashMap<>();

        for (Sacramento item : arrayList) {

            if (hashMap.containsKey(item.getGrid()) == true) {

                if (hashMap.get(item.getDistrict()).getGrid() < item.getGrid()) {

                    hashMap.put(item.getDistrict(), item);
                }

            } else {

                hashMap.put(item.getDistrict(), item);
            }
        }
        for (Map.Entry item : hashMap.entrySet()) {

            System.out.println(item.getValue());
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
