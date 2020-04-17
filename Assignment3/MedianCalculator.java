import java.util.ArrayList;
import java.util.Arrays;

public class MedianCalculator {

/* This method takes input ArrayList response and no of packets then it calculates
   median by extracting time from packets.
 */
    public double calculateMedian(ArrayList<String>response,int packets)
    {

        double[] packetsTime=new double[packets];
        int i=0;

        for(String line:response)
        {
            if(line.contains("ttl")) {
                System.out.println(line);
                double time = +extractTimeInResponse(line);

                packetsTime[i] = time;
                i++;
            }
        }

        Arrays.sort(packetsTime);//sorting array in asscending order

        int medianIndex=0;
        if(packetsTime.length%2!=0)
        {
            medianIndex=packetsTime.length/2;
            return packetsTime[medianIndex];
        }

        else
        {
            medianIndex=packetsTime.length/2;
            return (packetsTime[medianIndex-1]+packetsTime[medianIndex])/2;
        }
    }

    //This method is used to extract exactly time part in given packets.
    public double extractTimeInResponse(String response)
    {
        int indexOfTime=response.indexOf("time=");
        int indexOfms=response.indexOf(" ms");
        double time=Double.parseDouble(response.substring(indexOfTime+5,indexOfms));
        return time;
    }
}
