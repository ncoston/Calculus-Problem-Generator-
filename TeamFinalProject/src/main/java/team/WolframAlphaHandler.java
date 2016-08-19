package team;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * Created On: Aug 18, 2016
 *
 * @author William
 */
public class WolframAlphaHandler {

    public String getRawResponesFromWolfram( String input ) {
        //If no text is entered, nothing happens - we do not send WA the empty text
        if ( input != null ) {

            String appId = "GLHTK4-96L2PVQT4T";
            Client client = ClientBuilder.newClient();
            WebTarget wolframTarget = client.target("http://api.wolframalpha.com/v2/query");
            //First we get the text that has been entered in the text area so far

            /**
             * This adds ?input=<modified value of input>&appid=<value of appId>
             * to the URL so that WA can be called correctly. queryParam modifies the string in input into appropriate
             * syntax for the query URL.
             */
            WebTarget queryTarget = wolframTarget.queryParam("input", input).queryParam("appid", appId).queryParam(
                    "format", "mathml");

            //Here we call WA and read their response
            Response response = queryTarget.request().get();
            String responseText = response.readEntity(String.class);

            //For now, we'll display the xml in the GUI and print it to the program output
            return responseText;

        } else {
            return null;
        }
    }
}
