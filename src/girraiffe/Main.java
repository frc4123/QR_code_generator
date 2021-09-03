package girraiffe;

import com.google.zxing.WriterException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, WriterException {

        Generator generator = new Generator();

        if(!args[0].equalsIgnoreCase("help")){
            if(args.length == 2){

            generator.makeQrCode(args[0], args[1]);
            }
            if(args.length == 3){
                generator.makeQrCode(args[0], args[1], args[2]);
            }
        } else{
            System.out.println("Help: \n" +
                                       "Type `data` `outputImageFileName` as arguments for no logo\n" +
                                       "Type `data` `pathToLogo` `outputImageFileName` as arguments for no logo\n" +
                                       "Omit the ` character from your entry.");
        }


    }
}
