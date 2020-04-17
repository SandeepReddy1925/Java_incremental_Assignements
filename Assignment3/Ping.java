import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ping {

    /* This class Pings to the given host by usimgs its hostname. Ping command sends request message the host
     on the networks as packets. Here i have initialized ArrayList response to store all the ping packets
     and also declared host and packets to specify host name and no of packets to be sent.
     */

    public ArrayList<String> response;
    private String host;
    private int packets;

    public Ping() {
        response=new ArrayList<String>();
    }

    public void setHost(String host)
    {
        this.host=host;
    }


    public void setPacket(int packets) {
        this.packets = packets;
    }

    /* The method pingHost() uses Process to initialize the process by execuing the command and it uses
        ArrayList outpust to store the response.
     */

    public ArrayList<String> pingHost() throws IOException {

        ArrayList<String> output=new ArrayList<String>();

        String command = "ping -c" + packets + " " + host;

        Process proc = Runtime.getRuntime().exec(command);//executes the command in system terminal

        // Read the output

        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));//reads process output

        String line="";

        while((line = reader.readLine()) != null) {

            output.add(line);
        }

        return output;

    }

    // In this method we use insatne of MedianCalculator class to claculate median

    public  void medianCalculator() throws IOException {

        MedianCalculator medianCalculator=new MedianCalculator();

        response=pingHost();

        double median=medianCalculator.calculateMedian(response,packets);

        System.out.println("The median of time taken to ping host "+host+" is "+median);


    }

    public static void main(String args[]) throws IOException {

        Ping ping=new Ping();

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Hostname ");
        String hostname=scan.nextLine();

        ping.setHost(hostname);

        System.out.println("Enter no of packets to be sent");
        int packets=scan.nextInt();
        ping.setPacket(packets);

        ping.medianCalculator();

    }
}
