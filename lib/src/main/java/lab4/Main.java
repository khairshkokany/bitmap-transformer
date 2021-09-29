package lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello From The First ");

        String inputFilePathImage = "C:\\Users\\STUDENT\\401class\\bitmap-transformer\\resources\\lab04.bmp";
        String outputFilePathFolder = "C:\\Users\\STUDENT\\401class\\bitmap-transformer\\resources\\newfile";
        String transformBlackAndWhite = "Black And White";
        String transformDarken = "Darken";
        String transformBorder = "Border";
        String transformVer="Vertical Snape";
        String transformHor="Horizontal Snape";
        Bitmap image1 = new Bitmap(inputFilePathImage, outputFilePathFolder , transformBlackAndWhite);
        Bitmap image2 = new Bitmap(inputFilePathImage, outputFilePathFolder , transformBorder);
        Bitmap image3 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformDarken);
        Bitmap image4 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformVer);
        Bitmap image5 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformHor);


        image1.TestBlackAndWhite();
    image2.transformGrey();
    image4.reverseImageVertically();
    image5.blur();


    }
}
