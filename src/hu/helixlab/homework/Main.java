package hu.helixlab.homework;

import hu.helixlab.homework.homework10.Sacramento;
import hu.helixlab.homework.homework10.SacramentoUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SacramentoUtil sacramentoUtil = new SacramentoUtil();
        ArrayList<Sacramento> arrayList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\C\\IdeaProjects\\2017-05-17-HW\\src\\hu\\helixlab\\homework\\homework10\\SacramentocrimeJanuary2006.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                Sacramento sacramento = new Sacramento();
                String[] splitLine = line.split(",");
                sacramento.setCdTime(splitLine[0]);
                sacramento.setAddress(splitLine[1]);
                sacramento.setDistrict(Integer.parseInt(splitLine[2]));
                sacramento.setBeat(splitLine[3]);
                sacramento.setGrid(Integer.parseInt(splitLine[4]));
                sacramento.setCrimedescr(splitLine[5]);
                sacramento.setUcr_ncic_code(Integer.parseInt(splitLine[6]));
                sacramento.setLatitude(Float.parseFloat(splitLine[7]));
                sacramento.setLongitude(Float.parseFloat(splitLine[8]));

                arrayList.add(sacramento);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found! - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException - " + e.getMessage());
        }

        sacramentoUtil.printCSVFromSacramentoList(arrayList, "C:\\Users\\C\\IdeaProjects\\2017-05-17-HW\\src\\hu\\helixlab\\homework\\homework10\\Target.csv");

        sacramentoUtil.findBiggestGridByDistricts(arrayList);

        sacramentoUtil.getStreets(arrayList);

        sacramentoUtil.countCrimeType(arrayList, "THEFT");
    }
}
