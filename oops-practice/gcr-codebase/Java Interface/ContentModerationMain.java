public class ContentModerationMain {
    public static void main(String[] args) {
        String[] posts = {
            "Buy cheap followers now!",
            "I love this product, it works great.",
            "FREE free FREE free!!",
            "This is the worst service ever.",
            "Check out this amazing deal!"
        };

        ContentModerator moderator = new ContentModerator();

        System.out.println("=== AI-Based Content Moderation ===");
        moderator.displayModerationPolicy();
        for (String post : posts) {
            classifyPost(post, moderator);
        }
    }

    private static void classifyPost(String post, ContentModerator moderator) {
        boolean spam = moderator.isSpam(post);
        boolean offensive = moderator.isOffensive(post);
        String status;

        if (offensive) {
            status = "Offensive post";
        } else if (spam) {
            status = "Spam post";
        } else {
            status = "Valid post";
        }

        System.out.println("Post: '" + post + "' -> " + status);
    }
}

interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("TextModeration: Policy forbids hate speech, profanity, and offensive content.");
    }

    static boolean containsRestrictedWords(String post) {
        if (post == null) {
            return false;
        }
        String lowered = post.toLowerCase();
        String[] restricted = {"worst", "hate", "stupid", "idiot"};
        for (String word : restricted) {
            if (lowered.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("SpamDetection: Policy forbids repeated, misleading, or promotional spam.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        if (post == null) {
            return false;
        }
        String lowered = post.toLowerCase();
        boolean repeatedWords = lowered.contains("free free") || lowered.contains("buy cheap") || lowered.contains("followers");
        boolean promotional = lowered.contains("buy") || lowered.contains("deal") || lowered.contains("amazing");
        return repeatedWords && promotional;
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}
