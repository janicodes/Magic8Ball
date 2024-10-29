import java.util.Random;

public class Magic8Ball
{
    private static final String[] DEFAULT_ANSWERS = {
            //Positive Answers
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            //Inconclusive Answers
            "Reply hazy, try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            //Negative Answers
            "Don’t count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful",
    };

    private final String[] answers;

    public Magic8Ball() {
        this.answers = DEFAULT_ANSWERS;
    }

    public Magic8Ball(String[] answers) {
        if (answers == null || answers.length == 0) {
            throw new IllegalArgumentException("Answers array cannot be null or empty.");
        }
        this.answers = answers;
    }

    public String getAnswer() {
        Random random = new Random();
        int index = random.nextInt(answers.length);
        return answers[index];
    }
}
