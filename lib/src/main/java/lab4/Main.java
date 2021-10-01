package lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello From The First ");

        String inputFilePathImage = "C:\\Users\\STUDENT\\401class\\bitmap-transformer\\resources\\khair.bmp";
        String outputFilePathFolder = "C:\\Users\\STUDENT\\401class\\bitmap-transformer\\resources\\newfiles";
        String transformBlackAndWhite = "Black And White";
//        String transformDarken = "Darken";
        String transformGrey = "Grey";
        String transformVer="VerticalSnape";
        String transformHor="HorizontalSnape";
//        Bitmap image1 = new Bitmap(inputFilePathImage, outputFilePathFolder , transformBlackAndWhite);
        Bitmap image2 = new Bitmap(inputFilePathImage, outputFilePathFolder , transformGrey);
//        Bitmap image3 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformDarken);
        Bitmap image4 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformHor);
        Bitmap image5 = new Bitmap(inputFilePathImage, outputFilePathFolder ,transformVer);


        image2.transformGrey();
        image4.reverseImageHorizontally();
        image5.reverseImageVertically();

    }
}
