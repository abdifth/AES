// Import Statements
import javax.xml.bind.DatatypeConverter;
public class ConsoleOutput {
public static void printStateMatrix(byte[][] state, String message){
// Print state matrix
int row = 0, column = 0;
System.out.print("\n" + message + "\n");
for(row = 0; row < 4; row++){
for(column = 0; column < 4; column++){
System.out.print(DatatypeConverter.printHexBinary(new byte[]
{state[row][column]}) + " ");
}
System.out.print("\n");
column = 0;
}
}
public static String paddTo16Characters(String stringToPad){
String paddedInput = stringToPad;
int inputLength = stringToPad.length();
if (inputLength < 16){
for(int i = inputLength; i < 16; i++){
paddedInput = paddedInput.concat("n");
}
}
return paddedInput;
}
}
