public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market", // this one
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies", // this one
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry", // this one
                "The team showed great Synergy in the last project", // this one
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift", // this one
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String temp = "";

        for (int i = 0; i < sentences.length; i++) {
            temp = sentences[i];
            String[] word_array = temp.split(" ");
            for (int j = 0; j < word_array.length; j++) {
                String word = word_array[j].toLowerCase();
                for (int w = 0; w < keywords.length; w++) {
                    String bullshit = keywords[w].toLowerCase();
                    if (word.equals(bullshit))
                        System.out.println(temp);

                }

            }
        }

    }
}
