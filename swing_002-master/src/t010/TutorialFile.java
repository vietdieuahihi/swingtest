package t010;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TutorialFile {
    public static void main(String[] argr) {
        String pathName = null;
        File file = new File("E:\\LAND2311\\src\\t010\\students.txt");

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Tao file thanh cong");
                } else {
                    System.out.println("Tao file that bai");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        try {
//            FileOutputStream fos = new FileOutputStream("E:\\LAND2311\\src\\t010\\students.txt", false);
//            String data = "This is a line of text inside the file.";
//
//            //đổi string thành byte để ghi vào file
//            byte[] array = data.getBytes();
//            //Ghi byte vào file
//
//            fos.write(array);
//            fos.close();
//        } catch (IOException io) {
//            io.printStackTrace();
//        }


        // SAU BƯỚC NÀY: TÔI CÓ THỂ KHẲNG ĐỊNH FILE ĐÃ ĐƯỢC TẠO
        // DEFAULT FILE ĐÃ TỒN TẠI
//        FileInputStream input = null;
//        try {
//            input = new FileInputStream(file);
////            //Trả về số byte ban đầu chưa được đọc trong file
////            System.out.println(file.length());
////            System.out.println("Available bytes at the beginning: " + input.available());
////            input.skip(6);
////            //Đọc 3 byte từ file
////            input.read();
////            input.read();
////            input.read();
//            //Trả về số byte chưa được đọc từ file
//            System.out.println("Available bytes at the end: " + input.available());
//            input.close();
//        } catch (Exception e) {
//            e.getStackTrace();
//        } finally {
//            input = null;
//        }
//
        StringBuilder builder = new StringBuilder();
        try {
            byte[] arr = new byte[100];
            FileInputStream input = new FileInputStream(file);

            System.out.println("Data in the file: ");

            //Đọc byte đầu tiên từ file
            int i = input.read();

            while (i != -1) {
                builder.append((char) i);
//                System.out.print((char) i);
                //Đọc byte kế tiếp từ file
                i = input.read();
            }
            input.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println();
        }

        System.out.println(builder.toString());
    }
}
