package Philipp_Training.Other.JavaTranslator;


public class sourceCodeGenerator {

    private final StringBuilder javaCode = new StringBuilder();

    sourceCodeGenerator(String germanLanguage){
        String[] sentences = germanLanguage.trim().split("\n");

        for(String sentence: sentences){
            createConsoleOutput(sentence);
        }
    }

    private void createConsoleOutput(String sentence){
        String text = "";
        if(sentence.toLowerCase().contains("schreibe: ")){
            text = escape(sentence).replaceFirst(".*[Ss]chreibe: ","System.out.print(\"")+"\");\n";
        }
        this.javaCode.append(text);
    }

    public static String escape(String s){
        return s.replace("\\", "\\\\")
                .replace("\t", "\\t")
                .replace("\b", "\\b")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\f", "\\f")
                .replace("\"", "\\\"");
    }

    @Override
    public String toString() {
        return this.javaCode.toString();
    }
}
