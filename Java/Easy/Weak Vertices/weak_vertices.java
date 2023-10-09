import java.util.*;
import input.*;

/**
 * finding_an_a
 */
public class weak_vertices
{
    // Input Variables
    List<String> inputData = new ArrayList<String>();

    // Solution
    int numbersOfVertices = 0, loop = 1;
    List<int[]> verticesList = new ArrayList<int[]>();

    public static void main(String[] args)
    {
        weak_vertices weak_vertices = new weak_vertices();
        weak_vertices.start();

    }

    private void start()
    {
        sampleSolution();
    }

    private void sampleSolution()
    {
        // Create variables.
        ReadLocalFiles read = new ReadLocalFiles();
        unzip unzip = new unzip();
        unzip.test();
        //Unzip and read data
        inputData = read.getInputData();
        //bool for detemenaing if we get -1 and shold close
        boolean isOver = false;
        // an indext to determain an overall loop and fetch when we recive a new graph
        int overallLoop = 0;
        // while loop that will run until we get the -1
        while (!isOver)
        {
            System.out.println(overallLoop);
            // Check if we get -1, if so we should brake out of the loop
            if(Integer.parseInt(inputData.get(overallLoop)) == -1) break;
            // stor how many vertices we will recive and how big the graph will be.
            numbersOfVertices = Integer.parseInt(inputData.get(overallLoop));
            System.out.println("Number: " + numbersOfVertices);
            // we plus the overall loop to the to the first line of verticles
            overallLoop++;
            // we start the loop index on 1 to get the first line in the graph.
            while (loop <= numbersOfVertices)
            {
               /*  verticesList.add(inputData.get(overallLoop)); */
               //creating a string of the first line
                String line = inputData.get(loop);
                //System.out.println(line);
                //removing all the blank spaces of the string.
                line = line.replaceAll("\\s", "");
                // Creating a new array that will store all the numbers
                int[] ar = new int[numbersOfVertices];
                // Looping through all the number in the string and adding it to the array.
                // This is to change the input from string to int to make it easier to work with.
                for (int i = 0; i < line.length(); i++)
                {
                    ar[i] = Character.getNumericValue(line.charAt(i));
                }
                System.out.println(Arrays.toString(ar));
                //Adding the array to a list with array in order to store the information in a format we can read.
                verticesList.add(ar);
                loop++;
                overallLoop++;
            }
            

           
           

                verticesList.clear();
                //overallLoop++;
            
            
        }

        
        
    }

    
}

                
                /* List<int[]> checkConnectionss = new ArrayList<int[]>();

                for (int i = 0; i < verticesList.size(); i++)
                {
                int[] connections = new int[numbersOfVertices];
                   for (int j = 0; j < verticesList.get(i).length; j++)
                   {
                        if (verticesList.get(i)[j] == 1)
                        {
                            connections[j] = j + 1;
                        }
                   }
                   //System.out.println(Arrays.toString(connections));
                   checkConnectionss.add(connections);
                }
                for (int i = 0; i < checkConnectionss.size(); i++)
                {
                    for (int j = 0; j < checkConnectionss.get(i).length; j++)
                    {
                        if (checkConnectionss.get(i)[j] != 0)
                        {
                            
                            int z = checkConnectionss.get(i)[j];
                            int x = checkConnectionss.get(i)[j + 1];
                            //System.out.println("z: " + z);
                            //System.out.println("x: " + x);
                            Boolean checksi = false;
                            for (int ks : checkConnectionss.get(z - 1))
                            {
                                if (ks != 0) {
                                    System.out.println("ks: "+ks);
                                    if (ks == x)
                                    {
                                        checksi = true;
                                        System.out.println(x);
                                    }
                                    else if (ks != 0)checksi = false;

                                    //System.out.println(checksi);
    
                                }
                                
                            }

                        }
                    }
                } */

/*         unzip im = new unzip();
        Scanner sc = new Scanner(System.in);
        String output, input;
        int sumOfVertices = 0;
        int loops = 0;
        int numbersOfVertices = 0;
        List<String> weakVerticesList = new ArrayList<String>();
        List<Integer> weakVerticesSumList = new ArrayList<Integer>();
        System.out.println("Starting");
        im.test();
       
        while(numbersOfVertices != -1)// sc.hasNextLong)
        {
            numbersOfVertices = Integer.parseInt(sc.nextLine());
            while(loops >= numbersOfVertices || numbersOfVertices != -1)
            {
                sumOfVertices = 0;
                input = sc.nextLine();
                for (char c : input.toCharArray())
                {
                    if(c != ' ')
                    {
                        sumOfVertices += Character.getNumericValue(c);
                    }
                }
                weakVerticesSumList.add(sumOfVertices);
                System.out.println(weakVerticesSumList);
                loops++;
            }

            // Get the input, spit it after the first three digits and then compaire it printing 1 or 0 depending on the number.
            

            
        }
        sc.close(); */