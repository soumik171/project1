package customer;

import java.io.*;

public class Review {

    public void WriteInFile() {     //WritingFIles
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("D:\\JAVA project for final\\Final Group 2\\Final Group 2\\file\\review.txt"));
            System.out.println("Please rate our Service in Google Play Store\n");
            bw.write("\n\tDARAZ");
            bw.write("\tMain Office: Uttara, Dhaka");
            bw.write("\tOffice Number: +8801700816511");
            bw.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void ReadFromFile() {   //ReadingFile
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\JAVA project for final\\Final Group 2\\Final Group 2\\file\\review.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
