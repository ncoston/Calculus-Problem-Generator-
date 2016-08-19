package team;

public class MathMLParser {

    /**
     * This method takes in an input MathML String and parses the xml portion out of it. It assumes the xml is well
     * formed and has no errors in formatting.
     *
     * @param inputMathML the String input XML document, which contains a mathML portion
     *
     * @return A String that contains the MathML portion of the XML document, still in XML form.
     */
    public String getMathMLFromXMLString( String inputMathML ) {
        return inputMathML.substring(inputMathML.indexOf("<mathml>"), inputMathML.lastIndexOf("</mathml>") + 9);
    }
}
