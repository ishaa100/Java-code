public class Remove_space {
     
        public static void main(String[] args) {  
            String str = "Isha aggarwal is working on web development.";  
          
            // String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
            // System.out.println(noSpaceStr);  
          //or
            char[] strArray = str.toCharArray();  
            StringBuffer stringBuffer = new StringBuffer();  
            for (int i = 0; i < strArray.length; i++) {  
                if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                    stringBuffer.append(strArray[i]);  
                }  
            }  
            String noSpaceStr2 = stringBuffer.toString();  
            System.out.println(noSpaceStr2);  
        }  
   
    
}
