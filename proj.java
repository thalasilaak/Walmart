
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;
import java.io.FileWriter;

public class proj{
    public static void main(String[] args){
        try {
            //create output file
            File myFi = new File("outp.txt");
            //read from the input file
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            FileWriter myWriter = new FileWriter("outp.txt");
            int row = 0;
            int col = 0;
            String[] letters = new String[]{"A","B", "C", "D", "E", "F", "G", "H", "I", "J"};

            while (myReader.hasNextLine()) {//loops through the input file
            if(col == 19 && row == 9){
                break;
            }    
            String data = myReader.nextLine();
            String requestNum = data.substring(0,4);
            int num = Integer.parseInt(data.substring(5,6));
            String outputs = requestNum + " ";
            for(int k = 0; k < num; k++)
            {
                outputs += letters[row] + col + ",";
                if(col == 19 && row == 9){
                    break;
                } else if (col == 19 && row != 9){
                    row += 1;
                    col = 0;
                }else {
                    col += 1;
                }
            }
            if(col >= 16 && row != 9){
                row += 1;
                col = 0;
            } else if (col < 16 && row != 9){
                col += 3;
            } else {
                col = 19;
                row = 9;
            }
            
            myWriter.write(outputs);
            myWriter.write("\n");
            
            
            }
            System.out.println(myFi.getAbsolutePath());
            myWriter.close();
            myReader.close();
            
            
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
