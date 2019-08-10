package duplicate_characters;

class FindDuplicateCharacter 
{
    public static void main(String[] args) 
    {   

        String str = "HelloJavayy";
        char[] ch = str.toCharArray();
        int i=0,j=0;
        for(i=0;i<ch.length;i++)
        {
            int count = 1 ;
            for(j = i+1;j<ch.length;j++)
            { 
                if(ch[i] == ch[j] )                                           
                {
                    count++;
                }
            }
            if(count != 1)           
            {
                System.out.println(str.charAt(i) + " Occured " + count + " time");
            }


        }



    }
}