public class Main
{


    public static void main(String[] args)
    {
        //Non numbers ex. "a", "x 1", "a -2", "-";
        String posInt = "10";
        String negInt = "-10";
        String posRealNum = "10.1";
        String negRealNum = "-10.1";
        String sciNota = "1.5e1";

        String string = sciNota;

        try
        {
            double whatIsNumber = Double.parseDouble(string);
            int t = 0;

            //test scientific notation
            if (string.contains("e") || string.contains("E"))
            {
                System.out.println("scientific notation");
                t = 1;
            }

            if (t == 0)
            {
                //test real number
                if (whatIsNumber % 1 != 0)
                {
                    if (whatIsNumber >= 0)
                    {
                        System.out.println("positiv real number");
                    } else
                    {
                        System.out.println("negativ real number");
                    }
                }

                //test integer
                if (whatIsNumber % 1 == 0)
                {
                    if (whatIsNumber >= 0)
                    {
                        System.out.println("positiv integer");
                    } else
                    {
                        System.out.println("negativ integer");
                    }
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("This string is not a number");
        }
    }
}
