public class ServerNameGenerator {
    public static String[] adjectives = {"tall", "short", "high", "low", "big", "small", "loud", "quiet", "dark", "light"};

    public static String[] nouns = {"cat", "dog", "truck", "car", "fish", "whale", "burger", "pizza", "pen", "paper"};

    public static String nounAdjective(String[] array1, String[] array2) {
        String randomAdj = adjectives[(int) Math.floor(Math.random() * 10)];
        String randomNoun = nouns[(int) Math.floor(Math.random() * 10)];
        String result = System.out.printf("Here is your server name: %s-%s", randomAdj, randomNoun).toString();
        return result;
    }

    public static void main(String[] args) {

        ServerNameGenerator.nounAdjective(adjectives, nouns);

    }
}



