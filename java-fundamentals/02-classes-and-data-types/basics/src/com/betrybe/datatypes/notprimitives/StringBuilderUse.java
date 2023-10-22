package com.betrybe.datatypes.notprimitives;

public class StringBuilderUse {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String learning = "I'm learning ";
        String language = "Java";

        String frase = builder.append(learning).append(language).toString();
        System.out.println(frase);

        StringBuilder newFrase = builder.replace(12, 17, " C#");
        System.out.println(newFrase);
    }
}
