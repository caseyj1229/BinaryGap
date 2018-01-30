public class BinaryGap {
     public static int binaryGap(int a){
       int total = 0;
       int count = 0;
       //Change the number to a binary string
       if(a <= 4){
            return 0;
       }

       String binaryString = Integer.toBinaryString(a);
       char[] binaryArray = binaryString.toCharArray();

       if(binaryArray.length == 1){
           return 0;
       }

       //Start counting the gap
       for(int i = 0; i < binaryString.length(); i++){
           if(binaryArray[i] == '1'){
               if(count > total){
                   total = count;
               }
               count = 0;
           }
           else{
               count++;
           }
       }
       return total;
    }
}