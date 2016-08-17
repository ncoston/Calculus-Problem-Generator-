/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleprogram;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;
/**
 *
 * @author ianlong
 */
//import com.wolfram.jlink.*;


public class SampleProgram {

    public static void main(String[] argv) {

ClientConfig config = new ClientConfig();
Client client = ClientBuilder.newClient(config);
String appId="GLHTK4-96L2PVQT4T";
String input="integral of x^3 from 0 to 3";
WebTarget target =  client.target("http://api.wolframalpha.com/v2/query");
//WebTarget target =  client.target("http://api.wolframalpha.com/v2/query?input=pi&appid=GLHTK4-96L2PVQT4T");
//Response response1 = target.request(MediaType.APPLICATION_JSON).post(Entity.entity("{\"name\": \"will\"}", MediaType.APPLICATION_JSON));
//Try "Query param" first
WebTarget queryTarget = target.queryParam("input", input).queryParam("appid", appId);
System.out.print(queryTarget);
Response response = queryTarget.request().get();

System.out.println("post response body: " + response.readEntity(String.class));
System.out.println(response.getStatus());
        //System.out.println("response body: " + response.readEntity(String.class));
        
//        KernelLink ml = null;
//
//        try {
//            ml = MathLinkFactory.createKernelLink(argv);
//        } catch (MathLinkException e) {
//            System.out.println("Fatal error opening link: " + e.getMessage());
//            return;
//        }
//
//        try {
//            // Get rid of the initial InputNamePacket the kernel will send
//            // when it is launched.
//            ml.discardAnswer();
//
//            ml.evaluate("<<MyPackage.m");
//            ml.discardAnswer();
//
//            ml.evaluate("2+2");
//            ml.waitForAnswer();
//
//            int result = ml.getInteger();
//            System.out.println("2 + 2 = " + result);
//
//            // Here's how to send the same input, but not as a string:
//            ml.putFunction("EvaluatePacket", 1);
//            ml.putFunction("Plus", 2);
//            ml.put(3);
//            ml.put(3);
//            ml.endPacket();
//            ml.waitForAnswer();
//            result = ml.getInteger();
//            System.out.println("3 + 3 = " + result);
//
//            // If you want the result back as a string, use evaluateToInputForm
//            // or evaluateToOutputForm. The second arg for either is the
//            // requested page width for formatting the string. Pass 0 for
//            // PageWidth->Infinity. These methods get the result in one
//            // step--no need to call waitForAnswer.
//            String strResult = ml.evaluateToOutputForm("4+4", 0);
//            System.out.println("4 + 4 = " + strResult);
//
//        } catch (MathLinkException e) {
//            System.out.println("MathLinkException occurred: " + e.getMessage());
//        } finally {
//            ml.close();
//        }
    }
}
