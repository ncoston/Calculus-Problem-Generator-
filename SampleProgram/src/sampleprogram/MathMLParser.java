package sampleprogram;

import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author William
 */
public class MathMLParser {
    
    /**
     * This method takes in an input MathML String and parses the xml portion out of it. It assumes the 
     * xml is well formed and has no errors in formatting. 
     * 
     * @param inputMathML the String input XML document, which contains a mathML portion
     * @return A String that contains the MathML portion of the XML document, still in XML form. 
     */
    public String getMathMLFromXMLString(String inputMathML){
        System.out.println("string length: " + inputMathML.length());
        System.out.println("mathML starting point: " + inputMathML.indexOf("<mathml>") + " mathML stopping point: " + inputMathML.lastIndexOf("</mathml>"));
        return inputMathML.substring(inputMathML.indexOf("<mathml>"), inputMathML.lastIndexOf("</mathml>")+9);
    }
}
